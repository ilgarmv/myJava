package aboutSQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import static aboutSQL.Util.*;

public class CreateTables {


    static void createTables() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection connection = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD);

            String createTableQuery1 = "CREATE TABLE IF NOT EXISTS table1 (" +
                    "id INT AUTO_INCREMENT PRIMARY KEY," +
                    "name VARCHAR(50) NOT NULL UNIQUE," +
                    "age INT NOT NULL," +
                    "bin BINARY," +
                    "un INT UNSIGNED," +
                    "zf INT ZEROFILL," +
                    "g INT GENERATED ALWAYS AS (age + 10) VIRTUAL)";

            String createTableQuery2 = "CREATE TABLE IF NOT EXISTS table2 (" +
                    "id INT AUTO_INCREMENT PRIMARY KEY," +
                    "email VARCHAR(50) NOT NULL UNIQUE," +
                    "address VARCHAR(100)," +
                    "bin BINARY," +
                    "un INT UNSIGNED," +
                    "zf INT ZEROFILL," +
                    "g INT GENERATED ALWAYS AS (LENGTH(address)) STORED)";

            Statement statement = connection.createStatement();
            statement.executeUpdate(createTableQuery1);
            statement.executeUpdate(createTableQuery2);
            String insertDataQuery1 = "INSERT INTO table1 (id, name, age) VALUES " +
                    "(1, 'Ilgar', 18,), ";

            String insertDataQuery2 = "INSERT INTO table2 (id, email, address) VALUES " +
                    "(1, 'musayev@veezet.com', '139 Gunashli'), " +
                    "(2, 'nuri@ibrahim.com', '14A Nerimanov')";


            statement.executeUpdate(insertDataQuery1);
            statement.executeUpdate(insertDataQuery2);

            connection.close();

            System.out.println("Tables created successfully.");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}
