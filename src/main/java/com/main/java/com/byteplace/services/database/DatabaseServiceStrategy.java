package com.byteplace.services.database;
import java.sql.ResultSet;

public interface DatabaseServiceStrategy {

    public abstract ResultSet executeQuery(String query) throws Exception;

    /* Returns number of rows affected.*/
    public abstract int executeCommand(String command) throws Exception;

}
