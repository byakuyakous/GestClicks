/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IHM;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.JFrame;

/**
 *
 * @author Abdelkrim
 */
public class DentisteAccueil extends javax.swing.JFrame {
    
    int xMouse;
    int yMouse;
    GridBagLayout layout = new GridBagLayout();
    DOperation Doperation = new DOperation();
    DDefaut Ddefault = new DDefaut();
    /**
     * Creates new form Dentiste
     */
  
    public DentisteAccueil() {
        initComponents();
        ColorPanel1.setBackground(new Color(43,149,113));
        this.setLocationRelativeTo(null);
        DynamicPanel.setLayout(layout);
        GridBagConstraints c = new GridBagConstraints();
        c.gridx=0;
        c.gridy=0;
        DynamicPanel.add(Ddefault, c);
        DynamicPanel.add(Doperation, c);
        Ddefault.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TopPanel = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        ExitPanel = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        ExitPanel1 = new javax.swing.JLabel();
        NpLabel1 = new javax.swing.JLabel();
        NpLabel2 = new javax.swing.JLabel();
        LeftPanel = new javax.swing.JPanel();
        GestPanel = new javax.swing.JPanel();
        TextLabel = new javax.swing.JLabel();
        ImgLabel = new javax.swing.JLabel();
        ColorPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        NpLabel = new javax.swing.JLabel();
        GestPanel1 = new javax.swing.JPanel();
        TextLabel1 = new javax.swing.JLabel();
        ImgLabel1 = new javax.swing.JLabel();
        ColorPanel1 = new javax.swing.JPanel();
        GestPanel2 = new javax.swing.JPanel();
        TextLabel2 = new javax.swing.JLabel();
        ImgLabel2 = new javax.swing.JLabel();
        ColorPanel2 = new javax.swing.JPanel();
        GestPanel3 = new javax.swing.JPanel();
        TextLabel3 = new javax.swing.JLabel();
        ImgLabel3 = new javax.swing.JLabel();
        ColorPanel3 = new javax.swing.JPanel();
        DynamicPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        TopPanel.setBackground(new java.awt.Color(51, 129, 162));
        TopPanel.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                TopPanelMouseDragged(evt);
            }
        });
        TopPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TopPanelMousePressed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(51, 129, 162));
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel2MouseExited(evt);
            }
        });

        ExitPanel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imgs/exit.png"))); // NOI18N
        ExitPanel.setText("   ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(ExitPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(11, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ExitPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11))
        );

        jPanel3.setBackground(new java.awt.Color(51, 129, 162));
        jPanel3.setPreferredSize(new java.awt.Dimension(44, 45));
        jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel3MouseExited(evt);
            }
        });

        ExitPanel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imgs/reduce.png"))); // NOI18N
        ExitPanel1.setText("   ");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ExitPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(ExitPanel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        NpLabel1.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        NpLabel1.setForeground(new java.awt.Color(255, 255, 255));
        NpLabel1.setText("Dentiste: ");

        NpLabel2.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        NpLabel2.setForeground(new java.awt.Color(255, 255, 255));
        NpLabel2.setText("Login");

        javax.swing.GroupLayout TopPanelLayout = new javax.swing.GroupLayout(TopPanel);
        TopPanel.setLayout(TopPanelLayout);
        TopPanelLayout.setHorizontalGroup(
            TopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TopPanelLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(NpLabel1)
                .addGap(0, 0, 0)
                .addComponent(NpLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 502, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        TopPanelLayout.setVerticalGroup(
            TopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
            .addGroup(TopPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(TopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NpLabel1)
                    .addComponent(NpLabel2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        LeftPanel.setBackground(new java.awt.Color(58, 67, 94));

        GestPanel.setBackground(new java.awt.Color(58, 67, 94));
        GestPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                GestPanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                GestPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                GestPanelMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                GestPanelMousePressed(evt);
            }
        });

        TextLabel.setBackground(new java.awt.Color(255, 255, 255));
        TextLabel.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        TextLabel.setForeground(new java.awt.Color(255, 255, 255));
        TextLabel.setText("    Operations");

        ImgLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imgs/tooth.png"))); // NOI18N

        ColorPanel.setBackground(new java.awt.Color(58, 67, 94));

        javax.swing.GroupLayout ColorPanelLayout = new javax.swing.GroupLayout(ColorPanel);
        ColorPanel.setLayout(ColorPanelLayout);
        ColorPanelLayout.setHorizontalGroup(
            ColorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 12, Short.MAX_VALUE)
        );
        ColorPanelLayout.setVerticalGroup(
            ColorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout GestPanelLayout = new javax.swing.GroupLayout(GestPanel);
        GestPanel.setLayout(GestPanelLayout);
        GestPanelLayout.setHorizontalGroup(
            GestPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GestPanelLayout.createSequentialGroup()
                .addComponent(ColorPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ImgLabel)
                .addGap(14, 14, 14)
                .addComponent(TextLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        GestPanelLayout.setVerticalGroup(
            GestPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, GestPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(GestPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(TextLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ColorPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ImgLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imgs/dentist logo 2.png"))); // NOI18N
        jLabel1.setText("    ");

        NpLabel.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        NpLabel.setForeground(new java.awt.Color(255, 255, 255));
        NpLabel.setText("Nom et prenom");

        GestPanel1.setBackground(new java.awt.Color(58, 67, 94));
        GestPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                GestPanel1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                GestPanel1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                GestPanel1MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                GestPanel1MousePressed(evt);
            }
        });

        TextLabel1.setBackground(new java.awt.Color(255, 255, 255));
        TextLabel1.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        TextLabel1.setForeground(new java.awt.Color(255, 255, 255));
        TextLabel1.setText("     Accueil");

        ImgLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imgs/Accueil.png"))); // NOI18N

        ColorPanel1.setBackground(new java.awt.Color(58, 67, 94));

        javax.swing.GroupLayout ColorPanel1Layout = new javax.swing.GroupLayout(ColorPanel1);
        ColorPanel1.setLayout(ColorPanel1Layout);
        ColorPanel1Layout.setHorizontalGroup(
            ColorPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 12, Short.MAX_VALUE)
        );
        ColorPanel1Layout.setVerticalGroup(
            ColorPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout GestPanel1Layout = new javax.swing.GroupLayout(GestPanel1);
        GestPanel1.setLayout(GestPanel1Layout);
        GestPanel1Layout.setHorizontalGroup(
            GestPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GestPanel1Layout.createSequentialGroup()
                .addComponent(ColorPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ImgLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TextLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        GestPanel1Layout.setVerticalGroup(
            GestPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, GestPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(GestPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(TextLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ColorPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ImgLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );

        GestPanel2.setBackground(new java.awt.Color(58, 67, 94));
        GestPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                GestPanel2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                GestPanel2MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                GestPanel2MousePressed(evt);
            }
        });

        TextLabel2.setBackground(new java.awt.Color(255, 255, 255));
        TextLabel2.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        TextLabel2.setForeground(new java.awt.Color(255, 255, 255));
        TextLabel2.setText("     Rendez-vous");

        ImgLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imgs/RV2.png"))); // NOI18N

        ColorPanel2.setBackground(new java.awt.Color(58, 67, 94));

        javax.swing.GroupLayout ColorPanel2Layout = new javax.swing.GroupLayout(ColorPanel2);
        ColorPanel2.setLayout(ColorPanel2Layout);
        ColorPanel2Layout.setHorizontalGroup(
            ColorPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 12, Short.MAX_VALUE)
        );
        ColorPanel2Layout.setVerticalGroup(
            ColorPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout GestPanel2Layout = new javax.swing.GroupLayout(GestPanel2);
        GestPanel2.setLayout(GestPanel2Layout);
        GestPanel2Layout.setHorizontalGroup(
            GestPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GestPanel2Layout.createSequentialGroup()
                .addComponent(ColorPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(ImgLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TextLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4))
        );
        GestPanel2Layout.setVerticalGroup(
            GestPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, GestPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(GestPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(TextLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ColorPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ImgLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );

        GestPanel3.setBackground(new java.awt.Color(58, 67, 94));
        GestPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                GestPanel3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                GestPanel3MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                GestPanel3MousePressed(evt);
            }
        });

        TextLabel3.setBackground(new java.awt.Color(255, 255, 255));
        TextLabel3.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        TextLabel3.setForeground(new java.awt.Color(255, 255, 255));
        TextLabel3.setText("     Déconnexion");

        ImgLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imgs/Deconnexion.png"))); // NOI18N

        ColorPanel3.setBackground(new java.awt.Color(58, 67, 94));

        javax.swing.GroupLayout ColorPanel3Layout = new javax.swing.GroupLayout(ColorPanel3);
        ColorPanel3.setLayout(ColorPanel3Layout);
        ColorPanel3Layout.setHorizontalGroup(
            ColorPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 12, Short.MAX_VALUE)
        );
        ColorPanel3Layout.setVerticalGroup(
            ColorPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout GestPanel3Layout = new javax.swing.GroupLayout(GestPanel3);
        GestPanel3.setLayout(GestPanel3Layout);
        GestPanel3Layout.setHorizontalGroup(
            GestPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GestPanel3Layout.createSequentialGroup()
                .addComponent(ColorPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(ImgLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TextLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4))
        );
        GestPanel3Layout.setVerticalGroup(
            GestPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, GestPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(GestPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(TextLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ColorPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ImgLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout LeftPanelLayout = new javax.swing.GroupLayout(LeftPanel);
        LeftPanel.setLayout(LeftPanelLayout);
        LeftPanelLayout.setHorizontalGroup(
            LeftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(GestPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(GestPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(GestPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LeftPanelLayout.createSequentialGroup()
                .addComponent(GestPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(LeftPanelLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(LeftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NpLabel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        LeftPanelLayout.setVerticalGroup(
            LeftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LeftPanelLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(NpLabel)
                .addGap(34, 34, 34)
                .addComponent(GestPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(GestPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(GestPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(GestPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        DynamicPanel.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout DynamicPanelLayout = new javax.swing.GroupLayout(DynamicPanel);
        DynamicPanel.setLayout(DynamicPanelLayout);
        DynamicPanelLayout.setHorizontalGroup(
            DynamicPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        DynamicPanelLayout.setVerticalGroup(
            DynamicPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(LeftPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(TopPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(DynamicPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LeftPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(TopPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(DynamicPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jPanel2MouseClicked

    private void jPanel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseEntered
        // TODO add your handling code here:
        jPanel2.setBackground(Color.red);
    }//GEN-LAST:event_jPanel2MouseEntered

    private void jPanel2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseExited
        // TODO add your handling code here:
        jPanel2.setBackground(new Color(51,129,162));
    }//GEN-LAST:event_jPanel2MouseExited

    private void jPanel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jPanel3MouseClicked

    private void jPanel3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseEntered
        // TODO add your handling code here:
        jPanel3.setBackground(new Color(58,67,94));
    }//GEN-LAST:event_jPanel3MouseEntered

    private void jPanel3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseExited
        // TODO add your handling code here:
        jPanel3.setBackground(new Color(51,129,162));

    }//GEN-LAST:event_jPanel3MouseExited

    private void TopPanelMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TopPanelMouseDragged
        // TODO add your handling code here:
        int x=evt.getXOnScreen();
        int y=evt.getYOnScreen();
        this.setLocation(x-xMouse-400,y-yMouse);
    }//GEN-LAST:event_TopPanelMouseDragged

    private void TopPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TopPanelMousePressed
        xMouse=evt.getX();
        yMouse=evt.getY();
    }//GEN-LAST:event_TopPanelMousePressed

    private void GestPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GestPanelMouseEntered
        GestPanel.setBackground(new Color(96,112,157));
    }//GEN-LAST:event_GestPanelMouseEntered

    private void GestPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GestPanelMouseExited
        // TODO add your handling code here:
        GestPanel.setBackground(new Color(58,67,94));
    }//GEN-LAST:event_GestPanelMouseExited

    private void GestPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GestPanelMousePressed
        // TODO add your handling code here:
        ColorPanel.setBackground(new Color(43,149,113));
        ColorPanel1.setBackground(new Color(58,67,94));
        ColorPanel2.setBackground(new Color(58,67,94));
        ColorPanel3.setBackground(new Color(58,67,94));
    }//GEN-LAST:event_GestPanelMousePressed

    private void GestPanel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GestPanel1MouseEntered
        // TODO add your handling code here:
        GestPanel1.setBackground(new Color(96,112,157));
    }//GEN-LAST:event_GestPanel1MouseEntered

    private void GestPanel1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GestPanel1MouseExited
        // TODO add your handling code here:
        GestPanel1.setBackground(new Color(58,67,94));
    }//GEN-LAST:event_GestPanel1MouseExited

    private void GestPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GestPanel1MousePressed
        // TODO add your handling code here:
        ColorPanel1.setBackground(new Color(43,149,113));
        ColorPanel.setBackground(new Color(58,67,94));
        ColorPanel2.setBackground(new Color(58,67,94));
        ColorPanel3.setBackground(new Color(58,67,94));
    }//GEN-LAST:event_GestPanel1MousePressed

    private void GestPanel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GestPanel2MouseEntered
        // TODO add your handling code here:
        GestPanel2.setBackground(new Color(96,112,157));
    }//GEN-LAST:event_GestPanel2MouseEntered

    private void GestPanel2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GestPanel2MouseExited
        // TODO add your handling code here:
        GestPanel2.setBackground(new Color(58,67,94));
    }//GEN-LAST:event_GestPanel2MouseExited

    private void GestPanel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GestPanel2MousePressed
        // TODO add your handling code here:
        ColorPanel2.setBackground(new Color(43,149,113));
        ColorPanel1.setBackground(new Color(58,67,94));
        ColorPanel.setBackground(new Color(58,67,94));
        ColorPanel3.setBackground(new Color(58,67,94));
    }//GEN-LAST:event_GestPanel2MousePressed

    private void GestPanel3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GestPanel3MouseEntered
        // TODO add your handling code here:
        GestPanel3.setBackground(new Color(96,112,157));
    }//GEN-LAST:event_GestPanel3MouseEntered

    private void GestPanel3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GestPanel3MouseExited
        // TODO add your handling code here:
        GestPanel3.setBackground(new Color(58,67,94));
    }//GEN-LAST:event_GestPanel3MouseExited

    private void GestPanel3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GestPanel3MousePressed
        // TODO add your handling code here:
        ColorPanel3.setBackground(new Color(43,149,113));
        ColorPanel1.setBackground(new Color(58,67,94));
        ColorPanel2.setBackground(new Color(58,67,94));
        ColorPanel.setBackground(new Color(58,67,94));
    }//GEN-LAST:event_GestPanel3MousePressed

    private void GestPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GestPanelMouseClicked
        Ddefault.setVisible(false);
        Doperation.setVisible(true);
    }//GEN-LAST:event_GestPanelMouseClicked

    private void GestPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GestPanel1MouseClicked
        Ddefault.setVisible(true);
        Doperation.setVisible(false);
    }//GEN-LAST:event_GestPanel1MouseClicked

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
            java.util.logging.Logger.getLogger(DentisteAccueil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DentisteAccueil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DentisteAccueil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DentisteAccueil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DentisteAccueil().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ColorPanel;
    private javax.swing.JPanel ColorPanel1;
    private javax.swing.JPanel ColorPanel2;
    private javax.swing.JPanel ColorPanel3;
    private javax.swing.JPanel DynamicPanel;
    private javax.swing.JLabel ExitPanel;
    private javax.swing.JLabel ExitPanel1;
    private javax.swing.JPanel GestPanel;
    private javax.swing.JPanel GestPanel1;
    private javax.swing.JPanel GestPanel2;
    private javax.swing.JPanel GestPanel3;
    private javax.swing.JLabel ImgLabel;
    private javax.swing.JLabel ImgLabel1;
    private javax.swing.JLabel ImgLabel2;
    private javax.swing.JLabel ImgLabel3;
    private javax.swing.JPanel LeftPanel;
    private javax.swing.JLabel NpLabel;
    private javax.swing.JLabel NpLabel1;
    private javax.swing.JLabel NpLabel2;
    private javax.swing.JLabel TextLabel;
    private javax.swing.JLabel TextLabel1;
    private javax.swing.JLabel TextLabel2;
    private javax.swing.JLabel TextLabel3;
    private javax.swing.JPanel TopPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
