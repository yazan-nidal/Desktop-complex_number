package complex_number;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.YES_NO_CANCEL_OPTION;
import static javax.swing.JOptionPane.YES_OPTION;


public class GUI extends javax.swing.JFrame {

    public GUI() {
        initComponents();
        
     this.setTitle("Welcome to Complex Number Operations Arithmetic and Logical");
     
     addWindowListener(new WindowAdapter() {
         
     @Override
     public void windowOpened(WindowEvent we) {
         
         setIconImage( new ImageIcon("icons/p.png").getImage()); 
        
         try {
             
            Thread.sleep(800);
            p.setVisible(false);

         } 
         
         catch (InterruptedException ex) {
             Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
         } 

     }

     @Override
     public void windowClosing(WindowEvent we) {
       int ans=JOptionPane.showConfirmDialog(null,"Do you want to exit","Exit",YES_NO_CANCEL_OPTION,1,new ImageIcon("icons/can.png"));
       if (ans==YES_OPTION )dispose();
     }

     @Override
     public void windowClosed(WindowEvent we) { 
         JOptionPane.showMessageDialog(null, "thank you for use my program ;) ","good bye",1,new ImageIcon("icons/7.png")); 
     }

     @Override
      public void windowIconified(WindowEvent we) {
          setIconImage( new ImageIcon("icons/pl.png").getImage()); 
      }

      @Override
      public void windowDeiconified(WindowEvent we) {
          setIconImage( new ImageIcon("icons/p.png").getImage()); 
      }
      
     });
     
     setVisible(true);
     
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        p = new javax.swing.JPanel();
        w1 = new javax.swing.JLabel();
        w2 = new javax.swing.JLabel();
        w3 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        file = new javax.swing.JMenu();
        exit = new javax.swing.JMenuItem();
        operation = new javax.swing.JMenu();
        arithmetic = new javax.swing.JMenuItem();
        logical = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(450, 450));

        p.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 0)));

        w1.setFont(new java.awt.Font("Tahoma", 3, 16)); // NOI18N
        w1.setForeground(new java.awt.Color(153, 0, 51));
        w1.setText("WELCOME ");

        w2.setFont(new java.awt.Font("Tahoma", 3, 16)); // NOI18N
        w2.setForeground(new java.awt.Color(0, 102, 102));
        w2.setText("TO YOU IN MY");

        w3.setFont(new java.awt.Font("Tahoma", 3, 16)); // NOI18N
        w3.setForeground(new java.awt.Color(0, 51, 153));
        w3.setText("PROGRAM");

        javax.swing.GroupLayout pLayout = new javax.swing.GroupLayout(p);
        p.setLayout(pLayout);
        pLayout.setHorizontalGroup(
            pLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(w3, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(pLayout.createSequentialGroup()
                        .addComponent(w1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(pLayout.createSequentialGroup()
                .addGap(141, 141, 141)
                .addComponent(w2, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 151, Short.MAX_VALUE))
        );
        pLayout.setVerticalGroup(
            pLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pLayout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(w1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(w2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(w3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        file.setMnemonic('f');
        file.setText("File");

        exit.setMnemonic('e');
        exit.setText("Exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        file.add(exit);

        jMenuBar1.add(file);

        operation.setMnemonic('o');
        operation.setText("Operation");

        arithmetic.setMnemonic('a');
        arithmetic.setText("Arithmetic");
        arithmetic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                arithmeticActionPerformed(evt);
            }
        });
        operation.add(arithmetic);

        logical.setMnemonic('l');
        logical.setText("Logical");
        logical.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logicalActionPerformed(evt);
            }
        });
        operation.add(logical);

        jMenuBar1.add(operation);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(p, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addComponent(p, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(151, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
       int ans=JOptionPane.showConfirmDialog(null,"Do you want to exit","Exit",YES_NO_CANCEL_OPTION,1,new ImageIcon("icons/can.png"));
       if (ans==YES_OPTION )dispose();
    }//GEN-LAST:event_exitActionPerformed

    private void arithmeticActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_arithmeticActionPerformed
       Arithmetic dialog = new Arithmetic(new javax.swing.JFrame(), true);
    }//GEN-LAST:event_arithmeticActionPerformed

    private void logicalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logicalActionPerformed
       Logical dialog = new Logical(new javax.swing.JFrame(), true);
    }//GEN-LAST:event_logicalActionPerformed


    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI();
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem arithmetic;
    private javax.swing.JMenuItem exit;
    private javax.swing.JMenu file;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem logical;
    private javax.swing.JMenu operation;
    private javax.swing.JPanel p;
    private javax.swing.JLabel w1;
    private javax.swing.JLabel w2;
    private javax.swing.JLabel w3;
    // End of variables declaration//GEN-END:variables
}
