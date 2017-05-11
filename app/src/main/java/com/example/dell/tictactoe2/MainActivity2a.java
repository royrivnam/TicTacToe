package com.example.dell.tictactoe2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity2a extends AppCompatActivity {

    EditText E1,E2;
    Button B1,B2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity2a);

        E1=(EditText)findViewById(R.id.e1);
        E2=(EditText)findViewById(R.id.e2);
        B1=(Button)findViewById(R.id.b1);
        B2=(Button)findViewById(R.id.b2);
        B1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                value.a=E1.getText().toString();
                value.b=E2.getText().toString();
                Intent i=new Intent(getApplicationContext(),MainActivity2.class);
                startActivity(i);
            }
        });



        B2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
        Intent j=new Intent(getApplicationContext(),MainActivity.class);
        startActivity(j);

            }
        });


    }
}
