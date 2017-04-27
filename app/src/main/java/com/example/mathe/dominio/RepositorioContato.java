package com.example.mathe.dominio;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.widget.ArrayAdapter;

import com.example.mathe.dominio.entidades.Contato;

/**
 * Created by sergior on 19/04/17.
 */

public class RepositorioContato {

    private SQLiteDatabase connection;

    public RepositorioContato(SQLiteDatabase connection) {
        this.connection = connection;
    }

    public void inserir(Contato contato) {
        ContentValues values = new ContentValues();
        values.put("NOME", contato.getNome());
        values.put("TELEFONE", contato.getTelefone());
        values.put("TIPOTELEFONE", contato.getTipoTelefone());

        connection.insertOrThrow("CONTATO", null, values);
    }

    public ArrayAdapter<Contato> buscaContatos(Context context) {
        ArrayAdapter<Contato> adapter
                = new ArrayAdapter<Contato>(context, android.R.layout.simple_list_item_1);

        Cursor cursor = connection.query("CONTATO", null, null, null, null, null, null);

        if (cursor.getCount() > 0) {
            cursor.moveToFirst();
            do {
                Contato contato = new Contato();
                contato.setId(cursor.getLong(0));
                contato.setNome(cursor.getString(1));
                contato.setTelefone(cursor.getString(2));
                contato.setTipoTelefone(cursor.getString(3));
                adapter.add(contato);
            } while (cursor.moveToNext());
        }
        return adapter;
    }
}
