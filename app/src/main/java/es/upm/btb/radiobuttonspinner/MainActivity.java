package es.upm.btb.radiobuttonspinner;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private RadioGroup radioGroup;
    private Spinner spinner;
    private CheckBox checkBox1;
    private CheckBox checkBox2;
    private CheckBox checkBox3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Inicialización
        radioGroup = findViewById(R.id.radioGroup);
        spinner = findViewById(R.id.spinner);
        checkBox1 = findViewById(R.id.checkBox1);
        checkBox2 = findViewById(R.id.checkBox2);
        checkBox3 = findViewById(R.id.checkBox3);


        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int checkedId) {
                // Acción a realizar cuando se cambia la selección del RadioGroup
                if (checkedId == R.id.radioButton1) {
                    Toast.makeText(MainActivity.this, "This is a message for Radiogroup radioButton1 onCheckedChanged", Toast.LENGTH_LONG).show();
                } else if (checkedId == R.id.radioButton2) {
                    Toast.makeText(MainActivity.this, "This is a message for Radiogroup radioButton2 onCheckedChanged", Toast.LENGTH_LONG).show();
                }

            }
        });

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                // Acción a realizar cuando se selecciona un elemento del Spinner
                Toast.makeText(MainActivity.this, "This is a message for Spinner onItemSelected "+i, Toast.LENGTH_LONG).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                // Acción a realizar cuando no se selecciona ningún elemento del Spinner
                Toast.makeText(MainActivity.this, "This is a message for Spinner onNothingSelected ", Toast.LENGTH_LONG).show();
            }
        });


        checkBox1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                // Lógica cuando se cambia el estado del checkBox1
                Toast.makeText(MainActivity.this, "This is a message for checkbox1 onCheckedChanged. isChecked? "+isChecked, Toast.LENGTH_LONG).show();
            }
        });

        checkBox2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                // Lógica cuando se cambia el estado del checkBox2
                Toast.makeText(MainActivity.this, "This is a message for checkbox2 onCheckedChanged. isChecked? "+isChecked, Toast.LENGTH_LONG).show();
            }
        });

        checkBox3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                // Lógica cuando se cambia el estado del checkBox3
                Toast.makeText(MainActivity.this, "This is a message for checkbox3 onCheckedChanged. isChecked? "+isChecked, Toast.LENGTH_LONG).show();
            }
        });



    }
}
