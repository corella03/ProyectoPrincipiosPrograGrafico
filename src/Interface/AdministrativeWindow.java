/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//Package
package Interface;
//Imports
import AdminMenuWindows.StudentWindow;
import AdminMenuWindows.ProfessorWindow;
import AdminMenuWindows.CareerWindow;
import AdminMenuWindows.CourseWindow;
import AdminMenuWindows.CampusWindow;
import AdminMenuWindows.ClassroomWindow;
import AdminMenuWindows.ScheduleWindow;
/**
 **
 ** @author Luis Alonso Corella Chaves
 ** @date 2017-05-21 Domingo
 **/
public class AdministrativeWindow extends javax.swing.JFrame {
    /**
     * Creates new form Admin
     */
    public AdministrativeWindow() {
        initComponents();
        setLocationRelativeTo(null);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jPanel1 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        studentButton = new javax.swing.JButton();
        careerButton = new javax.swing.JButton();
        professorButton = new javax.swing.JButton();
        classroomButton = new javax.swing.JButton();
        campusButton = new javax.swing.JButton();
        courseButton = new javax.swing.JButton();
        scheduleButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        returnSystem = new javax.swing.JMenu();

        jMenu3.setText("File");
        jMenuBar2.add(jMenu3);

        jMenu4.setText("Edit");
        jMenuBar2.add(jMenu4);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setText("Menú Administrativo");

        studentButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/profesores-icono-9107-48.png"))); // NOI18N
        studentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentButtonActionPerformed(evt);
            }
        });

        careerButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/libros-de-la-biblioteca-icono-5623-48.png"))); // NOI18N
        careerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                careerButtonActionPerformed(evt);
            }
        });

        professorButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/asistente-icono-4190-48.png"))); // NOI18N
        professorButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                professorButtonActionPerformed(evt);
            }
        });

        classroomButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Science-Classroom-icon.png"))); // NOI18N
        classroomButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                classroomButtonActionPerformed(evt);
            }
        });

        campusButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/construccion-icono-7037-32.png"))); // NOI18N
        campusButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campusButtonActionPerformed(evt);
            }
        });

        courseButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/descripcion-general-icono-6851-48.png"))); // NOI18N
        courseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                courseButtonActionPerformed(evt);
            }
        });

        scheduleButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/reloj-icono-6599-48.png"))); // NOI18N
        scheduleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                scheduleButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Opciones Estudiante");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Opciones Profesor");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Opciones Carrera");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Opciones Curso");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Opciones Recintos");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("Opciones Aulas");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("Opciones Horario");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(studentButton)
                    .addComponent(courseButton)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(professorButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(campusButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(scheduleButton)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(careerButton, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(classroomButton, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addComponent(jLabel6))
                .addGap(56, 56, 56))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(185, 185, 185)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel1)
                .addGap(69, 69, 69)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(studentButton)
                    .addComponent(careerButton)
                    .addComponent(professorButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(classroomButton)
                    .addComponent(campusButton, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(courseButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGap(26, 26, 26)
                .addComponent(scheduleButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        returnSystem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/la-flecha-verde-de-la-izquierda-icono-7438-32.png"))); // NOI18N
        returnSystem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                returnSystemMouseClicked(evt);
            }
        });
        jMenuBar1.add(returnSystem);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void classroomButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_classroomButtonActionPerformed
        ClassroomWindow classroom = new ClassroomWindow();
        classroom.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_classroomButtonActionPerformed

    private void studentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentButtonActionPerformed
        StudentWindow student = new StudentWindow();
        student.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_studentButtonActionPerformed

    private void returnSystemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_returnSystemMouseClicked
        SystemMenu system = new SystemMenu();
        system.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_returnSystemMouseClicked

    private void professorButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_professorButtonActionPerformed
        ProfessorWindow professor =  new ProfessorWindow();
        professor.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_professorButtonActionPerformed

    private void careerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_careerButtonActionPerformed
        CareerWindow career =  new CareerWindow();
        career.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_careerButtonActionPerformed

    private void courseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_courseButtonActionPerformed
        CourseWindow course =  new CourseWindow();
        course.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_courseButtonActionPerformed

    private void campusButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campusButtonActionPerformed
        CampusWindow campus = new CampusWindow();
        campus.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_campusButtonActionPerformed

    private void scheduleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_scheduleButtonActionPerformed
        ScheduleWindow schedule =  new ScheduleWindow();
        schedule.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_scheduleButtonActionPerformed
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
            java.util.logging.Logger.getLogger(AdministrativeWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdministrativeWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdministrativeWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdministrativeWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdministrativeWindow().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton campusButton;
    private javax.swing.JButton careerButton;
    private javax.swing.JButton classroomButton;
    private javax.swing.JButton courseButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton professorButton;
    private javax.swing.JMenu returnSystem;
    private javax.swing.JButton scheduleButton;
    private javax.swing.JButton studentButton;
    // End of variables declaration//GEN-END:variables
}