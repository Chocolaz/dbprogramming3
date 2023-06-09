import java.sql.*;

public class LAB14 {
    public static void main(String[] args) {
        String URL = "jdbc:mysql://localhost:3306/mydb3";
        String username = "root";
        String password = "mysql@sit";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con= DriverManager.getConnection(URL, username, password);
            DatabaseMetaData meta = con.getMetaData();
            System.out.println("database URL: " + meta.getURL());
            System.out.println("database URL: " + meta.getURL());
            System.out.println("database product name: " + meta.getDatabaseProductName());
            System.out.println("database product version" + meta.getDatabaseProductVersion());
            System.out.println("JDBC driver name: "+ meta.getDriverName());
            System.out.println("JDBC driver version: "+ meta.getDriverVersion());
            System.out.println("JDBC major version: "+ meta.getDriverMajorVersion());
            System.out.println("JDBC minor version: "+ meta.getDriverMinorVersion());
            System.out.println("Max number of connections: " + meta.getMaxTableNameLength());
            System.out.println("MaxColumnsInTable: " + meta.getMaxColumnsInTable());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
