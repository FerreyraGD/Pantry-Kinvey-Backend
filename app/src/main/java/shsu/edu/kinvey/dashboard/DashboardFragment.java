package shsu.edu.kinvey.dashboard;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.kinvey.android.AsyncAppData;
import com.kinvey.android.callback.KinveyListCallback;
import com.kinvey.java.core.KinveyClientCallback;
import com.kinvey.java.model.KinveyReference;

import java.util.Arrays;
import java.util.List;

import shsu.edu.kinvey.MainApplication;
import shsu.edu.kinvey.R;

/**
 * Created by s0damachine on 4/25/2017.
 */

public class DashboardFragment extends android.support.v4.app.Fragment{
    public static final String TAG = "DashboardFragment";
    private ListView list;
    View v;
    FloatingActionButton fab;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.fragment_dashboard, container, false);
        defineView();
        loadData();
        return v;
    }

    private void loadData() {
        AsyncAppData<Ingredients> ingredients = MainApplication.getClient().appData("ingredients", Ingredients.class);
        ingredients.get(new KinveyListCallback<Ingredients>() {
            @Override
            public void onSuccess(Ingredients[] ingredientses) {
                setupListView(Arrays.asList(ingredientses));
            }

            @Override
            public void onFailure(Throwable throwable) {
                Log.e(TAG, "onFailure: ", throwable);
            }
        });
    }

    private void defineView() {
        list = (ListView)v.findViewById(R.id.list);
        fab = (FloatingActionButton) v.findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                addFavorite();
            }
        });
    }

    private void addFavorite(){
        Profile p = new Profile();
        p.setEmail("testing@test.com");
        p.setProfile("Gabriel");
        p.initReference(new Ingredients("58ff86e8ddba268a21dfc7b3"));

        AsyncAppData<Profile> newProfile = MainApplication.getClient().appData("profile", Profile.class);
        newProfile.save(p, new KinveyClientCallback<Profile>() {
            @Override
            public void onSuccess(Profile profile) {
                Log.d("TAG", "saved data for entity "+ profile.getProfile());
            }

            @Override
            public void onFailure(Throwable throwable) {
                Log.e("TAG", "failed to save event data", throwable);
            }
        });
    }

    private void setupListView(List<Ingredients> ingredientses) {
        ArrayAdapter<Ingredients> ingredientAdapter = new ArrayAdapter<Ingredients>(getContext(), android.R.layout.simple_list_item_1, ingredientses);
        list.setAdapter(ingredientAdapter);

    }
}
