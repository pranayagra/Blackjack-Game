
/**
 * @author PAgrawal
 */
public class Game extends javax.swing.JFrame {

    /**
     * Creates new form Game
     */
    private BJCard player;
    private BJCard dealer;
    private int counter;
    private int total;
    // Variables declaration - do not modify
    private javax.swing.JLabel jLabelBet;
    private javax.swing.JLabel jLabelCard1;
    private javax.swing.JLabel jLabelCard1Ace1;
    private javax.swing.JLabel jLabelCard1Ace11;
    private javax.swing.JLabel jLabelCard2;
    private javax.swing.JLabel jLabelCard2Ace1;
    private javax.swing.JLabel jLabelCard2Ace11;
    private javax.swing.JLabel jLabelCard3;
    private javax.swing.JLabel jLabelCard3Ace1;
    private javax.swing.JLabel jLabelCard3Ace11;
    private javax.swing.JLabel jLabelCard4;
    private javax.swing.JLabel jLabelCard4Ace1;
    private javax.swing.JLabel jLabelCard4Ace11;
    private javax.swing.JLabel jLabelCard5;
    private javax.swing.JLabel jLabelCard5Ace1;
    private javax.swing.JLabel jLabelCard5Ace11;
    private javax.swing.JLabel jLabelCardComp1;
    private javax.swing.JLabel jLabelCardComp2;
    private javax.swing.JLabel jLabelCardComp3;
    private javax.swing.JLabel jLabelCardComp4;
    private javax.swing.JLabel jLabelCardComp5;
    private javax.swing.JLabel jLabelComputer;
    private javax.swing.JLabel jLabelDraw;
    private javax.swing.JLabel jLabelEndRound;
    private javax.swing.JLabel jLabelMoney;
    private javax.swing.JLabel jLabelPlayer;
    private javax.swing.JLabel jLabelScore;
    private javax.swing.JLabel jLabelStand;
    private javax.swing.JLabel jLabelVS;
    private javax.swing.JLabel jLabelWarning;
    public Game() {
    }
    public Game(BJCard player, BJCard dealer) {
        this.player = player;
        this.dealer = dealer;
        counter = 1;
        total = 0;
        initComponents();
        this.player.secsim();
        this.dealer.secsim();
        jLabelCard1Ace1.setText("");
        jLabelCard1Ace11.setText("");
        jLabelCard2Ace1.setText("");
        jLabelCard2Ace11.setText("");
        jLabelCard3Ace1.setText("");
        jLabelCard3Ace11.setText("");
        jLabelCard4Ace1.setText("");
        jLabelCard4Ace11.setText("");
        jLabelCard5Ace1.setText("");
        jLabelCard5Ace11.setText("");
        jLabelMoney.setText(jLabelMoney.getText() + this.player.getMoney());
        jLabelBet.setText(jLabelBet.getText() + this.player.getBet());
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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Game().setVisible(true);
            }
        });
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        jLabelEndRound = new javax.swing.JLabel();
        jLabelDraw = new javax.swing.JLabel();
        jLabelComputer = new javax.swing.JLabel();
        jLabelVS = new javax.swing.JLabel();
        jLabelCard1 = new javax.swing.JLabel();
        jLabelPlayer = new javax.swing.JLabel();
        jLabelMoney = new javax.swing.JLabel();
        jLabelBet = new javax.swing.JLabel();
        jLabelCard2 = new javax.swing.JLabel();
        jLabelCard3 = new javax.swing.JLabel();
        jLabelCard4 = new javax.swing.JLabel();
        jLabelCard5 = new javax.swing.JLabel();
        jLabelCardComp1 = new javax.swing.JLabel();
        jLabelCardComp2 = new javax.swing.JLabel();
        jLabelCardComp3 = new javax.swing.JLabel();
        jLabelCardComp4 = new javax.swing.JLabel();
        jLabelCardComp5 = new javax.swing.JLabel();
        jLabelStand = new javax.swing.JLabel();
        jLabelScore = new javax.swing.JLabel();
        jLabelCard1Ace1 = new javax.swing.JLabel();
        jLabelCard1Ace11 = new javax.swing.JLabel();
        jLabelCard2Ace1 = new javax.swing.JLabel();
        jLabelCard2Ace11 = new javax.swing.JLabel();
        jLabelCard3Ace1 = new javax.swing.JLabel();
        jLabelCard3Ace11 = new javax.swing.JLabel();
        jLabelCard4Ace1 = new javax.swing.JLabel();
        jLabelCard4Ace11 = new javax.swing.JLabel();
        jLabelCard5Ace1 = new javax.swing.JLabel();
        jLabelCard5Ace11 = new javax.swing.JLabel();
        jLabelWarning = new javax.swing.JLabel();

        jLabelEndRound.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelEndRound.setForeground(new java.awt.Color(255, 0, 102));
        jLabelEndRound.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelEndRound.setText("Ace Value");
        jLabelEndRound.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabelEndRoundMouseReleased(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Game");
        setMinimumSize(new java.awt.Dimension(500, 600));
        setResizable(false);

        jLabelDraw.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelDraw.setForeground(new java.awt.Color(255, 0, 102));
        jLabelDraw.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelDraw.setText("Hit");
        jLabelDraw.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabelDrawMouseReleased(evt);
            }
        });

        jLabelComputer.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelComputer.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelComputer.setText("Computer");

        jLabelVS.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelVS.setForeground(new java.awt.Color(255, 0, 0));
        jLabelVS.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelVS.setText("VS");

        jLabelCard1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelCard1.setMaximumSize(new java.awt.Dimension(90, 108));
        jLabelCard1.setMinimumSize(new java.awt.Dimension(85, 106));
        jLabelCard1.setPreferredSize(new java.awt.Dimension(85, 106));

        jLabelPlayer.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelPlayer.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelPlayer.setText("Player");

        jLabelMoney.setText("Money: $");

        jLabelBet.setText("Bet: $");

        jLabelCard2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelCard2.setMaximumSize(new java.awt.Dimension(90, 108));
        jLabelCard2.setMinimumSize(new java.awt.Dimension(85, 106));
        jLabelCard2.setPreferredSize(new java.awt.Dimension(85, 106));

        jLabelCard3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelCard3.setMaximumSize(new java.awt.Dimension(90, 107));
        jLabelCard3.setMinimumSize(new java.awt.Dimension(85, 106));
        jLabelCard3.setPreferredSize(new java.awt.Dimension(85, 106));

        jLabelCard4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelCard4.setMaximumSize(new java.awt.Dimension(90, 107));
        jLabelCard4.setMinimumSize(new java.awt.Dimension(85, 106));
        jLabelCard4.setPreferredSize(new java.awt.Dimension(85, 106));

        jLabelCard5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelCard5.setMaximumSize(new java.awt.Dimension(90, 107));
        jLabelCard5.setMinimumSize(new java.awt.Dimension(85, 106));
        jLabelCard5.setPreferredSize(new java.awt.Dimension(85, 106));

        jLabelCardComp1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelCardComp1.setText("C1");
        jLabelCardComp1.setMaximumSize(new java.awt.Dimension(90, 108));
        jLabelCardComp1.setMinimumSize(new java.awt.Dimension(85, 106));
        jLabelCardComp1.setPreferredSize(new java.awt.Dimension(85, 106));

        jLabelCardComp2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelCardComp2.setText("C2");
        jLabelCardComp2.setMaximumSize(new java.awt.Dimension(90, 108));
        jLabelCardComp2.setMinimumSize(new java.awt.Dimension(85, 106));
        jLabelCardComp2.setPreferredSize(new java.awt.Dimension(85, 106));

        jLabelCardComp3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelCardComp3.setText("C3");
        jLabelCardComp3.setMaximumSize(new java.awt.Dimension(90, 107));
        jLabelCardComp3.setMinimumSize(new java.awt.Dimension(85, 106));
        jLabelCardComp3.setPreferredSize(new java.awt.Dimension(85, 106));

        jLabelCardComp4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelCardComp4.setText("C4");
        jLabelCardComp4.setMaximumSize(new java.awt.Dimension(90, 107));
        jLabelCardComp4.setMinimumSize(new java.awt.Dimension(85, 106));
        jLabelCardComp4.setPreferredSize(new java.awt.Dimension(85, 106));

        jLabelCardComp5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelCardComp5.setText("C5");
        jLabelCardComp5.setMaximumSize(new java.awt.Dimension(90, 107));
        jLabelCardComp5.setMinimumSize(new java.awt.Dimension(85, 106));
        jLabelCardComp5.setPreferredSize(new java.awt.Dimension(85, 106));

        jLabelStand.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelStand.setForeground(new java.awt.Color(255, 0, 102));
        jLabelStand.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelStand.setText("Stand");
        jLabelStand.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabelStandMouseReleased(evt);
            }
        });

        jLabelScore.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabelCard1Ace1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelCard1Ace1.setText("jLabel1");
        jLabelCard1Ace1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabelCard1Ace1MouseReleased(evt);
            }
        });

        jLabelCard1Ace11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelCard1Ace11.setText("jLabel2");
        jLabelCard1Ace11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabelCard1Ace11MouseReleased(evt);
            }
        });

        jLabelCard2Ace1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelCard2Ace1.setText("jLabel1");
        jLabelCard2Ace1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabelCard2Ace1MouseReleased(evt);
            }
        });

        jLabelCard2Ace11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelCard2Ace11.setText("jLabel2");
        jLabelCard2Ace11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabelCard2Ace11MouseReleased(evt);
            }
        });

        jLabelCard3Ace1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelCard3Ace1.setText("jLabel1");
        jLabelCard3Ace1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabelCard3Ace1MouseReleased(evt);
            }
        });

        jLabelCard3Ace11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelCard3Ace11.setText("jLabel2");
        jLabelCard3Ace11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabelCard3Ace11MouseReleased(evt);
            }
        });

        jLabelCard4Ace1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelCard4Ace1.setText("jLabel1");
        jLabelCard4Ace1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabelCard4Ace1MouseReleased(evt);
            }
        });

        jLabelCard4Ace11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelCard4Ace11.setText("jLabel2");
        jLabelCard4Ace11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabelCard4Ace11MouseReleased(evt);
            }
        });

        jLabelCard5Ace1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelCard5Ace1.setText("jLabel1");
        jLabelCard5Ace1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabelCard5Ace1MouseReleased(evt);
            }
        });

        jLabelCard5Ace11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelCard5Ace11.setText("jLabel2");
        jLabelCard5Ace11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabelCard5Ace11MouseReleased(evt);
            }
        });

        jLabelWarning.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelWarning.setForeground(new java.awt.Color(255, 0, 51));
        jLabelWarning.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabelDraw, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jLabelStand, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(jLabelWarning, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                        .addComponent(jLabelMoney, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
                                                                        .addComponent(jLabelBet, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                                .addGap(18, 18, 18)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addGap(8, 8, 8)
                                                                                .addComponent(jLabelCard1Ace1)
                                                                                .addGap(18, 18, 18)
                                                                                .addComponent(jLabelCard1Ace11))
                                                                        .addComponent(jLabelCard1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                .addComponent(jLabelCard2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                                                .addGap(14, 14, 14)
                                                                                .addComponent(jLabelCard2Ace1)
                                                                                .addGap(18, 18, 18)
                                                                                .addComponent(jLabelCard2Ace11)))
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addGap(14, 14, 14)
                                                                                .addComponent(jLabelCard3Ace1)
                                                                                .addGap(18, 18, 18)
                                                                                .addComponent(jLabelCard3Ace11)
                                                                                .addGap(18, 18, 18)
                                                                                .addComponent(jLabelCard4Ace1)
                                                                                .addGap(18, 18, 18)
                                                                                .addComponent(jLabelCard4Ace11)
                                                                                .addGap(26, 26, 26)
                                                                                .addComponent(jLabelCard5Ace1)
                                                                                .addGap(18, 18, 18)
                                                                                .addComponent(jLabelCard5Ace11))
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                .addComponent(jLabelCard3, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                .addComponent(jLabelCard4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                .addComponent(jLabelCard5, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addComponent(jLabelCardComp1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                .addComponent(jLabelCardComp2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                .addComponent(jLabelCardComp3, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                                        .addComponent(jLabelVS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                        .addComponent(jLabelComputer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                        .addComponent(jLabelPlayer, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                .addComponent(jLabelScore, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jLabelCardComp4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jLabelCardComp5, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addContainerGap(16, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, jLabelCard1, jLabelCard2, jLabelCard3, jLabelCard4, jLabelCard5);

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, jLabelCardComp1, jLabelCardComp2, jLabelCardComp3, jLabelCardComp4, jLabelCardComp5);

        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabelCardComp1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabelCardComp2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabelCardComp3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabelCardComp4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabelCardComp5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(59, 59, 59)
                                .addComponent(jLabelComputer)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelVS)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabelPlayer)
                                        .addComponent(jLabelScore, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                                .addComponent(jLabelWarning)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabelMoney)
                                        .addComponent(jLabelCard1Ace1)
                                        .addComponent(jLabelCard1Ace11)
                                        .addComponent(jLabelCard2Ace1)
                                        .addComponent(jLabelCard2Ace11)
                                        .addComponent(jLabelCard3Ace1)
                                        .addComponent(jLabelCard3Ace11)
                                        .addComponent(jLabelCard4Ace1)
                                        .addComponent(jLabelCard4Ace11)
                                        .addComponent(jLabelCard5Ace1)
                                        .addComponent(jLabelCard5Ace11))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabelBet)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jLabelCard1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabelCard2, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabelCard3, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabelCard4, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabelCard5, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabelDraw, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabelStand, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(20, 20, 20))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, jLabelCard1, jLabelCard2, jLabelCard3, jLabelCard4, jLabelCard5);

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, jLabelCardComp1, jLabelCardComp2, jLabelCardComp3, jLabelCardComp4, jLabelCardComp5);

        setSize(new java.awt.Dimension(658, 527));
        setLocationRelativeTo(null);
    }

    private void jLabelDrawMouseReleased(java.awt.event.MouseEvent evt) {
        counter++;
        jLabelWarning.setText("If an Ace (1 or 11) is drawn, choose the value, or 1 for all Aces will be assumed when Stand is pressed");
        System.out.println(player.getCard1() + ", " + player.getCard2() + ", " + player.getCard3() + ", " + player.getCard4() + ", " + player.getCard5());
        if (counter >= 1) {
            String c1 = "/AppPackage/Card" + player.getCard1() + ".png";
            String cc1 = "/AppPackage/Card" + dealer.getCard1() + ".png";
            jLabelCard1.setIcon(new javax.swing.ImageIcon(getClass().getResource(c1)));
            jLabelCardComp1.setIcon(new javax.swing.ImageIcon(getClass().getResource(cc1)));
            if (player.getCard1() == 1) {
                jLabelCard1Ace1.setText("1");
                jLabelCard1Ace11.setText("11");
            }
        }
        if (counter >= 2) {
            String c2 = "/AppPackage/Card" + player.getCard2() + ".png";
            //String cc2 = "/AppPackage/Card" + Comput.getCard2() + ".png";
            jLabelCard2.setIcon(new javax.swing.ImageIcon(getClass().getResource(c2)));
            jLabelCardComp2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AppPackage/Cardback.jpg")));
            if (player.getCard2() == 1) {
                jLabelCard2Ace1.setText("1");
                jLabelCard2Ace11.setText("11");
            }
        }
        if (counter >= 3) {
            String c3 = "/AppPackage/Card" + player.getCard3() + ".png";
            String cc3 = "/AppPackage/Card" + dealer.getCard3() + ".png";
            jLabelCard3.setIcon(new javax.swing.ImageIcon(getClass().getResource(c3)));
            int amount = (dealer.computerSum(dealer, 3));
            if (amount >= 3) {
                jLabelCardComp3.setIcon(new javax.swing.ImageIcon(getClass().getResource(cc3)));
            }
            if (player.getCard3() == 1) {
                jLabelCard3Ace1.setText("1");
                jLabelCard3Ace11.setText("11");
            }
        }
        if (counter >= 4) {
            String c4 = "/AppPackage/Card" + player.getCard4() + ".png";
            String cc4 = "/AppPackage/Card" + dealer.getCard4() + ".png";
            jLabelCard4.setIcon(new javax.swing.ImageIcon(getClass().getResource(c4)));
            int amount = (dealer.computerSum(dealer, 4));
            if (amount >= 4) {
                jLabelCardComp4.setIcon(new javax.swing.ImageIcon(getClass().getResource(cc4)));
            }
            if (player.getCard4() == 1) {
                jLabelCard4Ace1.setText("1");
                jLabelCard4Ace11.setText("11");
            }
        }
        if (counter >= 5) {
            String c5 = "/AppPackage/Card" + player.getCard5() + ".png";
            String cc5 = "/AppPackage/Card" + dealer.getCard5() + ".png";
            jLabelCard5.setIcon(new javax.swing.ImageIcon(getClass().getResource(c5)));
            int amount = (dealer.computerSum(dealer, 5));
            if (amount >= 5) {
                jLabelCardComp5.setIcon(new javax.swing.ImageIcon(getClass().getResource(cc5)));
            }
            if (player.getCard5() == 1) {
                jLabelCard5Ace1.setText("1");
                jLabelCard5Ace11.setText("11");
            }
        }
    }

    private void jLabelStandMouseReleased(java.awt.event.MouseEvent evt) {
        jLabelWarning.setText("");
        total = 0;
        if (counter >= 1) {
            total += player.getCard1();
        }
        if (counter >= 2) {
            total += player.getCard2();
        }
        if (counter >= 3) {
            total += player.getCard3();
        }
        if (counter >= 4) {
            total += player.getCard4();
        }
        if (counter >= 5) {
            total += player.getCard5();
        }
        jLabelScore.setText("Score: " + total);
        this.setVisible(false);
        new Results(player, dealer, counter, total).setVisible(true);

    }

    private void jLabelCard1Ace1MouseReleased(java.awt.event.MouseEvent evt) {
        jLabelCard1Ace11.setText("");
        player.setCard1(1);
    }

    private void jLabelCard1Ace11MouseReleased(java.awt.event.MouseEvent evt) {
        jLabelCard1Ace1.setText("");
        player.setCard1(11);
    }

    private void jLabelCard2Ace1MouseReleased(java.awt.event.MouseEvent evt) {
        jLabelCard2Ace11.setText("");
        player.setCard2(1);
    }

    private void jLabelCard2Ace11MouseReleased(java.awt.event.MouseEvent evt) {
        jLabelCard2Ace1.setText("");
        player.setCard2(11);
    }

    private void jLabelCard3Ace1MouseReleased(java.awt.event.MouseEvent evt) {
        jLabelCard3Ace11.setText("");
        player.setCard3(1);
    }

    private void jLabelCard3Ace11MouseReleased(java.awt.event.MouseEvent evt) {
        jLabelCard3Ace1.setText("");
        player.setCard3(11);
    }

    private void jLabelCard4Ace1MouseReleased(java.awt.event.MouseEvent evt) {
        jLabelCard4Ace11.setText("");
        player.setCard4(1);
    }

    private void jLabelCard4Ace11MouseReleased(java.awt.event.MouseEvent evt) {
        jLabelCard4Ace1.setText("");
        player.setCard4(11);
    }

    private void jLabelCard5Ace1MouseReleased(java.awt.event.MouseEvent evt) {
        jLabelCard5Ace11.setText("");
        player.setCard5(1);
    }

    private void jLabelCard5Ace11MouseReleased(java.awt.event.MouseEvent evt) {
        jLabelCard5Ace1.setText("");
        player.setCard5(11);
    }

    private void jLabelEndRoundMouseReleased(java.awt.event.MouseEvent evt) {

    }
    // End of variables declaration                   
}
