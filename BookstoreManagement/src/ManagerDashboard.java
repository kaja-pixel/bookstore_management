import javax.swing.table.DefaultTableModel;
import java.sql.*;
import javax.swing.JOptionPane;


public class ManagerDashboard extends javax.swing.JFrame {

    public ManagerDashboard() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtTitle = new javax.swing.JTextField();
        txtAuthor = new javax.swing.JTextField();
        txtPrice = new javax.swing.JTextField();
        btnAddBook = new javax.swing.JButton();
        btnLoadBooks = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblBooks = new javax.swing.JTable();
        btngenreSearch = new javax.swing.JButton();
        comboSearchGenre = new javax.swing.JComboBox<>();
        comboGenre = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btnLogout = new javax.swing.JButton();
        btnDeleteBook = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtNewUsername = new javax.swing.JTextField();
        txtNewPassword = new javax.swing.JPasswordField();
        jLabel7 = new javax.swing.JLabel();
        comboNewUserRole = new javax.swing.JComboBox<>();
        btnCreateUser = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 204, 255));
        jPanel1.setLayout(null);

        jLabel1.setText("Title");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(30, 90, 80, 16);

        jLabel2.setText("Author");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(30, 130, 70, 16);

        jLabel3.setText("Genre Type");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(330, 100, 80, 16);

        jLabel4.setText("Price");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(30, 210, 60, 16);
        jPanel1.add(txtTitle);
        txtTitle.setBounds(130, 90, 100, 22);
        jPanel1.add(txtAuthor);
        txtAuthor.setBounds(130, 130, 100, 22);
        jPanel1.add(txtPrice);
        txtPrice.setBounds(130, 210, 100, 22);

        btnAddBook.setText("Add Book");
        btnAddBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddBookActionPerformed(evt);
            }
        });
        jPanel1.add(btnAddBook);
        btnAddBook.setBounds(80, 250, 110, 23);

        btnLoadBooks.setText("Load Books");
        btnLoadBooks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoadBooksActionPerformed(evt);
            }
        });
        jPanel1.add(btnLoadBooks);
        btnLoadBooks.setBounds(250, 250, 120, 23);

        tblBooks.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Book ID", "Title", "Author", "Genre", "Price"
            }
        ));
        jScrollPane1.setViewportView(tblBooks);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(30, 310, 570, 230);

        btngenreSearch.setText("Search");
        btngenreSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btngenreSearchActionPerformed(evt);
            }
        });
        jPanel1.add(btngenreSearch);
        btngenreSearch.setBounds(430, 150, 90, 23);

        comboSearchGenre.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Fiction", "Non-Fiction", "Mystery", "Science Fiction", "Children’s Literature", "Fantasy", "Biography", "History", "Romance", "Other" }));
        jPanel1.add(comboSearchGenre);
        comboSearchGenre.setBounds(420, 100, 130, 22);

        comboGenre.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Fiction", "Non-Fiction", "Mystery", "Science Fiction", "Children’s Literature", "Fantasy", "Biography", "History", "Romance", "Other" }));
        jPanel1.add(comboGenre);
        comboGenre.setBounds(130, 170, 100, 22);

        jLabel8.setText("Genre");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(30, 170, 80, 16);

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel9.setText("Manager Dashboard");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(220, 10, 230, 29);

        btnLogout.setText("Log Out");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });
        jPanel1.add(btnLogout);
        btnLogout.setBounds(20, 10, 90, 23);

        btnDeleteBook.setText("Delete Book");
        btnDeleteBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteBookActionPerformed(evt);
            }
        });
        jPanel1.add(btnDeleteBook);
        btnDeleteBook.setBounds(430, 250, 120, 23);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 630, 570);

        jPanel2.setBackground(new java.awt.Color(255, 204, 204));
        jPanel2.setLayout(null);

        jLabel5.setText("username");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(60, 110, 70, 16);

        jLabel6.setText("password");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(60, 160, 70, 16);
        jPanel2.add(txtNewUsername);
        txtNewUsername.setBounds(140, 110, 110, 22);
        jPanel2.add(txtNewPassword);
        txtNewPassword.setBounds(140, 160, 110, 22);

        jLabel7.setText("Role");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(60, 220, 50, 16);

        comboNewUserRole.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cashier", "Manager" }));
        jPanel2.add(comboNewUserRole);
        comboNewUserRole.setBounds(140, 220, 100, 22);

        btnCreateUser.setText("Create User");
        btnCreateUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateUserActionPerformed(evt);
            }
        });
        jPanel2.add(btnCreateUser);
        btnCreateUser.setBounds(130, 320, 100, 23);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(630, 0, 350, 570);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //Add Book 
    private void btnAddBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddBookActionPerformed
        String title = txtTitle.getText();
        String author = txtAuthor.getText();
        String genre = (String) comboGenre.getSelectedItem();
        double price = Double.parseDouble(txtPrice.getText());
        addBook(title, author, genre, price);
        txtTitle.setText("");
        txtAuthor.setText("");
        txtPrice.setText("");
    }//GEN-LAST:event_btnAddBookActionPerformed

    //load Book 
    private void btnLoadBooksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoadBooksActionPerformed
        loadBooksIntoTable();
    }//GEN-LAST:event_btnLoadBooksActionPerformed

    //search book by genre
    private void btngenreSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btngenreSearchActionPerformed
        String selectedGenre = (String) comboSearchGenre.getSelectedItem();
        searchBooksByGenre(selectedGenre);
    }//GEN-LAST:event_btngenreSearchActionPerformed

    //create user account
    private void btnCreateUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateUserActionPerformed
    String username = txtNewUsername.getText();
    String password = new String(txtNewPassword.getPassword());
    String role = (String) comboNewUserRole.getSelectedItem();

    createUser(username, password, role);
    }//GEN-LAST:event_btnCreateUserActionPerformed

    //logout
    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        new LoginForm().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnLogoutActionPerformed

    //delete book
    private void btnDeleteBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteBookActionPerformed
    int selectedRow = tblBooks.getSelectedRow();
    
    if (selectedRow == -1) {
        JOptionPane.showMessageDialog(this, "Please select a book to delete.");
        return;
    }

    int confirm = JOptionPane.showConfirmDialog(this, "Are you sure you want to delete this book?", "Confirm Delete", JOptionPane.YES_NO_OPTION);
    
    if (confirm != JOptionPane.YES_OPTION) {
        return;
    }

    String bookId = tblBooks.getValueAt(selectedRow, 0).toString(); // assuming book_id is in column 0

    try (Connection con = DBConnection.getConnection()) {
        String sql = "DELETE FROM books WHERE book_id = ?";
        PreparedStatement pst = con.prepareStatement(sql);
        pst.setString(1, bookId);
        int rowsDeleted = pst.executeUpdate();

        if (rowsDeleted > 0) {
            JOptionPane.showMessageDialog(this, "Book deleted successfully.");
            refreshBookTable(); // your method to reload the table after deletion
        } else {
            JOptionPane.showMessageDialog(this, "Failed to delete book.");
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
    }
    
    }//GEN-LAST:event_btnDeleteBookActionPerformed

     public void addBook(String title, String author, String genre, double price) 
    {
        String sql = "INSERT INTO books (title, author, genre, price) VALUES (?, ?, ?, ?)";
        try (Connection conn = DBConnection.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql)) 
        {
            ps.setString(1, title);
            ps.setString(2, author);
            ps.setString(3, genre);
            ps.setDouble(4, price);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Book added successfully.");
        } 
        catch (SQLException e) 
        {
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
        }
    }
    
    private void refreshBookTable() {
    DefaultTableModel model = (DefaultTableModel) tblBooks.getModel();
    model.setRowCount(0); // clear current data

    try (Connection con = DBConnection.getConnection()) {
        String sql = "SELECT * FROM books";
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery(sql);

        while (rs.next()) {
            model.addRow(new Object[] {
                rs.getInt("book_id"),
                rs.getString("title"),
                rs.getString("author"),
                rs.getString("genre"),
                rs.getDouble("price")
            });
        }

    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
    }
}

     
    public void loadBooksIntoTable() {
        DefaultTableModel model = (DefaultTableModel) tblBooks.getModel();
        model.setRowCount(0);  // clear existing data

        String query = "SELECT * FROM books";
        try (Connection conn = DBConnection.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {

            while (rs.next()) {
                Object[] row = {
                    rs.getInt("book_id"),
                    rs.getString("title"),
                    rs.getString("author"),
                    rs.getString("genre"),
                    rs.getDouble("price")
                };
                model.addRow(row);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
        }
    }

    public void searchBooksByGenre(String genre) {
        DefaultTableModel model = (DefaultTableModel) tblBooks.getModel();
        model.setRowCount(0);

        String query = "SELECT * FROM books WHERE genre = ?";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(query)) {

            ps.setString(1, genre);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Object[] row = {
                    rs.getInt("book_id"),
                    rs.getString("title"),
                    rs.getString("author"),
                    rs.getString("genre"),
                    rs.getDouble("price")
                };
                model.addRow(row);
            }
        } 
        catch (SQLException e) 
        {
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
        }
    }
    
    public void createUser(String username, String password, String role) 
    {
        String sql = "INSERT INTO users (username, password, role) VALUES (?, ?, ?)";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, username);
            ps.setString(2, password);
            ps.setString(3, role);
            ps.executeUpdate();

            JOptionPane.showMessageDialog(this, "User created successfully.");
        } 
        catch (SQLException e) 
        {
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
        }
    }

    
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManagerDashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddBook;
    private javax.swing.JButton btnCreateUser;
    private javax.swing.JButton btnDeleteBook;
    private javax.swing.JButton btnLoadBooks;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btngenreSearch;
    private javax.swing.JComboBox<String> comboGenre;
    private javax.swing.JComboBox<String> comboNewUserRole;
    private javax.swing.JComboBox<String> comboSearchGenre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblBooks;
    private javax.swing.JTextField txtAuthor;
    private javax.swing.JPasswordField txtNewPassword;
    private javax.swing.JTextField txtNewUsername;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtTitle;
    // End of variables declaration//GEN-END:variables
}
