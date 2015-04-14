package genet.fabien.tp3;

import android.app.AlertDialog;
import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;

/**
 * Created by m4gyars on 14/04/15.
 */
public class Photo implements Parcelable {

    private String nom;
    private String description;
    private String nomImage;

    public Photo (String nom, String description, String nomImage){
        this.nom = nom;
        this.description = description;
        this.nomImage = nomImage;

    }

    public static ArrayList<Photo> initialiser () {
        ArrayList<Photo> listePhotos = new ArrayList<Photo>();

        listePhotos.add(new Photo("San jose street", "Une rue a San jose - Californie","img1"));
        listePhotos.add(new Photo("San jose university", "Université de San jose","img2"));
        listePhotos.add(new Photo("San jose university sport center", "La salle de sport de san jose University","img3"));
        listePhotos.add(new Photo("San jose parc", "Le parc de l'université de San jose","img4"));
        listePhotos.add(new Photo("Mustang", "Une petite mustang sympa","img5"));
        listePhotos.add(new Photo("Burger", "Un gros burger comme on les aimes","img6"));
        listePhotos.add(new Photo("Golden Gate", "Le Golden Gate de San Francisco","img7"));
        listePhotos.add(new Photo("Carmel", "La plage de Carmel","img8"));
        listePhotos.add(new Photo("Grand Canyon", "Le Grand canyon","img9"));
        listePhotos.add(new Photo("Monument valley", "La reserve de Monument valley","img10"));

        return listePhotos;
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

    public String getNomImage() {
        return nomImage;
    }

    public void setNomImage(String nomImage) {
        this.nomImage = nomImage;
    }

    // Sert à décrire le contenu de notre Parcel :
// le nb d’objets spéciaux qu’il contient
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(nom);
        parcel.writeString(description);
        parcel.writeString(nomImage);
    }

    public static final Parcelable.Creator<Photo> CREATOR = new
        Creator<Photo>() {
            // Création d’un objet photo à partir d’un parcel
            public Photo createFromParcel(Parcel source) {
                Photo p = new Photo(null, null, null);
                p.nom = source.readString();
                p.description = source.readString();
                p.nomImage = source.readString();
                return p;
            }
            @Override public Photo[] newArray(int size) {
                return new Photo[size];
            }
        };
}
