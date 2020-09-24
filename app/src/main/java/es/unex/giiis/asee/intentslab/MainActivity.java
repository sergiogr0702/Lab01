package es.unex.giiis.asee.intentslab;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button bSaludar = findViewById(R.id.bSaludar);
        bSaludar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Remplaza con una acción", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

    }
}