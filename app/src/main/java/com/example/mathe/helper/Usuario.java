package com.example.mathe.helper;

import com.example.mathe.config.ConfigFireBase;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.Exclude;

/**
 * Created by joao on 19/05/2017.
 */

public class Usuario {
    private String id;
    private String nome;
    private String senha;
    private String email;

    public Usuario() {
    }

    public void salvar(){
        DatabaseReference referenciaFirebase = ConfigFireBase.getFirebase();
        referenciaFirebase.child("usuarios").child(getId()).setValue(this);
    }
    @Exclude
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Exclude
    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
