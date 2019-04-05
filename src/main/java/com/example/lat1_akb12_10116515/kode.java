package com.example.lat1_akb12_10116515;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class kode extends AppCompatActivity {
    Button masuk,bt3;
    TextView teks, teks2;
    Typeface tf1,tf2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kode);



        masuk = (Button) findViewById(R.id.masuk);
        masuk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(kode.this,  Biodata.class);
                kode.this.startActivity(intent);
                kode.this.finish();
            }
        });

        TextView txt = (TextView) findViewById(R.id.textView5);
        Typeface font = Typeface.createFromAsset(getAssets(), "fonts/nunito_bold.ttf");
        txt.setTypeface(font);

        TextView txt2 = (TextView) findViewById(R.id.textView15);
        Typeface font2 = Typeface.createFromAsset(getAssets(), "fonts/nunito_bold.ttf");
        txt2.setTypeface(font2);

        TextView txt3 = (TextView) findViewById(R.id.textView16);
        Typeface font3 = Typeface.createFromAsset(getAssets(), "fonts/nunito_bold.ttf");
        txt3.setTypeface(font3);

        EditText edi1 = (EditText) findViewById(R.id.editText2);
        Typeface font6 = Typeface.createFromAsset(getAssets(), "fonts/nunito_bold.ttf");
        edi1.setTypeface(font6);

        TextView txt7 = (TextView) findViewById(R.id.textView8);
        Typeface font7 = Typeface.createFromAsset(getAssets(), "fonts/rubik_regular.ttf");
        txt7.setTypeface(font7);

        TextView txt8 = (TextView) findViewById(R.id.textView17);
        Typeface font8 = Typeface.createFromAsset(getAssets(), "fonts/rubik_regular.ttf");
        txt8.setTypeface(font8);

        TextView txt9 = (TextView) findViewById(R.id.textView18);
        Typeface font9 = Typeface.createFromAsset(getAssets(), "fonts/rubik_regular.ttf");
        txt9.setTypeface(font9);

        TextView txt10 = (TextView) findViewById(R.id.textView19);
        Typeface font10 = Typeface.createFromAsset(getAssets(), "fonts/rubik_regular.ttf");
        txt10.setTypeface(font10);

        masuk = (Button) findViewById(R.id.masuk);
        bt3 = (Button) findViewById(R.id.button3);
        tf1 = Typeface.createFromAsset(getAssets(), "fonts/nunito_bold.ttf");
        tf2 = Typeface.createFromAsset(getAssets(), "fonts/rubik_regular.ttf");
        masuk.setTypeface(tf1);
        bt3.setTypeface(tf2);
    }
}
