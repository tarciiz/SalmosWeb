/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.com.ifba.salmos.login.forgotPassword;

import javax.swing.JOptionPane;

import br.com.ifba.salmos.infrastructure.service.FacadeInstance;
import br.com.ifba.salmos.usuario.model.Usuario;
import java.awt.Color;

/**
 *
 * @author tarciiz
 */
public class ChangePassword extends javax.swing.JFrame {
    Usuario user;

    /**
     * Creates new form ChangePassword
     */
    public ChangePassword(Usuario user) {
        initComponents();
        this.user = user;
    }

    public ChangePassword() {
        initComponents();
    }

    public void salvar() {
        if (String.valueOf(txtNewPass.getPassword()).equals(String.valueOf(txtNewPassRepeat.getPassword()))) {
            // alterar
            this.user.setSenha(String.valueOf(txtNewPass.getPassword()));

            FacadeInstance.getInstance().updateUsuario(user);
            JOptionPane.showMessageDialog(null, "Sucesso, senha alterada com sucesso!",
                    "Sucesso!", JOptionPane.OK_OPTION);
            this.setVisible(false);
        } else {
            JOptionPane.showMessageDialog(null, "As senhas devem ser iguais!",
                    "Erro!", JOptionPane.ERROR_MESSAGE);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblSenhaRepeat = new javax.swing.JLabel();
        txtNewPass = new javax.swing.JPasswordField();
        txtNewPassRepeat = new javax.swing.JPasswordField();
        btnSalvar = new javax.swing.JButton();
        lblSenha = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        lblSenhaRepeat.setBackground(new java.awt.Color(250, 206, 86));
        lblSenhaRepeat.setFont(new java.awt.Font("Leelawadee UI", 1, 12)); // NOI18N
        lblSenhaRepeat.setForeground(new java.awt.Color(250, 206, 86));
        lblSenhaRepeat.setText("Repita a senha");

        txtNewPass.setBackground(new java.awt.Color(253, 255, 175));
        txtNewPass.setBorder(null);
        txtNewPass.setSelectionColor(new java.awt.Color(250, 206, 101));
        txtNewPass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNewPassKeyReleased(evt);
            }
        });

        txtNewPassRepeat.setBackground(new java.awt.Color(253, 255, 175));
        txtNewPassRepeat.setBorder(null);
        txtNewPassRepeat.setSelectionColor(new java.awt.Color(250, 206, 101));
        txtNewPassRepeat.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNewPassRepeatKeyReleased(evt);
            }
        });

        btnSalvar.setBackground(new java.awt.Color(250, 206, 86));
        btnSalvar.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 11)); // NOI18N
        btnSalvar.setForeground(new java.awt.Color(253, 255, 175));
        btnSalvar.setText("SALVAR");
        btnSalvar.setBorder(null);
        btnSalvar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalvar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSalvarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSalvarMouseExited(evt);
            }
        });
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        lblSenha.setBackground(new java.awt.Color(250, 206, 86));
        lblSenha.setFont(new java.awt.Font("Leelawadee UI", 1, 12)); // NOI18N
        lblSenha.setForeground(new java.awt.Color(250, 206, 86));
        lblSenha.setText("Nova Senha");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lblSenhaRepeat)
                        .addComponent(lblSenha)
                        .addComponent(txtNewPassRepeat, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
                        .addComponent(txtNewPass)))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(lblSenha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNewPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(lblSenhaRepeat)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNewPassRepeat, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(71, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txtNewPass, txtNewPassRepeat});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalvarMouseEntered
        // TODO add your handling code here:
        btnSalvar.setContentAreaFilled(false);
        btnSalvar.setOpaque(true);
        btnSalvar.setBackground(Color.ORANGE);
    }//GEN-LAST:event_btnSalvarMouseEntered

    private void btnSalvarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalvarMouseExited
        // TODO add your handling code here:
        Color color = lblSenha.getBackground();
        btnSalvar.setContentAreaFilled(false);
        btnSalvar.setOpaque(true);
        btnSalvar.setBackground(color);
    }//GEN-LAST:event_btnSalvarMouseExited

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnSalvarActionPerformed
        this.salvar();
    }// GEN-LAST:event_btnSalvarActionPerformed

    private void txtNewPassKeyReleased(java.awt.event.KeyEvent evt) {// GEN-FIRST:event_txtNewPassKeyReleased
        if (evt.getKeyCode() == (java.awt.event.KeyEvent.VK_ENTER)) {
            txtNewPassRepeat.requestFocus();
        }
    }// GEN-LAST:event_txtNewPassKeyReleased

    private void txtNewPassRepeatKeyReleased(java.awt.event.KeyEvent evt) {// GEN-FIRST:event_txtNewPassRepeatKeyReleased
        if (evt.getKeyCode() == (java.awt.event.KeyEvent.VK_ENTER)) {
            this.salvar();
        }
    }// GEN-LAST:event_txtNewPassRepeatKeyReleased

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
        // (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the default
         * look and feel.
         * For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ChangePassword.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChangePassword.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChangePassword.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChangePassword.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        }
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChangePassword().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSalvar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JLabel lblSenhaRepeat;
    private javax.swing.JPasswordField txtNewPass;
    private javax.swing.JPasswordField txtNewPassRepeat;
    // End of variables declaration//GEN-END:variables
}
