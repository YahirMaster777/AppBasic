package com.example.basicsapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {


    //crear variable
    private EditText txtFirstValue;
    private EditText txtSecondValue;

    private Button btnAdd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtFirstValue= findViewById(R.id.txt_first_value);
        txtSecondValue= findViewById(R.id.txt_second_value);
        btnAdd= findViewById(R.id.btn_add);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                int firstValue, secondValue, result;
                firstValue= Integer.parseInt(txtFirstValue.getText().toString());
                secondValue= Integer.parseInt(txtSecondValue.getText().toString());
                result=firstValue+secondValue;
                Toast.makeText(getApplicationContext(), "resultado: "+result, Toast.LENGTH_SHORT).show();


            }
        });




    }
}