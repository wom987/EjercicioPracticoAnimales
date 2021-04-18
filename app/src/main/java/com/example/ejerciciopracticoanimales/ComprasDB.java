package com.example.ejerciciopracticoanimales;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class ComprasDB  extends SQLiteOpenHelper {
    public static final String NOMBRE_DB="compras.db";
    public static final int VERSION=1;
    public static final String TABLA="CREATE TABLA (ART TEXT, PRECIO DOUBLE)";

    public ComprasDB(@Nullable Context context ) {
        super(context, NOMBRE_DB, null, VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(TABLA);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS '" + TABLA+"'") ;
        db.execSQL(TABLA);
    }
    public void agregar(String art, double precio){
    SQLiteDatabase db = getWritableDatabase();
        if(db!=null){
            db.execSQL("INSERT INTO CURSOS VALUES ('"+art+"','"+precio+"')");
            db.close();
        }
    }
}
