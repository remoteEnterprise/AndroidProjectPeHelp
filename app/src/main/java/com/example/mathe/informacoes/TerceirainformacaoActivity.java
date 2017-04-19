package com.example.mathe.informacoes;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.mathe.pehelp.R;

/**
 * Created by stewen on 18/04/17.
 */

public class TerceirainformacaoActivity extends Activity {
    private TextView but_three;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_infoprocedimento);

        but_three = (TextView) findViewById(R.id.btn_infoProcedimento);
        but_three.setText("Título IV\n" +
                "\n" +
                "Dos Procedimentos\n" +
                "\n" +
                "Capítulo I\n" +
                "Disposições Gerais\n" +
                "\n" +
                "Art. 13. Ao processo, ao julgamento e à execução das causas cíveis e criminais decorrentes da prática de violência doméstica e familiar contra a mulher aplicar-se-ão as normas dos códigos de Processo Penal e Processo Civil e da legislação específica relativa à criança, ao adolescente e ao idoso que não conflitarem com o estabelecido nesta Lei.\n" +
                "\n" +
                "Art. 14. Os Juizados de violência Doméstica e Familiar contra a mulher, órgãos da justiça Ordinária com competência cível e criminal, poderão ser criados pela união, no Distrito Federal e nos Territórios, e pelos Estados, para o processo, o julgamento e a execução das causas decorrentes da prática de violência doméstica e familiar contra a mulher. Parágrafo único. Os atos processuais poderão realizar-se em horário noturno, conforme dispuserem as normas de organização judiciária.\n" +
                "\n" +
                "Art. 15. É competente, por opção da ofendida, para os processos cíveis regidos por esta Lei, o Juizado:\n" +
                "\n" +
                "I- do seu domicílio ou de sua residência;\n" +
                "\n" +
                "II- do lugar do fato em que se baseou a demanda;\n" +
                "\n" +
                "III- do domicílio do agressor;\n" +
                "\n" +
                "Art. 16. Nas ações penais públicas condicionadas à representação da ofendida de que trata esta Lei, só será admitida a renúncia à representação perante o juiz, em audiência especialmente designada com tal finalidade, antes do recebimento da denúncia e ouvido o Ministério Público.\n" +
                "\n" +
                "Art. 17. É vedada aplicação, nos casos de violência doméstica e familiar contra a mulher, de penas de cesta básica ou outras de prestação pecuniária, bem como substituição de pena que implique o pagamento isolado de multa. ");


    }

}
