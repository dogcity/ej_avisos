package cl.estoyseguro.avisos;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class AvisosActivity extends AppCompatActivity {
    private ListView mListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_avisos);
        mListView = (ListView) findViewById(R.id.avisos_list_view);

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(
            //content
            this,
            //layout (view)
            R.layout.avisos_row,
            //row (view)
            R.id.row_text,
            //data (model) with bogus data to test our listview
            new String[]{"primer record", "segundo record", "tercero record"});

        mListView.setAdapter(arrayAdapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_avisos, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.action_patente:
                //capturar patente
                Log.d(getLocalClassName(), "Capturar Patente");
                return true;
            case R.id.action_inspeccionar:
                //capturar otras vistas luego de validar la patente
                Log.d(getLocalClassName(), "Capturar otras Vistas");
                return true;
            case R.id.action_salir:
                finish();
                return true;
            default:
                return false;
        }
}
