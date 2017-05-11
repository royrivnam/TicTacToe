package com.example.dell.tictactoe2;
import java.util.*;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity1 extends AppCompatActivity implements View.OnClickListener {

    Button p1,p2,p3,p4,p5,p6,p7,p8,p9,p10;
    TextView t;
    int i=9,d=0,e=0,n1=0,a[]={1,2,3,4,5,6,7,8,9}, max=9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        p1=(Button)findViewById(R.id.b1);p2=(Button)findViewById(R.id.b2);p3=(Button)findViewById(R.id.b3);
        p4=(Button)findViewById(R.id.b4);p5=(Button)findViewById(R.id.b5);p6=(Button)findViewById(R.id.b6);
        p7=(Button)findViewById(R.id.b7);p8=(Button)findViewById(R.id.b8);p9=(Button)findViewById(R.id.b9);
        p10=(Button)findViewById(R.id.b10);
        t=(TextView)findViewById(R.id.t1);
        t.setText(value.a+"'s TURN");

        value.a="PLAYER 1";
        value.b="COMPUTER";


        p10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                p1.setEnabled(true);
                p1.setText("");
                p2.setEnabled(true);
                p2.setText("");
                p3.setEnabled(true);
                p3.setText("");
                p4.setEnabled(true);
                p4.setText("");
                p5.setEnabled(true);
                p5.setText("");
                p6.setEnabled(true);
                p6.setText("");
                p7.setEnabled(true);
                p7.setText("");
                p8.setEnabled(true);
                p8.setText("");
                p9.setEnabled(true);
                p9.setText("");
                p1.setBackgroundColor(Color.parseColor("#d6d7d7"));
                p2.setBackgroundColor(Color.parseColor("#d6d7d7"));
                p3.setBackgroundColor(Color.parseColor("#d6d7d7"));
                p4.setBackgroundColor(Color.parseColor("#d6d7d7"));
                p5.setBackgroundColor(Color.parseColor("#d6d7d7"));
                p6.setBackgroundColor(Color.parseColor("#d6d7d7"));
                p7.setBackgroundColor(Color.parseColor("#d6d7d7"));
                p8.setBackgroundColor(Color.parseColor("#d6d7d7"));
                p9.setBackgroundColor(Color.parseColor("#d6d7d7"));
                t.setText(value.a+"'S TURN");
                i=9;
                d=0;
                n1=0;
                e=0;
                max=9;
                for(int k=0;k<9;k++)
                { a[k]=k+1;}
                p10.setVisibility(View.GONE);

            }
        });



        p1.setOnClickListener(this);
        p2.setOnClickListener(this);
        p3.setOnClickListener(this);
        p4.setOnClickListener(this);
        p5.setOnClickListener(this);
        p6.setOnClickListener(this);
        p7.setOnClickListener(this);
        p8.setOnClickListener(this);
        p9.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {


        if (i % 2 != 0) {
            switch (v.getId()) {
                case R.id.b1:

                    p1.setText("X");
                    t.setText(value.b + "'s TURN");
                    i--;
                    p1.setEnabled(false);
                    e = 1;

                    break;

                case R.id.b2:

                    p2.setText("X");
                    t.setText(value.b + "s TURN");

                    i--;
                    p2.setEnabled(false);
                    e = 2;

                    break;

                case R.id.b3:


                    p3.setText("X");
                    t.setText(value.b + "s TURN");
                    i--;
                    p3.setEnabled(false);
                    e = 3;

                    break;

                case R.id.b4:

                    p4.setText("X");
                    t.setText(value.b + "'s TURN");

                    i--;
                    p4.setEnabled(false);
                    e = 4;

                    break;

                case R.id.b5:


                    p5.setText("X");
                    t.setText(value.b + "'s TURN");

                    i--;
                    p5.setEnabled(false);
                    e = 5;


                    break;

                case R.id.b6:


                    p6.setText("X");
                    t.setText(value.b + "'s TURN");

                    i--;
                    p6.setEnabled(false);
                    e = 6;

                    break;

                case R.id.b7:


                    p7.setText("X");
                    t.setText(value.b + "'s TURN");

                    i--;
                    p7.setEnabled(false);
                    e = 7;

                    break;

                case R.id.b8:

                    p8.setText("X");
                    t.setText(value.b + "'s TURN");

                    i--;
                    p8.setEnabled(false);
                    e = 8;

                    break;

                case R.id.b9:


                    p9.setText("X");
                    t.setText(value.b + "'s TURN");
                    i--;
                    p9.setEnabled(false);
                    e = 9;

                    break;
            }
        }



        for (int k = 0; k <= (max - 1); k++) {
            if (a[e] == a[k]) {
                int l = a[e];
                a[e] = a[max - 1];
                a[max - 1] = l;
            }
        }

        max=max-1;
        Random rn = new Random();
        n1 = rn.nextInt(max);


        if (i % 2 == 0) {

            if (a[n1] == 1) {
                p1.setText("O");
                p1.setEnabled(false);
                i--;
            }
            else if (a[n1] == 2) {
                p2.setText("O");
                p2.setEnabled(false);
                i--;
            }
            else if (a[n1] == 3) {
                p3.setText("O");
                p3.setEnabled(false);
                i--;
            }
            else if (a[n1] == 4) {
                p4.setText("O");
                p4.setEnabled(false);
                i--;
            }
            else if (a[n1] == 5) {
                p5.setText("O");
                p5.setEnabled(false);
                i--;
            }
            else if (a[n1] == 6) {
                p6.setText("O");
                p6.setEnabled(false);
                i--;
            }
            else if (a[n1] == 7) {
                p7.setText("O");
                p7.setEnabled(false);
                i--;
            }
            else if (a[n1] == 8) {
                p8.setText("O");
                p8.setEnabled(false);
                i--;
            }
            else if (a[n1] == 9) {
                p9.setText("O");
                p9.setEnabled(false);
                i--;
            }

        }
        for (int k = 0; k <= (max-1); k++)
        {
            if (a[n1] == a[k])
            {
                int l = a[n1];
                a[n1] = a[max-1];
                a[max-1] = l;
            }
        }

        max = max - 1;


        if (i < 5) {

            if ((p1.getText().equals("X") || p1.getText().equals("O")) && p1.getText().equals(p2.getText()) && p2.getText().equals(p3.getText()))

            {
                p1.setBackgroundColor(Color.parseColor("#a1f84a"));
                p2.setBackgroundColor(Color.parseColor("#a1f84a"));
                p3.setBackgroundColor(Color.parseColor("#a1f84a"));
                if (i % 2 == 0) {
                    t.setText(value.a + " WINS");
                } else {
                    t.setText(value.b + " WINS");
                }
                i = 0;
                d = 1;
            } else if ((p1.getText().equals("X") || p1.getText().equals("O")) && p1.getText().equals(p4.getText()) && p4.getText().equals(p7.getText()))

            {
                p1.setBackgroundColor(Color.parseColor("#a1f84a"));
                p4.setBackgroundColor(Color.parseColor("#a1f84a"));
                p7.setBackgroundColor(Color.parseColor("#a1f84a"));
                if (i % 2 == 0) {
                    t.setText(value.a + " WINS");
                } else {
                    t.setText(value.b + " WINS");
                }
                i = 0;
                d = 1;
            } else if ((p4.getText().equals("X") || p4.getText().equals("O")) && p4.getText().equals(p5.getText()) && p5.getText().equals(p6.getText()))

            {
                p5.setBackgroundColor(Color.parseColor("#a1f84a"));
                p4.setBackgroundColor(Color.parseColor("#a1f84a"));
                p6.setBackgroundColor(Color.parseColor("#a1f84a"));
                if (i % 2 == 0) {
                    t.setText(value.a + " WINS");
                } else {
                    t.setText(value.b + " WINS");
                }
                i = 0;
                d = 1;
            } else if ((p1.getText().equals("X") || p1.getText().equals("O")) && p1.getText().equals(p5.getText()) && p5.getText().equals(p9.getText()))

            {
                p1.setBackgroundColor(Color.parseColor("#a1f84a"));
                p5.setBackgroundColor(Color.parseColor("#a1f84a"));
                p9.setBackgroundColor(Color.parseColor("#a1f84a"));
                if (i % 2 == 0) {
                    t.setText(value.a + " WINS");
                } else {
                    t.setText(value.b + " WINS");
                }
                i = 0;
                d = 1;
            } else if ((p7.getText().equals("X") || p7.getText().equals("O")) && p7.getText().equals(p8.getText()) && p8.getText().equals(p9.getText()))

            {
                p7.setBackgroundColor(Color.parseColor("#a1f84a"));
                p8.setBackgroundColor(Color.parseColor("#a1f84a"));
                p9.setBackgroundColor(Color.parseColor("#a1f84a"));
                if (i % 2 == 0) {
                    t.setText(value.a + " WINS");
                } else {
                    t.setText(value.b + " WINS");
                }
                i = 0;
                d = 1;
            } else if ((p5.getText().equals("X") || p5.getText().equals("O")) && p7.getText().equals(p5.getText()) && p5.getText().equals(p3.getText()))

            {
                p3.setBackgroundColor(Color.parseColor("#a1f84a"));
                p5.setBackgroundColor(Color.parseColor("#a1f84a"));
                p7.setBackgroundColor(Color.parseColor("#a1f84a"));
                if (i % 2 == 0) {
                    t.setText(value.a + " WINS");
                } else {
                    t.setText(value.b + " WINS");
                }
                i = 0;
                d = 1;
            } else if ((p3.getText().equals("X") || p3.getText().equals("O")) && p3.getText().equals(p6.getText()) && p6.getText().equals(p9.getText()))

            {
                p3.setBackgroundColor(Color.parseColor("#a1f84a"));
                p6.setBackgroundColor(Color.parseColor("#a1f84a"));
                p9.setBackgroundColor(Color.parseColor("#a1f84a"));
                if (i % 2 == 0) {
                    t.setText(value.a + " WINS");
                } else {
                    t.setText(value.b + " WINS");
                }
                i = 0;
                d = 1;
            } else if ((p5.getText().equals("X") || p5.getText().equals("O")) && p2.getText().equals(p5.getText()) && p5.getText().equals(p8.getText()))

            {
                p2.setBackgroundColor(Color.parseColor("#a1f84a"));
                p5.setBackgroundColor(Color.parseColor("#a1f84a"));
                p8.setBackgroundColor(Color.parseColor("#a1f84a"));
                if (i % 2 == 0) {
                    t.setText(value.a + " WINS");
                } else {
                    t.setText(value.b + " WINS");
                }
                i = 0;
                d = 1;
            }
        }
        if (i == 0) {
            if (d == 0) {
                t.setText("DRAW MATCH");
                p10.setVisibility(View.VISIBLE);

            } else {
                p10.setVisibility(View.VISIBLE);
            }
        }


    }

}
