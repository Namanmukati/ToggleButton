package com.example.togglebutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    ToggleButton tb1,tb2;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addListenerOnButtonClick();
    }

    public void addListenerOnButtonClick(){
        tb1 = findViewById(R.id.toggleButton);
        tb2 = findViewById(R.id.toggleButton2);
        btn = findViewById(R.id.button);

        //perform action on button click
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StringBuilder result = new StringBuilder();
               result.append("ToggleButton 1:").append(tb1.getText());
               result.append("\nToggleButton 2 :").append(tb2.getText());
               //Displaying the message in toast
                Toast.makeText(getApplicationContext(), result.toString(), Toast.LENGTH_LONG).show();

            }
        });
    }
}