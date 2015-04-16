package genet.fabien.tp3;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;


public class ListPhotoActivity extends ActionBarActivity {

    public final static String MSG_PHOTO = "genet.fabien.tp3.Photo";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_photo_liste);

        Intent intent = getIntent();
        String message = intent.getStringExtra(ListPaysActivity.MSG_TYPE);

        ArrayList<Photo> listeP = null;
        switch(message)
        {
            case "usa":
                listeP = Photo.initialiser("usa");
                setTitle("Etat-Unis");
                break;
            case "esp":
                listeP = Photo.initialiser("esp");
                setTitle("Espagne");
                break;
            case "fr":
                listeP = Photo.initialiser("fr");
                setTitle("France");
                break;
        }

        // récupération de la liste des photos
         //ArrayList<Photo> listeP = Photo.initialiser("fr");
        // création et initialisation de l'Adapter associé
        PhotoAdapter adapter = new PhotoAdapter(this, listeP);
        // récupération du composant ListView
        ListView l = (ListView)findViewById(R.id.listPhoto);
        // initialisation de la liste avec les données
        l.setAdapter(adapter);

        l.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Photo p = (Photo)adapterView.getItemAtPosition(i);
                //afficherMessage(p, i);
                startActivity(p,i);
            }
        });
    }

    public void startActivity(Photo item, int position)
    {
        Intent intent = new Intent(this, UnePhotoActivity.class);
        // Sauvegarde du nom dans l’intention

        Bundle b = new Bundle();
        b.putParcelable(MSG_PHOTO, item);
        intent.putExtras(b);

        // Lancement de l’activité
        startActivity(intent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_photo_liste, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            Log.d("QUITTEr", "QUITTERzz");
            android.os.Process.killProcess(android.os.Process.myPid());
        }

        return super.onOptionsItemSelected(item);
    }
}
