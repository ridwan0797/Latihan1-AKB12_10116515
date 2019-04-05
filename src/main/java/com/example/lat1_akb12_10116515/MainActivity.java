package com.example.lat1_akb12_10116515;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button mulai,b1;
    Typeface tf1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Nama :Ridwan Maulana
        //NIM : 10116515
        //Kelas : AKB-12 / IF-12
        //Tanggal Buat : 4 April 2019

       mulai = (Button) findViewById(R.id.mulai);
        mulai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,  kode.class);
                MainActivity.this.startActivity(intent);
                MainActivity.this.finish();
            }
        });

        TextView txt = (TextView) findViewById(R.id.mn);
        Typeface font = Typeface.createFromAsset(getAssets(), "fonts/nunito_bold.ttf");
        txt.setTypeface(font);

        TextView txt2 = (TextView) findViewById(R.id.mm);
        Typeface font2 = Typeface.createFromAsset(getAssets(), "fonts/nunito_bold.ttf");
        txt2.setTypeface(font2);

        b1 = (Button) findViewById(R.id.mulai);
        tf1 = Typeface.createFromAsset(getAssets(), "fonts/nunito_bold.ttf");


        b1.setTypeface(tf1);




    }
}
