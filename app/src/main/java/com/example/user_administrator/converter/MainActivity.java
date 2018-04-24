package com.example.user_administrator.converter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity{

    EditText ed1;
    TextView t1;
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ed1=(EditText)findViewById(R.id.ed1);
        t1=(TextView) findViewById(R.id.t1);

        b1=(Button)findViewById(R.id.b1);
        b2=(Button)findViewById(R.id.b2);
        b3=(Button)findViewById(R.id.b3);
        b4=(Button)findViewById(R.id.b4);
        b5=(Button)findViewById(R.id.b5);
        b6=(Button)findViewById(R.id.b6);
        b7=(Button)findViewById(R.id.b7);
        b8=(Button)findViewById(R.id.b8);
        b9=(Button)findViewById(R.id.b9);
        b10=(Button)findViewById(R.id.b10);
        b11=(Button)findViewById(R.id.b11);
        b12=(Button)findViewById(R.id.b12);

     /*   b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b4.setOnClickListener(this);
        b5.setOnClickListener(this);
        b6.setOnClickListener(this);
        b7.setOnClickListener(this);
        b8.setOnClickListener(this);
        b9.setOnClickListener(this);
        b10.setOnClickListener(this);
        b11.setOnClickListener(this);
        b12.setOnClickListener(this);*/




    }

  /*  @Override
    public void onClick(View view) {


    }*/

    public void dob(View view)
    {
        int i = Integer.parseInt(ed1.getText().toString());
        t1.setText(Integer.toBinaryString(i));
    }

    public void bod(View view)
    {
       String s = ed1.getText().toString();
       int i = Integer.parseInt(s,2);
       t1.setText(String.valueOf(i));
    }
}
