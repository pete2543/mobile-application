package com.example.midterm_6206021622011;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.NumberFormat;

public class Tax_Activity extends AppCompatActivity implements  View.OnClickListener {
    Button btn_T,btn_B;
    EditText edit_Amount,edit_Son,edit_Ins,edit_Inter;
    TextView show;
    int mon=12;
    Double Am,year,Son,Sell,Ins,Inter,Sum,Net,Tax;
    String Y,S,SS,N,T;
    NumberFormat numberFormat = NumberFormat.getInstance();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tax);
        btn_B = (Button) findViewById(R.id.btn_B);
        btn_B.setOnClickListener(this);
        btn_T = (Button) findViewById(R.id.btn_T);
        btn_T.setOnClickListener(this);
        show = (TextView) findViewById(R.id.show);
        edit_Amount = (EditText) findViewById(R.id.edit_Amount);
        edit_Son = (EditText) findViewById(R.id.edit_Son);
        edit_Ins = (EditText) findViewById(R.id.edit_Ins);
        edit_Inter = (EditText) findViewById(R.id.edit_Inter);
    }
    @Override
    public void onClick(View view) {
        int id = view.getId();
        if (id==R.id.btn_T){

           Am= Double.parseDouble(edit_Amount.getText().toString());
           Son = Double.parseDouble(edit_Son.getText().toString());
           Ins = Double.parseDouble(edit_Ins.getText().toString());
           Inter = Double.parseDouble(edit_Inter.getText().toString());
          Sell = (Son *10000);
          Sum = (Son *10000+Inter+Ins);
          year = Am*mon;
          Net = (year - Sum);
           S=numberFormat.format(Sell);
           Y=numberFormat.format(year);
           SS=numberFormat.format(Net);
            show.setText("Incure in year :"+Y+"\n"+"Amount Son :"+S+"\n"+"Amount Insurance :"+Ins+"\n"+"Amount Interest :"+Inter+"\n"+"Amount Net Income :"+SS);
        }
    }
}