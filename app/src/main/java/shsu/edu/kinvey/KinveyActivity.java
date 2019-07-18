package shsu.edu.kinvey;

import android.app.Activity;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.kinvey.android.Client;

import shsu.edu.kinvey.MainApplication;

/**
 * Created by s0damachine on 4/24/2017.
 */

public class KinveyActivity extends AppCompatActivity {
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
    }

    public Client getClient(){
        return ((MainApplication)getApplication()).getClient();
    }
}
