package trafego.view;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import trafego.model.AeronaveDao;
import trafego.model.ClasseAeronave;

/**
 *
 * @author wesley
 */
public class TabelaAeronave extends javax.swing.JFrame {

    public TabelaAeronave() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        identidade = new javax.swing.JTextField();
        botaoCadastrar = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        txtCombustivel = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtrotaChegada = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtrotaSaida = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtAltitude = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtCategoria = new javax.swing.JTextField();
        txtVelocidade = new javax.swing.JTextField();
        ConsultarAeronave = new javax.swing.JButton();
        txtPesquisar = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtModelo = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                fecharTela(evt);
            }
        });
        getContentPane().setLayout(null);

        identidade.setBackground(new java.awt.Color(0, 0, 0));
        identidade.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        identidade.setForeground(new java.awt.Color(255, 255, 0));
        identidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                identidadeActionPerformed(evt);
            }
        });
        getContentPane().add(identidade);
        identidade.setBounds(140, 90, 230, 30);

        botaoCadastrar.setBackground(new java.awt.Color(0, 0, 0));
        botaoCadastrar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        botaoCadastrar.setForeground(new java.awt.Color(255, 255, 153));
        botaoCadastrar.setText("CADASTRAR AERONAVE");
        botaoCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCadastrarActionPerformed(evt);
            }
        });
        getContentPane().add(botaoCadastrar);
        botaoCadastrar.setBounds(30, 460, 220, 40);

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 0));
        jLabel9.setText("COMBUSTIVEL");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(10, 280, 110, 40);

        txtCombustivel.setBackground(new java.awt.Color(0, 0, 0));
        txtCombustivel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtCombustivel.setForeground(new java.awt.Color(255, 204, 51));
        txtCombustivel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCombustivelActionPerformed(evt);
            }
        });
        getContentPane().add(txtCombustivel);
        txtCombustivel.setBounds(140, 290, 230, 30);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 0));
        jLabel8.setText("ROTA CHEGADA");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(10, 360, 140, 40);

        txtrotaChegada.setBackground(new java.awt.Color(0, 0, 0));
        txtrotaChegada.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtrotaChegada.setForeground(new java.awt.Color(255, 204, 51));
        txtrotaChegada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtrotaChegadaActionPerformed(evt);
            }
        });
        getContentPane().add(txtrotaChegada);
        txtrotaChegada.setBounds(140, 370, 230, 30);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 0));
        jLabel7.setText("ROTA SAIDA");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(10, 320, 140, 40);

        txtrotaSaida.setBackground(new java.awt.Color(0, 0, 0));
        txtrotaSaida.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtrotaSaida.setForeground(new java.awt.Color(255, 204, 51));
        txtrotaSaida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtrotaSaidaActionPerformed(evt);
            }
        });
        getContentPane().add(txtrotaSaida);
        txtrotaSaida.setBounds(140, 330, 230, 30);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 0));
        jLabel6.setText("ALTITUDE");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(20, 250, 90, 40);

        txtAltitude.setBackground(new java.awt.Color(0, 0, 0));
        txtAltitude.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtAltitude.setForeground(new java.awt.Color(255, 204, 51));
        txtAltitude.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAltitudeActionPerformed(evt);
            }
        });
        getContentPane().add(txtAltitude);
        txtAltitude.setBounds(140, 250, 230, 30);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 0));
        jLabel4.setText("CATEGORIA");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(20, 130, 110, 40);

        txtCategoria.setBackground(new java.awt.Color(0, 0, 0));
        txtCategoria.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtCategoria.setForeground(new java.awt.Color(255, 255, 102));
        txtCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCategoriaActionPerformed(evt);
            }
        });
        getContentPane().add(txtCategoria);
        txtCategoria.setBounds(140, 130, 230, 30);

        txtVelocidade.setBackground(new java.awt.Color(0, 0, 0));
        txtVelocidade.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtVelocidade.setForeground(new java.awt.Color(255, 255, 102));
        txtVelocidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtVelocidadeActionPerformed(evt);
            }
        });
        getContentPane().add(txtVelocidade);
        txtVelocidade.setBounds(140, 210, 230, 30);

        ConsultarAeronave.setBackground(new java.awt.Color(0, 0, 0));
        ConsultarAeronave.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ConsultarAeronave.setForeground(new java.awt.Color(204, 204, 0));
        ConsultarAeronave.setText("CONSULTAR AERONAVE");
        ConsultarAeronave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsultarAeronaveActionPerformed(evt);
            }
        });
        getContentPane().add(ConsultarAeronave);
        ConsultarAeronave.setBounds(630, 470, 200, 30);

        txtPesquisar.setBackground(new java.awt.Color(0, 0, 0));
        txtPesquisar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtPesquisar.setForeground(new java.awt.Color(255, 255, 0));
        getContentPane().add(txtPesquisar);
        txtPesquisar.setBounds(390, 470, 230, 30);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 0));
        jLabel5.setText("       VELOCIDADE");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(-10, 210, 140, 40);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 0));
        jLabel3.setText("MODELO");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 170, 80, 40);

        txtModelo.setBackground(new java.awt.Color(0, 0, 0));
        txtModelo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtModelo.setForeground(new java.awt.Color(255, 204, 102));
        txtModelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtModeloActionPerformed(evt);
            }
        });
        getContentPane().add(txtModelo);
        txtModelo.setBounds(140, 170, 230, 30);

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 0));
        jButton1.setText("FECHAR ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(700, 0, 150, 50);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 0));
        jLabel2.setText("       IDENTIFICAÇÃO");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(-10, 90, 140, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/F163D.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jLabel1.setMaximumSize(new java.awt.Dimension(2147483647, 800));
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 920, 510);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void identidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_identidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_identidadeActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();

    }//GEN-LAST:event_jButton1ActionPerformed

    private void fecharTela(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_fecharTela

    }//GEN-LAST:event_fecharTela

    private void txtModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtModeloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtModeloActionPerformed

    private void txtCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCategoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCategoriaActionPerformed

    private void txtVelocidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtVelocidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtVelocidadeActionPerformed

    private void txtAltitudeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAltitudeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAltitudeActionPerformed

    private void txtrotaSaidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtrotaSaidaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtrotaSaidaActionPerformed

    private void txtrotaChegadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtrotaChegadaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtrotaChegadaActionPerformed

    private void txtCombustivelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCombustivelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCombustivelActionPerformed

    private void botaoCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCadastrarActionPerformed
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            try {
                Connection conectado = DriverManager.getConnection("jdbc:mysql://localhost:3306/trafegoaereo", "root",
                        "");
                PreparedStatement st = conectado.prepareStatement("insert into aeronave values(?,?,?,?,?,?,?,?)");
                st.setString(1, identidade.getText());
                st.setString(2, txtCategoria.getText());
                st.setString(3, txtModelo.getText());
                st.setDouble(4, Double.parseDouble(txtVelocidade.getText()));
                st.setDouble(5, Double.parseDouble(txtAltitude.getText()));
                st.setDouble(6, Double.parseDouble(txtCombustivel.getText()));
                st.setString(7, txtrotaSaida.getText());
                st.setString(8, txtrotaChegada.getText());
                st.executeUpdate();
                JOptionPane.showMessageDialog(null, " AERONAVE INSERIDA NO SISTEMA ");

            } catch (SQLException ex) {
                JOptionPane.showConfirmDialog(null, ex.getMessage());
            }
        } catch (ClassNotFoundException ex) {
            JOptionPane.showConfirmDialog(null, ex.getMessage());

        }
    }//GEN-LAST:event_botaoCadastrarActionPerformed

    private void ConsultarAeronaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsultarAeronaveActionPerformed
        String codigo;
        codigo = txtPesquisar.getText();
        AeronaveDao aeronaveDao = new AeronaveDao();
        boolean status = aeronaveDao.conectar();
        if (status == true) {
            ClasseAeronave classeAeronave = aeronaveDao.consultar(codigo);
            if (classeAeronave == null) {
                JOptionPane.showConfirmDialog(null, "AERONAVE NÃO ENCONTRADA NO BANCO DE DADOS ");
            } else {
                txtCategoria.setText(classeAeronave.getCategoria_aeronave());
                txtModelo.setText(classeAeronave.getModelo());
                txtVelocidade.setText(String.valueOf(classeAeronave.getVelocidade()));
                txtAltitude.setText(String.valueOf(classeAeronave.getAltitude()));
                txtCombustivel.setText(String.valueOf(classeAeronave.getNivel_combustivel()));
                txtrotaSaida.setText(classeAeronave.getRota_saida());
                txtrotaChegada.setText(classeAeronave.getRota_chegada());

            }
            aeronaveDao.desconectar();
        } else {
            JOptionPane.showMessageDialog(null, "OPS!!!!FALHA NA CONEXÃO COM BANCO DE DADOS ");
        }
    }//GEN-LAST:event_ConsultarAeronaveActionPerformed
// metodo para limpar os campos apos preenchidos 
    public void limparCampos() {
        identidade.setText("");
        txtCategoria.setText("");
        txtModelo.setText("");
        txtVelocidade.setText("");
        txtAltitude.setText("");
        txtCombustivel.setText("");
        txtrotaSaida.setText("");
        txtrotaChegada.setText("");
        identidade.requestFocus();
    }

    /**
     * * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(TabelaAeronave.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TabelaAeronave.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TabelaAeronave.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TabelaAeronave.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TabelaAeronave().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ConsultarAeronave;
    private javax.swing.JButton botaoCadastrar;
    private javax.swing.JTextField identidade;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtAltitude;
    private javax.swing.JTextField txtCategoria;
    private javax.swing.JTextField txtCombustivel;
    private javax.swing.JTextField txtModelo;
    private javax.swing.JTextField txtPesquisar;
    private javax.swing.JTextField txtVelocidade;
    private javax.swing.JTextField txtrotaChegada;
    private javax.swing.JTextField txtrotaSaida;
    // End of variables declaration//GEN-END:variables
}
