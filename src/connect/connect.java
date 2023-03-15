package connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class connect {

    public static Connection getConnection() {
        try {
            return DriverManager.getConnection("jdbc:mysql://localhost:3306/programacao", "root", "");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Problemas com a Conexão do Banco de Dados: " + e);
        }
        return null;
    }
}
