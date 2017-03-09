package com.example.mathe.teladecadastro;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by mathe on 07/03/2017.
 */

public class MenuActivity extends Activity {

    private TextView cTexto;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        cTexto = (TextView)findViewById(R.id.texto);
        Bundle bundle = getIntent().getExtras();
        String texto = bundle.getString("user");
        cTexto.setText("Seja bem vinda (o), " + texto + "!");
    }
}
