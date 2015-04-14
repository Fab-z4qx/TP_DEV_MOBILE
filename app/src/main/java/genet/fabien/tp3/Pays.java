package genet.fabien.tp3;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;

/**
 * Created by m4gyars on 14/04/15.
 */
public class Pays implements Parcelable {
    private String nom;
    private String description;
    private String image;
    private String id;

    public Pays(String nom, String description, String image, String id)
    {
        this.nom = nom;
        this.description = description;
        this.image = image;
        this.id = id;
    }

    public static ArrayList<Pays> initialiser () {
        ArrayList<Pays> ListePays = new ArrayList<Pays>();

        ListePays.add(new Pays("Etat Unis", "Pays du burger","usa", "usa"));
        ListePays.add(new Pays("France", "Pays du Fromage","fr", "fr"));
        ListePays.add(new Pays("Espagne", "Pays du saucisson","esp", "esp"));

        return ListePays;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(nom);
        parcel.writeString(description);
        parcel.writeString(image);
    }

    public String getId() {
        return id;
    }
}
