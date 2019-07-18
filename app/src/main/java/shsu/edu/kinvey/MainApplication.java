package shsu.edu.kinvey;

import android.app.Application;

import com.kinvey.android.Client;

/**
 * Created by s0damachine on 4/24/2017.
 */

public class MainApplication extends Application {
    private static Client client;

    @Override
    public void onCreate() {
        super.onCreate();
       defineClient();
    }

    private void defineClient() {
        client = new Client.Builder("kid_BJpnu0jRl",
                "b9e26ff52a3c435aadc1ab4f9c42d194",
                getApplicationContext()).build();
    }

    public static Client getClient(){
        return client;
    }
}
