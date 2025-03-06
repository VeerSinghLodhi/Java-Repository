
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Veersingh Lodhi
 */
public class ThreadProgram1 extends javax.swing.JFrame implements Runnable {

    
    public ThreadProgram1() {
        initComponents();
    }
    public void run()
    {
        try{
            int x=500;
            while(x>110)//1000>=-110
            {
                snakeLabel.setBounds(x--, snakeLabel.getY(), snakeLabel.getWidth(), snakeLabel.getHeight());
                Thread.sleep(1000);
                if(x==-100)
                    x=1000;
            }
        }
        catch(InterruptedException e)
        {
            JOptionPane.showMessageDialog(this, "Error is"+e,"Error!!",0);
        }
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        snakeLabel = new javax.swing.JLabel();
        topButton = new javax.swing.JButton();
        bottomButton = new javax.swing.JButton();
        leftButton = new javax.swing.JButton();
        rightButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(51, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        snakeLabel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        snakeLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/download.jpg"))); // NOI18N
        jPanel2.add(snakeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 290, 280, 20));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 340));

        topButton.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        topButton.setText("T");
        topButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                topButtonActionPerformed(evt);
            }
        });
        jPanel1.add(topButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 350, 50, 50));

        bottomButton.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        bottomButton.setText("B");
        jPanel1.add(bottomButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 450, 50, 50));

        leftButton.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        leftButton.setText("L");
        jPanel1.add(leftButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 400, 50, 50));

        rightButton.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        rightButton.setText("R");
        jPanel1.add(rightButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 400, 50, 50));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void topButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_topButtonActionPerformed
        try
        {
            Thread t1=new Thread(this);
            t1.start();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this,"Error is "+e,"Error!!",0);
        }
    }//GEN-LAST:event_topButtonActionPerformed

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
            java.util.logging.Logger.getLogger(ThreadProgram1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ThreadProgram1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ThreadProgram1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ThreadProgram1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ThreadProgram1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bottomButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton leftButton;
    private javax.swing.JButton rightButton;
    private javax.swing.JLabel snakeLabel;
    private javax.swing.JButton topButton;
    // End of variables declaration//GEN-END:variables
}
