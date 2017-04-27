package com.example.mathe.pehelp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MenuUsuarioActivity extends AppCompatActivity {

    private Button botaoContatoConf;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_usuario);

        botaoContatoConf = (Button) findViewById(R.id.btn_contato_conf);
        botaoContatoConf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuUsuarioActivity.this,
                        ContatoDeConfianca.class);
                startActivity(intent);
            }
        });
    }
}
