package com.example.student.lab04;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

public class Lab04 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab04);

//        Context context = getApplicationContext();
//        CharSequence tostMsg = "Hello Toast";
//        int duration = Toast.LENGTH_SHORT;
//
//        Toast toast = Toast.makeText(context, tostMsg,duration);
//
//        toast.setGravity(Gravity.TOP,0,0);
//        toast.show();

        LayoutInflater inflate = getLayoutInflater();
        View layout = inflate.inflate(R.layout.customer_toast,(ViewGroup)findViewById(R.id.custom_toast_container));

        TextView text = (TextView) layout.findViewById(R.id.text);
        text.setText("This is a custom toast");

        Toast toast = new Toast(getApplicationContext());
        toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
        toast.setDuration(Toast.LENGTH_LONG);
        toast.setView(layout);
        toast.show();
    }
}
