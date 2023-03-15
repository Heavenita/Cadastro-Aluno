package View;
import functions.*;
import java.sql.*;
import connect.*;

public class CadastroAlunos extends javax.swing.JInternalFrame {

   
    public CadastroAlunos() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        RecebeEmail = new javax.swing.JTextField();
        ButtonCadastrar = new javax.swing.JButton();
        ButtonSair = new javax.swing.JButton();
        canvas1 = new java.awt.Canvas();
        lblEmail = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        RecebeNome = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        lblDataNascimento = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        lblCurso = new javax.swing.JLabel();
        lblNotaMatematica = new javax.swing.JLabel();
        RecebeNotadeMatematica = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        RecebeNotaDeHistoria = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();
        lblNotaHistoria = new javax.swing.JLabel();
        lblNotaFisica = new javax.swing.JLabel();
        RecebeNotaDeFisica = new javax.swing.JTextField();
        jSeparator8 = new javax.swing.JSeparator();
        RecebeCurso = new javax.swing.JComboBox<>();
        lblLogo = new javax.swing.JLabel();
        RecebeDatadeNascimento = new javax.swing.JFormattedTextField();

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator1.setAlignmentY(1.0F);

        RecebeEmail.setBackground(new java.awt.Color(0, 0, 0));
        RecebeEmail.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        RecebeEmail.setForeground(new java.awt.Color(204, 204, 204));
        RecebeEmail.setBorder(null);

        ButtonCadastrar.setBackground(new java.awt.Color(255, 22, 22));
        ButtonCadastrar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        ButtonCadastrar.setForeground(new java.awt.Color(255, 255, 255));
        ButtonCadastrar.setText("CADASTRAR");
        ButtonCadastrar.setBorder(null);
        ButtonCadastrar.setCursor(new java.awt.Cursor(java.awt.Cursor.NE_RESIZE_CURSOR));
        ButtonCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonCadastrarActionPerformed(evt);
            }
        });

        ButtonSair.setBackground(new java.awt.Color(0, 0, 0));
        ButtonSair.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        ButtonSair.setForeground(new java.awt.Color(225, 225, 225));
        ButtonSair.setText("Sair");
        ButtonSair.setBorder(null);
        ButtonSair.setCursor(new java.awt.Cursor(java.awt.Cursor.NE_RESIZE_CURSOR));
        ButtonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonSairActionPerformed(evt);
            }
        });

        lblEmail.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblEmail.setForeground(new java.awt.Color(204, 204, 204));
        lblEmail.setText("E-mail");

        lblNome.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblNome.setForeground(new java.awt.Color(204, 204, 204));
        lblNome.setText("Nome");

        RecebeNome.setBackground(new java.awt.Color(0, 0, 0));
        RecebeNome.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        RecebeNome.setForeground(new java.awt.Color(204, 204, 204));
        RecebeNome.setBorder(null);

        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator2.setAlignmentY(1.0F);

        lblDataNascimento.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblDataNascimento.setForeground(new java.awt.Color(204, 204, 204));
        lblDataNascimento.setText("Data de Nascimento");

        jSeparator4.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator4.setAlignmentY(1.0F);

        jSeparator5.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator5.setAlignmentY(1.0F);

        lblCurso.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblCurso.setForeground(new java.awt.Color(204, 204, 204));
        lblCurso.setText("Curso");

        lblNotaMatematica.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblNotaMatematica.setForeground(new java.awt.Color(204, 204, 204));
        lblNotaMatematica.setText("Nota de Matemática");

        RecebeNotadeMatematica.setBackground(new java.awt.Color(0, 0, 0));
        RecebeNotadeMatematica.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        RecebeNotadeMatematica.setForeground(new java.awt.Color(204, 204, 204));
        RecebeNotadeMatematica.setBorder(null);

        jSeparator6.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator6.setAlignmentY(1.0F);

        RecebeNotaDeHistoria.setBackground(new java.awt.Color(0, 0, 0));
        RecebeNotaDeHistoria.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        RecebeNotaDeHistoria.setForeground(new java.awt.Color(204, 204, 204));
        RecebeNotaDeHistoria.setBorder(null);

        jSeparator7.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator7.setAlignmentY(1.0F);

        lblNotaHistoria.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblNotaHistoria.setForeground(new java.awt.Color(204, 204, 204));
        lblNotaHistoria.setText("Nota de História");

        lblNotaFisica.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblNotaFisica.setForeground(new java.awt.Color(204, 204, 204));
        lblNotaFisica.setText("Nota de Física");

        RecebeNotaDeFisica.setBackground(new java.awt.Color(0, 0, 0));
        RecebeNotaDeFisica.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        RecebeNotaDeFisica.setForeground(new java.awt.Color(204, 204, 204));
        RecebeNotaDeFisica.setBorder(null);

        jSeparator8.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator8.setAlignmentY(1.0F);

        RecebeCurso.setBackground(new java.awt.Color(0, 0, 0));
        RecebeCurso.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Técnico Informática", "Técnico Eletro Mecânica", "Técnico Quimica" }));
        RecebeCurso.setBorder(null);

        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/ANIME FLIX.jpg"))); // NOI18N

        RecebeDatadeNascimento.setBackground(new java.awt.Color(0, 0, 0));
        RecebeDatadeNascimento.setBorder(null);
        RecebeDatadeNascimento.setForeground(new java.awt.Color(204, 204, 204));
        try {
            RecebeDatadeNascimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        RecebeDatadeNascimento.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(458, 458, 458)
                        .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(672, 672, 672))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(744, 744, 744)
                                .addComponent(canvas1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(313, 313, 313)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(lblNome)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                    .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(RecebeNome, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addComponent(RecebeDatadeNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(59, 59, 59)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(lblEmail)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(lblNotaFisica)
                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                            .addComponent(jSeparator8, javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(RecebeNotaDeFisica, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                        .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(RecebeEmail, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(lblDataNascimento)
                                                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(451, 451, 451)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblNotaMatematica)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(jSeparator6, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(RecebeNotadeMatematica, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(59, 59, 59)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblNotaHistoria)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(ButtonCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                    .addComponent(jSeparator7, javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(RecebeNotaDeHistoria, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                    .addComponent(lblCurso)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(RecebeCurso, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jSeparator5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(202, 202, 202)
                                        .addComponent(ButtonSair, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(135, 135, 135))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(256, 256, 256)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblEmail)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(RecebeEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblNome)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(RecebeNome, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)
                                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblDataNascimento)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(RecebeDatadeNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblNotaFisica)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(RecebeNotaDeFisica, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)
                                .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblNotaHistoria)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(RecebeNotaDeHistoria, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)
                                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblNotaMatematica)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(RecebeNotadeMatematica, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)
                                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblCurso)
                                .addGap(2, 2, 2)
                                .addComponent(RecebeCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(ButtonCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(ButtonSair)))))
                .addGap(640, 640, 640)
                .addComponent(canvas1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1378, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 6, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 733, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonCadastrarActionPerformed
        String nome = RecebeNome.getText();
        String email = RecebeEmail.getText();
        String dia = RecebeDatadeNascimento.getText().substring(0, 2);
        String mes = RecebeDatadeNascimento.getText().substring(3, 5);
        String ano = RecebeDatadeNascimento.getText().substring(6);
        String curso = RecebeCurso.getSelectedItem().toString();
        float matematica = Float.parseFloat(RecebeNotadeMatematica.getText());
        float historia = Float.parseFloat(RecebeNotaDeHistoria.getText());
        float fisica = Float.parseFloat(RecebeNotaDeFisica.getText());
        
        
        cadastrar action = new cadastrar(nome, email, dia, mes, ano, curso, matematica, historia, fisica);
        try{
        action.cadastrar(connect.getConnection());
        }catch(SQLException e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_ButtonCadastrarActionPerformed

    private void ButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonSairActionPerformed
        doDefaultCloseAction();
    }//GEN-LAST:event_ButtonSairActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonCadastrar;
    private javax.swing.JButton ButtonSair;
    private javax.swing.JComboBox<String> RecebeCurso;
    private javax.swing.JFormattedTextField RecebeDatadeNascimento;
    private javax.swing.JTextField RecebeEmail;
    private javax.swing.JTextField RecebeNome;
    private javax.swing.JTextField RecebeNotaDeFisica;
    private javax.swing.JTextField RecebeNotaDeHistoria;
    private javax.swing.JTextField RecebeNotadeMatematica;
    private java.awt.Canvas canvas1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JLabel lblCurso;
    private javax.swing.JLabel lblDataNascimento;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblNotaFisica;
    private javax.swing.JLabel lblNotaHistoria;
    private javax.swing.JLabel lblNotaMatematica;
    // End of variables declaration//GEN-END:variables
}
