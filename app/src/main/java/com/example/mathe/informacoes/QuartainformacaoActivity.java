package com.example.mathe.informacoes;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.mathe.pehelp.R;

/**
 * Created by stewen on 18/04/17.
 */

public class QuartainformacaoActivity extends Activity{

    private TextView but_four;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_informedidas);

        but_four = (TextView) findViewById(R.id.btn_infoMedidas);

        but_four.setText(" Título IV\n" +
                "\n" +
                "Dos procedimentos\n" +
                "\n" +
                "Capítulo II\n" +
                "Das medidas Protetivas de Urgência\n" +
                "\n" +
                "Seção III das Medidas Protetivas de Urgência à ofendida\n" +
                "\n" +
                "Art. 23. Poderá o juiz, quando necessário, sem prejuízo de outras medidas:\n" +
                "\n" +
                "I- encaminhar a ofendida e seus dependentes a programa oficial ou comunitário de proteção ou atendimento;\n" +
                "\n" +
                "II- determinar a recondução da ofendida e a de seus dependentes ao respectivo domicílio, após afastamento do agressor;\n" +
                "\n" +
                "III- determinar o afastamento da ofendida do lar, sem prejuízo dos direitos relativos a bens, guarda dos filhos e alimentos;\n" +
                "\n" +
                "IV- determinar a separação de corpos.\n" +
                "\n" +
                "Art. 24. Para a proteção patrimonial dos bens da sociedade conjugal ou daqueles de propriedade particular da mulher, o juiz poderá determinar, liminarmente, as seguintes medidas, entre outras:\n" +
                "\n" +
                "I- restituição de bens indevidamente subtraídos pelo agressor à ofendida;\n" +
                "\n" +
                "II_ proibição temporária para a celebração de atos e contratos de compra, venda e locação de propriedade em comum, salvo expressa autorização judicial;\n" +
                "\n" +
                "III- suspensão das procurações conferidas pela ofendida ao agressor;\n" +
                "\n" +
                "IV- prestação de caução provisória, mediante depósito judicial, por perdas e danos materiais decorrentes da prática de violência doméstica e familiar contra a ofendida.\n" +
                "\n" +
                "Parágrafo único. Deverá o juiz oficiar ao cartório competente para os fins previstos nos incisos II e III deste artigo.");

    }
}
