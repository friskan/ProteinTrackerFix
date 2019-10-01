package proteintracker.com;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import proteintracker.com.Adapter.MahasiswaAdapter;
import proteintracker.com.Adapter.MahasiswaAdapter_2;
import proteintracker.com.Model.Mahasiswa;
import proteintracker.com.Model.Mahasiswa_2;

public class RecyclerViewActivityMhs extends AppCompatActivity {
    private RecyclerView recyclerView;
    private MahasiswaAdapter_2 mahasiswaAdapter;
    private ArrayList<Mahasiswa_2> mahasiswaArrayList2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);

        addData();

        recyclerView = findViewById(R.id.rvMahasiswa);
        mahasiswaAdapter = new MahasiswaAdapter_2(mahasiswaArrayList2);

        RecyclerView.LayoutManager layoutManager = new
                LinearLayoutManager(RecyclerViewActivityMhs.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(mahasiswaAdapter);
    }
    private void addData(){
        mahasiswaArrayList2 = new ArrayList<>();
        mahasiswaArrayList2.add(new Mahasiswa_2("Eva Kristina",
                "72170091","Perempuan", " Hobi : Bermain Game", " Cita-cita : Animal Resquer",
                "Motto : Life is Simple", R.drawable.eva));
        mahasiswaArrayList2.add(new Mahasiswa_2("Emma Norren",
                "72170097", "Perempuan", "Hobi : Melukis",
                "Cita-cita : Pengusaha Fashion", " Motto : Stop Dreaming & Start Doing", R.drawable.emma));
        mahasiswaArrayList2.add(new Mahasiswa_2("Cynthia Kumalasari",
                "72170101", "Perempuan", "Hobi : Nge-gym", "Cita-cita : President Team Herbalife",
                "Motto : No Pain, No Gain", R.drawable.cynkum));
        mahasiswaArrayList2.add(new Mahasiswa_2("Monica Carista",
                "72170133", "Perempuan", "Hobi : Main Game", "Cita-cita : Berguna bagi keluarga",
                "Motto : Don't Judge!", R.drawable.monic));


    }

}
