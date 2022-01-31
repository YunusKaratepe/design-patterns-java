package structural.facade;

import java.sql.Connection;

public class MySqlHelper {

    public static Connection getMySqlDBConnection() {
        // get MySql DB connection using parameters.
        return null;
    }

    public void generateMySqlPDFReport(String tableName, Connection conn) {
        // get data from table and generate pdf report.
    } 

    public void generateMySqlHTMLReport(String tableName, Connection conn) {
        // get data from table and generate html report.
    }
}
