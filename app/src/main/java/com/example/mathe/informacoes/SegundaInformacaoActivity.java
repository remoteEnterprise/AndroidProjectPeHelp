package com.example.mathe.informacoes;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.mathe.pehelp.R;

/**
 * Created by stewen on 17/04/17.
 */

public class SegundaInformacaoActivity extends Activity {
//    private GoogleApiClient client;
    private TextView but_two;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_infoassistencia);

        but_two = (TextView) findViewById(R.id.btn_infoAssistencia);
        but_two.setText("Título III\n" +
                "\n" +
                " Da assistência à mulher em situação de violêNcia doméstica e familiar\n" +
                "\n" +
                "  Capítulo II\n" +
                "\n" +
                "Da assistência à mulher em situação de violêNcia doméstica e familiar\n" +
                "\n" +
                " Art. 9º A assistência à mulher em situação de violência doméstica e familiar será prestada de forma articulada e conforme os princípio e as diretrizes previsto na lei Orgânica da Assistência social, no sistema único de saude pública, entre outras normas e políticas pública de proteção, e emergencialmente quando for o caso.\n" +
                "\n" +
                " #1º O juiz determinará, por prazo certo, a inclusão da mulher em situação de violễncia doméstica e familiar no cadastro de programas assistenciais do governo federal,estadual e municial.\n" +
                "\n" +
                " #2º O juiz assegurar à mulher em situação de violência doméstica e familiar, para preservar sua integridade física e psicológica:\n" +
                "\n" +
                " I- Acesso prioritário à remoção quando servidora pública, integrante da administração direta e indireta;\n" +
                "\n" +
                " II- Manutenção do vínculo trabalhista, quando necessário o afastamento do local de trabalho, por até seis meses.\n" +
                "\n" +
                " #3º A assistência à mulher em situação de violência doméstica e familiar compreenderá o acesso aos benefícios decorrentes do desen volvimento científico e tecnológico, incluindo os serviços de contracepção de emergẽncia, a profilaxia das doenças sexualmente transmissíveis (DST) e da síndrome da imunodeficiência adquirida (AIDS) e outros procedimentos médicos necessários e cabíveis nos casos de violência sexual.\n" +
                "\" ");
    }
}
