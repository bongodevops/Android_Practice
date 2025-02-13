package com.hafizurrahmanomar.fragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button button1,button2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //  Fragment connection code here

                FragmentManager fManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fManager.beginTransaction();
                fragmentTransaction.add(R.id.frameLayout,new firstFragment());
                fragmentTransaction.commit();



            }
        });



        // button2.setOnClickListener  code here


        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //  Fragment conection code here

                FragmentManager fManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fManager.beginTransaction();
                fragmentTransaction.add(R.id.frameLayout,new secondFragment());
                fragmentTransaction.commit();




            }
        });

    }
}