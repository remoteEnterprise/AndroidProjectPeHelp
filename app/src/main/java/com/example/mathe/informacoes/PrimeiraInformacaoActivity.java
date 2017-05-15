package com.example.mathe.informacoes;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.mathe.pehelp.R;

/**
 * Created by stewen on 18/04/17.
 */

public class PrimeiraInformacaoActivity extends Activity {

    private TextView but_one;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_infoviolencia);

        but_one = (TextView) findViewById(R.id.btn_infoViolencia);
        but_one.setText(" Título II\n" +
                "\n" +
                "  DA VIOLÊNCIA DOMÉSTICA E FAMILIAR CONTRA A MULHER\n" +
                "\n" +
                "  Capítulo I\n" +
                "\n" +
                "        Disposições gerais\n" +
                "\n" +
                "   Art. 5º Para os efeitos desda lei, configura violência doméstica e famíliar contra a mulher qualquer ação ou omissão baseada no gênero que lhe cause morte, lesão, sofrimento físico, " +
                "sexual ou psicológico e dano moral ou patrimonial:\n" +
                "\n" +
                "   I- no âmbito da unidade doméstica, compreendida como o espaço de convívio permanente de pessoas, com ou semvínculo familiar, inclusive as esporadicamento agregadas;\n " +
                "\n" +
                "   II- no âmbito da família, compreendida com a comunidade formada por indivíduos que são ou se consideram aparentados, unidos por laços naturais, por afinidade ou por vontade expressa;\n" + "\n"+
                "   III- em qualquer relação íntima de afeto, na qual o agressor conviva ou tenha convivido com a ofendida, independentemente de coabitação.\n" +
                "\n" +
                "   Parágrafo único. As relações pessoais enunciadas neste artigo independem de orientação sexual.\n" +
                "\n" +
                "   Art. 6º A violência doméstica e familiar contra a mulher constitui uma das formas de violação dos direitos humanos.\" ");

    }
}