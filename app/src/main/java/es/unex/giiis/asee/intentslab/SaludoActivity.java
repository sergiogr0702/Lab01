package es.unex.giiis.asee.intentslab;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SaludoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saludo);

        String name = getIntent().getStringExtra("Nombre");
        if(name==null) name="";

        TextView tVSaludo = findViewById(R.id.tVSaludo);
        tVSaludo.setText("Hola "+ name);
    }
}