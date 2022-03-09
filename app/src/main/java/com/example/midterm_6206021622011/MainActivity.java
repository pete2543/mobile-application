package com.example.midterm_6206021622011;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AlertDialog;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity<id> extends AppCompatActivity implements View.OnClickListener {
    private Button btn_GPA,btn_Quit,btn_About,btn_Tax,btn_Show;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_About = (Button) findViewById(R.id.btn_About);
        btn_About.setOnClickListener(this);
        btn_GPA = (Button) findViewById(R.id.btn_GPA);
        btn_GPA.setOnClickListener(this);
        btn_Tax = (Button) findViewById(R.id.btn_Tax);
        btn_Tax.setOnClickListener(this);
        btn_Quit = (Button) findViewById(R.id.btn_Quit);
        btn_Quit.setOnClickListener(this);
        btn_Show = (Button) findViewById(R.id.btn_Show);
        btn_Show.setOnClickListener(this);
    }
    @Override
    public void onClick(View view){
        int d = view.getId();
        if (d==R.id.btn_GPA){
            GPA();
        }
    else if (d ==R.id.btn_Tax){
        Tax();
    }
    else if (d ==R.id.btn_Quit) {
            showAlertDialog();
        }
    }
    public void GPA() {
        Intent launchGPA = new Intent(MainActivity.this, GPA_Activity.class);
        startActivity(launchGPA);
    }public void Tax() {
        Intent launchTax = new Intent(MainActivity.this, Tax_Activity.class);
        startActivity(launchTax);
    }
    public void showAlertDialog() {
        final AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setCancelable(false);
        builder.setTitle("Exit");
        builder.setMessage("Are you sure you want to leave ?");
        builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        });
        builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });
        builder.create().show();
    }
}