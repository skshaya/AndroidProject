package com.example.myapplication;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    ImageButton btn3;
    Button btn2;


    private static final int CAMERA_REQUEST = 123;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        //access for  call
        btn2 = (Button)findViewById(R.id.btnCall);

        //access for map
        btn3 = (ImageButton) findViewById(R.id.imageButton);


        btn2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity = new Intent(MainActivity.this, contacts.class);
                startActivity(intentLoadNewActivity);


            }
        });

        //access for news
        Button mIdButtonHome = (Button)findViewById(R.id.button);
        mIdButtonHome.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent browserIntent = new Intent(
                        Intent.ACTION_VIEW,
                        Uri.parse("https://www.srilanka.travel/"));
                startActivity(browserIntent);
            }
        });

    }




    //access for launching maps
    public void btnClick3(View v){
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse("geo:47.4925,19.0513"));
        Intent chooser = Intent.createChooser(i,"Launch Maps");
        startActivity(chooser);

    }
}
