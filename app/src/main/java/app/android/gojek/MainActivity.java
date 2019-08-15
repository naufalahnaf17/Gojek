package app.android.gojek;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ImageView btnGoFood , btnA , btnB ,btnD;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnGoFood = (ImageView) findViewById(R.id.btnGoFood);
        btnA = (ImageView) findViewById(R.id.btnA);
        btnB = (ImageView) findViewById(R.id.btnB);
        btnD = (ImageView) findViewById(R.id.btnD);
        btnGoFood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this , GoFoodActivity.class);
                startActivity(intent);
            }
        });

        btnA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Fitur Ini Belum Tersedia", Toast.LENGTH_SHORT).show();
            }
        });

        btnB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Fitur Ini Belum Tersedia", Toast.LENGTH_SHORT).show();
            }
        });

        btnD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Fitur Ini Belum Tersedia", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
