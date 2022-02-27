package com.example.co3_q3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void callActivity(View view) {
        Intent i = new Intent(getApplicationContext(), MainActivity2.class);
        final EditText editText1 = (EditText)findViewById(R.id.name);
        String msg = editText1.getText().toString();
        final EditText editText2 = (EditText)findViewById(R.id.address);
        String add = editText2.getText().toString();
        final EditText editText3 = (EditText)findViewById(R.id.email);
        String em = editText3.getText().toString();
        i.putExtra("Value1", msg);
        i.putExtra("Value2", add);
        i.putExtra("Value3", em);
        startActivity(i);
    }
}