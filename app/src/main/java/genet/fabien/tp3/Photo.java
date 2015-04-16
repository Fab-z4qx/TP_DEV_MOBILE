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

    public static ArrayList<Photo> initialiser (String pays) {
        ArrayList<Photo> listePhotos = new ArrayList<Photo>();

        switch(pays){
            case "usa":
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
                break;
            case "fr":
                listePhotos.add(new Photo("Tour eiffel", "La tour Eiffel est une tour de fer puddlé de 324 mètres de hauteur située à Paris, à l’extrémité nord-ouest du parc du Champ-de-Mars en bordure de la Seine dans le 7ᵉ arrondissement","toureiffel"));
                listePhotos.add(new Photo("Arc de Triomphe", "L’arc de triomphe de l’Étoile souvent appelé simplement l'Arc de Triomphe, construit de 1806 à 1836 sur ordre de Napoléon, est situé à Paris dans le 8ᵉ arrondissement, sur la place de l’Étoile, à l’extrémité ouest de l’avenue des Champs-Élysées","arctriomphe"));
                listePhotos.add(new Photo("Notre Dame de Paris", "La cathédrale Notre-Dame de Paris, Notre-Dame de Paris ou Notre-Dame est la cathédrale de l’archidiocèse de Paris, en France","notredam"));
                listePhotos.add(new Photo("Le sacre Coeur", "La basilique du Sacré-Cœur, dite du Vœu national, située au sommet de la butte Montmartre, dans le 18ᵉ arrondissement de Paris, est un édifice religieux parisien majeur. Sa construction suit l'après-guerre de 1870.","sacrecoeur"));
                listePhotos.add(new Photo("Le louvre", "Le palais du Louvre est un ancien palais royal situé à Paris sur la rive droite de la Seine, entre le jardin des Tuileries et l'église Saint-Germain-l'Auxerrois.","louvre"));
                listePhotos.add(new Photo("La côte d'Azur", "La Côte d’Azur est la partie orientale du littoral méditerranéen français et inclut la côte monégasque.","coteazur"));
                listePhotos.add(new Photo("Le chateau de versaille", "Le château de Versailles est un château et un monument historique français qui se situe à Versailles, dans les Yvelines, en France. Il fut la résidence des rois de France Louis XIV, Louis XV et Louis XVI","versailles"));
                listePhotos.add(new Photo("Le chateau de chambord", "Le château de Chambord est un château français situé dans la commune de Chambord, dans le département de Loir-et-Cher en région Centre-Val de Loire","chambor"));
                listePhotos.add(new Photo("Le chateau de chenonceau", "Le château de Chenonceau est situé dans la commune de Chenonceaux en Indre-et-Loire. Il fait partie des châteaux communément appelés les châteaux de la Loire","chenonceau"));
                listePhotos.add(new Photo("Place de la concorde", "La place de la Concorde, avec 8,64 hectares, est la plus grande place de Paris. Le nom aurait été choisi par le Directoire pour marquer la réconciliation des Français après les excès de la Terreur","concorde"));
                break;
            case "esp":
                listePhotos.add(new Photo("La Sagrada Famillia", "La Sagrada Família, Temple Expiatori de la Sagrada Família de son nom complet en catalan, ou Templo Expiatorio de la Sagrada Familia en espagnol, est une basilique mineure catholique de Barcelone érigée à partir de 1882.","sagrafamillia"));
                listePhotos.add(new Photo("Plaza de España", "La Place d'Espagne est une des places les plus spectaculaires de Séville","plazaespagna"));
                listePhotos.add(new Photo("Le palai royal d'espagne", "Le palais royal de Madrid ou palais d’Orient, résidence officielle du roi d’Espagne, est situé à la place de l’Orient au cœur de la capitale espagnole Madrid.","royalpalacemadrid"));
                listePhotos.add(new Photo("Ibiza", "Ibiza, en catalan : Eivissa, anciennement dénommée Ebusus ou Iviza, est la plus grande des îles Pityuses","ibiza"));
                listePhotos.add(new Photo("le Temple d'Amon", "Le temple d'Amon, situé à l'origine à Debod, aussi connu comme le Temple de Debod, est un temple nubien de l'Égypte antique, datant du -IIᵉ siècle, dédié au dieu égyptien Amon.","templeamon"));
                listePhotos.add(new Photo("Tenerifie", "Tenerife, aussi appelée Ténériffe, en espagnol Tenerife, est une île d'Espagne faisant partie des îles Canaries, dans l'océan Atlantique.","tenerifie"));
                listePhotos.add(new Photo("Alcazar de Séville", "L'Alcazar de Séville est un palais fortifié construit à Séville par les Omeyyades d'Espagne à partir de 844 sous le règne de l'émir Abd al-Rahman II","alcazardeseville"));
                break;
        }

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
