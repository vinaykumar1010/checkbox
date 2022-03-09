package com.vinappstudio.checkbox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private CheckBox carrier;
    private CheckBox videogame;
    private CheckBox movies;

    private TextView result ;
    private Button button;


    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        carrier = findViewById(R.id.carrier_id);
        videogame = findViewById(R.id.videoGame_id);
        movies = findViewById(R.id.movies_id);

        result = findViewById(R.id.result_id);
        
        button = findViewById(R.id.btn_id);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(carrier.getText().toString() + " status is  : "+ carrier.isChecked() +"\n");
            stringBuilder.append(videogame.getText().toString() +" status is : "+ videogame.isChecked()+"\n");
            stringBuilder.append(movies.getText().toString() +" status is : "+movies.isChecked()+"\n");

            result.setText(stringBuilder);

            }
        });


    }
}