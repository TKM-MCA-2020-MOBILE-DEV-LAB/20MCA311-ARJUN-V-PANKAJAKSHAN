package com.example.myapplication;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DbConnect extends SQLiteOpenHelper {


    public static final String CUSTOMER = "customer";
    public static final String ID = "id";
    public static final String CUSTOMER_NAME = "customer_name";
    public static final String CUSTOMER_AGE = "customer_age";
    public static final String CUSTOMER_STATUS = "customer_status";

    public DbConnect(@Nullable Context context) {
        super(context, CUSTOMER + ".DB",null,1);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        String query= "Create table " + CUSTOMER + "(" + ID + " integer primary key autoincrement," + CUSTOMER_NAME + " text," + CUSTOMER_AGE + " int," + CUSTOMER_STATUS + " bool)";

        sqLiteDatabase.execSQL(query);

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }

    public boolean insertData(CustomerModel customerModel){
        SQLiteDatabase sqLiteDatabase=this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put(CUSTOMER_NAME,customerModel.getCustomerName());
        contentValues.put(CUSTOMER_AGE,customerModel.getCustomerAge());
        contentValues.put(CUSTOMER_STATUS,customerModel.getCutomerStatus());
        long insert=sqLiteDatabase.insert(CUSTOMER,null,contentValues);
        if (insert==-1){
            return false;
        }
        else {
            return true;
        }
    }
}
