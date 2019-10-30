package proteintracker.com;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class CobaMenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coba_menu);

        String ContMenu[] = {"Riyan Mozes Sahetapy", "Brian Eldrin Sombuk ", "Elias Aru F. Langer", "Aditya Halimawan", "Immanuel Harold Maga",
                "Eben Haezer Gultom", "Yosua Erick Gunawan", "Nana Eka Wulandari", "Eva Kristina", "Jonathan Prajna Marga Parama",
                "Emma Norren Cahya Putri", "Michael Gerardi Adji", "Cynthia Kumalasari", "Nikolaus Aryawan Ravato Wijaya", "Daniel Surya Nugraha",
                "Lionrico Sanjay Exauvida Jeipy", "Jonathan Alvin Ananto", "Monica Carista", "Didimus Candra Gased", "Valeriana Tanesha Indra S",
                "Ivan Bernov", "Friska F. Nainggolan", "Grace Hutabarat", "Beni Mulia Tabarus"};
        ListView lv = (ListView)findViewById(R.id.LstView);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,ContMenu);
        lv.setAdapter(adapter);
        registerForContextMenu(lv);
    }
    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo){
        super.onCreateContextMenu(menu,v,menuInfo);
        menu.setHeaderTitle("Silahkan Pilih");
        menu.add(0,v.getId(), 0, "Update");
        menu.add(0,v.getId(), 0, "Delete");
    }

    public boolean onContextItemSelected(MenuItem item){
        if(item.getTitle()=="Update") {
            Toast.makeText(getApplicationContext(), "pura-puranya item disimpan ke DB", Toast.LENGTH_SHORT).show();
        }else if(item.getTitle()=="Delete"){
            Toast.makeText(getApplicationContext(), "tidak disimpan ke DB", Toast.LENGTH_SHORT).show();
        }else {
            return false;
        }
        return true;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu1,menu);
        return true;
    }

    @Override
    public  boolean onOptionsItemSelected(MenuItem item){
        if(item.getItemId() == R.id.item1) {
            Toast.makeText(getApplicationContext(), "Ini menu pertama", Toast.LENGTH_SHORT).show();
        }if(item.getItemId() == R.id.item2) {
            Toast.makeText(getApplicationContext(), "Ini menu kedua", Toast.LENGTH_SHORT).show();
        }if(item.getItemId() == R.id.item3) {
            Toast.makeText(getApplicationContext(), "Ini menu ketiga", Toast.LENGTH_SHORT).show();
        }
        return true;
    }
}
