package com.example.mathe.teladecadastro;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

/**
 * Created by mathe on 07/03/2017.
 */

public class MenuActivity extends Activity implements View.OnClickListener{
      private GoogleApiClient client;
      private Button btnFazerLogin;
      private Button btnMapa;
      private Button btnInfo;
//    private TextView cTexto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
          client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
          btnFazerLogin=(Button)findViewById(R.id.btnl);
          btnMapa= (Button)findViewById(R.id.btnm);
          btnInfo= (Button)findViewById(R.id.btninf);
          btnFazerLogin.setOnClickListener(this);
          btnMapa.setOnClickListener(this);
//        cTexto = (TextView)findViewById(R.id.texto);
//        Bundle bundle = getIntent().getExtras();
//        String texto = bundle.getString("user");
//        cTexto.setText("Seja bem vinda (o), " + texto + "!");
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
        }
    }
}
