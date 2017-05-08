package com.example.mathe.dialog;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.mathe.pehelp.R;

/**
 * Created by mathe on 08/05/2017.
 */

public class DialogMapa extends Dialog implements View.OnClickListener{

    public DialogMapa(Context context){
        super(context);
    }

    private Button btnmap;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dialog_mapa);
        btnmap = (Button)findViewById(R.id.btn);
        btnmap.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        dismiss();
    }
}
