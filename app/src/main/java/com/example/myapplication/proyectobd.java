package com.example.myapplication;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.sql.Date;
import java.sql.Time;

public class proyectobd extends SQLiteOpenHelper {

    private static final String CURSO_BD = "developeru.bd";
    private static final int VERSION_BD = 1;
    private static final String TABLA_CURSOS = "CREATE TABLE CURSOS(CODIGO TEXT PRIMARY KEY, CURSO TEXT, HORA TIME, DIA DATE)";

    public proyectobd(@Nullable Context context) {
        super(context, CURSO_BD, null, VERSION_BD);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(TABLA_CURSOS);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS" + TABLA_CURSOS);
        sqLiteDatabase.execSQL(TABLA_CURSOS);
    }

    public void agregarCursos(String codigo, String curso, Time hora, Date dia) {
        SQLiteDatabase bd = getWritableDatabase();

        if (bd != null) {
            bd.execSQL("INSERT INTO CURSOS VALUES('" + codigo + "', '" + curso + "', '" + hora + "', '" + dia + "')");
            bd.close();
        }
    }
}
