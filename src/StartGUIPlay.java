import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author PAgrawal
 */
public class StartGUIPlay extends javax.swing.JFrame {
    private BJCard player = new BJCard();
    private BJCard dealer = new BJCard();

    /**
     * Creates new form StartGUIPlay
     */
    public StartGUIPlay() {
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabelPlay = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabelLoad = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PlayScreen");
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("~ BlackJack ~");

        jLabelPlay.setFont(new java.awt.Font("Tw Cen MT Condensed "
                + "Extra Bold", 0, 36));
        jLabelPlay.setForeground(new java.awt.Color(255, 51, 153));
        jLabelPlay.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelPlay.setText("Play");
        jLabelPlay.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabelPlayMouseReleased(evt);
            }
        });

        jLabelLoad.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabelLoad.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelLoad.setToolTipText("");
        jLabelLoad.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout;
        layout = new javax.swing.GroupLayout(getContentPane());

        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
                        .addComponent(jLabelPlay, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(288, 288, 288)
                                .addComponent(jLabel3)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabelLoad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(115, 115, 115)
                                .addComponent(jLabelPlay, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 184, Short.MAX_VALUE)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelLoad, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(85, 85, 85))
        );

        pack();
        setLocationRelativeTo(null);
    }

    /**
     *
     * @param evt Mouse event for play button
     */
    private void jLabelPlayMouseReleased(java.awt.event.MouseEvent evt) {
        this.setVisible(false);
        new StartGUI(player, dealer).setVisible(true);
        ActionListener taskPerformer = new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                //...Perform a task...
                performTask();
            }
        };
    }

    private void performTask() {
        int x = (int) (Math.random() * 10 + 1);
        if (jLabelLoad.getText().length() < 3) {
            jLabelLoad.setText(jLabelLoad.getText() + '.');
        } else if (jLabelLoad.getText().length() == 3) {
            jLabelLoad.setText("");
        }
        if (x == 9) {
            this.setVisible(false);
            new StartGUI(player, dealer).setVisible(true);

        }
    }


    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("checkstyle:ArrayTypeStyle")
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StartGUIPlay().setVisible(true);


            }
        });


    }

    // Variables declaration - do not modify
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelLoad;
    private javax.swing.JLabel jLabelPlay;
    // End of variables declaration                   
}
