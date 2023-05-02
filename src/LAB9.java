import java.sql.*;
import java.util.*;

public class LAB9 {
    public static void main(String[] args) {
        String URL = "jdbc:mysql://localhost:3306/mydb3";
        String username = "root";
        String password = "mysql@sit";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con= DriverManager.getConnection(URL, username, password);
            Statement statement = con.createStatement();
            String sql = "insert into student (studentID, firstName, lastName, email, deptID) "
                    + "values('111111', 'aaaa', 'bbbbb', 'aaaa@gmail.com', 'IT')";
            statement.executeUpdate(sql);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
