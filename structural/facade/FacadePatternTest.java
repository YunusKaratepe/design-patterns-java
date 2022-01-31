package structural.facade;

import java.sql.Connection;

import structural.facade.HelperFacade.ReportTypes;

public class FacadePatternTest {
    public static void main(String[] args) {
        
        String tableName = "Employee";

        // generating MySql HTML report and Oracle PDF report without using Facade ->
        Connection conn = MySqlHelper.getMySqlDBConnection();
        MySqlHelper sqlHelper = new MySqlHelper();
        sqlHelper.generateMySqlHTMLReport(tableName, conn);

        Connection conn1 = OracleHelper.getOracleDBConnection();
        OracleHelper oracleHelper = new OracleHelper();
        oracleHelper.generateOraclePDFReport(tableName, conn);

        // generating with Facade
        HelperFacade.generateReport(HelperFacade.DBTypes.MYSQL, ReportTypes.HTML, tableName);
        HelperFacade.generateReport(HelperFacade.DBTypes.ORACLE, ReportTypes.HTML, tableName);    
    }
}
