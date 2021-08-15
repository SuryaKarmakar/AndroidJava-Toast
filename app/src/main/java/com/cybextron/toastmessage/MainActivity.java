package com.cybextron.toastmessage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn1 = (Button) findViewById(R.id.btn1);
        Button btn2 = (Button) findViewById(R.id.btn2);
        Button btn3 = (Button) findViewById(R.id.btn3);
        Button btn4 = (Button) findViewById(R.id.btn4);

        //Creating the LayoutInflater instance
        LayoutInflater li = getLayoutInflater();
        //Getting the View object as defined in the custom_toast.xml file
        View layout = li.inflate(R.layout.custom_toast,(ViewGroup) findViewById(R.id.customtoast));

        // Simple toast message
        btn1.setOnClickListener(view -> {
            Toast toast = Toast.makeText(getApplicationContext(), "Simple Toast Message", Toast.LENGTH_SHORT);
            toast.show();
        });

        // Show long duration toast message with methode chaining
        btn2.setOnClickListener(view -> {
            Toast.makeText(getApplicationContext(), "Show Long Duration Toast", Toast.LENGTH_LONG).show();
        });

        // Set toast position or gravity
        btn3.setOnClickListener(view -> {
            Toast toast = Toast.makeText(getApplicationContext(), "Set Toast Position", Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.BOTTOM | Gravity.LEFT, 10, 20);
            toast.show();
        });

        // Set toast custom layout
        btn4.setOnClickListener(view -> {
            Toast toast = Toast.makeText(getApplicationContext(), "Set Toast Position", Toast.LENGTH_SHORT);
            toast.setView(layout);
            toast.show();
        });

    }
    public void showToast (String msg){
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }
}