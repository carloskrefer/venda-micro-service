package com.byteplace.services.database;

import java.sql.ResultSet;

public class MySQLService implements DatabaseServiceStrategy {

    public ResultSet executeQuery(String query) throws Exception {
        // Executar query (select) e retornar resultado
    }

    public int executeCommand(String command) throws Exception {
        // Executar comando (insert, update ou delete) e retornar número de linhas afetadas
    }

}
