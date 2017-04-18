package com.example.mathe.pehelp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.mathe.informacoes.InformacoesActivity;

public class MenuActivity extends Activity implements View.OnClickListener{
    private Button btnFazerLogin;
    private Button btnMapa;
    private Button btnInfo_1234;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        btnFazerLogin=(Button)findViewById(R.id.btnl);
        btnMapa= (Button)findViewById(R.id.btnm);
        btnInfo_1234= (Button)findViewById(R.id.infor_1234);
        btnFazerLogin.setOnClickListener(this);
        btnMapa.setOnClickListener(this);
        btnInfo_1234.setOnClickListener(this);
    }

    public void onClick(View v) {
        switch (v.getId()) {

            case R.id.btnl:
                Intent intent = new Intent(this, LoginActivity.class);
                startActivity(intent);
                break;

            case R.id.btnm:
                intent = new Intent(this, MapsActivity.class);
                startActivity(intent);
                break;

            case R.id.infor_1234:
                intent = new Intent(this, InformacoesActivity.class);
                startActivity(intent);
                break;


        }
    }
}