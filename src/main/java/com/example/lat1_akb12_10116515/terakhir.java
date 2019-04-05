package com.example.lat1_akb12_10116515;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class terakhir extends AppCompatActivity {
    Button b1,exitbtn;
    Typeface tf1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_terakhir);

        TextView txt = (TextView) findViewById(R.id.textView4);
        Typeface font = Typeface.createFromAsset(getAssets(), "fonts/nunito_bold.ttf");
        txt.setTypeface(font);

        b1 = (Button) findViewById(R.id.oke);
        tf1 = Typeface.createFromAsset(getAssets(), "fonts/nunito_bold.ttf");


        b1.setTypeface(tf1);

        exitbtn = (Button)findViewById(R.id.oke);
        exitbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moveTaskToBack(true);
                finish();
                System.exit( 0);
            }
        });


    }
}
