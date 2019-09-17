package proteintracker.com;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

public class Main4Activity extends AppCompatActivity implements Mahasiswa2Fragment.SendData, MahasiswaFragment.SendData2{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        click2();
    }
    public void click (){
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        MahasiswaFragment fragmentCRUD = new MahasiswaFragment();
        ft.replace(R.id.frameMain, fragmentCRUD);
        ft.commit();
    }

    public void click2(){
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        Mahasiswa2Fragment fragmentMhs = new Mahasiswa2Fragment();
        ft.replace(R.id.frameMain, fragmentMhs);
        ft.commit();
    }

}
