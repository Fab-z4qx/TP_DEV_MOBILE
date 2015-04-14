package genet.fabien.tp3;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;


public class ListPaysActivity extends Activity {

    //public final static String MSG_PHOTO = "genet.fabien.tp3.photo";
    public final static String MSG_TYPE = "genet.fabien.tp3.type";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_pays);

        // récupération de la liste des photos
        ArrayList<Pays> listeP = Pays.initialiser();
        // création et initialisation de l'Adapter associé
        PaysAdapter adapter = new PaysAdapter(this, listeP);

        // récupération du composant ListView
        ListView l = (ListView)findViewById(R.id.listViewPays);
        // initialisation de la liste avec les données
        l.setAdapter(adapter);

        l.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Pays p = (Pays)adapterView.getItemAtPosition(i);
                startActivity(p, i);
            }
        });
    }

    public void startActivity(Pays item, int position)
    {
        Intent intent = new Intent(this, ListPhotoActivity.class);
        String b = "fr";
        intent.putExtra(MSG_TYPE, item.getId());
        // Lancement de l’activité
        startActivity(intent);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_list_pays, menu);
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
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
