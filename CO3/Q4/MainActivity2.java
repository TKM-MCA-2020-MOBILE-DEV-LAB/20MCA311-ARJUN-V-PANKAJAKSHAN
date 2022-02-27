package com.example.co3_q4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.option_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.i1:
                Intent i1 = new Intent(getApplicationContext(),MainActivity2.class);
                startActivity(i1);
                return true;
            case R.id.si1:
                Intent si2 = new Intent(getApplicationContext(),MainActivity3.class);
                startActivity(si2);
                return true;
            case R.id.si2:
                Intent si3 = new Intent(getApplicationContext(),MainActivity4.class);
                startActivity(si3);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}