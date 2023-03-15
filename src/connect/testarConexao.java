package connect;

import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class testarConexao {

    public static void main(String[] args) throws SQLException {
        try (Connection connection = new connect().getConnection()) {
            JOptionPane.showMessageDialog(null, "Conexão Efetuada com Sucesso" );
        }
    }
}
