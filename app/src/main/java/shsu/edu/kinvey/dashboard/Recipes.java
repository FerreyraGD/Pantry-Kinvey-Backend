package shsu.edu.kinvey.dashboard;

import com.google.api.client.util.Key;
import com.kinvey.java.model.KinveyFile;

/**
 * Created by s0damachine on 4/25/2017.
 */

public class Recipes extends KinveyFile {

    @Key
    private String recipeid;

    public Recipes(){

    }

    public Recipes(String recipeid) {
        this.recipeid = recipeid;
    }

    public Recipes(String id, String recipeid) {
        super(id);
        this.recipeid = recipeid;
    }

    public String getRecipeid() {
        return recipeid;
    }

    public void setRecipeid(String recipeid) {
        this.recipeid = recipeid;
    }
}
