import javax.swing.table.DefaultTableModel;
import java.sql.*;
import javax.swing.JOptionPane;

    private void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
public class CashierDashboard extends javax.swing.JFrame {
private static final String URL = "jdbc:mysql://localhost:3306/little_book_haven";
    private static final String USER = "root";       // default user in WAMP
    private static final String PASSWORD = "";       // default password is empty in WAMP

    public static Connection getConnection() /*throws SQLException*/ {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
   
    public CashierDashboard() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblBooks = new javax.swing.JTable();
        btnLoadBooks = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtTitle = new javax.swing.JTextField();
        txtAuthor = new javax.swing.JTextField();
        txtPrice = new javax.swing.JTextField();
        btnAddBook = new javax.swing.JButton();
        comboSearchGenre = new javax.swing.JComboBox<>();
        btnSearchBook = new javax.swing.JButton();
        comboGenre = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnlogout = new javax.swing.JButton();
        btnDeleteBook = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setLayout(null);

        jLabel1.setText("Title");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(100, 50, 80, 16);

        tblBooks.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Book ID", "Title", "Author", "Genre", "Price"
            }
        ));
        jScrollPane1.setViewportView(tblBooks);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(80, 260, 570, 230);

        btnLoadBooks.setText("Load Books");
        btnLoadBooks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoadBooksActionPerformed(evt);
            }
        });
        jPanel1.add(btnLoadBooks);
        btnLoadBooks.setBounds(280, 220, 120, 23);

        jLabel2.setText("Author");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(100, 90, 70, 16);

        jLabel3.setText("Genre type");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(400, 100, 80, 16);

        jLabel4.setText("Price");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(100, 170, 70, 16);

        txtTitle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTitleActionPerformed(evt);
            }
        });
        jPanel1.add(txtTitle);
        txtTitle.setBounds(200, 50, 130, 22);
        jPanel1.add(txtAuthor);
        txtAuthor.setBounds(200, 90, 130, 22);
        jPanel1.add(txtPrice);
        txtPrice.setBounds(200, 170, 130, 22);

        btnAddBook.setText("Add Book");
        btnAddBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddBookActionPerformed(evt);
            }
        });
        jPanel1.add(btnAddBook);
        btnAddBook.setBounds(90, 220, 120, 23);

        comboSearchGenre.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Fiction", "Non-Fiction", "Mystery", "Science Fiction", "Children’s Literature", "Fantasy", "Biography", "History", "Romance", "Other" }));
        jPanel1.add(comboSearchGenre);
        comboSearchGenre.setBounds(510, 100, 150, 22);

        btnSearchBook.setText("Search by Genre");
        btnSearchBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchBookActionPerformed(evt);
            }
        });
        jPanel1.add(btnSearchBook);
        btnSearchBook.setBounds(450, 150, 130, 23);

        comboGenre.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Fiction", "Non-Fiction", "Mystery", "Science Fiction", "Children’s Literature", "Fantasy", "Biography", "History", "Romance", "Other" }));
        jPanel1.add(comboGenre);
        comboGenre.setBounds(200, 130, 130, 22);

        jLabel5.setText("Genre");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(100, 130, 70, 16);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel6.setText("Cashier Dashboard");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(260, 10, 230, 29);

        btnlogout.setText("Log Out");
        btnlogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlogoutActionPerformed(evt);
            }
        });
        jPanel1.add(btnlogout);
        btnlogout.setBounds(20, 10, 90, 23);

        btnDeleteBook.setText("Delete Book");
        btnDeleteBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteBookActionPerformed(evt);
            }
        });
        jPanel1.add(btnDeleteBook);
        btnDeleteBook.setBounds(470, 220, 120, 23);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 730, 520);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Load Book
    private void btnLoadBooksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoadBooksActionPerformed
        loadBooksIntoTable();
    }//GEN-LAST:event_btnLoadBooksActionPerformed

    //Add Book
    private void btnAddBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddBookActionPerformed
        String title = txtTitle.getText();
        String author = txtAuthor.getText();
        String genre = (String) comboGenre.getSelectedItem();
        double price = Double.parseDouble(txtPrice.getText());
        addBook(title, author, genre, price);
    }//GEN-LAST:event_btnAddBookActionPerformed

    //search book by genre
    private void btnSearchBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchBookActionPerformed
        String selectedGenre = (String) comboSearchGenre.getSelectedItem();
        searchBooksByGenre(selectedGenre);       
    }//GEN-LAST:event_btnSearchBookActionPerformed

    //logout
    private void btnlogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlogoutActionPerformed
        new LoginForm().setVisible(true);
        this.setVisible(false);      
    }//GEN-LAST:event_btnlogoutActionPerformed

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

        try {
            if(Connection conn = DBConnection.getConnection())
            {
            String sql = "DELETE FROM books WHERE book_id = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, bookId);
            int rowsDeleted = pst.executeUpdate();

            if (rowsDeleted > 0) {
                JOptionPane.showMessageDialog(this, "Book deleted successfully.");
                refreshBookTable(); // reload the table after deletion
            } else {
                JOptionPane.showMessageDialog(this, "Failed to delete book.");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
        }
        
    }//GEN-LAST:event_btnDeleteBookActionPerformed

    private void txtTitleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTitleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTitleActionPerformed
    
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

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CashierDashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddBook;
    private javax.swing.JButton btnDeleteBook;
    private javax.swing.JButton btnLoadBooks;
    private javax.swing.JButton btnSearchBook;
    private javax.swing.JButton btnlogout;
    private javax.swing.JComboBox<String> comboGenre;
    private javax.swing.JComboBox<String> comboSearchGenre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblBooks;
    private javax.swing.JTextField txtAuthor;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtTitle;
    // End of variables declaration//GEN-END:variables
}
