package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button buttonviewAll,buttonAdd;
    EditText customerName,age;
    Switch customerStatus;
    ListView listview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        buttonviewAll=findViewById(R.id.viewall);
        buttonAdd=findViewById(R.id.button_add);
        customerName=findViewById(R.id.customer_name);
        age=findViewById(R.id.customer_age);
        customerStatus=findViewById(R.id.customer_status);
        listview=findViewById(R.id.listview);


        buttonAdd.setOnClickListener(new View.OnClickListener() {
            CustomerModel customerModel;
            @Override
            public void onClick(View view) {
                try {
                    customerModel=new CustomerModel(1,customerName.getText().toString(),Integer.parseInt(age.getText().toString()),customerStatus.isChecked());



                }
                catch (Exception e){
                    Toast.makeText(MainActivity.this,"Error found",Toast.LENGTH_LONG).show();

                }
                DbConnect db=new DbConnect(MainActivity.this);
                Boolean success=db.insertData(customerModel);

                if(success){
                    Toast.makeText(MainActivity.this,"Success",Toast.LENGTH_LONG).show();

                }
                else{
                    Toast.makeText(MainActivity.this,"Error found",Toast.LENGTH_LONG).show();

                }



            }
        });

        buttonviewAll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(MainActivity.this,"Button Viewall",Toast.LENGTH_LONG).show();

            }
        });

    }



}
