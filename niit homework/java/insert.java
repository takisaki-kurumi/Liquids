/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package abc;

import com.mysql.jdbc.CallableStatement;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.sql.DriverManager;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.filechooser.FileSystemView;

/**
 *
 * @author 35775
 */
public class insert extends javax.swing.JFrame {
   
     java.util.Date now =new java.util.Date();
java.sql.Date nowSqlDate = new java.sql.Date(now.getTime());
java.sql.Timestamp nowSqlTimeStamp = new java.sql.Timestamp(now.getTime());
    private Object filechooser;
    private PreparedStatement st;

    /**
     * Creates new form insert
     */
    public insert() {
        initComponents();
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
        jLabel1 = new javax.swing.JLabel();
        btnBrowse = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtPath = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));
        jPanel1.setForeground(new java.awt.Color(0, 51, 255));

        jLabel1.setFont(new java.awt.Font("华文楷体", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 255));
        jLabel1.setText("Please insert your picture");

        btnBrowse.setBackground(new java.awt.Color(0, 51, 255));
        btnBrowse.setForeground(new java.awt.Color(255, 255, 255));
        btnBrowse.setText("Browse");
        btnBrowse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBrowseMouseClicked(evt);
            }
        });

        btnSave.setBackground(new java.awt.Color(0, 51, 255));
        btnSave.setForeground(new java.awt.Color(255, 255, 255));
        btnSave.setText("Submit");
        btnSave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSaveMouseClicked(evt);
            }
        });
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        jTextField2.setForeground(new java.awt.Color(0, 51, 255));

        jLabel3.setForeground(new java.awt.Color(0, 51, 255));
        jLabel3.setText("YourID");

        jLabel4.setForeground(new java.awt.Color(0, 51, 255));
        jLabel4.setText("Select picture");

        txtPath.setForeground(new java.awt.Color(0, 51, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(57, 57, 57)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                                            .addComponent(txtPath))
                                        .addGap(31, 31, 31)
                                        .addComponent(btnBrowse))
                                    .addComponent(jLabel4))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnSave)
                                .addGap(239, 239, 239))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(194, 194, 194))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnBrowse)
                            .addComponent(txtPath, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(46, 46, 46)
                        .addComponent(btnSave)))
                .addGap(21, 21, 21))
        );

        jPanel3.setBackground(new java.awt.Color(0, 51, 153));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 17, Short.MAX_VALUE)
        );

        jPanel4.setBackground(new java.awt.Color(51, 153, 255));
        jPanel4.setForeground(new java.awt.Color(51, 153, 255));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 16, Short.MAX_VALUE)
        );

        jPanel2.setBackground(new java.awt.Color(204, 255, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 18, Short.MAX_VALUE)
        );

        jPanel8.setBackground(new java.awt.Color(0, 51, 102));
        jPanel8.setForeground(new java.awt.Color(0, 102, 153));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 657, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 104, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBrowseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBrowseMouseClicked

       
JButton btn = (JButton) evt.getSource();
        if (btn.equals(btnBrowse)) {

           JFileChooser fileChooser = new JFileChooser("C:\\", FileSystemView.getFileSystemView());
             fileChooser.setDialogTitle("Choose Your File");
    fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
            fileChooser.setFileFilter(new FileNameExtensionFilter("Image Files", "jpg", "png", "tif", "gif", "bmp"));
            int returnVal = fileChooser.showOpenDialog(jPanel1);
            if (returnVal == JFileChooser.APPROVE_OPTION) {
                String fileName = fileChooser.getSelectedFile().getName();
                String extension = fileName.substring(fileName.lastIndexOf("."));
                if (extension.equalsIgnoreCase(".jpg") || extension.equalsIgnoreCase(".png")
                        || extension.equalsIgnoreCase(".bmp") || extension.equalsIgnoreCase(".tif")
                        || extension.equalsIgnoreCase(".gif")) {
                    txtPath.setText(fileChooser.getSelectedFile().getPath());
                    
                     int returnval = fileChooser.showOpenDialog(this);
    if (returnval == JFileChooser.APPROVE_OPTION)
    {
      File file = fileChooser.getSelectedFile();
        BufferedImage bi;
        try {
            // display the image in a Jlabel
            bi = ImageIO.read(file);
            jLabel2.setIcon(new ImageIcon(bi));
        } catch(IOException e) {
           e.printStackTrace(); // todo: implement proper error handeling
        }
        this.pack();
    }
                    
                } else {
                    JOptionPane.showMessageDialog(this, "Kindly Select Image File Only",
"Error", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                txtPath.setText("No File Uploaded");
            }
        }
 
        
    }//GEN-LAST:event_btnBrowseMouseClicked

    private void btnSaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSaveMouseClicked
         SaveImage(txtPath.getText());
    }//GEN-LAST:event_btnSaveMouseClicked

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSaveActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
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
            java.util.logging.Logger.getLogger(insert.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(insert.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(insert.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(insert.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new insert().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBrowse;
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField txtPath;
    // End of variables declaration//GEN-END:variables

    private void SaveImage(String imagePath) {
             try {
            byte[] rawBytes = null;
            FileInputStream fis = null;

            if (imagePath.equals("No File Uploaded")) {
                ClassLoader cl = this.getClass().getClassLoader();
                URL resouces = cl.getResource("resources/blank-image.png");
                imagePath = resouces.getFile();
            }

            File fileObj = new File(imagePath);
            fis = new FileInputStream(fileObj);
            String name;
           name=jTextField2.getText();

            //loading the JdbcOdbc driver for Sql Operations
     
            //create and specify the DSN as myCon. and since my sql is using windowsauthentication that's why i'm not ing
            //username and word as the second and third parameter in the getConnectionMethod of DriverManager class
           	Class.forName("com.mysql.jdbc.Driver");		
	java.sql.Connection con = (java.sql.Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/niit","root", "1234");
           String sa="insert "+ name +"(picture,number,xtime) values (?,1,?)";//弄清楚如何向用户决定的表中输入数值，表名写于jtextfield上
           //或者弄明白procedure构造语句中怎么写单引号。解决这个问题先解决输出图片的问题，再后改写doctorframe，向病人表中输入药和病史信息，并输出于userframe上
          st  = (PreparedStatement) con.prepareStatement(sa);
           
     
              st.setTimestamp(2,nowSqlTimeStamp);

            //st.setBinaryStream(3, fis);
            int imageLength = Integer.parseInt(String.valueOf(fileObj.length()));
            rawBytes = new byte[imageLength];
            fis.read(rawBytes, 0, imageLength);
           // st.setBinaryStream(3, (InputStream) fis, imageLength);
            st.setBytes(1, rawBytes);
            int count = st.executeUpdate();
            if (count > 0) {
                JOptionPane.showMessageDialog(this, "Data Saved Successfully");
            } else {
                JOptionPane.showMessageDialog(this, "Error Saving Data");
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
        
        
     
    }
}