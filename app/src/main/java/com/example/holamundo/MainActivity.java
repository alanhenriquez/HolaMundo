package com.example.holamundo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.net.URI;

public class MainActivity extends AppCompatActivity {

    private Button _btn_link;
    String _url = "https://estudiantes.ugb.edu.sv/";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        _btn_link = findViewById(R.id.ugblink);
        _btn_link.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Uri _link = Uri.parse(_url);
               Intent i = new Intent(Intent.ACTION_VIEW,_link);
               startActivity(i);


           }
        });



    }


}