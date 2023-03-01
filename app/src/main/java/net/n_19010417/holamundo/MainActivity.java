package net.n_19010417.holamundo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    //Declaramos los componentes del lado Java
    private EditText editText1;

    private EditText editText2;

    private EditText editText3;
    private Button button1;
    private Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText1 = findViewById(R.id.editText1);
        editText2 = findViewById(R.id.editText2);
        editText3 = findViewById(R.id.editText3);
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);

        button1.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        String nombre = editText1.getText().toString();
                        String ap = editText2.getText().toString();
                        String am = editText3.getText().toString();
                        Bundle bundle = new Bundle();
                        bundle.putString("nombre", nombre);
                        bundle.putString("ap", ap);
                        bundle.putString("am", am);
                        Intent intent = new Intent(MainActivity.this,
                                MainActivity2.class);
                        intent.putExtras(bundle);
                        startActivity(intent);
                    }
                }
        ); //cierre button1

        button2.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        System.exit(0);
                    }
                }
        ); //cierre button2

    }
}