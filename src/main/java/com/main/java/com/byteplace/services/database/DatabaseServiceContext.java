package com.byteplace.services.database;

import java.sql.ResultSet;

public class DatabaseServiceContext {
    DatabaseServiceStrategy databaseServiceStrategy;

    public void setStrategy(DatabaseServiceStrategy databaseServiceStrategy) {
        this.databaseServiceStrategy = databaseServiceStrategy;
    }

    public ResultSet executeQuery(String query) throws Exception {
        return this.databaseServiceStrategy.executeQuery(query);
    }

    public int executeCommand(String command) throws Exception {
        return this.databaseServiceStrategy.executeCommand(command);
    }

}
