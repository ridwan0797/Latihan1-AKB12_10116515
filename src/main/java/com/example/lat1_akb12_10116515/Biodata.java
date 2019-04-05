package com.example.lat1_akb12_10116515;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Biodata extends AppCompatActivity {
    Button selanjutnya;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_biodata);

        selanjutnya = (Button) findViewById(R.id.selanjutnya);
        selanjutnya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Biodata.this,  terakhir.class);
                Biodata.this.startActivity(intent);
                Biodata.this.finish();
            }
        });
        TextView txt = (TextView) findViewById(R.id.textView3);
        Typeface font = Typeface.createFromAsset(getAssets(), "fonts/nunito_bold.ttf");
        txt.setTypeface(font);

        TextView txt2 = (TextView) findViewById(R.id.textView2);
        Typeface font2 = Typeface.createFromAsset(getAssets(), "fonts/nunito_bold.ttf");
        txt2.setTypeface(font2);

        Button btn = (Button) findViewById(R.id.selanjutnya);
        Typeface font3 = Typeface.createFromAsset(getAssets(), "fonts/nunito_bold.ttf");
        btn.setTypeface(font3);
    }
}
