package com.example.mathe.dominio.entidades;

import java.io.Serializable;

/**
 * Created by sergior on 19/04/17.
 */

public class Contato implements Serializable {

    private long id;
    private String nome;
    private String telefone;
    private String tipoTelefone;

    public Contato() {

    }

    public String getTipoTelefone() {
        return tipoTelefone;
    }

    public void setTipoTelefone(String tipoTelefone) {
        this.tipoTelefone = tipoTelefone;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String toString() {
        return nome + ": " + telefone;
    }

}
