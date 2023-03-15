package functions;

import connect.connect;
import java.sql.*;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class tabela {

    private JTable tabela;
    private String ordem;

    public tabela(JTable tabela, String ordem) {
        this.tabela = tabela;
        this.ordem = ordem;
    }

    public String getOrdem() {
        return ordem;
    }

    public void setOrdem(String ordem) {
        this.ordem = ordem;
    }

    public JTable getTabela() {
        return tabela;
    }

    public void setTabela(JTable tabela) {
        this.tabela = tabela;
    }

    public void ordemAlfabetica(Connection connection) throws SQLException {
        DefaultTableModel modelo = (DefaultTableModel) getTabela().getModel();
        modelo.setNumRows(0);

        getTabela().getColumnModel().getColumn(0);
        getTabela().getColumnModel().getColumn(1);
        getTabela().getColumnModel().getColumn(2);
        getTabela().getColumnModel().getColumn(3);
        getTabela().getColumnModel().getColumn(4);
        getTabela().getColumnModel().getColumn(5);
        getTabela().getColumnModel().getColumn(6);
        getTabela().getColumnModel().getColumn(7);
        getTabela().getColumnModel().getColumn(8);

        try {
            Connection conn = connect.getConnection();
            PreparedStatement stm;
            ResultSet resultado;

            stm = conn.prepareStatement("SELECT * FROM `Alunos` ORDER BY " + getOrdem() + ";");
            resultado = stm.executeQuery();
            
            int i = 0;
            while (resultado.next()) {
                
                String data = resultado.getString(4);
                if(data!=null){
                String dia = data.substring(8, 10);
                String mes = data.substring(5, 7);
                String ano = data.substring(0, 4);
                String dataNascimento = dia + "/" + mes + "/" + ano;

                modelo.addRow(new Object[]{
                    resultado.getString(2),
                    resultado.getString(3),
                    dataNascimento,
                    resultado.getString(5),
                    resultado.getString(6),
                    resultado.getString(7),
                    resultado.getString(8),
                    resultado.getString(9),
                    resultado.getString(10)});
                }else{
                   modelo.addRow(new Object[]{
                    resultado.getString(2),
                    resultado.getString(3),
                    resultado.getString(5),
                    resultado.getString(6),
                    resultado.getString(7),
                    resultado.getString(8),
                    resultado.getString(9),
                    resultado.getString(10)}); 
                }
            }

        } catch (SQLException ex) {
            
        }

    }
}
