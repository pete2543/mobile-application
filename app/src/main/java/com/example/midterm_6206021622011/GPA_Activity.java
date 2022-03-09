package com.example.midterm_6206021622011;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class GPA_Activity extends AppCompatActivity implements View.OnClickListener {
    Button btn_CalGPA,btn_Back;
    EditText edit_G1,edit_G2,edit_G3,edit_G4,edit_G5;
    TextView text_Result;
    Double credit=3.0,GPA,G1,G2,G3,G4,G5,totalCre,a,total;
    String msg="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gpa);
        btn_Back = (Button) findViewById(R.id.btn_Back);
        btn_Back.setOnClickListener(this);
        btn_CalGPA = (Button) findViewById(R.id.btn_CalGPA);
        btn_CalGPA.setOnClickListener(this);
        edit_G1 = (EditText) findViewById(R.id.edit_G1);
        edit_G2 = (EditText) findViewById(R.id.edit_G2);
        edit_G3 = (EditText) findViewById(R.id.edit_G3);
        edit_G4 = (EditText) findViewById(R.id.edit_G4);
        edit_G5 = (EditText) findViewById(R.id.edit_G5);
        text_Result = (TextView) findViewById(R.id.text_Result);
    }
    @Override
    public void onClick(View view){
        int id = view.getId();
        if (id==R.id.btn_CalGPA){
            //Grade1************************************************************
            if (edit_G1.getText().toString().equals("A")){
                G1=4.0;
            }else if (edit_G1.getText().toString().equals("B+")){
                G1=3.5;
            }else if (edit_G1.getText().toString().equals("B")){
                G1=3.0;
            }else if (edit_G1.getText().toString().equals("C+")){
                G1=2.5;
            }else if (edit_G1.getText().toString().equals("C")){
                G1=2.0;
            }else if (edit_G1.getText().toString().equals("D+")){
                G1=1.5;
            }
            else if (edit_G1.getText().toString().equals("D")){
                G1=1.0;
            }
            else if (edit_G1.getText().toString().equals("F")){
                G1=0.0;
            }

            //*************************/Grade2***************************************
            if (edit_G2.getText().toString().equals("A")){
                G2=4.0;
            }else if (edit_G2.getText().toString().equals("B+")){
                G2=3.5;
            }else if (edit_G2.getText().toString().equals("B")){
                G2=3.0;
            }else if (edit_G2.getText().toString().equals("C+")){
                G2=2.5;
            }else if (edit_G2.getText().toString().equals("C")){
                G2=2.0;
            }else if (edit_G2.getText().toString().equals("D+")){
                G2=1.5;
            }
            else if (edit_G2.getText().toString().equals("D")){
                G2=1.0;
            }
            else if (edit_G2.getText().toString().equals("F")){
                G2=0.0;
            }
            //*************************/Grade3***************************************
            if (edit_G3.getText().toString().equals("A")){
                G3=4.0;
            }else if (edit_G3.getText().toString().equals("B+")){
                G3=3.5;
            }else if (edit_G3.getText().toString().equals("B")){
                G3=3.0;
            }else if (edit_G3.getText().toString().equals("C+")){
                G3=2.5;
            }else if (edit_G3.getText().toString().equals("C")){
                G3=2.0;
            }else if (edit_G3.getText().toString().equals("D+")){
                G3=1.5;
            }
            else if (edit_G3.getText().toString().equals("D")){
                G3=1.0;
            }
            else if (edit_G3.getText().toString().equals("F")){
                G3=0.0;
            }

            //*************************/Grade4***************************************
            if (edit_G4.getText().toString().equals("A")){
                G4=4.0;
            }else if (edit_G4.getText().toString().equals("B+")){
                G4=3.5;
            }else if (edit_G4.getText().toString().equals("B")){
                G4=3.0;
            }else if (edit_G4.getText().toString().equals("C+")){
                G4 =2.5;
            }else if (edit_G4.getText().toString().equals("C")){
                G4=2.0;
            }else if (edit_G4.getText().toString().equals("D+")){
                G4=1.5;
            }
            else if (edit_G4.getText().toString().equals("D")){
                G4=1.0;
            }
            else if (edit_G4.getText().toString().equals("F")){
                G4=0.0;
            }
            //*************************/Grade5***************************************
            if (edit_G5.getText().toString().equals("A")){
                G5 =4.0;
            }else if (edit_G5.getText().toString().equals("B+")){
                G5 =3.5;
            }else if (edit_G5.getText().toString().equals("B")){
                G5=3.0;
            }else if (edit_G5.getText().toString().equals("C+")){
                G5 =2.5;
            }else if (edit_G5.getText().toString().equals("C")){
                G5=2.0;
            }else if (edit_G5.getText().toString().equals("D+")){
                G5=1.5;
            }
            else if (edit_G5.getText().toString().equals("D")){
                G5=1.0;
            }
            else if (edit_G5.getText().toString().equals("F")){
                G5=0.0;
            }
           a = credit*5;
           total = ((G1*credit)+(G2*credit)+(G3*credit)+(G4*credit)+(G5+credit));
            GPA = total/a;
            //msg+=("Points:"+total);
            if (GPA<1.25){
                text_Result.setBackgroundColor(Color.RED);
                msg = "Retire";
            }else if (GPA>=1.25&&GPA<=1.99){
                text_Result.setBackgroundColor(Color.YELLOW);
                msg = "Probation";
            }else  if (GPA>=2.00&&GPA<=4.00){
                text_Result.setBackgroundColor(Color.GREEN);
                msg = "Nomal";
            }
            text_Result.setText(""+"Points:"+total+"\n"+"Credits:"+a+"\n"+"GPA:"+GPA+"\n"+"Status:"+msg);
        }
        else if (id==R.id.btn_Back){
                finish();
        }
    }
}