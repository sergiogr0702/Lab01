package es.unex.giiis.asee.intentslab;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class PreguntaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pregunta);

        Button bResponder = findViewById(R.id.bResponder);
        final EditText eDName = findViewById(R.id.eTRespuesta);

        bResponder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                String resp = eDName.getText().toString();
                intent.putExtra("Datos", resp);
                setResult(RESULT_OK, intent);
                finish();
            }
        });
    }
}