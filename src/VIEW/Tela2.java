 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package VIEW;



import JDBC_DAO.TableUpdater;
import CONTROLLER.PessoaController;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;


/**
 *
 * @author itiel
 */
public class Tela2 extends javax.swing.JFrame {

    /**
     * Creates new form Tela2
     */
    public Tela2(JFrame jFrame, boolean par) {
        initComponents();
        DefaultTableModel modelo = (DefaultTableModel) jTable.getModel();
        jTable.setRowSorter(new TableRowSorter(modelo));
        TableUpdater.readJtable(jTable);
    }
            
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtCPF = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        btnLimpar = new javax.swing.JToggleButton();
        jLabel5 = new javax.swing.JLabel();
        bntInserir = new javax.swing.JToggleButton();
        txtTelefone = new javax.swing.JTextField();
        jToggleButton2 = new javax.swing.JToggleButton();
        jLabel8 = new javax.swing.JLabel();
        jToggleButton3 = new javax.swing.JToggleButton();
        jLabel4 = new javax.swing.JLabel();
        jToggleButton4 = new javax.swing.JToggleButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtConsultaRealizada = new javax.swing.JTextPane();
        jToggleButton5 = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();
        txtDataFormated = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MediLog");
        setBackground(new java.awt.Color(0, 102, 102));
        setForeground(java.awt.Color.white);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("CPF");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Sistema de cadastro e consulta de pacientes.");
        jLabel2.setToolTipText("");
        jLabel2.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        txtCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCPFActionPerformed(evt);
            }
        });
        txtCPF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCPFKeyTyped(evt);
            }
        });

        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nome", "CPF", "Data de Nascimento", "Idade", "Contato telefonico", "Consulta realizada"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTableMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(jTable);

        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Data Nasc");

        bntInserir.setText("Inserir");
        bntInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntInserirActionPerformed(evt);
            }
        });

        txtTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefoneActionPerformed(evt);
            }
        });
        txtTelefone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefoneKeyTyped(evt);
            }
        });

        jToggleButton2.setText("Alterar");
        jToggleButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton2ActionPerformed(evt);
            }
        });

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Nmr Contato");

        jToggleButton3.setText("Excluir");
        jToggleButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton3ActionPerformed(evt);
            }
        });

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Informações da consulta realizada");

        jToggleButton4.setText("Buscar CPF");
        jToggleButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton4ActionPerformed(evt);
            }
        });

        jScrollPane2.setViewportView(txtConsultaRealizada);

        jToggleButton5.setText("Atualizar");
        jToggleButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton5ActionPerformed(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nome");

        try {
            txtDataFormated.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtDataFormated.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDataFormatedActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtCPF, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNome, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnLimpar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDataFormated, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(67, 67, 67)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bntInserir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jToggleButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jToggleButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jToggleButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jToggleButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(127, 127, 127))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(292, 292, 292)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bntInserir)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jToggleButton2)
                                .addGap(12, 12, 12)
                                .addComponent(jToggleButton3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jToggleButton4)
                                .addGap(18, 18, 18)
                                .addComponent(jToggleButton5))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtDataFormated, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18)
                        .addComponent(btnLimpar)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 311, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(927, 579));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCPFActionPerformed
        
    }//GEN-LAST:event_txtCPFActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
            txtNome.setText("");
            txtCPF.setText("");
            txtTelefone.setText("");
            txtDataFormated.setText("");
            txtConsultaRealizada.setText("");
    }//GEN-LAST:event_btnLimparActionPerformed

    private void bntInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntInserirActionPerformed
        inserir();
    }//GEN-LAST:event_bntInserirActionPerformed
    
    private void txtCPFKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCPFKeyTyped
         if (txtCPF.getText().length() >= 11){
            evt.consume();
        }
                char c = evt.getKeyChar();
                if (!Character.isDigit(c)){
                    evt.consume();
                }
    }//GEN-LAST:event_txtCPFKeyTyped

    private void txtTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefoneActionPerformed

    private void txtTelefoneKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefoneKeyTyped
         if (txtTelefone.getText().length() >= 11){
            evt.consume();
        }
                char c = evt.getKeyChar();
                if (!Character.isDigit(c)){
                    evt.consume();
                }
    }//GEN-LAST:event_txtTelefoneKeyTyped

    private void jToggleButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton5ActionPerformed
        TableUpdater.readJtable(jTable);// TODO add your handling code here:
    }//GEN-LAST:event_jToggleButton5ActionPerformed

    private void jTableMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableMousePressed
        //define o formato de entrada da data
        DateTimeFormatter inputFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        //define o formato de saida da data
        DateTimeFormatter outputFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        
        String inputDate = (jTable.getValueAt(jTable.getSelectedRow(), 3).toString());
        LocalDate date = LocalDate.parse(inputDate, inputFormatter);
        String outputDate = date.format(outputFormatter);
        
        txtNome.setText(jTable.getValueAt(jTable.getSelectedRow(), 1).toString());
        txtCPF.setText(jTable.getValueAt(jTable.getSelectedRow(), 2).toString());
        txtDataFormated.setText(outputDate);
        txtTelefone.setText(jTable.getValueAt(jTable.getSelectedRow(), 5).toString());
        txtConsultaRealizada.setText(jTable.getValueAt(jTable.getSelectedRow(), 6).toString());
    }//GEN-LAST:event_jTableMousePressed

    private void txtDataFormatedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDataFormatedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDataFormatedActionPerformed

    private void jToggleButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton3ActionPerformed
        deleteJtable();
    }//GEN-LAST:event_jToggleButton3ActionPerformed

    private void jToggleButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton4ActionPerformed
        buscarPorCPF();
    }//GEN-LAST:event_jToggleButton4ActionPerformed

    private void jToggleButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton2ActionPerformed
        try {
            alterar();
        } catch (SQLException ex) {
            Logger.getLogger(Tela2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jToggleButton2ActionPerformed
 
    private void inserir() {
    try {
        String nome = txtNome.getText();
        String cpf = txtCPF.getText();
        String telefone = txtTelefone.getText();
        String consultaRealizada = txtConsultaRealizada.getText();
        String dataNascimentoStr = txtDataFormated.getText();
        
        //Verifica se a data informada é valida
        DateTimeFormatter inputFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dataNascimento;
        try {
        dataNascimento = LocalDate.parse(dataNascimentoStr, inputFormatter);
        } catch (DateTimeParseException e) {
            JOptionPane.showMessageDialog(null, "Data de nascimento incorreta. Use o formato dd/MM/yyyy.", "ERRO DE FORMATO", JOptionPane.ERROR_MESSAGE);
            return;
        }

        PessoaController pessoaController = new PessoaController();
        pessoaController.inserirPessoa(nome, cpf, dataNascimentoStr, telefone, consultaRealizada);

        JOptionPane.showMessageDialog(null, "Novo cadastro registrado", "Sistema de Cadastro", JOptionPane.INFORMATION_MESSAGE);

        // Limpa os campos de entrada após a inserção bem-sucedida
        txtNome.setText("");
        txtCPF.setText("");
        txtTelefone.setText("");
        txtDataFormated.setText("");
        txtConsultaRealizada.setText("");

        // Atualiza a tabela após a inserção
        TableUpdater.readJtable(jTable);
    } catch (IllegalArgumentException e) {
        JOptionPane.showMessageDialog(null, e.getMessage(), "Erro de validação", JOptionPane.WARNING_MESSAGE);
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Erro ao acessar o banco de dados: " + e.getMessage(), "Erro de banco de dados", JOptionPane.ERROR_MESSAGE);
    }
}
  
    private void alterar() throws SQLException {
    int selectedRow = getSelectedRowIndex();
    if (selectedRow == -1) {
        return;
    }

    try {
        // Suponha que `txtIdPessoa` seja o campo de texto onde o usuário insere o id_pessoa
        String idPessoaStr = jTable.getValueAt(selectedRow, 0).toString();

        // Verifica se o campo id_pessoa está vazio
        if (idPessoaStr.isEmpty()) {
            throw new IllegalArgumentException("Nenhum registro selecionado.");
        }

        int idPessoa = Integer.parseInt(idPessoaStr);

        String nome = txtNome.getText();
        String cpf = txtCPF.getText();
        String dataNascimentoStr = txtDataFormated.getText();
        String telefone = txtTelefone.getText();
        String consultaRealizada = txtConsultaRealizada.getText();

        PessoaController pessoaController = new PessoaController();
        pessoaController.alterarPessoa(idPessoa, nome, cpf, dataNascimentoStr, telefone, consultaRealizada);

        JOptionPane.showMessageDialog(null, "Cadastro alterado", "Sistema de Cadastro", JOptionPane.INFORMATION_MESSAGE);

        // Limpa os campos de entrada após a alteração bem-sucedida
        txtNome.setText("");
        txtCPF.setText("");
        txtTelefone.setText("");
        txtDataFormated.setText("");
        txtConsultaRealizada.setText("");

        // Atualiza a tabela após a alteração
        TableUpdater.readJtable(jTable);
    } catch (IllegalArgumentException e) {
        JOptionPane.showMessageDialog(null, e.getMessage(), "Erro de validação", JOptionPane.WARNING_MESSAGE);
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Erro ao acessar o banco de dados: " + e.getMessage(), "Erro de banco de dados", JOptionPane.ERROR_MESSAGE);
    }
}
    
    private void buscarPorCPF() {
        String cpf = txtCPF.getText();
        if (cpf.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, informe um CPF para buscar.", "CPF não informado", JOptionPane.WARNING_MESSAGE);
        } else {
            TableUpdater.readJtable(jTable, cpf);
        }
    }
    
    private void deleteJtable(){
        
        int selectedRow = jTable.getSelectedRow();
        
        // Verifica se o há seleção dos campos
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(null, "Nenhum registro selecionado!", "Sem seleção!", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        String idpessoa = jTable.getValueAt(selectedRow, 0).toString();
        
        try {
        // Suponha que `txtIdPessoa` seja o campo de texto onde o usuário insere o id_pessoa
        String idPessoaStr = idpessoa;

        int idPessoa = Integer.parseInt(idPessoaStr);

        PessoaController pessoaController = new PessoaController();
        pessoaController.removerPessoa(idPessoa);

        JOptionPane.showMessageDialog(null, "Cadastro removido", "Sistema de Cadastro", JOptionPane.INFORMATION_MESSAGE);

        // Limpa os campos de entrada após a remoção bem-sucedida
        txtNome.setText("");
        txtCPF.setText("");
        txtTelefone.setText("");
        txtDataFormated.setText("");
        txtConsultaRealizada.setText("");

        // Atualiza a tabela após a remoção
        TableUpdater.readJtable(jTable);
    } catch (IllegalArgumentException e) {
        JOptionPane.showMessageDialog(null, e.getMessage(), "Erro de validação", JOptionPane.WARNING_MESSAGE);
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Erro ao acessar o banco de dados: " + e.getMessage(), "Erro de banco de dados", JOptionPane.ERROR_MESSAGE);
    }
        
    }
    
    private int getSelectedRowIndex() {
    int selectedRow = jTable.getSelectedRow();
    if (selectedRow == -1) {
        JOptionPane.showMessageDialog(null, "Nenhum registro selecionado!", "Sem seleção!", JOptionPane.WARNING_MESSAGE);
    }
    return selectedRow;
}
    
    private void adjustColumnWidths() {
        jTable.getColumnModel().getColumn(0).setPreferredWidth(10);  // Define largura preferida da primeira coluna
        jTable.getColumnModel().getColumn(1).setPreferredWidth(50);  // Define largura preferida da segunda coluna
        jTable.getColumnModel().getColumn(2).setPreferredWidth(100); // Define largura preferida da terceira coluna
    }
    
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Tela2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela2(new javax.swing.JFrame(), true).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton bntInserir;
    private javax.swing.JToggleButton btnLimpar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JToggleButton jToggleButton3;
    private javax.swing.JToggleButton jToggleButton4;
    private javax.swing.JToggleButton jToggleButton5;
    private javax.swing.JTextField txtCPF;
    private javax.swing.JTextPane txtConsultaRealizada;
    private javax.swing.JFormattedTextField txtDataFormated;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtTelefone;
    // End of variables declaration//GEN-END:variables
}
