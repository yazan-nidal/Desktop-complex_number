package complex_number;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.YES_NO_CANCEL_OPTION;
import static javax.swing.JOptionPane.YES_OPTION;


public class Logical extends javax.swing.JDialog {


    public Logical(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
         this.setTitle("Logical Operation");
         
         addWindowListener(new WindowAdapter() {
         
     @Override
     public void windowOpened(WindowEvent we) {
         
         setIconImage( new ImageIcon("icons/p.png").getImage()); 
        
         try {
             
            Thread.sleep(1500);
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
     
     });
         
    setVisible(true);
     
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        first = new javax.swing.JTextField();
        b1 = new javax.swing.JButton();
        second = new javax.swing.JTextField();
        label1 = new javax.swing.JLabel();
        b2 = new javax.swing.JButton();
        label2 = new javax.swing.JLabel();
        panel2 = new javax.swing.JPanel();
        p = new javax.swing.JLabel();
        b3 = new javax.swing.JButton();
        panel = new javax.swing.JPanel();
        a1 = new javax.swing.JRadioButton();
        a2 = new javax.swing.JRadioButton();
        a3 = new javax.swing.JRadioButton();
        a4 = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        first.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                firstKeyTyped(evt);
            }
        });

        b1.setBackground(new java.awt.Color(0, 153, 0));
        b1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/complex_number/icons/ok1.png"))); // NOI18N
        b1.setMnemonic('1');
        b1.setText("Compare");
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });

        second.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                secondKeyTyped(evt);
            }
        });

        label1.setText("Enter First Complex Number:");

        b2.setBackground(new java.awt.Color(153, 153, 153));
        b2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/complex_number/icons/rem1.png"))); // NOI18N
        b2.setMnemonic('2');
        b2.setText("Clear");
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });

        label2.setText("Enter Second Complex Number:");

        p.setFont(new java.awt.Font("Tahoma", 3, 15)); // NOI18N
        p.setForeground(new java.awt.Color(153, 0, 102));
        p.setText("note : use this input format :  a + bi");

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel2Layout.createSequentialGroup()
                .addGap(0, 24, Short.MAX_VALUE)
                .addComponent(p, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel2Layout.createSequentialGroup()
                .addGap(0, 13, Short.MAX_VALUE)
                .addComponent(p, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        b3.setBackground(new java.awt.Color(153, 0, 51));
        b3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/complex_number/icons/can1.png"))); // NOI18N
        b3.setMnemonic('3');
        b3.setText("Cancel");
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });

        panel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Result is", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(102, 51, 0))); // NOI18N

        buttonGroup1.add(a1);
        a1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        a1.setText("Equal");
        a1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                a1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                a1FocusLost(evt);
            }
        });

        buttonGroup1.add(a2);
        a2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        a2.setText("Greater Than");
        a2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                a2FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                a2FocusLost(evt);
            }
        });

        buttonGroup1.add(a3);
        a3.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        a3.setText("Less Than");
        a3.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                a3FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                a3FocusLost(evt);
            }
        });

        buttonGroup1.add(a4);
        a4.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        a4.setText("Invalid Check Input");
        a4.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                a4FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                a4FocusLost(evt);
            }
        });

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(a1)
                    .addComponent(a2)
                    .addComponent(a3)
                    .addComponent(a4))
                .addGap(0, 56, Short.MAX_VALUE))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(a1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(a2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(a3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(a4)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(b1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(b2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(b3, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(label1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(label2))
                                .addGap(36, 36, 36)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(second, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(first, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(first, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(second, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b1)
                    .addComponent(b2)
                    .addComponent(b3))
                .addContainerGap(77, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void firstKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_firstKeyTyped

        if(!(((evt.getKeyChar()>='0')&&(evt.getKeyChar()<='9'))
            ||(evt.getKeyChar()=='+')||(evt.getKeyChar()=='-')
            ||(evt.getKeyChar()=='i')||(evt.getKeyChar()=='I')
            ||(evt.getKeyChar()=='.')))
        {
            evt.consume();
        }

        else
        {
            String h=first.getText();
            if((evt.getKeyChar()=='i')||(evt.getKeyChar()=='I')) if( h.contains("i" )||h.contains("I") )evt.consume();
        }

    }//GEN-LAST:event_firstKeyTyped

    private void secondKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_secondKeyTyped

        if(!(((evt.getKeyChar()>='0')&&(evt.getKeyChar()<='9'))
            ||(evt.getKeyChar()=='+')||(evt.getKeyChar()=='-')
            ||(evt.getKeyChar()=='i')||(evt.getKeyChar()=='I')
            ||(evt.getKeyChar()=='.')))
        {
            evt.consume();
        }

        else
        {
            String h=second.getText();
            if((evt.getKeyChar()=='i')||(evt.getKeyChar()=='I')) if( h.contains("i" )||h.contains("I") )evt.consume();
        }

    }//GEN-LAST:event_secondKeyTyped

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
        a1.setSelected(false);
        a2.setSelected(false);
        a3.setSelected(false);
        a4.setSelected(false);
        buttonGroup1.clearSelection();
        first.setText("");
        second.setText("");
    }//GEN-LAST:event_b2ActionPerformed

    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3ActionPerformed
        int ans=JOptionPane.showConfirmDialog(null,"Do you want to exit","Exit",YES_NO_CANCEL_OPTION,1,new ImageIcon("icons/can.png"));
        if (ans==YES_OPTION )dispose();
    }//GEN-LAST:event_b3ActionPerformed

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
       
       a1.setSelected(false);
       a2.setSelected(false);
       a3.setSelected(false);
       a4.setSelected(false);
       buttonGroup1.clearSelection();   
       
        String f=first.getText(); 
        String g=second.getText();
        if(f.isEmpty() || g.isEmpty()){a4.setSelected(true); return; }
        
        Complex a=new Complex(); int er=a.setString(f);
        Complex b=new Complex(); int er2=b.setString(g);
        
        int i=((er==0)||(er2==0))? 3:Complex.compare(a, b);
        
           switch(i)
        {   
            case -1:{a3.setSelected(true); break; }
            case 0:{a1.setSelected(true); break; }
            case 1:{ a2.setSelected(true);break; }
            case 2:{ a4.setSelected(true); break; }
            default :{a4.setSelected(true);}
        }
           
    }//GEN-LAST:event_b1ActionPerformed

    private void a1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_a1FocusGained
        a1.setEnabled(false);
    }//GEN-LAST:event_a1FocusGained

    private void a1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_a1FocusLost
        a1.setEnabled(true);
    }//GEN-LAST:event_a1FocusLost

    private void a2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_a2FocusGained
        a2.setEnabled(false);
    }//GEN-LAST:event_a2FocusGained

    private void a2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_a2FocusLost
        a2.setEnabled(true);
    }//GEN-LAST:event_a2FocusLost

    private void a3FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_a3FocusGained
        a3.setEnabled(false);
    }//GEN-LAST:event_a3FocusGained

    private void a3FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_a3FocusLost
        a3.setEnabled(true);
    }//GEN-LAST:event_a3FocusLost

    private void a4FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_a4FocusGained
        a4.setEnabled(false);
    }//GEN-LAST:event_a4FocusGained

    private void a4FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_a4FocusLost
        a4.setEnabled(true);
    }//GEN-LAST:event_a4FocusLost


    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Logical dialog = new Logical(new javax.swing.JFrame(), true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton a1;
    private javax.swing.JRadioButton a2;
    private javax.swing.JRadioButton a3;
    private javax.swing.JRadioButton a4;
    private javax.swing.JButton b1;
    private javax.swing.JButton b2;
    private javax.swing.JButton b3;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField first;
    private javax.swing.JLabel label1;
    private javax.swing.JLabel label2;
    private javax.swing.JLabel p;
    private javax.swing.JPanel panel;
    private javax.swing.JPanel panel2;
    private javax.swing.JTextField second;
    // End of variables declaration//GEN-END:variables
}
