package test;

import java.sql.*;

/**
 * A utility class to handle connecting to MySQL databases.
 * @author mhh91
 */
public class MySQL {

    private String user;
    private String pass;
    private String database;
    private String host = "localhost";
    private int port = 3306;


    private MySQL(String host, String user, String pass, String database) {
        this.user = user;
        this.pass = pass;
        this.database = database;
        this.host = host;
    }

    /**
     * Sets the database up for connection.
     * @param host The name of the MySQL server to connect to.
     * @param user MySQL username.
     * @param password MySQL password.
     * @param database The Name of the database you want to connect to.
     * @return A new instance of <code>MySQL</code>.
     */
    public static MySQL setup(String host,String user, String password, String database) {
        return new MySQL(host, user, password, database);
    }
    
    /**
     * Use this method when connecting to the local MySQL server.
     * @param user MySQL username.
     * @param password MySQL password.
     * @param database The name of the database you want to connect to.
     * @return A new instance of <code>MySQL</code>.
     */
    
    public static MySQL setup(String user, String password, String database){
        return new MySQL("localhost", user, password, database);
    }

    /**
     * Sets the username and password for MySQL.
     * @param username MySQL's username.
     * @param password MySQL's password.
     */
    public void databaseLogin(String username, String password) {
        this.user = username;
        this.pass = password;
    }

    /**
     * Sets the server's hostname and port, default is localhost.
     * @param hostName The name of the MySQL server to connect to.
     * @param port connection port, default is 3306.
     */
    public void setHost(String hostName, int port) {
        this.host = hostName;
        this.port = port;
    }

    /**
     * Changes the database used.
     * @param databaseName The name of the database you want to connect to.
     */
    public void setDatabase(String databaseName) {
        this.database = databaseName;
    }

    /**
     * Connects to the database.
     * @return An instance of <code>Connection</code>.
     * @throws SQLException 
     */
    public Connection connect() throws SQLException {
        String connectionString = "jdbc:mysql://" + host + ":" + port + "/"
                + database;
        return DriverManager.getConnection(connectionString, user, pass);
    }
}
