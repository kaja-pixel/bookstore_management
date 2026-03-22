import com.sun.jdi.connect.spi.Connection;
import java.sql.*;
import javax.swing.JOptionPane;

public class LoginForm extends javax.swing.JFrame {
  
    public LoginForm() {
        initComponents();
    }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnLogin = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        comboRole = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setLayout(null);

        jLabel1.setText("Username:");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(150, 140, 80, 16);
        jPanel1.add(txtUsername);
        txtUsername.setBounds(260, 140, 110, 22);

        jLabel2.setText("Password:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(150, 190, 80, 16);

        btnLogin.setText("Submit");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        jPanel1.add(btnLogin);
        btnLogin.setBounds(200, 310, 80, 23);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel3.setText("Bookstore Login");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(120, 30, 280, 30);
        jPanel1.add(txtPassword);
        txtPassword.setBounds(260, 190, 110, 22);

        jLabel4.setText("Role");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(150, 250, 60, 16);

        comboRole.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cashier", "Manager" }));
        jPanel1.add(comboRole);
        comboRole.setBounds(270, 250, 110, 22);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 610, 510);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    public String authenticateUser(String username, String password) {
        String sql = "SELECT role FROM users WHERE username = ? AND password = ?";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, username);
            ps.setString(2, password);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                return rs.getString("role");  // 'manager' or 'cashier'
            } else {
                return null; // invalid login
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
    
    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        String username = txtUsername.getText();
        String password = new String(txtPassword.getPassword());
        String selectedRole = (String) comboRole.getSelectedItem();

        try (Connection con = (Connection) DBConnection.getConnection()) {
            String query = "SELECT * FROM users WHERE username=? AND password=? AND role=?";
            PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1, username);
            pst.setString(2, password);
            pst.setString(3, selectedRole.toLowerCase()); // match DB value

            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                if (selectedRole.equalsIgnoreCase("Cashier")) {
                    JOptionPane.showMessageDialog(this, "Login successful as Cashier!");
                    new CashierDashboard().setVisible(true);
                } else if (selectedRole.equalsIgnoreCase("Manager")) {
                    JOptionPane.showMessageDialog(this, "Login successful as Manager!");
                    new ManagerDashboard().setVisible(true);
                }
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(this, "Invalid credentials or role mismatch.");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
            e.printStackTrace();
        }
    

    }//GEN-LAST:event_btnLoginActionPerformed
  
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JComboBox<String> comboRole;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
