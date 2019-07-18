package shsu.edu.kinvey.dashboard;

import com.google.api.client.util.Key;
import com.kinvey.java.model.KinveyFile;
import com.kinvey.java.model.KinveyReference;

/**
 * Created by s0damachine on 4/25/2017.
 */

public class Profile extends KinveyFile{
    @Key
    private String email;

    @Key
    private String profile;

    @Key
    private KinveyReference ingredient;

    public Profile(){

    }

    public Profile(String email, String profile, KinveyReference ingredient) {
        this.email = email;
        this.profile = profile;
        this.ingredient = ingredient;
    }

    public Profile(String id, String email, String profile, KinveyReference ingredient) {
        super(id);
        this.email = email;
        this.profile = profile;
        this.ingredient = ingredient;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    public KinveyReference getIngredient() {
        return ingredient;
    }

    public void initReference(Ingredients myIngredients){
        KinveyReference reference = new KinveyReference("ingredients", myIngredients.getId());
        this.ingredient = reference;
    }
}
