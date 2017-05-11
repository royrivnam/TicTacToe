package com.example.dell.tictactoe2;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.zip.Inflater;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button p1, p2, p3;
    ImageView I;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        p1 = (Button)findViewById(R.id.b1);
        p2 = (Button)findViewById(R.id.b2);
        p3 = (Button)findViewById(R.id.b3);
        I  = (ImageView)findViewById(R.id.i1);

       if(value.c==0)
       {

           LayoutInflater l = getLayoutInflater();
           View o2 = l.inflate(R.layout.tictac, (ViewGroup) findViewById(R.id.toast));
           Toast o3 = Toast.makeText(getApplicationContext(), "HI", Toast.LENGTH_LONG);
           o3.setView(o2);
           o3.show();
           value.c=1;
       }


        p1.setOnClickListener(this);
        p2.setOnClickListener(this);
        p3.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        switch (v.getId())
        {
            case R.id.b1:
                Intent i=new Intent(getApplicationContext(),MainActivity1.class);
                startActivity(i);
                break;


            case R.id.b2:
                Intent j=new Intent(getApplicationContext(),MainActivity2a.class);
                startActivity(j);
                break;

            case R.id.b3:
                Intent k=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.in.com/games/"));
                startActivity(k);
                break;

            default:
                break;

        }



    }
}
