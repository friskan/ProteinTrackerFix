package proteintracker.com;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

public class KelolaActivity extends AppCompatActivity {
    String[] items = {"Riyan Mozes Sahetapy", "Brian Eldrin Sombuk ", "Elias Aru F. Langer", "Aditya Halimawan", "Immanuel Harold Maga",
            "Eben Haezer Gultom", "Yosua Erick Gunawan", "Nana Eka Wulandari", "Eva Kristina", "Jonathan Prajna Marga Parama",
            "Emma Norren Cahya Putri", "Michael Gerardi Adji", "Cynthia Kumalasari", "Nikolaus Aryawan Ravato Wijaya", "Daniel Surya Nugraha",
            "Lionrico Sanjay Exauvida Jeipy", "Jonathan Alvin Ananto", "Monica Carista", "Didimus Candra Gased", "Valeriana Tanesha Indra S",
            "Ivan Bernov", "Friska F. Nainggolan", "Grace Hutabarat", "Beni Mulia Tabarus"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kelola);

        ListView lv = (ListView) findViewById(R.id.listMhs);

        Button updateButton =  (Button) findViewById(R.id.btnUpdate);
        updateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent insert = new Intent(KelolaActivity.this, UpdateActivity.class);
                startActivity(insert);
            }
        });

        Button insertButton =  (Button) findViewById(R.id.btnInsert);
        insertButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent insert = new Intent(KelolaActivity.this, InsertActivity.class);
                startActivity(insert);
            }
        });


        lv.setAdapter(new ArrayAdapter<String>(KelolaActivity.this, android.R.layout.simple_list_item_1, items));
        /*ArrayAdapter<String> adap = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, items);
        adap.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        /*lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long id) {
                Toast.makeText(KelolaActivity.this, "Anda memilih " +
                        items[i], Toast.LENGTH_SHORT).show();
            }
        });*/

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int
                    position, long id) {
                Toast.makeText(KelolaActivity.this,"Anda memilih " +
                        items[position], Toast.LENGTH_LONG).show();
            }
        });


        /*spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int i, long id)
            {
                Toast.makeText(KelolaActivity.this,"Anda  memilih : "
                        + items[i],Toast.LENGTH_SHORT).show();
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                Toast.makeText(KelolaActivity.this,"Anda tidak memilih",
                        Toast.LENGTH_SHORT).show();

            }
        });


        updateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (KelolaActivity.this,UpdateActivity.class);
                startActivity(intent);
            }
        });*/


    }
}
