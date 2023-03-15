package View;

import connect.connect;
import java.sql.*;
import functions.*;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ConsultaAlunos extends javax.swing.JInternalFrame {
    
   
    public ConsultaAlunos() {
        initComponents();
    }
    
    
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblBoasVindas = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TabelaAlunos = new javax.swing.JTable();
        ButtonOrdemAlfabetica = new javax.swing.JButton();
        ButtonOrdemMedia = new javax.swing.JButton();
        ButtonOrdemNascimento = new javax.swing.JButton();
        ButtonSair = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/CadastroCerto.png"))); // NOI18N

        lblBoasVindas.setBackground(new java.awt.Color(0, 0, 0));
        lblBoasVindas.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lblBoasVindas.setText("Tabela de consulta de Alunos Cadastrados");
        lblBoasVindas.setToolTipText("");

        TabelaAlunos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Nome", "Email", "Nascimento", "Curso", "Matematica", "Historia", "Fisica", "Media", "Situação"
            }
        ));
        jScrollPane1.setViewportView(TabelaAlunos);
        if (TabelaAlunos.getColumnModel().getColumnCount() > 0) {
            TabelaAlunos.getColumnModel().getColumn(8).setResizable(false);
        }

        ButtonOrdemAlfabetica.setBackground(new java.awt.Color(255, 0, 0));
        ButtonOrdemAlfabetica.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        ButtonOrdemAlfabetica.setForeground(new java.awt.Color(255, 255, 255));
        ButtonOrdemAlfabetica.setText("Ordem Alfabética");
        ButtonOrdemAlfabetica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonOrdemAlfabeticaActionPerformed(evt);
            }
        });

        ButtonOrdemMedia.setBackground(new java.awt.Color(255, 0, 0));
        ButtonOrdemMedia.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        ButtonOrdemMedia.setForeground(new java.awt.Color(255, 255, 255));
        ButtonOrdemMedia.setText("Ordem de Média");
        ButtonOrdemMedia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonOrdemMediaActionPerformed(evt);
            }
        });

        ButtonOrdemNascimento.setBackground(new java.awt.Color(255, 0, 0));
        ButtonOrdemNascimento.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        ButtonOrdemNascimento.setForeground(new java.awt.Color(255, 255, 255));
        ButtonOrdemNascimento.setText("Ordem de Nascimento");
        ButtonOrdemNascimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonOrdemNascimentoActionPerformed(evt);
            }
        });

        ButtonSair.setBackground(new java.awt.Color(255, 0, 0));
        ButtonSair.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        ButtonSair.setForeground(new java.awt.Color(255, 255, 255));
        ButtonSair.setText("Sair");
        ButtonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(292, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(434, 434, 434))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lblBoasVindas, javax.swing.GroupLayout.PREFERRED_SIZE, 506, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(381, 381, 381))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(ButtonOrdemAlfabetica)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ButtonOrdemMedia)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ButtonOrdemNascimento)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ButtonSair))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 807, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(214, 214, 214))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblBoasVindas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButtonSair, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonOrdemNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonOrdemMedia)
                    .addComponent(ButtonOrdemAlfabetica))
                .addContainerGap(48, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(35, 35, 35))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonOrdemAlfabeticaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonOrdemAlfabeticaActionPerformed
        String ordem = "nome";
        tabela action  = new tabela(TabelaAlunos, ordem);
              
        try {
            action.ordemAlfabetica(connect.getConnection());
        } catch (SQLException ex) {
            Logger.getLogger(ConsultaAlunos.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_ButtonOrdemAlfabeticaActionPerformed

    private void ButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonSairActionPerformed
        doDefaultCloseAction();
    }//GEN-LAST:event_ButtonSairActionPerformed

    private void ButtonOrdemMediaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonOrdemMediaActionPerformed
        String ordem = "Media";
        tabela action  = new tabela(TabelaAlunos, ordem);
        
        try {
            action.ordemAlfabetica(connect.getConnection());
        } catch (SQLException ex) {
            Logger.getLogger(ConsultaAlunos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ButtonOrdemMediaActionPerformed

    private void ButtonOrdemNascimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonOrdemNascimentoActionPerformed
        String ordem = "dataNas";
        tabela action  = new tabela(TabelaAlunos, ordem);
             
        try {
            action.ordemAlfabetica(connect.getConnection());
        } catch (SQLException ex) {
            Logger.getLogger(ConsultaAlunos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ButtonOrdemNascimentoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonOrdemAlfabetica;
    private javax.swing.JButton ButtonOrdemMedia;
    private javax.swing.JButton ButtonOrdemNascimento;
    private javax.swing.JButton ButtonSair;
    private javax.swing.JTable TabelaAlunos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBoasVindas;
    // End of variables declaration//GEN-END:variables

}
