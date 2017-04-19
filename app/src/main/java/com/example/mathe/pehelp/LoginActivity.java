package com.example.mathe.pehelp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    private EditText nlogin;
    private EditText nSenha;
    private Button nBtn;
    private TextView mCadastro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        nlogin = (EditText) findViewById(R.id.login);
        nSenha = (EditText) findViewById(R.id.senha);
        nBtn = (Button) findViewById(R.id.btn);
        mCadastro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(LoginActivity.this,CadastroActivity.class);
                startActivity(intent2);
            }
        });

        nBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                logar();
            }
        });

    }

    private void logar() {
        String[] users = {"julianajags", "rebecad", "anacarol"};
        String password = "jujutop";
        String user = nlogin.getText().toString();
        String pass = nSenha.getText().toString();
        View focus = null;
        for (int x = 0; x < users.length; x++) {
            if(user.isEmpty()){
                nlogin.setError("Campo vazio!");
                focus = nlogin;
                focus.requestFocus();
            }else if(pass.isEmpty()){
                nSenha.setError("Campo vazio!");
                focus = nSenha;
                focus.requestFocus();
            }else if(user.equals(users[x]) && pass.equals(password)){
                Intent intent = new Intent(this, MenuActivity.class);
                Bundle bundle = new Bundle();
                bundle.putString("user", users[x]);
                intent.putExtras(bundle);
                startActivity(intent);
                finish();
            }


        }

    }




}





