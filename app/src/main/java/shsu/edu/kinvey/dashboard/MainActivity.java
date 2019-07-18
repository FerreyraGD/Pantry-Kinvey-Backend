package shsu.edu.kinvey.dashboard;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import shsu.edu.kinvey.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        getSupportFragmentManager().beginTransaction().add(R.id.main_frame, new DashboardFragment(), DashboardFragment.TAG).commit();



    }
}
