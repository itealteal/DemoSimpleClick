package com.example.demosimpleclick;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    TextView tvDisplay;
    Button btnDisplay;
    EditText etInput;
    ToggleButton toggle;
    RadioGroup gender;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvDisplay = findViewById(R.id.textViewDisplay);
        btnDisplay = findViewById(R.id.buttonDisplay);
        etInput = findViewById(R.id.editTextInput);
        toggle = findViewById(R.id.toggleButtonEnabled);
        gender = findViewById(R.id.genderGroup);

        btnDisplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Code for the action
                String stringResponse = etInput.getText().toString();
                int checkRadioId = gender.getCheckedRadioButtonId();
                if(checkRadioId == R.id.radioMale){
                    stringResponse = "He says " + stringResponse;
                }else {
                    stringResponse = "She says " + stringResponse;
                }

                tvDisplay.setText(stringResponse);
            }
        });

        toggle.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if(toggle.isChecked()){
                    etInput.setEnabled(true);
                }else{
                    etInput.setEnabled(false);
                }
            }
        });


    }
}