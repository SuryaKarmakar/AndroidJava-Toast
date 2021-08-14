package com.cybextron.toastmessage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button bt1 = (Button) findViewById(R.id.btn1);
        Button bt2 = (Button) findViewById(R.id.btn2);
        Button bt3 = (Button) findViewById(R.id.btn3);

        Toast toast = Toast.makeText(getApplicationContext(), "This is Toast Object", Toast.LENGTH_SHORT);

        // Make a toast object and show it with help of the show() function
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Toast toast = Toast.makeText(getApplicationContext(), "This is Toast Object", Toast.LENGTH_SHORT);
                toast.show();
            }
        });

        // Call the toast in one line
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "This is One Line Toast", Toast.LENGTH_SHORT).show();
            }
        });

        // Pass the toast message into function
        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showToast("Pass Toast Message");
            }
        });
    }
    public void showToast (String msg){
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }
}