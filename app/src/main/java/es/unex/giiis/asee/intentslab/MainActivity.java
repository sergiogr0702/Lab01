package es.unex.giiis.asee.intentslab;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    private static final int REQUEST_CODE = 85;

    TextView mtVRespuesta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button bSaludar = findViewById(R.id.bSaludar);
        final EditText eDName = findViewById(R.id.editTextTextPersonName);
        Button bPreguntar = findViewById(R.id.bPreguntar);
        mtVRespuesta = findViewById(R.id.tVRespuesta);

        bSaludar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Snackbar.make(view, "Remplaza con una acción", Snackbar.LENGTH_LONG)
                //        .setAction("Action", null).show();
                Intent intent = new Intent(MainActivity.this, SaludoActivity.class);
                String name = eDName.getText().toString();
                intent.putExtra("Nombre", name);
                startActivity(intent);
            }
        });

        bPreguntar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, PreguntaActivity.class);
                startActivityForResult(intent, REQUEST_CODE);
            }
        });

        Button bNavegar = findViewById(R.id.button3);

        bNavegar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri webpage = Uri.parse("https://www.android.com");
                Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
                startActivity(Intent.createChooser(webIntent, "Selecciona una aplicación"));
            }
        });

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(requestCode == REQUEST_CODE && resultCode == RESULT_OK){
            String respuesta = data.getStringExtra("Datos");
            mtVRespuesta.setText(respuesta);
        }
    }
}