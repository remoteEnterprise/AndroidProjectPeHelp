package com.example.mathe.pehelp;

import android.content.Intent;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ListView;

import com.example.mathe.database.Database;
import com.example.mathe.dominio.RepositorioContato;
import com.example.mathe.dominio.entidades.Contato;

public class ContatoDeConfianca extends AppCompatActivity implements View.OnClickListener,
        AdapterView.OnItemClickListener {

    private ImageButton imgAdd;
    private EditText search;
    private ListView contatos;
    private ArrayAdapter<Contato> adapter;

    private Database database;
    private SQLiteDatabase connection;
    private RepositorioContato repositorioContato;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contato_de_confianca);

        imgAdd = (ImageButton) findViewById(R.id.btn_add);
        search = (EditText) findViewById(R.id.pesquisar);
        contatos = (ListView) findViewById(R.id.contatos_view);

        contatos.setOnItemClickListener(this);
        imgAdd.setOnClickListener(this);

        try {
            database = new Database(this);
            connection = database.getWritableDatabase();
            repositorioContato = new RepositorioContato(connection);

            adapter = repositorioContato.buscaContatos(this);

            contatos.setAdapter(adapter);

        } catch (SQLException ex) {
            AlertDialog.Builder dlg = new AlertDialog.Builder(this);
            dlg.setMessage("Erro " + ex.getMessage());
            dlg.setNeutralButton("Ok", null);
            dlg.show();
        }
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(this, CadastroContatoActivity.class);
        startActivityForResult(intent, 0);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        adapter = repositorioContato.buscaContatos(this);
        contatos.setAdapter(adapter);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Contato contato = adapter.getItem(position);
        Intent intent = new Intent(this, CadastroContatoActivity.class);
        intent.putExtra("CONTATO", contato);
        startActivityForResult(intent, 0);
    }
}
