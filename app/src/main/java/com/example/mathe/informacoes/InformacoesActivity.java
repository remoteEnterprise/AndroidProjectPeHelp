package com.example.mathe.informacoes;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.mathe.pehelp.R;

/**
 * Created by stewen on 17/04/17.
 */

public class InformacoesActivity extends Activity implements View.OnClickListener {

    private TextView text;
    private Button inf1;
    private Button inf2;
    private Button inf3;
    private Button inf4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_informacoes);

        text = (TextView) findViewById(R.id.textoDesc);
        inf1 = (Button) findViewById(R.id.infOne);
        inf2= (Button) findViewById(R.id.infTwo);
        inf3= (Button) findViewById(R.id.infthree);
        inf4= (Button) findViewById(R.id.btnfour);
        inf1.setOnClickListener(this);
        inf2.setOnClickListener(this);
        inf3.setOnClickListener(this);
        inf4.setOnClickListener(this);
    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.infOne:
                Intent intent = new Intent(this, PrimeiraInformacaoActivity.class);
                startActivity(intent);

                break;
            case R.id.infTwo:
                intent = new Intent(this, SegundaInformacaoActivity.class);
                startActivity(intent);
                break;

            case R.id.infthree:
                intent = new Intent(this, TerceirainformacaoActivity.class);
                startActivity(intent);
                break;

            case R.id.btnfour:
                intent = new Intent(this, QuartainformacaoActivity.class);
                startActivity(intent);
                break;


        }



    }




}