package com.example.alexandra.mentorme;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import android.database.sqlite.*;
/**
 * Created by Alexandra on 4/25/2018.
 */

public class Database extends SQLiteOpenHelper {
    private static final String DATABASE_NAME="users.db";
    private static final int DATABASE_VERSION=1;
    private static final String TABLE_NAME="users_table";
    private static final String ID="id";
    private static final String USERNAME="uname";
    private static final String NAME="uname";
    private static final String PASSWORD="pass";
    private static final String CPASSWORD="cpass";
    private static final String EMAIL="email";
    private static final String SUBJECT="subject";
    SQLiteDatabase sqLiteDatabase;

    private static final String CREATE_TABLE_QUERY=
            "CREATE TABLE " + TABLE_NAME + "(" + ID + "INTEGER PRIMARY KEY AUTOINCREMENT, "  + USERNAME + "TEXT, " + NAME + "TEXT" + PASSWORD + "TEXT" + CPASSWORD + "TEXT" + EMAIL + "TEXT" + SUBJECT + "TEXT" + ")" ;

    private static final String DROP_TABLE_QUERY = "DROP TABLE IF EXISTS " + TABLE_NAME;

    public Database(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(CREATE_TABLE_QUERY);}

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS "+ TABLE_NAME);
        onCreate(sqLiteDatabase);
    }
    public void insertContact(Contact c)
    {
        SQLiteDatabase sqLiteDatabase = this.getWritableDatabase();
        ContentValues values = new ContentValues();

        String query = "select * from users";
        Cursor cursor = sqLiteDatabase.rawQuery(query, null);
        int count = cursor.getCount();

        values.put(ID, count);
        values.put(USERNAME, c.getUname());
        values.put(PASSWORD, c.getPass());
        values.put(CPASSWORD, c.getCpass());
        values.put(EMAIL, c.getEmail());
        values.put(SUBJECT, c.getSubject());
        values.put(NAME, c.getName());

        sqLiteDatabase.insert(TABLE_NAME, null, values);

    }
    public String searchPass (String uname)
    {
        sqLiteDatabase = this.getReadableDatabase();
        String query= "select uname, pass from " + TABLE_NAME;
        Cursor cursor = sqLiteDatabase.rawQuery(query, null);
        String a, b;
        b="not found";
        if(cursor. moveToFirst())
        {
            do{
                a= cursor.getString(0);

                if(a.equals(uname))
                {
                    b= cursor.getString(1);
                    break;
                }
            }
            while(cursor.moveToNext());
        }
        return b;
    }

}






