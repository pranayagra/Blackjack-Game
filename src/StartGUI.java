/**
 * @author PAgrawal
 */
public class StartGUI extends javax.swing.JFrame {
    /**
     * Creates new form StartGUI
     */
    private BJCard player;
    private BJCard dealer;
    // Variables declaration - do not modify
    private javax.swing.JLabel jLabelChip1;
    private javax.swing.JLabel jLabelChip10;
    private javax.swing.JLabel jLabelChip100;
    private javax.swing.JLabel jLabelChip20;
    private javax.swing.JLabel jLabelChip5;
    private javax.swing.JLabel jLabelDisplay;
    private javax.swing.JLabel jLabelLowBet;
    private javax.swing.JLabel jLabelMoney;
    private javax.swing.JLabel jLabelPlayButton;
    private javax.swing.JLabel jLabelResetChips;
    private javax.swing.JLabel jLabelSubmit;

    public StartGUI() {
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        initComponents();
    }

    /**
     * @param player the player
     * @param dealer the dealer
     */
    public StartGUI(BJCard player, BJCard dealer) {
        this.player = player;
        this.dealer = dealer;
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        initComponents();
        this.player.shuffle();
        this.dealer.shuffle();
        this.player.chips();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StartGUI().setVisible(true);
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    private void initComponents() {

        jLabelMoney = new javax.swing.JLabel();
        jLabelPlayButton = new javax.swing.JLabel();
        jLabelDisplay = new javax.swing.JLabel();
        jLabelChip100 = new javax.swing.JLabel();
        jLabelChip20 = new javax.swing.JLabel();
        jLabelChip10 = new javax.swing.JLabel();
        jLabelChip5 = new javax.swing.JLabel();
        jLabelChip1 = new javax.swing.JLabel();
        jLabelSubmit = new javax.swing.JLabel();
        jLabelLowBet = new javax.swing.JLabel();
        jLabelResetChips = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("BlackJack");
        setUndecorated(true);
        setResizable(false);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });

        jLabelMoney.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelMoney.setText("Money: ");
        jLabelMoney.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                jLabelMoneyComponentAdded(evt);
            }
        });
        jLabelMoney.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabelMoneyMousePressed(evt);
            }
        });

        jLabelPlayButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelPlayButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelPlayButton.setText("Start Round!");
        jLabelPlayButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabelPlayButtonMouseReleased(evt);
            }
        });

        jLabelDisplay.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabelDisplay.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabelChip100.setBackground(new java.awt.Color(255, 0, 0));
        jLabelChip100.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelChip100.setForeground(new java.awt.Color(255, 51, 51));
        jLabelChip100.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelChip100.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabelChip100MouseReleased(evt);
            }
        });

        jLabelChip20.setBackground(new java.awt.Color(255, 0, 0));
        jLabelChip20.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelChip20.setForeground(new java.awt.Color(255, 51, 51));
        jLabelChip20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelChip20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabelChip20MouseReleased(evt);
            }
        });

        jLabelChip10.setBackground(new java.awt.Color(255, 0, 0));
        jLabelChip10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelChip10.setForeground(new java.awt.Color(255, 51, 51));
        jLabelChip10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelChip10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabelChip10MouseReleased(evt);
            }
        });

        jLabelChip5.setBackground(new java.awt.Color(255, 0, 0));
        jLabelChip5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelChip5.setForeground(new java.awt.Color(255, 51, 51));
        jLabelChip5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelChip5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabelChip5MouseReleased(evt);
            }
        });

        jLabelChip1.setBackground(new java.awt.Color(255, 0, 0));
        jLabelChip1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelChip1.setForeground(new java.awt.Color(255, 51, 51));
        jLabelChip1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelChip1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabelChip1MouseReleased(evt);
            }
        });

        jLabelSubmit.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelSubmit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelSubmit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabelSubmitMouseReleased(evt);
            }
        });

        jLabelLowBet.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelLowBet.setForeground(new java.awt.Color(255, 51, 51));
        jLabelLowBet.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        jLabelResetChips.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabelResetChips.setForeground(new java.awt.Color(255, 0, 0));
        jLabelResetChips.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelResetChips.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabelResetChipsMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabelDisplay, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelChip100, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelChip20, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelChip10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelChip5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelChip1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabelMoney, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(108, 108, 108)
                                                .addComponent(jLabelSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabelLowBet, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabelPlayButton)
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                .addContainerGap())
                        .addComponent(jLabelResetChips, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabelPlayButton, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addComponent(jLabelDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabelChip100)
                                .addGap(18, 18, 18)
                                .addComponent(jLabelChip20)
                                .addGap(18, 18, 18)
                                .addComponent(jLabelChip10)
                                .addGap(18, 18, 18)
                                .addComponent(jLabelChip5)
                                .addGap(18, 18, 18)
                                .addComponent(jLabelChip1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 205, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabelMoney, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabelSubmit)
                                        .addComponent(jLabelLowBet, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(51, 51, 51)
                                .addComponent(jLabelResetChips, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(77, 77, 77))
        );

        pack();
        setLocationRelativeTo(null);
    }

    private void jLabelMoneyComponentAdded(java.awt.event.ContainerEvent evt) {
        // jLabelMoney.setText("Money: " + Player.getMoney());
    }

    private void jLabelMoneyMousePressed(java.awt.event.MouseEvent evt) {
        // jLabelMoney.setText("Money: " + Player.getMoney());
    }

    private void jLabelPlayButtonMouseReleased(java.awt.event.MouseEvent evt) {
        jLabelMoney.setText("Money: " + player.getMoney());
        player.setBet(0);
        if (player.getMoney() < 3) {
            jLabelPlayButton.setText("Status: Not enough money");
        } else {
            bet(player);
        }
    }

    private void formMousePressed(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
    }

    private void jLabelChip100MouseReleased(java.awt.event.MouseEvent evt) {
        if (player.getChip100() > 0) {
            player.setChip100(player.getChip100() - 1);
            jLabelDisplay.setText("" + (Integer.parseInt(jLabelDisplay.getText()) + 100));
            jLabelChip100.setText("You Have: " + player.getChip100() + " $100 chips");
        } else {
            jLabelChip100.setText("Not enough $100 Chips!");
        }
    }

    private void jLabelChip20MouseReleased(java.awt.event.MouseEvent evt) {
        if (player.getChip20() > 0) {
            player.setChip20(player.getChip20() - 1);
            jLabelDisplay.setText("" + (Integer.parseInt(jLabelDisplay.getText()) + 20));
            jLabelChip20.setText("You Have: " + player.getChip20() + " $20 chips");
        } else {
            jLabelChip20.setText("Not enough $20 Chips!");
        }
    }

    private void jLabelChip10MouseReleased(java.awt.event.MouseEvent evt) {
        if (player.getChip10() > 0) {
            player.setChip10(player.getChip10() - 1);
            jLabelDisplay.setText("" + (Integer.parseInt(jLabelDisplay.getText()) + 10));
            jLabelChip10.setText("You Have: " + player.getChip10() + " $10 chips");
        } else {
            jLabelChip10.setText("Not enough $10 Chips!");
        }
    }

    private void jLabelChip5MouseReleased(java.awt.event.MouseEvent evt) {
        if (player.getChip5() > 0) {
            player.setChip5(player.getChip5() - 1);
            jLabelDisplay.setText("" + (Integer.parseInt(jLabelDisplay.getText()) + 5));
            jLabelChip5.setText("You Have: " + player.getChip5() + " $5 chips");
        } else {
            jLabelChip5.setText("Not enough $5 Chips!");
        }
    }

    private void jLabelChip1MouseReleased(java.awt.event.MouseEvent evt) {
        if (player.getChip1() > 0) {
            player.setChip1(player.getChip1() - 1);
            jLabelDisplay.setText("" + (Integer.parseInt(jLabelDisplay.getText()) + 1));
            jLabelChip1.setText("You Have: " + player.getChip1() + " $1 chips");
        } else {
            jLabelChip1.setText("Not enough $1 Chips!");
        }
    }

    private void jLabelSubmitMouseReleased(java.awt.event.MouseEvent evt) {
        player.setBet(Integer.parseInt(jLabelDisplay.getText()));
        if (player.getBet() > 3) {
            this.setVisible(false);
            player.setMoney(player.getMoney() - player.getBet());
            new Game(player, dealer).setVisible(true);
        } else {
            jLabelLowBet.setText("Bet must be greater than 3!");

        }
    }

    private void jLabelResetChipsMouseReleased(java.awt.event.MouseEvent evt) {
        player.chips();
        jLabelLowBet.setText("");
        bet(player);
    }

    /**
     *
     * @param player the player bet
     */
    private void bet(BJCard player) {
        jLabelPlayButton.setText("Playing!");
        jLabelResetChips.setText("Reset Betting Amount");
        jLabelDisplay.setText("0");
        jLabelChip100.setText("You Have: " + player.getChip100() + " $100 chips");
        jLabelChip20.setText("You Have: " + player.getChip20() + " $20 chips");
        jLabelChip10.setText("You Have: " + player.getChip10() + " $10 chips");
        jLabelChip5.setText("You Have: " + player.getChip5() + " $5 chips");
        jLabelChip1.setText("You Have: " + player.getChip1() + " $1 chips");
        jLabelSubmit.setText("Submit");
    }
    // End of variables declaration                   
}
