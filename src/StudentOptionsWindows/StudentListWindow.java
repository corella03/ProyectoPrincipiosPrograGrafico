/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//Package
package StudentOptionsWindows;
//Imports
import AdminMenuWindows.StudentWindow;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.table.DefaultTableModel;
import static StudentOptionsWindows.StudentRegistryWindow.StudentList;
/**
 **
 ** @author Luis Alonso Corella Chaves
 ** @date 2017-05-23 Martes
 **/
public class StudentListWindow extends javax.swing.JFrame {
    /**
     * Creates new form StudentListWindow
     */
    String names = "";
    String lastNames = "";
    String ids = "";
    String address = "";
    String phones = "";
    String emails = "";
    public StudentListWindow() {
        initComponents();
        setLocationRelativeTo(null);
        studentListTable.addMouseListener(new MouseAdapter() 
        {
            DefaultTableModel model = new DefaultTableModel();
            public void mouseClicked(MouseEvent e) 
            {
                int i = studentListTable.getSelectedRow();
                names = (studentListTable.getValueAt(i, 0).toString());
                lastNames = (studentListTable.getValueAt(i, 1).toString());
                ids = (studentListTable.getValueAt(i, 2).toString());
                address = (studentListTable.getValueAt(i, 3).toString());
                phones = (studentListTable.getValueAt(i, 4).toString());
                emails = (studentListTable.getValueAt(i, 5).toString());
            }  
        });
        shows();
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
        jLabel11 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        studentListTable = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        returnStudent = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setText("Lista de Estudiantes");

        studentListTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Apellido", "Cédula", "Dirección", "Teléfono", "Email"
            }
        ));
        jScrollPane2.setViewportView(studentListTable);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(185, 185, 185)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 550, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(278, Short.MAX_VALUE))
        );

        returnStudent.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/la-flecha-verde-de-la-izquierda-icono-7438-32.png"))); // NOI18N
        returnStudent.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                returnStudentMouseClicked(evt);
            }
        });
        jMenuBar1.add(returnStudent);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void returnStudentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_returnStudentMouseClicked
        StudentWindow student = new StudentWindow();
        student.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_returnStudentMouseClicked
    public  void shows() {
        String tableList[][] = new String[StudentList.size()][6];
        for (int i = 0; i < StudentList.size(); i++) {
            tableList[i][0] = StudentList.get(i).getName();
            tableList[i][1] = StudentList.get(i).getLastName();
            tableList[i][2] = StudentList.get(i).getIdentificationCard();
            tableList[i][3] = StudentList.get(i).getAddress();
            tableList[i][4] = StudentList.get(i).getTelephoneNumber();
            tableList[i][5] = StudentList.get(i).getEmail();
        }
        studentListTable.setModel(new javax.swing.table.DefaultTableModel(
                tableList,
                new String[]{
                    "Nombre", "Apellido", "Cédula", "Dirección", "Teléfono", "Email"
                }
        ));
    }
    /**
     * @param args the command line arguments
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
            java.util.logging.Logger.getLogger(StudentListWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentListWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentListWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentListWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentListWindow().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel11;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JMenu returnStudent;
    private javax.swing.JTable studentListTable;
    // End of variables declaration//GEN-END:variables
}