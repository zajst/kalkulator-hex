import java.util.Formatter;
import java.lang.StringBuffer;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author java
 */
public class NewJFrame extends javax.swing.JFrame {

    String wartoscHex = new String();
    int wartosc1, wartosc2;
    int flag=0;
    
    public NewJFrame() {
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

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        jButton25 = new javax.swing.JButton();
        jButton26 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Ubuntu", 0, 36)); // NOI18N
        jLabel1.setText("tu bedzie wynik");
        jLabel1.setToolTipText("");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 24, 322, 59));
        jLabel1.getAccessibleContext().setAccessibleName("");

        jButton1.setText("1");
        jButton1.setMaximumSize(new java.awt.Dimension(20, 29));
        jButton1.setMinimumSize(new java.awt.Dimension(20, 29));
        jButton1.setPreferredSize(new java.awt.Dimension(40, 32));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 115, -1, -1));

        jButton2.setText("2");
        jButton2.setPreferredSize(new java.awt.Dimension(40, 32));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(71, 115, -1, -1));

        jButton3.setText("3");
        jButton3.setPreferredSize(new java.awt.Dimension(40, 32));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(117, 115, -1, -1));

        jButton4.setText("4");
        jButton4.setPreferredSize(new java.awt.Dimension(40, 32));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(163, 115, -1, -1));

        jButton5.setText("5");
        jButton5.setPreferredSize(new java.awt.Dimension(40, 32));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 153, -1, -1));

        jButton6.setText("6");
        jButton6.setPreferredSize(new java.awt.Dimension(40, 32));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(71, 153, -1, -1));

        jButton7.setText("7");
        jButton7.setPreferredSize(new java.awt.Dimension(40, 32));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(117, 153, -1, -1));

        jButton8.setText("8");
        jButton8.setPreferredSize(new java.awt.Dimension(40, 32));
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(163, 153, -1, -1));

        jButton9.setText("9");
        jButton9.setPreferredSize(new java.awt.Dimension(40, 32));
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 191, -1, -1));

        jButton10.setText("A");
        jButton10.setPreferredSize(new java.awt.Dimension(40, 32));
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(71, 191, -1, -1));

        jButton11.setText("B");
        jButton11.setPreferredSize(new java.awt.Dimension(40, 32));
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(117, 191, -1, -1));

        jButton12.setText("C");
        jButton12.setPreferredSize(new java.awt.Dimension(40, 32));
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(163, 191, -1, -1));

        jButton13.setText("D");
        jButton13.setPreferredSize(new java.awt.Dimension(40, 32));
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 229, -1, -1));

        jButton14.setText("E");
        jButton14.setPreferredSize(new java.awt.Dimension(40, 32));
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton14, new org.netbeans.lib.awtextra.AbsoluteConstraints(71, 229, -1, -1));

        jButton15.setText("F");
        jButton15.setPreferredSize(new java.awt.Dimension(40, 32));
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton15, new org.netbeans.lib.awtextra.AbsoluteConstraints(117, 229, -1, -1));

        jButton16.setText("0");
        jButton16.setPreferredSize(new java.awt.Dimension(40, 32));
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton16, new org.netbeans.lib.awtextra.AbsoluteConstraints(163, 229, -1, -1));

        jButton17.setText("+");
        jButton17.setPreferredSize(new java.awt.Dimension(40, 32));
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton17, new org.netbeans.lib.awtextra.AbsoluteConstraints(236, 191, 41, -1));

        jButton18.setText("-");
        jButton18.setPreferredSize(new java.awt.Dimension(40, 32));
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton18, new org.netbeans.lib.awtextra.AbsoluteConstraints(283, 191, -1, -1));

        jButton19.setText("*");
        jButton19.setPreferredSize(new java.awt.Dimension(40, 32));
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton19, new org.netbeans.lib.awtextra.AbsoluteConstraints(329, 191, -1, -1));

        jButton20.setText("/");
        jButton20.setPreferredSize(new java.awt.Dimension(40, 32));
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton20, new org.netbeans.lib.awtextra.AbsoluteConstraints(375, 191, -1, -1));

        jButton21.setText("|");
        jButton21.setPreferredSize(new java.awt.Dimension(40, 32));
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton21, new org.netbeans.lib.awtextra.AbsoluteConstraints(236, 229, -1, -1));

        jButton22.setText("~");
        jButton22.setPreferredSize(new java.awt.Dimension(40, 32));
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton22, new org.netbeans.lib.awtextra.AbsoluteConstraints(282, 229, -1, -1));

        jButton23.setText("&");
        jButton23.setPreferredSize(new java.awt.Dimension(40, 32));
        jButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton23ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton23, new org.netbeans.lib.awtextra.AbsoluteConstraints(328, 229, -1, -1));

        jButton24.setText("^");
        jButton24.setPreferredSize(new java.awt.Dimension(40, 32));
        jButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton24ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton24, new org.netbeans.lib.awtextra.AbsoluteConstraints(374, 229, -1, -1));

        jButton25.setText("Clear");
        jButton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton25ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton25, new org.netbeans.lib.awtextra.AbsoluteConstraints(358, 131, -1, 50));

        jButton26.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jButton26.setText("=");
        jButton26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton26ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton26, new org.netbeans.lib.awtextra.AbsoluteConstraints(279, 133, 70, 50));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        wartoscHex = wartoscHex + "1";
        jLabel1.setText(wartoscHex);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        wartoscHex = wartoscHex + "2";
        jLabel1.setText(wartoscHex);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        wartoscHex = wartoscHex + "3";
        jLabel1.setText(wartoscHex);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        wartoscHex = wartoscHex + "4";
        jLabel1.setText(wartoscHex);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        wartoscHex = wartoscHex + "5";
        jLabel1.setText(wartoscHex);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        wartoscHex = wartoscHex + "6";
        jLabel1.setText(wartoscHex);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        wartoscHex = wartoscHex + "7";
        jLabel1.setText(wartoscHex);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        wartoscHex = wartoscHex + "8";
        jLabel1.setText(wartoscHex);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        wartoscHex = wartoscHex + "9";
        jLabel1.setText(wartoscHex);
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        wartoscHex = wartoscHex + "A";
        jLabel1.setText(wartoscHex);
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        wartoscHex = wartoscHex + "B";
        jLabel1.setText(wartoscHex);
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        wartoscHex = wartoscHex + "C";
        jLabel1.setText(wartoscHex);
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        wartoscHex = wartoscHex + "D";
        jLabel1.setText(wartoscHex);
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        wartoscHex = wartoscHex + "E";
        jLabel1.setText(wartoscHex);
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        wartoscHex = wartoscHex + "F";
        jLabel1.setText(wartoscHex);
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        if (wartoscHex != "0" || wartoscHex != "") 
            wartoscHex = wartoscHex + "0";
        jLabel1.setText(wartoscHex);
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton25ActionPerformed
        wartoscHex = "";
        wartosc1=0;
        wartosc2=0;
        flag = 0;
        jLabel1.setText(wartoscHex);
    }//GEN-LAST:event_jButton25ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        
        if (flag==0) {
            wartosc2 = zamienNaDec();
            wartosc1 = wartosc2;
            flag=1;
            zamienNaHex();
            wyswietl();
        }
        else if (flag==10) {
            zamienNaHex();
            wyswietl();
            flag=1;
        }
        else {
            wartosc2 = zamienNaDec();
            podajWynik();
            zamienNaHex();
            wyswietl();
            flag=1;
        }
        
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        if (flag==0) {
            if (wartoscHex == "") {
                wartoscHex = "-";
            }
             else {
                wartosc2 = zamienNaDec();
                wartosc1 = wartosc2;
                flag=1;
                zamienNaHex();
                wyswietl();
            }
            
        }
        else if (flag==10) {
            zamienNaHex();
            wyswietl();
            flag=2;
        }
        else {
            wartosc2 = zamienNaDec();
            podajWynik();
            zamienNaHex();
            wyswietl();
            flag=2;
        }
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton26ActionPerformed
        wartosc2 = zamienNaDec();
        podajWynik();
        zamienNaHex();
        wyswietl();
        wartosc2=0;
        flag=10;
    }//GEN-LAST:event_jButton26ActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        if (flag==0) {
            wartosc2 = zamienNaDec();
            wartosc1 = wartosc2;

            zamienNaHex();
            wyswietl();
        }
        else if (flag==10) {
            zamienNaHex();
            wyswietl();

        }
        else {
            wartosc2 = zamienNaDec();
            podajWynik();
            zamienNaHex();
            wyswietl();

        }
        flag=3;
    }//GEN-LAST:event_jButton19ActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
        if (flag==0) {
            wartosc2 = zamienNaDec();
            wartosc1 = wartosc2;

            zamienNaHex();
            wyswietl();
        }
        else if (flag==10) {
            zamienNaHex();
            wyswietl();

        }
        else {
            wartosc2 = zamienNaDec();
            podajWynik();
            zamienNaHex();
            wyswietl();

        }
        flag=4;
    }//GEN-LAST:event_jButton20ActionPerformed

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
        if (flag==0) {
            wartosc2 = zamienNaDec();
            wartosc1 = wartosc2;

            zamienNaHex();
            wyswietl();
        }
        else if (flag==10) {
            zamienNaHex();
            wyswietl();

        }
        else {
            wartosc2 = zamienNaDec();
            podajWynik();
            zamienNaHex();
            wyswietl();

        }
        flag=5;
    }//GEN-LAST:event_jButton21ActionPerformed

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
        if (flag==0) {
            wartosc2 = zamienNaDec();
            wartosc1 = wartosc2;

            zamienNaHex();
            wyswietl();
        }
        else if (flag==10) {
            zamienNaHex();
            wyswietl();

        }
        else {
            wartosc2 = zamienNaDec();
            podajWynik();
            zamienNaHex();
            wyswietl();

        }
        flag=6;
    }//GEN-LAST:event_jButton22ActionPerformed

    private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton23ActionPerformed
        if (flag==0) {
            wartosc2 = zamienNaDec();
            wartosc1 = wartosc2;

            zamienNaHex();
            wyswietl();
        }
        else if (flag==10) {
            zamienNaHex();
            wyswietl();

        }
        else {
            wartosc2 = zamienNaDec();
            podajWynik();
            zamienNaHex();
            wyswietl();

        }
        flag=7;
    }//GEN-LAST:event_jButton23ActionPerformed

    private void jButton24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton24ActionPerformed
        if (flag==0) {
            wartosc2 = zamienNaDec();
            wartosc1 = wartosc2;

            zamienNaHex();
            wyswietl();
        }
        else if (flag==10) {
            zamienNaHex();
            wyswietl();

        }
        else {
            wartosc2 = zamienNaDec();
            podajWynik();
            zamienNaHex();
            wyswietl();

        }
        flag=8;
    }//GEN-LAST:event_jButton24ActionPerformed

    private int zamienNaDec() {
        if (wartoscHex.charAt(0) == '-' ) {
            StringBuffer tmp = new StringBuffer(wartoscHex);
            tmp = tmp.deleteCharAt(0);
            wartoscHex = tmp.toString();
            return -Integer.valueOf(wartoscHex, 16);
        }
        else
            return Integer.valueOf(wartoscHex, 16);
    }
    
    private void zamienNaHex() {
        if (wartosc1 >= 0) {
            Formatter formatter = new Formatter();          // tworzymy obiekt Formatter
            formatter.format("%x", wartosc1);		// formatujemy liczbę na szesnastkową
            wartoscHex = formatter.toString();
        }
        else {
            Formatter formatter = new Formatter();          // tworzymy obiekt Formatter
            formatter.format("%x", Math.abs(wartosc1));		// formatujemy liczbę na szesnastkową
            wartoscHex = "-" + formatter.toString();
        }	
    }
    
    private void podajWynik() {
        switch (flag) {
            case 1: wartosc1 = wartosc1 + wartosc2;
            break;
            case 2: wartosc1 = wartosc1 - wartosc2;
            break;
            case 3: wartosc1 = wartosc1 * wartosc2;
            break;
            case 4: wartosc1 = wartosc1 / wartosc2;
            break;
            case 5: wartosc1 = Math.abs(wartosc1) | Math.abs(wartosc2);
            break;
            case 6: wartosc1 = Math.abs(wartosc1) ^ Math.abs(wartosc2);
            break;
            case 7: wartosc1 = Math.abs(wartosc1) & Math.abs(wartosc2);
            break;
            case 8: wartosc1 = Math.abs(wartosc1) ^ Math.abs(wartosc2);
            break;
            
        }
    }
    
    private void wyswietl() {
        wartoscHex.toUpperCase();
        jLabel1.setText(wartoscHex);
        wartoscHex = "";
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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
