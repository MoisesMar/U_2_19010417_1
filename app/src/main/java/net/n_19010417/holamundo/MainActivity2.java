package net.n_19010417.holamundo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity2 extends AppCompatActivity {

    private EditText getEditText4;

    private EditText getEditText5;

    private EditText getEditText6;
    private Button button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        getEditText4 = findViewById(R.id.editText4);
        getEditText5 = findViewById(R.id.editText5);
        getEditText6 = findViewById(R.id.editText6);
        button3 = findViewById(R.id.button3);

        Bundle bundle = this.getIntent().getExtras();
        String nombre = bundle.getString("nombre").toString();
        getEditText4.setText(nombre);
        String ap = bundle.getString("ap").toString();
        getEditText5.setText(ap);
        String am = bundle.getString("am").toString();
        getEditText6.setText(am);

        button3.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(
                                MainActivity2.this,
                                MainActivity.class
                        );
                        startActivity(intent);
                    }
                }
        ); //cierre button3

    }
}