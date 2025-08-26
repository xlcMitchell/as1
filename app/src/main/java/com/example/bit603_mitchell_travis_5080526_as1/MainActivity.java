package com.example.bit603_mitchell_travis_5080526_as1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        Button btn = findViewById(R.id.btn);
        EditText name = findViewById(R.id.nameEntry);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkName(name);

            }
        });
    }

    void checkName(EditText name){
        if(name.getText().length() == 0){
            Toast.makeText(getApplicationContext(),
                    "Hello, this is a Toast!",
                    Toast.LENGTH_SHORT).show();
        }
    }

}