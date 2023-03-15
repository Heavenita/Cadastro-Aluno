package functions;
import java.sql.*;
import javax.swing.JOptionPane;

public class cadastrar {
    private String nome;
    private String email;
    private String dia;
    private String mes;
    private String ano;
    private String Curso;
    private float matematica;
    private float historia;
    private float fisica;

    public cadastrar(String nome, String email, String dia,String mes, String ano, String Curso, float matematica, float historia, float fisica) {
        this.nome = nome;
        this.email = email;
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        this.Curso = Curso;
        this.matematica = matematica;
        this.historia = historia;
        this.fisica = fisica;
    }

    public String getNome() {
        return nome;
    }
   

    public String getEmail() {
        return email;
    }


    public String getDia() {
        return dia;
    }
    

    public String getCurso() {
        return Curso;
    }
   

    public float getMatematica() {
        return matematica;
    }
   

    public float getHistoria() {
        return historia;
    }

    public String getMes() {
        return mes;
    }
    
    public float getFisica() {
        return fisica;
    }   

    public String getAno() {
        return ano;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public void setCurso(String Curso) {
        this.Curso = Curso;
    }

    public void setMatematica(float matematica) {
        this.matematica = matematica;
    }

    public void setHistoria(float historia) {
        this.historia = historia;
    }

    public void setFisica(float fisica) {
        this.fisica = fisica;
    }

    
    
    
    public String data(){
        try{
            String dataSQL = getAno()+"-"+getMes()+"-"+getDia();
            return dataSQL;
        }catch(Exception e){
            JOptionPane.showInternalMessageDialog(null, "Formato de data invalido: " + e);
        }
        return null;
    }
    
    public void cadastrar(Connection conn) throws SQLException{
        float media = (getMatematica()+getFisica()+getHistoria())/3;
        String situacaoAluno = null;
        
        if(media < 5){
            situacaoAluno = "Reprovado";
        }else if(media>=6){
            situacaoAluno = "Aprovado";
        }else if((media<6)&&(media>=5)){
            situacaoAluno = "Recuperação";
        }
        

        try{String sqlInsert = "INSERT INTO `Alunos`(`nome`, `email`, `dataNas`, `Curso`, `Matematica`, `Historia`, `Fisica`, `Media`, `SituacaoAluno`) VALUES (?,?,?,?,?,?,?,?,?)";
            
        
            PreparedStatement stm;
            stm = conn.prepareStatement(sqlInsert);
            stm.setString(1, getNome());
            stm.setString(2, getEmail());
            stm.setString(3, data());
            stm.setString(4, getCurso());
            stm.setFloat(5, getMatematica());
            stm.setFloat(6, getHistoria());
            stm.setFloat(7, getFisica());
            stm.setFloat(8, media);
            stm.setString(9, situacaoAluno);

            stm.execute();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Falha ao iserir os dados no banco de dados: " + e);
           
        }
    }
    

}
