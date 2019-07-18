package shsu.edu.kinvey.dashboard;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.Key;
import com.kinvey.java.model.KinveyFile;

/**
 * Created by s0damachine on 4/25/2017.
 */

public class Ingredients extends KinveyFile{
    @Key
    private String name;

    public Ingredients(){

    }

    public Ingredients(String id){
        super(id);
    }

    public Ingredients(String id, String name){
        super(id);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name + "\n";
    }
}
