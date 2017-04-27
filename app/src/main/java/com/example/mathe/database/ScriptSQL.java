package com.example.mathe.database;

/**
 * Created by sergior on 19/04/17.
 */

public class ScriptSQL {

    public static String getCreateContato() {
        StringBuilder sqlBuilder = new StringBuilder();
        sqlBuilder.append("CREATE TABLE IF NOT EXISTS CONTATO (");
        sqlBuilder.append("_id                INTEGER       NOT NULL ");
        sqlBuilder.append("PRIMARY KEY AUTOINCREMENT, ");
        sqlBuilder.append("NOME               VARCHAR (50), ");
        sqlBuilder.append("TELEFONE           VARCHAR (14), ");
        sqlBuilder.append("TIPOTELEFONE       VARCHAR (1));");
        return sqlBuilder.toString();
    }

}
