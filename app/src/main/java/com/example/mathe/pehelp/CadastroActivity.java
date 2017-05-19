package com.example.mathe.pehelp;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.mathe.config.ConfigFireBase;
import com.example.mathe.helper.Usuario;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseAuthInvalidCredentialsException;
import com.google.firebase.auth.FirebaseAuthUserCollisionException;
import com.google.firebase.auth.FirebaseAuthWeakPasswordException;
import com.google.firebase.auth.FirebaseUser;

public class CadastroActivity extends AppCompatActivity {
    private EditText nome;
    private EditText email;
    private EditText senha;
    private Button botaoCadastrar;
    private Usuario usuario;
    private FirebaseAuth autenticacao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);


        nome = (EditText) findViewById(R.id.cadastrar_nomeId);
        email = (EditText) findViewById(R.id.cadastrar_emailId);
        senha = (EditText) findViewById(R.id.senhaId);
        botaoCadastrar = (Button) findViewById(R.id.botaoCadastrarId);

        botaoCadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                usuario = new Usuario();
                usuario.setNome(nome.getText().toString());
                usuario.setEmail(email.getText().toString());
                usuario.setSenha(senha.getText().toString());
                cadastradoUsuario();
            }
        });
    }
    private void cadastradoUsuario(){
        autenticacao = ConfigFireBase.getFirebaseAuth();
        autenticacao.createUserWithEmailAndPassword(usuario.getEmail(),usuario.getSenha()).addOnCompleteListener(
                CadastroActivity.this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()){
                            Toast.makeText(CadastroActivity.this,"Sucesso ao cadastrar usuário",Toast.LENGTH_SHORT).show();
                            //criando um usuario firebase a partir da task e adicionando o id em uma instancia da classe usuário
                            FirebaseUser usuarioFirebase = task.getResult().getUser();
                            usuario.setId(usuarioFirebase.getUid());
                            usuario.salvar();

                            autenticacao.signOut();
                            finish();
                        }else{
                            String erro = "";
                            try{
                                throw task.getException();
                            }catch(FirebaseAuthWeakPasswordException e){
                                erro = "Digite uma senha mais forte, contendo mais caracteres e com letras e números";
                            }catch(FirebaseAuthInvalidCredentialsException e){
                                erro= "O email é inválido, digite outro email";
                            }catch(FirebaseAuthUserCollisionException e){
                                erro = "O usuário já existe";
                            }catch(Exception e){
                                erro= "Ao cadastrar o usuário";
                                e.printStackTrace();
                            }
                            Toast.makeText(CadastroActivity.this,"Erro "+ erro,Toast.LENGTH_SHORT).show();
                        }
                    }
                }
        );
    }
}
