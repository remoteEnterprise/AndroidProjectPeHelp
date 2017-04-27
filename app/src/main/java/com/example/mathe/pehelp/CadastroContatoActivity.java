package com.example.mathe.pehelp;

import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

import com.example.mathe.database.Database;
import com.example.mathe.dominio.RepositorioContato;
import com.example.mathe.dominio.entidades.Contato;

public class CadastroContatoActivity extends AppCompatActivity {

    private EditText nome;
    private EditText telefone;
    private Spinner spinnerTipoTel;
    private ArrayAdapter<String> adpTipoTel;

    private Database database;
    private SQLiteDatabase connection;
    private RepositorioContato repositorioContato;
    private Contato contato;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_contato);

        nome = (EditText) findViewById(R.id.inputName);
        telefone = (EditText) findViewById(R.id.inputNumber);
        spinnerTipoTel = (Spinner) findViewById(R.id.spnTypeNumber);

        adpTipoTel = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item);
        adpTipoTel.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinnerTipoTel.setAdapter(adpTipoTel);
        adpTipoTel.add("Celular");
        adpTipoTel.add("Residencial");
        adpTipoTel.add("Outros");

        Bundle bundle = getIntent().getExtras();

        if ((bundle != null) && (bundle.containsKey("CONTATO"))) {
            contato = (Contato) bundle.getSerializable("CONTATO");
            preencheDados();
        } else {
            contato = new Contato();
        }

        try {
            database = new Database(this);
            connection = database.getWritableDatabase();
            repositorioContato = new RepositorioContato(connection);
        } catch (SQLException ex) {
            AlertDialog.Builder dlg = new AlertDialog.Builder(this);
            dlg.setMessage("Erro " + ex.getMessage());
            dlg.setNeutralButton("Ok", null);
            dlg.show();
        }

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.cadastro_contato_menu, menu);

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.acao_1:
                if (contato.getId() == 0) {
                    inserir();

                }
                finish();
                break;
            case R.id.acao_2:
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    private void preencheDados() {
        nome.setText(contato.getNome());
        telefone.setText(contato.getTelefone());
        spinnerTipoTel.setSelection(Integer.parseInt(contato.getTipoTelefone()));
    }

    private void inserir() {
        try {
            contato = new Contato();
            contato.setNome(nome.getText().toString());
            contato.setTelefone(telefone.getText().toString());
            contato.setTipoTelefone(String.valueOf(spinnerTipoTel.getSelectedItemPosition()));
            repositorioContato.inserir(contato);
        } catch (Exception ex) {
            AlertDialog.Builder dlg = new AlertDialog.Builder(this);
            dlg.setMessage("Erro ao inserir os dados " + ex.getMessage());
            dlg.setNeutralButton("Ok", null);
            dlg.show();
        }
    }

}
