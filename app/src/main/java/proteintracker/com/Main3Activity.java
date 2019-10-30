package proteintracker.com;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.proteintrakcerapp);

        Button resetButton = (Button)findViewById(R.id.btnReset);

        resetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(Main3Activity.this);
                builder.setMessage("Apakah anda yakin untuk mereset nilai protein?")
                        .setNegativeButton("No", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(Main3Activity.this, "Tidak jadi reset",
                                        Toast.LENGTH_SHORT).show();
                            }
                        })
                        .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(Main3Activity.this, "Melakukan RESET !!",
                                        Toast.LENGTH_SHORT).show();
                            }
                        });

                AlertDialog dialog = builder.create();
                dialog.show();
            }
        });
    }
}
