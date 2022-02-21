/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.team09.shoppingapp;

import java.net.MalformedURLException;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import org.netbeans.lib.awtextra.AbsoluteLayout;

/**
 *
 * @author user
 */
public class MainFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
        initComponents();
        homepanel.setVisible(true);
        catagorypanel.setVisible(false);
        servicepanell.setVisible(false);
        helppanel.setVisible(false);
        loginpanel.setVisible(false);
        contact.setVisible(false);
        signuppanal.setVisible(false);
    }

    public static String myemail = "";
    //itempage
    public static String name1;
    public static String price1;
    public static String itempagemainimage;
    public static String avalibleitem;
    //homepage
    public static String homecloth1;
    public static String homecloth1n;
    public static String homecloth1p;
    public static String homecloth2;
    public static String homecloth2n;
    public static String homecloth2p;
    public static String homecloth3;
    public static String homecloth3n;
    public static String homecloth3p;
    public static String homecloth4;
    public static String homecloth4n;
    public static String homecloth4p;
    public static String homeshoe1;
    public static String homeshoe1n;
    public static String homeshoe1p;
    public static String homeshoe2;
    public static String homeshoe2n;
    public static String homeshoe2p;
    public static String homeshoe3;
    public static String homeshoe3n;
    public static String homeshoe3p;
    public static String homeshoe4;
    public static String homeshoe4n;
    public static String homeshoe4p;
    public static String homebag1;
    public static String homebag1n;
    public static String homebag1p;
    public static String homebag2;
    public static String homebag2n;
    public static String homebag2p;
    public static String homebag3;
    public static String homebag3n;
    public static String homebag3p;
    public static String homebag4;
    public static String homebag4n;
    public static String homebag4p;
    public static String hometoy1;
    public static String hometoy1n;
    public static String hometoy1p;
    public static String hometoy2;
    public static String hometoy2n;
    public static String hometoy2p;
    public static String hometoy3;
    public static String hometoy3n;
    public static String hometoy3p;
    public static String hometoy4;
    public static String hometoy4n;
    public static String hometoy4p;

    public static String item1;
    public static String item1n;
    public static String item1p;
    public static String item2;
    public static String item2n;
    public static String item2p;
    public static String item3;
    public static String item3n;
    public static String item3p;
    public static String item4;
    public static String item4n;
    public static String item4p;
    public static String item5;
    public static String item5n;
    public static String item5p;
    public static String item6;
    public static String item6n;
    public static String item6p;

    public static String item7;
    public static String item7n;
    public static String item7p;
    public static String item8;
    public static String item8n;
    public static String item8p;
    public static String item9;
    public static String item9n;
    public static String item9p;
    public static String item10;
    public static String item10n;
    public static String item10p;
    public static String item11;
    public static String item11n;
    public static String item11p;
    public static String item12;
    public static String item12n;
    public static String item12p;

    public static String item13;
    public static String item13n;
    public static String item13p;
    public static String item14;
    public static String item14n;
    public static String item14p;
    public static String item15;
    public static String item15n;
    public static String item15p;
    public static String item16;
    public static String item16n;
    public static String item16p;
    public static String item17;
    public static String item17n;
    public static String item17p;
    public static String item18;
    public static String item18n;
    public static String item18p;

    public static String item19;
    public static String item19n;
    public static String item19p;
    public static String item20;
    public static String item20n;
    public static String item20p;
    public static String item21;
    public static String item21n;
    public static String item21p;
    public static String item22;
    public static String item22n;
    public static String item22p;
    public static String item23;
    public static String item23n;
    public static String item23p;
    public static String item24;
    public static String item24n;
    public static String item24p;

    //sql connection function
    public static Statement sqlconnection() {
        Statement stmt = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/team9", "test", "test");
//here sonoo is database name, root is username and password
            stmt = con.createStatement();
        } catch (Exception e) {
            System.out.println(e);
        }
        return stmt;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainpanel = new javax.swing.JPanel();
        navpanel = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        catagerylistpanel = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jLabel119 = new javax.swing.JLabel();
        jLabel120 = new javax.swing.JLabel();
        jLabel121 = new javax.swing.JLabel();
        logopanel = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        catagorypanel = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        jButton11 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jPanel37 = new javax.swing.JPanel();
        jPanel38 = new javax.swing.JPanel();
        jLabel207 = new javax.swing.JLabel();
        jLabel208 = new javax.swing.JLabel();
        jLabel209 = new javax.swing.JLabel();
        jPanel39 = new javax.swing.JPanel();
        jLabel210 = new javax.swing.JLabel();
        jLabel211 = new javax.swing.JLabel();
        jLabel212 = new javax.swing.JLabel();
        jPanel40 = new javax.swing.JPanel();
        jLabel213 = new javax.swing.JLabel();
        jLabel214 = new javax.swing.JLabel();
        jLabel215 = new javax.swing.JLabel();
        jPanel41 = new javax.swing.JPanel();
        jLabel216 = new javax.swing.JLabel();
        jLabel217 = new javax.swing.JLabel();
        jLabel218 = new javax.swing.JLabel();
        jPanel42 = new javax.swing.JPanel();
        jLabel219 = new javax.swing.JLabel();
        jLabel220 = new javax.swing.JLabel();
        jLabel221 = new javax.swing.JLabel();
        jPanel43 = new javax.swing.JPanel();
        jLabel222 = new javax.swing.JLabel();
        jLabel223 = new javax.swing.JLabel();
        jLabel224 = new javax.swing.JLabel();
        jPanel65 = new javax.swing.JPanel();
        jPanel66 = new javax.swing.JPanel();
        jLabel279 = new javax.swing.JLabel();
        jLabel280 = new javax.swing.JLabel();
        jLabel281 = new javax.swing.JLabel();
        jPanel67 = new javax.swing.JPanel();
        jLabel282 = new javax.swing.JLabel();
        jLabel283 = new javax.swing.JLabel();
        jLabel284 = new javax.swing.JLabel();
        jPanel68 = new javax.swing.JPanel();
        jLabel285 = new javax.swing.JLabel();
        jLabel286 = new javax.swing.JLabel();
        jLabel287 = new javax.swing.JLabel();
        jPanel69 = new javax.swing.JPanel();
        jLabel288 = new javax.swing.JLabel();
        jLabel289 = new javax.swing.JLabel();
        jLabel290 = new javax.swing.JLabel();
        jPanel70 = new javax.swing.JPanel();
        jLabel291 = new javax.swing.JLabel();
        jLabel292 = new javax.swing.JLabel();
        jLabel293 = new javax.swing.JLabel();
        jPanel71 = new javax.swing.JPanel();
        jLabel294 = new javax.swing.JLabel();
        jLabel295 = new javax.swing.JLabel();
        jLabel296 = new javax.swing.JLabel();
        jPanel72 = new javax.swing.JPanel();
        jPanel73 = new javax.swing.JPanel();
        jLabel297 = new javax.swing.JLabel();
        jLabel298 = new javax.swing.JLabel();
        jLabel299 = new javax.swing.JLabel();
        jPanel74 = new javax.swing.JPanel();
        jLabel300 = new javax.swing.JLabel();
        jLabel301 = new javax.swing.JLabel();
        jLabel302 = new javax.swing.JLabel();
        jPanel75 = new javax.swing.JPanel();
        jLabel303 = new javax.swing.JLabel();
        jLabel304 = new javax.swing.JLabel();
        jLabel305 = new javax.swing.JLabel();
        jPanel76 = new javax.swing.JPanel();
        jLabel306 = new javax.swing.JLabel();
        jLabel307 = new javax.swing.JLabel();
        jLabel308 = new javax.swing.JLabel();
        jPanel77 = new javax.swing.JPanel();
        jLabel309 = new javax.swing.JLabel();
        jLabel310 = new javax.swing.JLabel();
        jLabel311 = new javax.swing.JLabel();
        jPanel78 = new javax.swing.JPanel();
        jLabel312 = new javax.swing.JLabel();
        jLabel313 = new javax.swing.JLabel();
        jLabel314 = new javax.swing.JLabel();
        jPanel79 = new javax.swing.JPanel();
        jPanel80 = new javax.swing.JPanel();
        jLabel315 = new javax.swing.JLabel();
        jLabel316 = new javax.swing.JLabel();
        jLabel317 = new javax.swing.JLabel();
        jPanel81 = new javax.swing.JPanel();
        jLabel318 = new javax.swing.JLabel();
        jLabel319 = new javax.swing.JLabel();
        jLabel320 = new javax.swing.JLabel();
        jPanel82 = new javax.swing.JPanel();
        jLabel321 = new javax.swing.JLabel();
        jLabel322 = new javax.swing.JLabel();
        jLabel323 = new javax.swing.JLabel();
        jPanel83 = new javax.swing.JPanel();
        jLabel324 = new javax.swing.JLabel();
        jLabel325 = new javax.swing.JLabel();
        jLabel326 = new javax.swing.JLabel();
        jPanel84 = new javax.swing.JPanel();
        jLabel327 = new javax.swing.JLabel();
        jLabel328 = new javax.swing.JLabel();
        jLabel329 = new javax.swing.JLabel();
        jPanel85 = new javax.swing.JPanel();
        jLabel330 = new javax.swing.JLabel();
        jLabel331 = new javax.swing.JLabel();
        jLabel332 = new javax.swing.JLabel();
        homepanel = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel18 = new javax.swing.JPanel();
        jLabel133 = new javax.swing.JLabel();
        jLabel134 = new javax.swing.JLabel();
        jLabel135 = new javax.swing.JLabel();
        jPanel19 = new javax.swing.JPanel();
        jLabel145 = new javax.swing.JLabel();
        jLabel146 = new javax.swing.JLabel();
        jLabel147 = new javax.swing.JLabel();
        jPanel20 = new javax.swing.JPanel();
        jLabel148 = new javax.swing.JLabel();
        jLabel149 = new javax.swing.JLabel();
        jLabel150 = new javax.swing.JLabel();
        jPanel21 = new javax.swing.JPanel();
        jLabel151 = new javax.swing.JLabel();
        jLabel152 = new javax.swing.JLabel();
        jLabel153 = new javax.swing.JLabel();
        jPanel22 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jPanel23 = new javax.swing.JPanel();
        jLabel154 = new javax.swing.JLabel();
        jLabel155 = new javax.swing.JLabel();
        jLabel156 = new javax.swing.JLabel();
        jPanel24 = new javax.swing.JPanel();
        jLabel157 = new javax.swing.JLabel();
        jLabel158 = new javax.swing.JLabel();
        jLabel159 = new javax.swing.JLabel();
        jPanel25 = new javax.swing.JPanel();
        jLabel160 = new javax.swing.JLabel();
        jLabel161 = new javax.swing.JLabel();
        jLabel162 = new javax.swing.JLabel();
        jPanel26 = new javax.swing.JPanel();
        jLabel163 = new javax.swing.JLabel();
        jLabel164 = new javax.swing.JLabel();
        jLabel165 = new javax.swing.JLabel();
        jPanel27 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jPanel28 = new javax.swing.JPanel();
        jLabel166 = new javax.swing.JLabel();
        jLabel167 = new javax.swing.JLabel();
        jLabel168 = new javax.swing.JLabel();
        jPanel29 = new javax.swing.JPanel();
        jLabel169 = new javax.swing.JLabel();
        jLabel170 = new javax.swing.JLabel();
        jLabel171 = new javax.swing.JLabel();
        jPanel30 = new javax.swing.JPanel();
        jLabel172 = new javax.swing.JLabel();
        jLabel173 = new javax.swing.JLabel();
        jLabel174 = new javax.swing.JLabel();
        jPanel31 = new javax.swing.JPanel();
        jLabel175 = new javax.swing.JLabel();
        jLabel176 = new javax.swing.JLabel();
        jLabel177 = new javax.swing.JLabel();
        jPanel32 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jPanel33 = new javax.swing.JPanel();
        jLabel187 = new javax.swing.JLabel();
        jLabel188 = new javax.swing.JLabel();
        jLabel189 = new javax.swing.JLabel();
        jPanel34 = new javax.swing.JPanel();
        jLabel184 = new javax.swing.JLabel();
        jLabel185 = new javax.swing.JLabel();
        jLabel186 = new javax.swing.JLabel();
        jPanel35 = new javax.swing.JPanel();
        jLabel181 = new javax.swing.JLabel();
        jLabel182 = new javax.swing.JLabel();
        jLabel183 = new javax.swing.JLabel();
        jPanel36 = new javax.swing.JPanel();
        jLabel178 = new javax.swing.JLabel();
        jLabel179 = new javax.swing.JLabel();
        jLabel180 = new javax.swing.JLabel();
        servicepanell = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        aboutus = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        privacy = new javax.swing.JPanel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        delivery = new javax.swing.JPanel();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel62 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        jLabel99 = new javax.swing.JLabel();
        contact = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jLabel103 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel104 = new javax.swing.JLabel();
        jLabel105 = new javax.swing.JLabel();
        jLabel106 = new javax.swing.JLabel();
        jLabel107 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel108 = new javax.swing.JLabel();
        jLabel109 = new javax.swing.JLabel();
        jLabel110 = new javax.swing.JLabel();
        jLabel111 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel112 = new javax.swing.JLabel();
        jLabel113 = new javax.swing.JLabel();
        jLabel114 = new javax.swing.JLabel();
        jLabel115 = new javax.swing.JLabel();
        jLabel116 = new javax.swing.JLabel();
        jLabel117 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        terms = new javax.swing.JPanel();
        jLabel73 = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel75 = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        jLabel78 = new javax.swing.JLabel();
        jLabel79 = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        jLabel81 = new javax.swing.JLabel();
        jLabel82 = new javax.swing.JLabel();
        jLabel83 = new javax.swing.JLabel();
        jLabel84 = new javax.swing.JLabel();
        jLabel85 = new javax.swing.JLabel();
        jLabel100 = new javax.swing.JLabel();
        jLabel101 = new javax.swing.JLabel();
        returnexchange = new javax.swing.JPanel();
        jLabel86 = new javax.swing.JLabel();
        jLabel87 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jLabel88 = new javax.swing.JLabel();
        jLabel89 = new javax.swing.JLabel();
        jLabel90 = new javax.swing.JLabel();
        jLabel91 = new javax.swing.JLabel();
        jLabel92 = new javax.swing.JLabel();
        jLabel93 = new javax.swing.JLabel();
        jLabel94 = new javax.swing.JLabel();
        jLabel95 = new javax.swing.JLabel();
        jLabel96 = new javax.swing.JLabel();
        jLabel97 = new javax.swing.JLabel();
        jLabel98 = new javax.swing.JLabel();
        jLabel102 = new javax.swing.JLabel();
        helppanel = new javax.swing.JPanel();
        contact1 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jLabel118 = new javax.swing.JLabel();
        jLabel190 = new javax.swing.JLabel();
        jLabel191 = new javax.swing.JLabel();
        jLabel192 = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        jLabel193 = new javax.swing.JLabel();
        jLabel194 = new javax.swing.JLabel();
        jLabel195 = new javax.swing.JLabel();
        jLabel196 = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        jLabel197 = new javax.swing.JLabel();
        jLabel198 = new javax.swing.JLabel();
        jLabel199 = new javax.swing.JLabel();
        jLabel200 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel201 = new javax.swing.JLabel();
        jLabel202 = new javax.swing.JLabel();
        jLabel203 = new javax.swing.JLabel();
        jLabel204 = new javax.swing.JLabel();
        jLabel205 = new javax.swing.JLabel();
        jLabel206 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jButton10 = new javax.swing.JButton();
        loginpanel = new javax.swing.JPanel();
        loginpanal = new javax.swing.JPanel();
        jTextField4 = new javax.swing.JTextField();
        jLabel123 = new javax.swing.JLabel();
        jLabel124 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel125 = new javax.swing.JLabel();
        jLabel126 = new javax.swing.JLabel();
        jButton9 = new javax.swing.JButton();
        signuppanal = new javax.swing.JPanel();
        jTextField6 = new javax.swing.JTextField();
        jLabel127 = new javax.swing.JLabel();
        jLabel128 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jLabel129 = new javax.swing.JLabel();
        jLabel130 = new javax.swing.JLabel();
        jLabel131 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jButton8 = new javax.swing.JButton();
        jLabel122 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mainpanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        navpanel.setBackground(new java.awt.Color(102, 102, 102));
        navpanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new java.awt.Color(0, 0, 0));
        jPanel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel6MouseClicked(evt);
            }
        });
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(0, 0, 153));
        jLabel1.setOpaque(true);
        jPanel6.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 20, 70));

        jLabel2.setIcon(new javax.swing.ImageIcon("src/img/home.jpg"));
        jPanel6.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 50, 50));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Home");
        jLabel3.setToolTipText("");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jPanel6.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, 110, 70));

        navpanel.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 200, 70));
        jPanel6.getAccessibleContext().setAccessibleDescription("");

        jPanel8.setBackground(new java.awt.Color(0, 0, 0));
        jPanel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel8MouseClicked(evt);
            }
        });
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setBackground(new java.awt.Color(0, 0, 153));
        jLabel7.setOpaque(true);
        jPanel8.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 20, 70));

        jLabel8.setIcon(new javax.swing.ImageIcon("src/img/catagory.png"));
        jPanel8.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 50, 50));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Catagory");
        jLabel9.setToolTipText("");
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        jPanel8.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, 110, 70));

        navpanel.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 200, 70));
        jPanel8.getAccessibleContext().setAccessibleName("");

        jPanel9.setBackground(new java.awt.Color(0, 0, 0));
        jPanel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel9MouseClicked(evt);
            }
        });
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setBackground(new java.awt.Color(0, 0, 153));
        jLabel10.setOpaque(true);
        jPanel9.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 20, 70));

        jLabel11.setIcon(new javax.swing.ImageIcon("src/img/service.png"));
        jPanel9.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 50, 50));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Service");
        jLabel12.setToolTipText("");
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });
        jPanel9.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, 110, 70));

        catagerylistpanel.setBackground(new java.awt.Color(0, 0, 0));
        catagerylistpanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel19.setBackground(new java.awt.Color(255, 255, 0));
        jLabel19.setText("jLabel19");
        catagerylistpanel.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 100, 30));

        jLabel20.setBackground(new java.awt.Color(255, 255, 0));
        jLabel20.setText("jLabel19");
        catagerylistpanel.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 100, 30));

        jLabel24.setBackground(new java.awt.Color(255, 255, 0));
        jLabel24.setText("jLabel19");
        catagerylistpanel.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 100, 30));

        jLabel25.setBackground(new java.awt.Color(255, 255, 0));
        jLabel25.setText("jLabel19");
        catagerylistpanel.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 100, 30));

        jLabel26.setBackground(new java.awt.Color(255, 255, 0));
        jLabel26.setText("jLabel19");
        catagerylistpanel.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 100, 30));

        jLabel27.setBackground(new java.awt.Color(255, 255, 0));
        jLabel27.setText("jLabel19");
        catagerylistpanel.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 100, 30));

        jLabel28.setBackground(new java.awt.Color(255, 255, 0));
        jLabel28.setText("jLabel19");
        catagerylistpanel.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 100, 30));

        jPanel9.add(catagerylistpanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, -100, 110, 210));

        navpanel.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 200, 70));

        jPanel10.setBackground(new java.awt.Color(0, 0, 0));
        jPanel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel10MouseClicked(evt);
            }
        });
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setBackground(new java.awt.Color(0, 0, 153));
        jLabel13.setOpaque(true);
        jPanel10.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 20, 70));

        jLabel14.setIcon(new javax.swing.ImageIcon("src/img/help2.jpg"));
        jPanel10.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 50, 50));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Help");
        jLabel15.setToolTipText("");
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
        });
        jPanel10.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, 110, 70));

        navpanel.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 400, 200, 70));

        jPanel11.setBackground(new java.awt.Color(0, 0, 0));
        jPanel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel11MouseClicked(evt);
            }
        });
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel16.setBackground(new java.awt.Color(0, 0, 153));
        jLabel16.setOpaque(true);
        jPanel11.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 20, 70));

        jLabel17.setIcon(new javax.swing.ImageIcon("src/img/login.png"));
        jPanel11.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 50, 50));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Log In");
        jLabel18.setToolTipText("");
        jLabel18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel18MouseClicked(evt);
            }
        });
        jPanel11.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, 110, 70));

        navpanel.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 500, 200, 70));

        jPanel12.setBackground(new java.awt.Color(0, 0, 0));
        jPanel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel12MouseClicked(evt);
            }
        });
        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel119.setBackground(new java.awt.Color(0, 0, 153));
        jLabel119.setOpaque(true);
        jPanel12.add(jLabel119, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 20, 70));

        jLabel120.setIcon(new javax.swing.ImageIcon("src/img/logout.png"));
        jPanel12.add(jLabel120, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 50, 50));

        jLabel121.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel121.setForeground(new java.awt.Color(255, 255, 255));
        jLabel121.setText("Log Out");
        jLabel121.setToolTipText("");
        jLabel121.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel121MouseClicked(evt);
            }
        });
        jPanel12.add(jLabel121, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, 110, 70));

        navpanel.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 500, 200, 70));

        mainpanel.add(navpanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 690));

        logopanel.setBackground(new java.awt.Color(255, 255, 255));
        logopanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setIcon(new javax.swing.ImageIcon("src/img/logo.png"));
        logopanel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 0, 300, 81));

        mainpanel.add(logopanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 1170, 100));
        logopanel.getAccessibleContext().setAccessibleName("");

        catagorypanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel17.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton11.setText("Bags");
        jButton11.setFocusPainted(false);
        jButton11.setFocusable(false);
        jButton11.setRequestFocusEnabled(false);
        jButton11.setRolloverEnabled(false);
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jPanel17.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 10, 200, 50));

        jButton15.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton15.setText("Cloths");
        jButton15.setFocusPainted(false);
        jButton15.setFocusable(false);
        jButton15.setRequestFocusEnabled(false);
        jButton15.setRolloverEnabled(false);
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        jPanel17.add(jButton15, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 200, 50));

        jButton12.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton12.setText("toys");
        jButton12.setFocusPainted(false);
        jButton12.setFocusable(false);
        jButton12.setRequestFocusEnabled(false);
        jButton12.setRolloverEnabled(false);
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        jPanel17.add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 10, 200, 50));

        jButton13.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton13.setText("Shoes");
        jButton13.setFocusPainted(false);
        jButton13.setFocusable(false);
        jButton13.setRequestFocusEnabled(false);
        jButton13.setRolloverEnabled(false);
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        jPanel17.add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 10, 200, 50));

        catagorypanel.add(jPanel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 1150, 70));

        jPanel37.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel38.setBackground(new java.awt.Color(255, 255, 102));
        jPanel38.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel38MouseClicked(evt);
            }
        });
        jPanel38.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel207.setText(item5n);
        jPanel38.add(jLabel207, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 170, -1));

        jLabel208.setText(item6p);
        jPanel38.add(jLabel208, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, 100, -1));

        jLabel209.setIcon(new javax.swing.ImageIcon(item6));
        jPanel38.add(jLabel209, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 90, 90));

        jPanel37.add(jPanel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 270, 270, 210));

        jPanel39.setBackground(new java.awt.Color(255, 255, 102));
        jPanel39.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel39MouseClicked(evt);
            }
        });
        jPanel39.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel210.setText(item3n);
        jPanel39.add(jLabel210, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 170, -1));

        jLabel211.setText(item3p);
        jPanel39.add(jLabel211, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, 100, -1));

        jLabel212.setIcon(new javax.swing.ImageIcon(item3));
        jPanel39.add(jLabel212, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 90, 90));

        jPanel37.add(jPanel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 30, 270, 210));

        jPanel40.setBackground(new java.awt.Color(255, 255, 102));
        jPanel40.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel40MouseClicked(evt);
            }
        });
        jPanel40.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel213.setText(item2n);
        jPanel40.add(jLabel213, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 170, -1));

        jLabel214.setText(item2p);
        jPanel40.add(jLabel214, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, 100, -1));

        jLabel215.setIcon(new javax.swing.ImageIcon(item2));
        jPanel40.add(jLabel215, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 90, 90));

        jPanel37.add(jPanel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 30, 270, 210));

        jPanel41.setBackground(new java.awt.Color(255, 255, 102));
        jPanel41.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel41MouseClicked(evt);
            }
        });
        jPanel41.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel216.setText(item5n);
        jPanel41.add(jLabel216, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 170, -1));

        jLabel217.setText(item5p);
        jPanel41.add(jLabel217, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, 100, -1));

        jLabel218.setIcon(new javax.swing.ImageIcon(item5));
        jPanel41.add(jLabel218, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 90, 90));

        jPanel37.add(jPanel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 270, 270, 210));

        jPanel42.setBackground(new java.awt.Color(255, 255, 102));
        jPanel42.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel42MouseClicked(evt);
            }
        });
        jPanel42.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel219.setText(item1n);
        jPanel42.add(jLabel219, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 170, -1));

        jLabel220.setText(item1p);
        jPanel42.add(jLabel220, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, 100, -1));

        jLabel221.setIcon(new javax.swing.ImageIcon(item1));
        jPanel42.add(jLabel221, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 90, 90));

        jPanel37.add(jPanel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, 270, 210));

        jPanel43.setBackground(new java.awt.Color(255, 255, 102));
        jPanel43.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel43MouseClicked(evt);
            }
        });
        jPanel43.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel222.setText(item4n);
        jPanel43.add(jLabel222, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 170, -1));

        jLabel223.setText(item4p);
        jPanel43.add(jLabel223, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, 100, -1));

        jLabel224.setIcon(new javax.swing.ImageIcon(item4));
        jPanel43.add(jLabel224, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 90, 90));

        jPanel37.add(jPanel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 270, 270, 210));

        catagorypanel.add(jPanel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 1150, 490));

        jPanel65.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel66.setBackground(new java.awt.Color(255, 255, 102));
        jPanel66.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel66MouseClicked(evt);
            }
        });
        jPanel66.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel279.setText(item7n);
        jPanel66.add(jLabel279, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 170, -1));

        jLabel280.setText(item7p);
        jPanel66.add(jLabel280, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, 100, -1));

        jLabel281.setIcon(new javax.swing.ImageIcon(item7));
        jPanel66.add(jLabel281, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 90, 90));

        jPanel65.add(jPanel66, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 270, 270, 210));

        jPanel67.setBackground(new java.awt.Color(255, 255, 102));
        jPanel67.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel67MouseClicked(evt);
            }
        });
        jPanel67.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel282.setText(item8n);
        jPanel67.add(jLabel282, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 170, -1));

        jLabel283.setText(item8p);
        jPanel67.add(jLabel283, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, 100, -1));

        jLabel284.setIcon(new javax.swing.ImageIcon(item8));
        jPanel67.add(jLabel284, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 90, 90));

        jPanel65.add(jPanel67, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 30, 270, 210));

        jPanel68.setBackground(new java.awt.Color(255, 255, 102));
        jPanel68.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel68MouseClicked(evt);
            }
        });
        jPanel68.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel285.setText(item9n);
        jPanel68.add(jLabel285, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 170, -1));

        jLabel286.setText(item9p);
        jPanel68.add(jLabel286, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, 100, -1));

        jLabel287.setIcon(new javax.swing.ImageIcon(item9));
        jPanel68.add(jLabel287, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 90, 90));

        jPanel65.add(jPanel68, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 30, 270, 210));

        jPanel69.setBackground(new java.awt.Color(255, 255, 102));
        jPanel69.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel69MouseClicked(evt);
            }
        });
        jPanel69.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel288.setText(item10n);
        jPanel69.add(jLabel288, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 170, -1));

        jLabel289.setText(item10p);
        jPanel69.add(jLabel289, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, 100, -1));

        jLabel290.setIcon(new javax.swing.ImageIcon(item10));
        jPanel69.add(jLabel290, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 90, 90));

        jPanel65.add(jPanel69, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 270, 270, 210));

        jPanel70.setBackground(new java.awt.Color(255, 255, 102));
        jPanel70.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel70MouseClicked(evt);
            }
        });
        jPanel70.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel291.setText(item11n);
        jPanel70.add(jLabel291, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 170, -1));

        jLabel292.setText(item11p);
        jPanel70.add(jLabel292, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, 100, -1));

        jLabel293.setIcon(new javax.swing.ImageIcon(item11));
        jPanel70.add(jLabel293, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 90, 90));

        jPanel65.add(jPanel70, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, 270, 210));

        jPanel71.setBackground(new java.awt.Color(255, 255, 102));
        jPanel71.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel71MouseClicked(evt);
            }
        });
        jPanel71.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel294.setText(item12n);
        jPanel71.add(jLabel294, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 170, -1));

        jLabel295.setText(item12p);
        jPanel71.add(jLabel295, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, 100, -1));

        jLabel296.setIcon(new javax.swing.ImageIcon(item12));
        jPanel71.add(jLabel296, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 90, 90));

        jPanel65.add(jPanel71, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 270, 270, 210));

        catagorypanel.add(jPanel65, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 1150, 490));

        jPanel72.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel73.setBackground(new java.awt.Color(255, 255, 102));
        jPanel73.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel73MouseClicked(evt);
            }
        });
        jPanel73.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel297.setText(item13n);
        jPanel73.add(jLabel297, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 170, -1));

        jLabel298.setText(item13p);
        jPanel73.add(jLabel298, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, 100, -1));

        jLabel299.setIcon(new javax.swing.ImageIcon(item13));
        jPanel73.add(jLabel299, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 90, 90));

        jPanel72.add(jPanel73, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 270, 270, 210));

        jPanel74.setBackground(new java.awt.Color(255, 255, 102));
        jPanel74.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel74MouseClicked(evt);
            }
        });
        jPanel74.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel300.setText(item14n);
        jPanel74.add(jLabel300, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 170, -1));

        jLabel301.setText(item14p);
        jPanel74.add(jLabel301, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, 100, -1));

        jLabel302.setIcon(new javax.swing.ImageIcon(item14));
        jPanel74.add(jLabel302, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 90, 90));

        jPanel72.add(jPanel74, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 30, 270, 210));

        jPanel75.setBackground(new java.awt.Color(255, 255, 102));
        jPanel75.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel75MouseClicked(evt);
            }
        });
        jPanel75.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel303.setText(item15n);
        jPanel75.add(jLabel303, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 170, -1));

        jLabel304.setText(item15p);
        jPanel75.add(jLabel304, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, 100, -1));

        jLabel305.setIcon(new javax.swing.ImageIcon(item15));
        jPanel75.add(jLabel305, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 90, 90));

        jPanel72.add(jPanel75, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 30, 270, 210));

        jPanel76.setBackground(new java.awt.Color(255, 255, 102));
        jPanel76.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel76MouseClicked(evt);
            }
        });
        jPanel76.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel306.setText(item16n);
        jPanel76.add(jLabel306, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 170, -1));

        jLabel307.setText(item16p);
        jPanel76.add(jLabel307, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, 100, -1));

        jLabel308.setIcon(new javax.swing.ImageIcon(item16));
        jPanel76.add(jLabel308, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 90, 90));

        jPanel72.add(jPanel76, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 270, 270, 210));

        jPanel77.setBackground(new java.awt.Color(255, 255, 102));
        jPanel77.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel77MouseClicked(evt);
            }
        });
        jPanel77.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel309.setText(item17n);
        jPanel77.add(jLabel309, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 170, -1));

        jLabel310.setText(item17p);
        jPanel77.add(jLabel310, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, 100, -1));

        jLabel311.setIcon(new javax.swing.ImageIcon(item7));
        jPanel77.add(jLabel311, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 90, 90));

        jPanel72.add(jPanel77, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, 270, 210));

        jPanel78.setBackground(new java.awt.Color(255, 255, 102));
        jPanel78.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel78MouseClicked(evt);
            }
        });
        jPanel78.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel312.setText(item18n);
        jPanel78.add(jLabel312, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 170, -1));

        jLabel313.setText(item18p);
        jPanel78.add(jLabel313, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, 100, -1));

        jLabel314.setIcon(new javax.swing.ImageIcon(item18));
        jPanel78.add(jLabel314, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 90, 90));

        jPanel72.add(jPanel78, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 270, 270, 210));

        catagorypanel.add(jPanel72, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 1150, 490));

        jPanel79.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel80.setBackground(new java.awt.Color(255, 255, 102));
        jPanel80.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel80MouseClicked(evt);
            }
        });
        jPanel80.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel315.setText(item19n);
        jPanel80.add(jLabel315, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 170, -1));

        jLabel316.setText(item19p);
        jPanel80.add(jLabel316, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, 100, -1));

        jLabel317.setIcon(new javax.swing.ImageIcon(item19));
        jPanel80.add(jLabel317, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 90, 90));

        jPanel79.add(jPanel80, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 270, 270, 210));

        jPanel81.setBackground(new java.awt.Color(255, 255, 102));
        jPanel81.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel81MouseClicked(evt);
            }
        });
        jPanel81.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel318.setText(item20n);
        jPanel81.add(jLabel318, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 170, -1));

        jLabel319.setText(item20p);
        jPanel81.add(jLabel319, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, 100, -1));

        jLabel320.setIcon(new javax.swing.ImageIcon(item20));
        jPanel81.add(jLabel320, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 90, 90));

        jPanel79.add(jPanel81, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 30, 270, 210));

        jPanel82.setBackground(new java.awt.Color(255, 255, 102));
        jPanel82.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel82MouseClicked(evt);
            }
        });
        jPanel82.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel321.setText(item21n);
        jPanel82.add(jLabel321, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 170, -1));

        jLabel322.setText(item21p);
        jPanel82.add(jLabel322, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, 100, -1));

        jLabel323.setIcon(new javax.swing.ImageIcon(item21));
        jPanel82.add(jLabel323, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 90, 90));

        jPanel79.add(jPanel82, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 30, 270, 210));

        jPanel83.setBackground(new java.awt.Color(255, 255, 102));
        jPanel83.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel83MouseClicked(evt);
            }
        });
        jPanel83.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel324.setText(item22n);
        jPanel83.add(jLabel324, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 170, -1));

        jLabel325.setText(item22p);
        jPanel83.add(jLabel325, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, 100, -1));

        jLabel326.setIcon(new javax.swing.ImageIcon(item22));
        jPanel83.add(jLabel326, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 90, 90));

        jPanel79.add(jPanel83, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 270, 270, 210));

        jPanel84.setBackground(new java.awt.Color(255, 255, 102));
        jPanel84.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel84MouseClicked(evt);
            }
        });
        jPanel84.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel327.setText(item23n);
        jPanel84.add(jLabel327, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 170, -1));

        jLabel328.setText(item23p);
        jPanel84.add(jLabel328, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, 100, -1));

        jLabel329.setIcon(new javax.swing.ImageIcon(item23));
        jPanel84.add(jLabel329, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 90, 90));

        jPanel79.add(jPanel84, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, 270, 210));

        jPanel85.setBackground(new java.awt.Color(255, 255, 102));
        jPanel85.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel85MouseClicked(evt);
            }
        });
        jPanel85.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel330.setText(item24n);
        jPanel85.add(jLabel330, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 170, -1));

        jLabel331.setText(item24p);
        jPanel85.add(jLabel331, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, 100, -1));

        jLabel332.setIcon(new javax.swing.ImageIcon(item24));
        jPanel85.add(jLabel332, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 90, 90));

        jPanel79.add(jPanel85, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 270, 270, 210));

        catagorypanel.add(jPanel79, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 1150, 490));

        mainpanel.add(catagorypanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 100, 1160, 590));

        homepanel.setBackground(new java.awt.Color(255, 255, 255));
        homepanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel14.setBackground(new java.awt.Color(255, 255, 255));
        jPanel14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel14.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setBackground(new java.awt.Color(255, 51, 51));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel5.setText("Cloth Section");
        jLabel5.setOpaque(true);
        jPanel14.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 240, 60));

        jPanel18.setBackground(new java.awt.Color(255, 255, 102));
        jPanel18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel18MouseClicked(evt);
            }
        });
        jPanel18.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel133.setText(homecloth4n);
        jPanel18.add(jLabel133, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 100, 170, -1));

        jLabel134.setText(homecloth4p);
        jPanel18.add(jLabel134, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 120, 100, -1));

        jLabel135.setIcon(new javax.swing.ImageIcon(homecloth4));
        jPanel18.add(jLabel135, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 90, 90));

        jPanel14.add(jPanel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 0, 200, 140));

        jPanel19.setBackground(new java.awt.Color(255, 255, 102));
        jPanel19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel19MouseClicked(evt);
            }
        });
        jPanel19.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel145.setText(homecloth1n);
        jPanel19.add(jLabel145, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 100, 170, -1));

        jLabel146.setText(homecloth1p);
        jPanel19.add(jLabel146, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 120, 100, -1));

        jLabel147.setIcon(new javax.swing.ImageIcon(homecloth1));
        jPanel19.add(jLabel147, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 90, 90));

        jPanel14.add(jPanel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 0, 200, 140));

        jPanel20.setBackground(new java.awt.Color(255, 255, 102));
        jPanel20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel20MouseClicked(evt);
            }
        });
        jPanel20.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel148.setText(homecloth2n);
        jPanel20.add(jLabel148, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 100, 170, -1));

        jLabel149.setText(homecloth2p);
        jPanel20.add(jLabel149, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 120, 100, -1));

        jLabel150.setIcon(new javax.swing.ImageIcon(homecloth2));
        jPanel20.add(jLabel150, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 90, 90));

        jPanel14.add(jPanel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 0, 200, 140));

        jPanel21.setBackground(new java.awt.Color(255, 255, 102));
        jPanel21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel21MouseClicked(evt);
            }
        });
        jPanel21.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel151.setText(homecloth3n);
        jPanel21.add(jLabel151, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 100, 170, -1));

        jLabel152.setText(homecloth3p);
        jPanel21.add(jLabel152, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 120, 100, -1));

        jLabel153.setIcon(new javax.swing.ImageIcon(homecloth3));
        jPanel21.add(jLabel153, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 90, 90));

        jPanel14.add(jPanel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 0, 200, 140));

        homepanel.add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1170, 140));

        jPanel22.setBackground(new java.awt.Color(255, 255, 255));
        jPanel22.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel22.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel21.setBackground(new java.awt.Color(255, 51, 51));
        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel21.setText("Shoes Section");
        jLabel21.setOpaque(true);
        jPanel22.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 240, 60));

        jPanel23.setBackground(new java.awt.Color(255, 255, 102));
        jPanel23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel23MouseClicked(evt);
            }
        });
        jPanel23.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel154.setText(homeshoe4n);
        jPanel23.add(jLabel154, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 100, 170, -1));

        jLabel155.setText(homeshoe4p);
        jPanel23.add(jLabel155, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 120, 100, -1));

        jLabel156.setIcon(new javax.swing.ImageIcon(homeshoe4));
        jPanel23.add(jLabel156, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 90, 90));

        jPanel22.add(jPanel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 0, 200, 140));

        jPanel24.setBackground(new java.awt.Color(255, 255, 102));
        jPanel24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel24MouseClicked(evt);
            }
        });
        jPanel24.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel157.setText(homeshoe1n);
        jPanel24.add(jLabel157, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 100, 170, -1));

        jLabel158.setText(homeshoe1p);
        jPanel24.add(jLabel158, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 120, 100, -1));

        jLabel159.setIcon(new javax.swing.ImageIcon(homeshoe1));
        jPanel24.add(jLabel159, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 90, 90));

        jPanel22.add(jPanel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 0, 200, 140));

        jPanel25.setBackground(new java.awt.Color(255, 255, 102));
        jPanel25.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel25MouseClicked(evt);
            }
        });
        jPanel25.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel160.setText(homeshoe2n);
        jPanel25.add(jLabel160, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 100, 170, -1));

        jLabel161.setText(homeshoe2p);
        jPanel25.add(jLabel161, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 120, 100, -1));

        jLabel162.setIcon(new javax.swing.ImageIcon(homeshoe2));
        jPanel25.add(jLabel162, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 90, 90));

        jPanel22.add(jPanel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 0, 200, 140));

        jPanel26.setBackground(new java.awt.Color(255, 255, 102));
        jPanel26.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel26MouseClicked(evt);
            }
        });
        jPanel26.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel163.setText(homeshoe3n);
        jPanel26.add(jLabel163, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 100, 170, -1));

        jLabel164.setText(homeshoe3p);
        jPanel26.add(jLabel164, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 120, 100, -1));

        jLabel165.setIcon(new javax.swing.ImageIcon(homeshoe3));
        jPanel26.add(jLabel165, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 90, 90));

        jPanel22.add(jPanel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 0, 200, 140));

        homepanel.add(jPanel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 145, 1170, 140));

        jPanel27.setBackground(new java.awt.Color(255, 255, 255));
        jPanel27.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel27.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel22.setBackground(new java.awt.Color(255, 51, 51));
        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel22.setText("Bags Section");
        jLabel22.setOpaque(true);
        jPanel27.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 240, 60));

        jPanel28.setBackground(new java.awt.Color(255, 255, 102));
        jPanel28.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel28MouseClicked(evt);
            }
        });
        jPanel28.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel166.setText(homebag4n);
        jPanel28.add(jLabel166, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 100, 170, -1));

        jLabel167.setText(homebag4p);
        jPanel28.add(jLabel167, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 120, 100, -1));

        jLabel168.setIcon(new javax.swing.ImageIcon(homebag4));
        jPanel28.add(jLabel168, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 90, 90));

        jPanel27.add(jPanel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 0, 200, 140));

        jPanel29.setBackground(new java.awt.Color(255, 255, 102));
        jPanel29.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel29MouseClicked(evt);
            }
        });
        jPanel29.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel169.setText(homebag1n);
        jPanel29.add(jLabel169, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 100, 170, -1));

        jLabel170.setText(homebag1p);
        jPanel29.add(jLabel170, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 120, 100, -1));

        jLabel171.setIcon(new javax.swing.ImageIcon(homebag1));
        jPanel29.add(jLabel171, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 90, 90));

        jPanel27.add(jPanel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 0, 200, 140));

        jPanel30.setBackground(new java.awt.Color(255, 255, 102));
        jPanel30.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel30MouseClicked(evt);
            }
        });
        jPanel30.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel172.setText(homebag2n);
        jPanel30.add(jLabel172, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 100, 170, -1));

        jLabel173.setText(homebag2p);
        jPanel30.add(jLabel173, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 120, 100, -1));

        jLabel174.setIcon(new javax.swing.ImageIcon(homebag3));
        jPanel30.add(jLabel174, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 90, 90));

        jPanel27.add(jPanel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 0, 200, 140));

        jPanel31.setBackground(new java.awt.Color(255, 255, 102));
        jPanel31.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel31MouseClicked(evt);
            }
        });
        jPanel31.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel175.setText(homebag3n);
        jPanel31.add(jLabel175, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 100, 170, -1));

        jLabel176.setText(homebag3p);
        jPanel31.add(jLabel176, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 120, 100, -1));

        jLabel177.setIcon(new javax.swing.ImageIcon(homebag2));
        jPanel31.add(jLabel177, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 90, 90));

        jPanel27.add(jPanel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 0, 200, 140));

        homepanel.add(jPanel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 1170, 140));

        jPanel32.setBackground(new java.awt.Color(255, 255, 255));
        jPanel32.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel32.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel23.setBackground(new java.awt.Color(255, 51, 51));
        jLabel23.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel23.setText("Toys Section");
        jLabel23.setOpaque(true);
        jPanel32.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 240, 60));

        jPanel33.setBackground(new java.awt.Color(255, 255, 102));
        jPanel33.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel33MouseClicked(evt);
            }
        });
        jPanel33.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel187.setText(hometoy4n);
        jPanel33.add(jLabel187, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 100, 170, -1));

        jLabel188.setText(hometoy4p);
        jPanel33.add(jLabel188, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 120, 100, -1));

        jLabel189.setIcon(new javax.swing.ImageIcon(hometoy4));
        jPanel33.add(jLabel189, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 90, 90));

        jPanel32.add(jPanel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 0, 200, 140));

        jPanel34.setBackground(new java.awt.Color(255, 255, 102));
        jPanel34.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel34MouseClicked(evt);
            }
        });
        jPanel34.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel184.setText(hometoy1n);
        jPanel34.add(jLabel184, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 100, 170, -1));

        jLabel185.setText(hometoy1p);
        jPanel34.add(jLabel185, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 120, 100, -1));

        jLabel186.setIcon(new javax.swing.ImageIcon(hometoy1));
        jPanel34.add(jLabel186, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 90, 90));

        jPanel32.add(jPanel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 0, 200, 140));

        jPanel35.setBackground(new java.awt.Color(255, 255, 102));
        jPanel35.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel35MouseClicked(evt);
            }
        });
        jPanel35.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel181.setText(hometoy2n);
        jPanel35.add(jLabel181, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 100, 170, -1));

        jLabel182.setText(hometoy2p);
        jPanel35.add(jLabel182, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 120, 100, -1));

        jLabel183.setIcon(new javax.swing.ImageIcon(hometoy2));
        jPanel35.add(jLabel183, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 90, 90));

        jPanel32.add(jPanel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 0, 200, 140));

        jPanel36.setBackground(new java.awt.Color(255, 255, 102));
        jPanel36.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel36MouseClicked(evt);
            }
        });
        jPanel36.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel178.setText(hometoy3n);
        jPanel36.add(jLabel178, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 100, 170, -1));

        jLabel179.setText(hometoy3p);
        jPanel36.add(jLabel179, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 120, 100, -1));

        jLabel180.setIcon(new javax.swing.ImageIcon(hometoy3));
        jPanel36.add(jLabel180, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 90, 90));

        jPanel32.add(jPanel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 0, 200, 140));

        homepanel.add(jPanel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 435, 1170, 140));

        mainpanel.add(homepanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 100, 1140, 590));
        homepanel.getAccessibleContext().setAccessibleName("");

        servicepanell.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setBackground(new java.awt.Color(255, 255, 102));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel6.setText("   ABOUT US");
        jLabel6.setToolTipText("");
        jLabel6.setOpaque(true);
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 41, 264, 58));

        jLabel29.setBackground(new java.awt.Color(255, 255, 102));
        jLabel29.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel29.setText("   Privacy & Policy");
        jLabel29.setToolTipText("");
        jLabel29.setOpaque(true);
        jLabel29.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel29MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 134, 264, 58));

        jLabel30.setBackground(new java.awt.Color(255, 255, 102));
        jLabel30.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel30.setText("   Terms & Conditions");
        jLabel30.setToolTipText("");
        jLabel30.setOpaque(true);
        jLabel30.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel30MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 392, 266, 58));

        jLabel31.setBackground(new java.awt.Color(255, 255, 102));
        jLabel31.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel31.setText("   Return & Exchangers");
        jLabel31.setToolTipText("");
        jLabel31.setOpaque(true);
        jLabel31.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel31MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 479, 266, 58));

        jLabel33.setBackground(new java.awt.Color(255, 255, 102));
        jLabel33.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel33.setText("   Contact ");
        jLabel33.setToolTipText("");
        jLabel33.setOpaque(true);
        jLabel33.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel33MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 307, 266, 58));

        jLabel34.setBackground(new java.awt.Color(255, 255, 102));
        jLabel34.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel34.setText("   Delivery Information");
        jLabel34.setToolTipText("");
        jLabel34.setOpaque(true);
        jLabel34.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel34MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 221, 264, 58));

        servicepanell.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 290, 590));

        aboutus.setBackground(new java.awt.Color(204, 204, 204));
        aboutus.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel32.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel32.setText("ABOUT US");
        aboutus.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 340, 90));

        jLabel35.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(102, 102, 102));
        jLabel35.setText("We're dedicated to giving you the very best of textile product, with a focus on"); // NOI18N
        jLabel35.setToolTipText("");
        aboutus.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, 700, 20));

        jButton1.setBackground(new java.awt.Color(255, 51, 51));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton1.setText("READ MORE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        aboutus.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 440, 270, 50));
        aboutus.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 510, 270, 70));

        jLabel39.setFont(new java.awt.Font("Segoe UI", 3, 28)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(102, 102, 102));
        jLabel39.setText("This who we are and what are our products and services. ");
        aboutus.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 840, 40));

        jLabel40.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(102, 102, 102));
        jLabel40.setText("dependability, customer service and uniqueness. Founded in 2015 by Mr Tapar"); // NOI18N
        jLabel40.setToolTipText("");
        aboutus.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 690, 20));

        jLabel41.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(102, 102, 102));
        jLabel41.setText("Shah, E-textile has come a long way from its beginnings in a 29/12, Mount Road,"); // NOI18N
        jLabel41.setToolTipText("");
        aboutus.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, 740, 20));

        jLabel42.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(102, 102, 102));
        jLabel42.setText("Colombo. When Mr Tapar Shah first started out, his passion for providing the best"); // NOI18N
        jLabel42.setToolTipText("");
        aboutus.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, 720, 20));

        jLabel43.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(102, 102, 102));
        jLabel43.setText("equipment for his consumers and gave him the impetus to turn hard work and"); // NOI18N
        jLabel43.setToolTipText("");
        aboutus.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, 750, 20));

        jLabel44.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(102, 102, 102));
        jLabel44.setText("Lanka, and are thrilled to be a part of the fair trade wing of the fashion, industry."); // NOI18N
        jLabel44.setToolTipText("");
        aboutus.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, 750, 20));

        jLabel45.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(102, 102, 102));
        jLabel45.setText("Welcome to E-textile, your number one source for all things of textile products."); // NOI18N
        jLabel45.setToolTipText("");
        aboutus.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 730, 20));

        jLabel46.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(102, 102, 102));
        jLabel46.setText("Sincerely,"); // NOI18N
        jLabel46.setToolTipText("");
        aboutus.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, 620, 20));

        jLabel47.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(102, 102, 102));
        jLabel47.setText("Mr. Tapar Shah (Founder)"); // NOI18N
        jLabel47.setToolTipText("");
        aboutus.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 380, 620, 20));

        jLabel48.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel48.setForeground(new java.awt.Color(102, 102, 102));
        jLabel48.setText("inspiration into to a booming online store. We now serve customers all over the Sri"); // NOI18N
        jLabel48.setToolTipText("");
        aboutus.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, 720, 20));

        servicepanell.add(aboutus, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 0, 860, 590));

        privacy.setBackground(new java.awt.Color(204, 204, 204));
        privacy.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel36.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel36.setText("PRIVACY AND POLICY");
        privacy.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 500, 90));

        jLabel37.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(102, 102, 102));
        jLabel37.setText("use the personal information you provide to us and to assist you in making informed"); // NOI18N
        jLabel37.setToolTipText("");
        privacy.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, 700, 20));

        jButton2.setBackground(new java.awt.Color(255, 51, 51));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton2.setText("READ MORE");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        privacy.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 440, 270, 50));
        privacy.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 510, 270, 70));

        jLabel50.setFont(new java.awt.Font("Segoe UI", 3, 28)); // NOI18N
        jLabel50.setForeground(new java.awt.Color(102, 102, 102));
        jLabel50.setText("This is how we (eTextile) use your info.");
        privacy.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 840, 40));

        jLabel51.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel51.setForeground(new java.awt.Color(102, 102, 102));
        jLabel51.setText("decision when using our site and our products and services."); // NOI18N
        jLabel51.setToolTipText("");
        privacy.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 690, 20));

        jLabel52.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel52.setForeground(new java.awt.Color(102, 102, 102));
        jLabel52.setText("Data Use and Sharing"); // NOI18N
        jLabel52.setToolTipText("");
        privacy.add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, 740, 40));

        jLabel53.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel53.setForeground(new java.awt.Color(102, 102, 102));
        jLabel53.setText("Explain your uses of personally identifiable information beyond what is necessary"); // NOI18N
        jLabel53.setToolTipText("");
        privacy.add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, 720, 20));

        jLabel54.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel54.setForeground(new java.awt.Color(102, 102, 102));
        jLabel54.setText("for fulfilling a customer transaction or for the basic functionality of an online service."); // NOI18N
        jLabel54.setToolTipText("");
        privacy.add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, 750, 20));

        jLabel55.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel55.setForeground(new java.awt.Color(102, 102, 102));
        jLabel55.setText("you share personally identifiable information."); // NOI18N
        jLabel55.setToolTipText("");
        privacy.add(jLabel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, 750, 20));

        jLabel56.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel56.setForeground(new java.awt.Color(102, 102, 102));
        jLabel56.setText("Our Privacy Policy is designed to assist you in understanding how we collect and"); // NOI18N
        jLabel56.setToolTipText("");
        privacy.add(jLabel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 730, 20));

        jLabel59.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel59.setForeground(new java.awt.Color(102, 102, 102));
        jLabel59.setText("Whenever possible, provide a link to the privacy policies of third parties with whom"); // NOI18N
        jLabel59.setToolTipText("");
        privacy.add(jLabel59, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, 720, 20));

        servicepanell.add(privacy, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 0, 860, 590));

        delivery.setBackground(new java.awt.Color(204, 204, 204));
        delivery.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel60.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel60.setText("DELIVERY INFORMATION");
        delivery.add(jLabel60, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 580, 90));

        jLabel61.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel61.setForeground(new java.awt.Color(102, 102, 102));
        jLabel61.setText("Usually Delivery will happen within 2-4 working days. But orders within Colombo 01-"); // NOI18N
        jLabel61.setToolTipText("");
        delivery.add(jLabel61, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 700, 20));

        jButton3.setBackground(new java.awt.Color(255, 51, 51));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton3.setText("READ MORE");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        delivery.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 440, 270, 50));
        delivery.add(jLabel62, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 510, 270, 70));

        jLabel64.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel64.setForeground(new java.awt.Color(102, 102, 102));
        jLabel64.setText("15 will only takes 1-3 working days."); // NOI18N
        jLabel64.setToolTipText("");
        delivery.add(jLabel64, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, 690, 20));

        jLabel65.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel65.setForeground(new java.awt.Color(102, 102, 102));
        jLabel65.setText("Delivery Fee  (For 1st Kg)  North and East Rs.300  All other locations Rs.250"); // NOI18N
        jLabel65.setToolTipText("");
        delivery.add(jLabel65, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, 740, 20));

        jLabel66.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel66.setForeground(new java.awt.Color(102, 102, 102));
        jLabel66.setText("Rs.100 will be charged for each additional Kg."); // NOI18N
        jLabel66.setToolTipText("");
        delivery.add(jLabel66, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, 720, 20));

        jLabel67.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel67.setForeground(new java.awt.Color(102, 102, 102));
        jLabel67.setText("Once we receive your order our staff and reliable outsourced courier services will"); // NOI18N
        jLabel67.setToolTipText("");
        delivery.add(jLabel67, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, 750, 20));

        jLabel68.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel68.setForeground(new java.awt.Color(102, 102, 102));
        jLabel68.setText("bit longer during promotions and unforeseen circumstances. The delivery dates will"); // NOI18N
        jLabel68.setToolTipText("");
        delivery.add(jLabel68, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, 750, 20));

        jLabel69.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel69.setForeground(new java.awt.Color(102, 102, 102));
        jLabel69.setText("We deliver to all addresses in Sri Lanka. A full postal address is required to arrange the delivery. "); // NOI18N
        jLabel69.setToolTipText("");
        delivery.add(jLabel69, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 760, 20));

        jLabel70.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel70.setForeground(new java.awt.Color(102, 102, 102));
        jLabel70.setText("depend on your shipping address and order date. We will send you an e-mail and"); // NOI18N
        jLabel70.setToolTipText("");
        delivery.add(jLabel70, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, 620, 20));

        jLabel71.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel71.setForeground(new java.awt.Color(102, 102, 102));
        jLabel71.setText("Contact – Email Us: etextile@gmail.com or Call Us : +94 76 1234567"); // NOI18N
        jLabel71.setToolTipText("");
        delivery.add(jLabel71, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 410, 620, 20));

        jLabel72.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel72.setForeground(new java.awt.Color(102, 102, 102));
        jLabel72.setText("work hard to deliver your package within the commitment period, but it could take a"); // NOI18N
        jLabel72.setToolTipText("");
        delivery.add(jLabel72, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, 720, 20));

        jLabel99.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel99.setForeground(new java.awt.Color(102, 102, 102));
        jLabel99.setText("text message when your order dispatch from our warehouse."); // NOI18N
        jLabel99.setToolTipText("");
        delivery.add(jLabel99, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 380, 620, 20));

        servicepanell.add(delivery, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 0, 860, 590));

        contact.setBackground(new java.awt.Color(204, 204, 204));
        contact.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel57.setIcon(new javax.swing.ImageIcon("src/img/location.jpg"));
        jPanel5.add(jLabel57, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 50, 50));

        jLabel58.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel58.setText("Location");
        jLabel58.setToolTipText("");
        jPanel5.add(jLabel58, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, 140, 20));

        jLabel63.setBackground(new java.awt.Color(102, 102, 102));
        jLabel63.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel63.setForeground(new java.awt.Color(102, 102, 102));
        jLabel63.setText("29/18, Mount Road, ");
        jPanel5.add(jLabel63, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, 140, -1));

        jLabel103.setBackground(new java.awt.Color(102, 102, 102));
        jLabel103.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel103.setForeground(new java.awt.Color(102, 102, 102));
        jLabel103.setText("Dehiwala, Colombo");
        jPanel5.add(jLabel103, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, 140, -1));

        contact.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, 220, 180));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel104.setIcon(new javax.swing.ImageIcon("src/img/email.jpg"));
        jPanel4.add(jLabel104, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 50, 50));

        jLabel105.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel105.setText("email");
        jLabel105.setToolTipText("");
        jPanel4.add(jLabel105, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, 90, 20));

        jLabel106.setBackground(new java.awt.Color(102, 102, 102));
        jLabel106.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel106.setForeground(new java.awt.Color(102, 102, 102));
        jLabel106.setText("etextile@gmail.com");
        jPanel4.add(jLabel106, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, 140, -1));

        jLabel107.setBackground(new java.awt.Color(102, 102, 102));
        jLabel107.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel107.setForeground(new java.awt.Color(102, 102, 102));
        jLabel107.setText("info.etextile@gmail.com");
        jPanel4.add(jLabel107, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 160, -1));

        contact.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 70, 220, 180));

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel108.setIcon(new javax.swing.ImageIcon("src/img/phone.jpg"));
        jPanel7.add(jLabel108, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 50, 50));

        jLabel109.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel109.setText("Phone ");
        jLabel109.setToolTipText("");
        jPanel7.add(jLabel109, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, 140, 20));

        jLabel110.setBackground(new java.awt.Color(102, 102, 102));
        jLabel110.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel110.setForeground(new java.awt.Color(102, 102, 102));
        jLabel110.setText("+94 76 1234567 ");
        jPanel7.add(jLabel110, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, 140, -1));

        jLabel111.setBackground(new java.awt.Color(102, 102, 102));
        jLabel111.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel111.setForeground(new java.awt.Color(102, 102, 102));
        jLabel111.setText("+94 71 9876543 ");
        jPanel7.add(jLabel111, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, 140, -1));

        contact.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 70, 220, 180));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel112.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel112.setForeground(new java.awt.Color(51, 51, 255));
        jLabel112.setText("Send a message to eTextiles");
        jPanel2.add(jLabel112, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 660, 30));

        jLabel113.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel113.setForeground(new java.awt.Color(102, 102, 102));
        jLabel113.setText("send us message from here. It's our pleasure to help you.  ");
        jPanel2.add(jLabel113, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 690, -1));

        jLabel114.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel114.setForeground(new java.awt.Color(102, 102, 102));
        jLabel114.setText("If you want to ask something from us or any types of quries related to our products and service,");
        jPanel2.add(jLabel114, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 690, -1));

        jLabel115.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel115.setText("message");
        jPanel2.add(jLabel115, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, -1, -1));

        jLabel116.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel116.setText("Your Name");
        jPanel2.add(jLabel116, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, -1));

        jLabel117.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel117.setText("Your Email");
        jPanel2.add(jLabel117, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 100, -1, -1));

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 115, 320, 30));

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 165, 680, 50));

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 115, 320, 30));

        jButton6.setBackground(new java.awt.Color(0, 0, 255));
        jButton6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("Send Now");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 220, 140, 30));

        contact.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 300, 760, 260));

        servicepanell.add(contact, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 0, 860, 590));

        terms.setBackground(new java.awt.Color(204, 204, 204));
        terms.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel73.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel73.setText("TERMS AND CONDITION ");
        terms.add(jLabel73, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 490, 90));

        jLabel74.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel74.setForeground(new java.awt.Color(102, 102, 102));
        jLabel74.setText("and that you agree to comply with its terms. If you do not want to be bound by the"); // NOI18N
        jLabel74.setToolTipText("");
        terms.add(jLabel74, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, 700, 20));

        jButton4.setBackground(new java.awt.Color(255, 51, 51));
        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton4.setText("READ MORE");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        terms.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 450, 270, 50));
        terms.add(jLabel75, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 510, 270, 70));

        jLabel76.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel76.setForeground(new java.awt.Color(102, 102, 102));
        jLabel76.setText("Conditions of use ");
        terms.add(jLabel76, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 840, 30));

        jLabel77.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel77.setForeground(new java.awt.Color(102, 102, 102));
        jLabel77.setText("terms of this Agreement, you are advised to leave the website accordingly. services"); // NOI18N
        jLabel77.setToolTipText("");
        terms.add(jLabel77, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 690, 20));

        jLabel78.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel78.setForeground(new java.awt.Color(102, 102, 102));
        jLabel78.setText("to those who have accepted its terms"); // NOI18N
        jLabel78.setToolTipText("");
        terms.add(jLabel78, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, 740, 20));

        jLabel79.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel79.setForeground(new java.awt.Color(102, 102, 102));
        jLabel79.setText("Applicable Law"); // NOI18N
        jLabel79.setToolTipText("");
        terms.add(jLabel79, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, 720, 20));

        jLabel80.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel80.setForeground(new java.awt.Color(102, 102, 102));
        jLabel80.setText("By visiting this website, you agree that the laws of the [location), without regard to"); // NOI18N
        jLabel80.setToolTipText("");
        terms.add(jLabel80, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, 750, 20));

        jLabel81.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel81.setForeground(new java.awt.Color(102, 102, 102));
        jLabel81.setText("any sort that might come between (name] and you, or its business partners and associates."); // NOI18N
        jLabel81.setToolTipText("");
        terms.add(jLabel81, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, 750, 20));

        jLabel82.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel82.setForeground(new java.awt.Color(102, 102, 102));
        jLabel82.setText("By using this website, you certify that you have read and reviewed this Agreement"); // NOI18N
        jLabel82.setToolTipText("");
        terms.add(jLabel82, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 730, 20));

        jLabel83.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel83.setForeground(new java.awt.Color(102, 102, 102));
        jLabel83.setText("Disputes"); // NOI18N
        jLabel83.setToolTipText("");
        terms.add(jLabel83, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, 620, 20));

        jLabel84.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel84.setForeground(new java.awt.Color(102, 102, 102));
        jLabel84.setText("purchase from us shall be arbitrated by state or federal court (location] and you"); // NOI18N
        jLabel84.setToolTipText("");
        terms.add(jLabel84, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 400, 620, 20));

        jLabel85.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel85.setForeground(new java.awt.Color(102, 102, 102));
        jLabel85.setText("principles of conflict laws, will govern these terms and conditions, or any dispute of"); // NOI18N
        jLabel85.setToolTipText("");
        terms.add(jLabel85, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, 720, 20));

        jLabel100.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel100.setForeground(new java.awt.Color(102, 102, 102));
        jLabel100.setText("consent to exclusive jurisdiction and venue of such courts"); // NOI18N
        jLabel100.setToolTipText("");
        terms.add(jLabel100, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 420, 620, 20));

        jLabel101.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel101.setForeground(new java.awt.Color(102, 102, 102));
        jLabel101.setText("Any dispute related in any way to your visit to this website or to products you"); // NOI18N
        jLabel101.setToolTipText("");
        terms.add(jLabel101, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 380, 620, 20));

        servicepanell.add(terms, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 0, 860, 590));

        returnexchange.setBackground(new java.awt.Color(204, 204, 204));
        returnexchange.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel86.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel86.setText("RETURNS AND EXCHANGES ");
        returnexchange.add(jLabel86, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 610, 90));

        jLabel87.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel87.setForeground(new java.awt.Color(102, 102, 102));
        jLabel87.setText("Step 01 : You can inform us through Email to etextile@gmail.com or call us on +94"); // NOI18N
        jLabel87.setToolTipText("");
        returnexchange.add(jLabel87, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, 700, 20));

        jButton5.setBackground(new java.awt.Color(255, 51, 51));
        jButton5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton5.setText("READ MORE");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        returnexchange.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 450, 270, 50));
        returnexchange.add(jLabel88, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 510, 270, 70));

        jLabel89.setFont(new java.awt.Font("Segoe UI", 3, 28)); // NOI18N
        jLabel89.setForeground(new java.awt.Color(102, 102, 102));
        jLabel89.setText("This who we are and what are our products and services. ");
        returnexchange.add(jLabel89, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 840, 40));

        jLabel90.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel90.setForeground(new java.awt.Color(102, 102, 102));
        jLabel90.setText("76 1234567. Let us know your need to exchange your particular item."); // NOI18N
        jLabel90.setToolTipText("");
        returnexchange.add(jLabel90, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 690, 20));

        jLabel91.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel91.setForeground(new java.awt.Color(102, 102, 102));
        jLabel91.setText("Step 02 : After an analysis, our Exchange Team will get back to you stating the"); // NOI18N
        jLabel91.setToolTipText("");
        returnexchange.add(jLabel91, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, 740, 50));

        jLabel92.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel92.setForeground(new java.awt.Color(102, 102, 102));
        jLabel92.setText("procedure where you have to send the package back through Registered Post or a"); // NOI18N
        jLabel92.setToolTipText("");
        returnexchange.add(jLabel92, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, 720, 50));

        jLabel93.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel93.setForeground(new java.awt.Color(102, 102, 102));
        jLabel93.setText("Courier Service along with following details."); // NOI18N
        jLabel93.setToolTipText("");
        returnexchange.add(jLabel93, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, 750, 50));

        jLabel94.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel94.setForeground(new java.awt.Color(102, 102, 102));
        jLabel94.setText("Details with the order number)"); // NOI18N
        jLabel94.setToolTipText("");
        returnexchange.add(jLabel94, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, 750, 50));

        jLabel95.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel95.setForeground(new java.awt.Color(51, 51, 51));
        jLabel95.setText("Exchange through Courier"); // NOI18N
        jLabel95.setToolTipText("");
        returnexchange.add(jLabel95, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, 730, -1));

        jLabel96.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel96.setForeground(new java.awt.Color(102, 102, 102));
        jLabel96.setText("Step 03 : Once we have received the package, one of our Sales Representatives will"); // NOI18N
        jLabel96.setToolTipText("");
        returnexchange.add(jLabel96, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 380, 620, 20));

        jLabel97.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel97.setForeground(new java.awt.Color(102, 102, 102));
        jLabel97.setText("contact you and give you a coupon code so you can simply redeem the exchange"); // NOI18N
        jLabel97.setToolTipText("");
        returnexchange.add(jLabel97, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 400, 620, 20));

        jLabel98.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel98.setForeground(new java.awt.Color(102, 102, 102));
        jLabel98.setText("To – E-textile Online – No 29/18, Mount Road, Dehiwala, Colombo From – (Your"); // NOI18N
        jLabel98.setToolTipText("");
        returnexchange.add(jLabel98, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, 720, 50));

        jLabel102.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel102.setForeground(new java.awt.Color(102, 102, 102));
        jLabel102.setText("product value from your next order. "); // NOI18N
        jLabel102.setToolTipText("");
        returnexchange.add(jLabel102, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 410, 620, 40));

        servicepanell.add(returnexchange, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 0, 860, 590));

        mainpanel.add(servicepanell, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, 1170, 590));

        helppanel.setBackground(new java.awt.Color(0, 0, 204));
        helppanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        contact1.setBackground(new java.awt.Color(204, 204, 204));
        contact1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));
        jPanel13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel118.setIcon(new javax.swing.ImageIcon("src/img/location.jpg"));
        jPanel13.add(jLabel118, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 50, 50));

        jLabel190.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel190.setText("Location");
        jLabel190.setToolTipText("");
        jPanel13.add(jLabel190, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, 140, 20));

        jLabel191.setBackground(new java.awt.Color(102, 102, 102));
        jLabel191.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel191.setForeground(new java.awt.Color(102, 102, 102));
        jLabel191.setText("29/18, Mount Road, ");
        jPanel13.add(jLabel191, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, 140, -1));

        jLabel192.setBackground(new java.awt.Color(102, 102, 102));
        jLabel192.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel192.setForeground(new java.awt.Color(102, 102, 102));
        jLabel192.setText("Dehiwala, Colombo");
        jPanel13.add(jLabel192, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, 140, -1));

        contact1.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, 220, 180));

        jPanel15.setBackground(new java.awt.Color(255, 255, 255));
        jPanel15.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel193.setIcon(new javax.swing.ImageIcon("src/img/email.jpg"));
        jPanel15.add(jLabel193, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 50, 50));

        jLabel194.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel194.setText("email");
        jLabel194.setToolTipText("");
        jPanel15.add(jLabel194, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, 90, 20));

        jLabel195.setBackground(new java.awt.Color(102, 102, 102));
        jLabel195.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel195.setForeground(new java.awt.Color(102, 102, 102));
        jLabel195.setText("etextile@gmail.com");
        jPanel15.add(jLabel195, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, 140, -1));

        jLabel196.setBackground(new java.awt.Color(102, 102, 102));
        jLabel196.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel196.setForeground(new java.awt.Color(102, 102, 102));
        jLabel196.setText("info.etextile@gmail.com");
        jPanel15.add(jLabel196, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 160, -1));

        contact1.add(jPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 70, 220, 180));

        jPanel16.setBackground(new java.awt.Color(255, 255, 255));
        jPanel16.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel197.setIcon(new javax.swing.ImageIcon("src/img/phone.jpg"));
        jPanel16.add(jLabel197, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 50, 50));

        jLabel198.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel198.setText("Phone ");
        jLabel198.setToolTipText("");
        jPanel16.add(jLabel198, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, 140, 20));

        jLabel199.setBackground(new java.awt.Color(102, 102, 102));
        jLabel199.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel199.setForeground(new java.awt.Color(102, 102, 102));
        jLabel199.setText("+94 76 1234567 ");
        jPanel16.add(jLabel199, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, 140, -1));

        jLabel200.setBackground(new java.awt.Color(102, 102, 102));
        jLabel200.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel200.setForeground(new java.awt.Color(102, 102, 102));
        jLabel200.setText("+94 71 9876543 ");
        jPanel16.add(jLabel200, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, 140, -1));

        contact1.add(jPanel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 70, 220, 180));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel201.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel201.setForeground(new java.awt.Color(51, 51, 255));
        jLabel201.setText("Send a message to eTextiles");
        jPanel3.add(jLabel201, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 660, 30));

        jLabel202.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel202.setForeground(new java.awt.Color(102, 102, 102));
        jLabel202.setText("send us message from here. It's our pleasure to help you.  ");
        jPanel3.add(jLabel202, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 690, -1));

        jLabel203.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel203.setForeground(new java.awt.Color(102, 102, 102));
        jLabel203.setText("If you want to ask something from us or any types of quries related to our products and service,");
        jPanel3.add(jLabel203, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 690, -1));

        jLabel204.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel204.setText("message");
        jPanel3.add(jLabel204, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, -1, -1));

        jLabel205.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel205.setText("Your Name");
        jPanel3.add(jLabel205, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, -1));

        jLabel206.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel206.setText("Your Email");
        jPanel3.add(jLabel206, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 100, -1, -1));

        jTextField9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField9ActionPerformed(evt);
            }
        });
        jPanel3.add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 115, 320, 30));

        jTextField10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField10ActionPerformed(evt);
            }
        });
        jPanel3.add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 165, 680, 50));

        jTextField11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField11ActionPerformed(evt);
            }
        });
        jPanel3.add(jTextField11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 115, 320, 30));

        jButton10.setBackground(new java.awt.Color(0, 0, 255));
        jButton10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton10.setForeground(new java.awt.Color(255, 255, 255));
        jButton10.setText("Send Now");
        jButton10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton10MouseClicked(evt);
            }
        });
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 220, 140, 30));

        contact1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 300, 760, 260));

        helppanel.add(contact1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 0, 860, 590));

        mainpanel.add(helppanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 100, 1160, 590));

        loginpanel.setBackground(new java.awt.Color(255, 255, 255));
        loginpanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        loginpanal.setBackground(new java.awt.Color(255, 255, 255));
        loginpanal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        loginpanal.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, 290, 30));

        jLabel123.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel123.setText("E-Mail");
        jLabel123.setToolTipText("");
        loginpanal.add(jLabel123, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 90, 30));

        jLabel124.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel124.setText("Password");
        jLabel124.setToolTipText("");
        loginpanal.add(jLabel124, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, 90, 30));
        loginpanal.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, 290, 30));

        jLabel125.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel125.setText("Don't have a account? ");
        loginpanal.add(jLabel125, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 200, 40));

        jLabel126.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel126.setForeground(new java.awt.Color(0, 153, 255));
        jLabel126.setText("Sign-Up");
        jLabel126.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel126MouseClicked(evt);
            }
        });
        loginpanal.add(jLabel126, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 70, 80, 40));

        jButton9.setBackground(new java.awt.Color(0, 51, 204));
        jButton9.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jButton9.setText("Log-In");
        jButton9.setToolTipText("");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        loginpanal.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 310, 120, 30));

        loginpanel.add(loginpanal, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 130, 380, 370));

        signuppanal.setBackground(new java.awt.Color(255, 255, 255));
        signuppanal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        signuppanal.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 290, 30));

        jLabel127.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel127.setText("E-Mail");
        jLabel127.setToolTipText("");
        signuppanal.add(jLabel127, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 90, 30));

        jLabel128.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel128.setText("Password");
        jLabel128.setToolTipText("");
        signuppanal.add(jLabel128, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, 90, 30));
        signuppanal.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, 290, 30));

        jLabel129.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel129.setText("Do you have a account? ");
        signuppanal.add(jLabel129, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 210, 40));

        jLabel130.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel130.setForeground(new java.awt.Color(0, 153, 255));
        jLabel130.setText("Log-In");
        jLabel130.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel130MouseClicked(evt);
            }
        });
        signuppanal.add(jLabel130, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 30, 60, 40));

        jLabel131.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel131.setText("Password");
        jLabel131.setToolTipText("");
        signuppanal.add(jLabel131, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 90, 30));
        signuppanal.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 290, 30));

        jButton8.setBackground(new java.awt.Color(0, 51, 204));
        jButton8.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jButton8.setText("Sign-Up");
        jButton8.setToolTipText("");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        signuppanal.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 330, 120, 30));

        loginpanel.add(signuppanal, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 130, 380, 370));

        jLabel122.setIcon(new javax.swing.ImageIcon("src/img/back.jpg"));
        jLabel122.setText("jLabel122");
        loginpanel.add(jLabel122, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1140, 590));

        mainpanel.add(loginpanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 100, 1160, 590));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(mainpanel, javax.swing.GroupLayout.PREFERRED_SIZE, 1351, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(mainpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //black mouse click//main panals route
    private void jPanel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel6MouseClicked
        homepanel.setVisible(true);
        catagorypanel.setVisible(false);
        servicepanell.setVisible(false);
        helppanel.setVisible(false);
        loginpanel.setVisible(false);// TODO add your handling code here:
    }//GEN-LAST:event_jPanel6MouseClicked

    private void jPanel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel8MouseClicked
        homepanel.setVisible(false);
        catagorypanel.setVisible(true);
        servicepanell.setVisible(false);
        helppanel.setVisible(false);
        loginpanel.setVisible(false);// TODO add your handling code here:
    }//GEN-LAST:event_jPanel8MouseClicked

    private void jPanel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel9MouseClicked
        homepanel.setVisible(false);
        catagorypanel.setVisible(false);
        servicepanell.setVisible(true);
        helppanel.setVisible(false);
        loginpanel.setVisible(false);// TODO add your handling code here:
    }//GEN-LAST:event_jPanel9MouseClicked

    private void jPanel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel10MouseClicked
        homepanel.setVisible(false);
        catagorypanel.setVisible(false);
        servicepanell.setVisible(false);
        helppanel.setVisible(true);
        loginpanel.setVisible(false);// TODO add your handling code here:
    }//GEN-LAST:event_jPanel10MouseClicked

    private void jPanel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel11MouseClicked
        homepanel.setVisible(false);
        catagorypanel.setVisible(false);
        servicepanell.setVisible(false);
        helppanel.setVisible(false);
        loginpanel.setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_jPanel11MouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        homepanel.setVisible(false);
        catagorypanel.setVisible(true);
        servicepanell.setVisible(false);
        helppanel.setVisible(false);
        loginpanel.setVisible(false);// TODO add your handling code here:
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        homepanel.setVisible(false);
        catagorypanel.setVisible(false);
        servicepanell.setVisible(true);
        helppanel.setVisible(false);
        loginpanel.setVisible(false);// TODO add your handling code here:
    }//GEN-LAST:event_jLabel12MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        homepanel.setVisible(true);
        catagorypanel.setVisible(false);
        servicepanell.setVisible(false);
        helppanel.setVisible(false);
        loginpanel.setVisible(false);// TODO add your handling code here:
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
        homepanel.setVisible(false);
        catagorypanel.setVisible(false);
        servicepanell.setVisible(false);
        helppanel.setVisible(true);
        loginpanel.setVisible(false);// TODO add your handling code here:
    }//GEN-LAST:event_jLabel15MouseClicked

    private void jLabel18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel18MouseClicked
        homepanel.setVisible(false);
        catagorypanel.setVisible(false);
        servicepanell.setVisible(false);
        helppanel.setVisible(false);
        loginpanel.setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_jLabel18MouseClicked

    //read more buttons
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    //service pages route
    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        aboutus.setVisible(true);
        privacy.setVisible(false);
        contact.setVisible(false);
        delivery.setVisible(false);
        terms.setVisible(false);
        returnexchange.setVisible(false);// TODO add your handling code here:
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel29MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel29MouseClicked
        aboutus.setVisible(false);
        privacy.setVisible(true);
        contact.setVisible(false);
        delivery.setVisible(false);
        terms.setVisible(false);
        returnexchange.setVisible(false);// TODO add your handling code here:
    }//GEN-LAST:event_jLabel29MouseClicked

    private void jLabel34MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel34MouseClicked
        aboutus.setVisible(false);
        privacy.setVisible(false);
        contact.setVisible(false);
        delivery.setVisible(true);
        terms.setVisible(false);
        returnexchange.setVisible(false);// TODO add your handling code here:
    }//GEN-LAST:event_jLabel34MouseClicked

    private void jLabel33MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel33MouseClicked
        aboutus.setVisible(false);
        privacy.setVisible(false);
        contact.setVisible(true);
        delivery.setVisible(false);
        terms.setVisible(false);
        returnexchange.setVisible(false);// TODO add your handling code here:
    }//GEN-LAST:event_jLabel33MouseClicked

    private void jLabel30MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel30MouseClicked
        aboutus.setVisible(false);
        privacy.setVisible(false);
        contact.setVisible(false);
        delivery.setVisible(false);
        terms.setVisible(true);
        returnexchange.setVisible(false);// TODO add your handling code here:
    }//GEN-LAST:event_jLabel30MouseClicked

    private void jLabel31MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel31MouseClicked
        aboutus.setVisible(false);
        privacy.setVisible(false);
        contact.setVisible(false);
        delivery.setVisible(false);
        terms.setVisible(false);
        returnexchange.setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_jLabel31MouseClicked

    //contact message send form
    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jLabel121MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel121MouseClicked
        homepanel.setVisible(false);
        catagorypanel.setVisible(false);
        servicepanell.setVisible(false);
        helppanel.setVisible(false);
        loginpanel.setVisible(true);
        myemail = "";// TODO add your handling code here:
    }//GEN-LAST:event_jLabel121MouseClicked

    private void jPanel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel12MouseClicked
        homepanel.setVisible(false);
        catagorypanel.setVisible(false);
        servicepanell.setVisible(false);
        helppanel.setVisible(false);
        loginpanel.setVisible(true);
        myemail = "";// TODO add your handling code here:
    }//GEN-LAST:event_jPanel12MouseClicked

    //signup btn
    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        String email = "";
        String password1 = "";
        String password2 = "";
        email = jTextField6.getText();
        password1 = jTextField7.getText();
        password2 = jTextField8.getText();
        Statement stmt = null;
            Connection con = null;
            PreparedStatement pst;
            try {
                Class.forName("com.mysql.jdbc.Driver");
                con = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/team9", "test", "test");
//here sonoo is database name, root is username and password
                stmt = con.createStatement();
            } catch (Exception e) {
                System.out.println(e);
            }
        if (email != "" || password1 != "" || password2 != "") {            
            try {
                pst = con.prepareStatement("insert into client(email,password,validated)values(?,?,?)");
                pst.setString(1, email);
                pst.setString(2, password1);
                pst.setInt(3, 1);
                pst.executeUpdate();
                JOptionPane.showMessageDialog(null, "Record Added !");
                //table_load();
                jTextField6.setText("");
                jTextField7.setText("");
                jTextField8.setText("");
                //txtName.requestFocus();

            } catch (SQLException e1) {
                e1.printStackTrace();
            }
            loginpanel.setVisible(false);
        homepanel.setVisible(true);
        jPanel11.setVisible(false);
        jPanel12.setVisible(true);
        } else {
            System.out.println("something wrong");
        }// TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed
    //log in
    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        loginpanel.setVisible(false);
        homepanel.setVisible(true);
        jPanel11.setVisible(false);
        jPanel12.setVisible(true);
        String email = "";
        String password = "";
        email = jTextField4.getText();
        password = jTextField5.getText();
        System.out.println("hi");
        if (email != "" || password != "") {
            System.out.println("hi");
            try {
                String sql = "select * from client WHERE email= " + email;
                Statement stmt = sqlconnection();
                ResultSet rs = stmt.executeQuery(sql);
                while (rs.next()) {
                    if (password.equals(rs.getString(3))) {
                        myemail = rs.getString(2);

                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            System.out.println("something wrong");
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton9ActionPerformed

    //go to log in form
    private void jLabel130MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel130MouseClicked
        signuppanal.setVisible(false);
        loginpanal.setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_jLabel130MouseClicked
    //go to sign up form
    private void jLabel126MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel126MouseClicked
        signuppanal.setVisible(true);
        loginpanal.setVisible(false);// TODO add your handling code here:
    }//GEN-LAST:event_jLabel126MouseClicked

    private void jTextField9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField9ActionPerformed

    private void jTextField10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField10ActionPerformed

    private void jTextField11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField11ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        jPanel37.setVisible(false);
        jPanel65.setVisible(false);
        jPanel72.setVisible(true);
        jPanel79.setVisible(false);
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        jPanel37.setVisible(false);
        jPanel65.setVisible(false);
        jPanel72.setVisible(false);
        jPanel79.setVisible(true);
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        jPanel37.setVisible(false);
        jPanel65.setVisible(true);
        jPanel72.setVisible(false);
        jPanel79.setVisible(false);
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        jPanel37.setVisible(true);
        jPanel65.setVisible(false);
        jPanel72.setVisible(false);
        jPanel79.setVisible(false);
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jPanel19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel19MouseClicked
        MyPanel mypanel = new MyPanel();
        try {
            mypanel.item("cloths", 1);
        } catch (SQLException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.getContentPane().add(mypanel);
        System.out.println(mypanel.isVisible());
        mypanel.setLocation(200, 100);
        mypanel.setSize(1170, 590);
        mypanel.setVisible(true);
        mypanel.setFocusable(true);
    }//GEN-LAST:event_jPanel19MouseClicked

    //help panel
    private void jButton10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton10MouseClicked
        String name = "";
        String email = "";
        String msg = "";
        name = jTextField11.getText();
        email = jTextField9.getText();
        msg = jTextField10.getText();
        System.out.println("hi");
        Statement stmt = null;
        Connection con = null;
        PreparedStatement pst;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/team9", "test", "test");
//here sonoo is database name, root is username and password
            stmt = con.createStatement();
        } catch (Exception e) {
            System.out.println(e);
        }
        if (name != "" || email != "" || msg != "") {
            try {
                pst = con.prepareStatement("insert into message(name,email,msg)values(?,?,?)");
                pst.setString(1, name);
                pst.setString(2, email);
                pst.setString(3, msg);
                pst.executeUpdate();
                JOptionPane.showMessageDialog(null, "Record Added !");
                //table_load();
                jTextField11.setText("");
                jTextField9.setText("");
                jTextField10.setText("");
                //txtName.requestFocus();

            } catch (SQLException e1) {
                e1.printStackTrace();
            }
        } else {
            System.out.println("something wrong");
        }// TODO add your handling code here:
    }//GEN-LAST:event_jButton10MouseClicked

    private void jPanel20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel20MouseClicked
        MyPanel mypanel = new MyPanel();
        try {
            mypanel.item("cloths", 2);
        } catch (SQLException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.getContentPane().add(mypanel);
        System.out.println(mypanel.isVisible());
        mypanel.setLocation(200, 100);
        mypanel.setSize(1170, 590);
        mypanel.setVisible(true);
        mypanel.setFocusable(true);// TODO add your handling code here:
    }//GEN-LAST:event_jPanel20MouseClicked

    private void jPanel21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel21MouseClicked
        MyPanel mypanel = new MyPanel();
        try {
            mypanel.item("cloths", 3);
        } catch (SQLException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.getContentPane().add(mypanel);
        System.out.println(mypanel.isVisible());
        mypanel.setLocation(200, 100);
        mypanel.setSize(1170, 590);
        mypanel.setVisible(true);
        mypanel.setFocusable(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel21MouseClicked

    private void jPanel18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel18MouseClicked
        MyPanel mypanel = new MyPanel();
        try {
            mypanel.item("cloths", 4);
        } catch (SQLException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.getContentPane().add(mypanel);
        System.out.println(mypanel.isVisible());
        mypanel.setLocation(200, 100);
        mypanel.setSize(1170, 590);
        mypanel.setVisible(true);
        mypanel.setFocusable(true);// TODO add your handling code here:
    }//GEN-LAST:event_jPanel18MouseClicked

    private void jPanel24MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel24MouseClicked
        MyPanel mypanel = new MyPanel();
        try {
            mypanel.item("shoes", 1);
        } catch (SQLException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.getContentPane().add(mypanel);
        System.out.println(mypanel.isVisible());
        mypanel.setLocation(200, 100);
        mypanel.setSize(1170, 590);
        mypanel.setVisible(true);
        mypanel.setFocusable(true);// TODO add your handling code here:
    }//GEN-LAST:event_jPanel24MouseClicked

    private void jPanel25MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel25MouseClicked
        MyPanel mypanel = new MyPanel();
        try {
            mypanel.item("shoes", 2);
        } catch (SQLException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.getContentPane().add(mypanel);
        System.out.println(mypanel.isVisible());
        mypanel.setLocation(200, 100);
        mypanel.setSize(1170, 590);
        mypanel.setVisible(true);
        mypanel.setFocusable(true);// TODO add your handling code here:
    }//GEN-LAST:event_jPanel25MouseClicked

    private void jPanel26MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel26MouseClicked
        MyPanel mypanel = new MyPanel();
        try {
            mypanel.item("shoes", 3);
        } catch (SQLException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.getContentPane().add(mypanel);
        System.out.println(mypanel.isVisible());
        mypanel.setLocation(200, 100);
        mypanel.setSize(1170, 590);
        mypanel.setVisible(true);
        mypanel.setFocusable(true);// TODO add your handling code here:
    }//GEN-LAST:event_jPanel26MouseClicked

    private void jPanel23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel23MouseClicked
        MyPanel mypanel = new MyPanel();
        try {
            mypanel.item("shoes", 4);
        } catch (SQLException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.getContentPane().add(mypanel);
        System.out.println(mypanel.isVisible());
        mypanel.setLocation(200, 100);
        mypanel.setSize(1170, 590);
        mypanel.setVisible(true);
        mypanel.setFocusable(true);// TODO add your handling code here:
    }//GEN-LAST:event_jPanel23MouseClicked

    private void jPanel29MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel29MouseClicked
        MyPanel mypanel = new MyPanel();
        try {
            mypanel.item("bags", 1);
        } catch (SQLException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.getContentPane().add(mypanel);
        System.out.println(mypanel.isVisible());
        mypanel.setLocation(200, 100);
        mypanel.setSize(1170, 590);
        mypanel.setVisible(true);
        mypanel.setFocusable(true);// TODO add your handling code here:
    }//GEN-LAST:event_jPanel29MouseClicked

    private void jPanel30MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel30MouseClicked
        MyPanel mypanel = new MyPanel();
        try {
            mypanel.item("bags", 2);
        } catch (SQLException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.getContentPane().add(mypanel);
        System.out.println(mypanel.isVisible());
        mypanel.setLocation(200, 100);
        mypanel.setSize(1170, 590);
        mypanel.setVisible(true);
        mypanel.setFocusable(true);// TODO add your handling code here:
    }//GEN-LAST:event_jPanel30MouseClicked

    private void jPanel31MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel31MouseClicked
        MyPanel mypanel = new MyPanel();
        try {
            mypanel.item("bags", 3);
        } catch (SQLException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.getContentPane().add(mypanel);
        System.out.println(mypanel.isVisible());
        mypanel.setLocation(200, 100);
        mypanel.setSize(1170, 590);
        mypanel.setVisible(true);
        mypanel.setFocusable(true);// TODO add your handling code here:
    }//GEN-LAST:event_jPanel31MouseClicked

    private void jPanel28MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel28MouseClicked
        MyPanel mypanel = new MyPanel();
        try {
            mypanel.item("bags", 4);
        } catch (SQLException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.getContentPane().add(mypanel);
        System.out.println(mypanel.isVisible());
        mypanel.setLocation(200, 100);
        mypanel.setSize(1170, 590);
        mypanel.setVisible(true);
        mypanel.setFocusable(true);// TODO add your handling code here:
    }//GEN-LAST:event_jPanel28MouseClicked

    private void jPanel34MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel34MouseClicked
        MyPanel mypanel = new MyPanel();
        try {
            mypanel.item("toys", 1);
        } catch (SQLException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.getContentPane().add(mypanel);
        System.out.println(mypanel.isVisible());
        mypanel.setLocation(200, 100);
        mypanel.setSize(1170, 590);
        mypanel.setVisible(true);
        mypanel.setFocusable(true);// TODO add your handling code here:
    }//GEN-LAST:event_jPanel34MouseClicked

    private void jPanel35MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel35MouseClicked
        MyPanel mypanel = new MyPanel();
        try {
            mypanel.item("toys", 2);
        } catch (SQLException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.getContentPane().add(mypanel);
        System.out.println(mypanel.isVisible());
        mypanel.setLocation(200, 100);
        mypanel.setSize(1170, 590);
        mypanel.setVisible(true);
        mypanel.setFocusable(true);// TODO add your handling code here:
    }//GEN-LAST:event_jPanel35MouseClicked

    private void jPanel36MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel36MouseClicked
        MyPanel mypanel = new MyPanel();
        try {
            mypanel.item("toys", 3);
        } catch (SQLException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.getContentPane().add(mypanel);
        System.out.println(mypanel.isVisible());
        mypanel.setLocation(200, 100);
        mypanel.setSize(1170, 590);
        mypanel.setVisible(true);
        mypanel.setFocusable(true);// TODO add your handling code here:
    }//GEN-LAST:event_jPanel36MouseClicked

    private void jPanel33MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel33MouseClicked
        MyPanel mypanel = new MyPanel();
        try {
            mypanel.item("toys", 4);
        } catch (SQLException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.getContentPane().add(mypanel);
        System.out.println(mypanel.isVisible());
        mypanel.setLocation(200, 100);
        mypanel.setSize(1170, 590);
        mypanel.setVisible(true);
        mypanel.setFocusable(true);// TODO add your handling code here:
    }//GEN-LAST:event_jPanel33MouseClicked

    private void jPanel38MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel38MouseClicked
        MyPanel mypanel = new MyPanel();
        try {
            mypanel.item("cloths", 1);
        } catch (SQLException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.getContentPane().add(mypanel);
        System.out.println(mypanel.isVisible());
        mypanel.setLocation(200, 100);
        mypanel.setSize(1170, 590);
        mypanel.setVisible(true);
        mypanel.setFocusable(true);// TODO add your handling code here:
    }//GEN-LAST:event_jPanel38MouseClicked

    private void jPanel39MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel39MouseClicked
        MyPanel mypanel = new MyPanel();
        try {
            mypanel.item("cloths", 2);
        } catch (SQLException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.getContentPane().add(mypanel);
        System.out.println(mypanel.isVisible());
        mypanel.setLocation(200, 100);
        mypanel.setSize(1170, 590);
        mypanel.setVisible(true);
        mypanel.setFocusable(true);// TODO add your handling code here:
    }//GEN-LAST:event_jPanel39MouseClicked

    private void jPanel40MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel40MouseClicked
        MyPanel mypanel = new MyPanel();
        try {
            mypanel.item("cloths", 3);
        } catch (SQLException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.getContentPane().add(mypanel);
        System.out.println(mypanel.isVisible());
        mypanel.setLocation(200, 100);
        mypanel.setSize(1170, 590);
        mypanel.setVisible(true);
        mypanel.setFocusable(true);// TODO add your handling code here:
    }//GEN-LAST:event_jPanel40MouseClicked

    private void jPanel41MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel41MouseClicked
        MyPanel mypanel = new MyPanel();
        try {
            mypanel.item("cloths", 4);
        } catch (SQLException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.getContentPane().add(mypanel);
        System.out.println(mypanel.isVisible());
        mypanel.setLocation(200, 100);
        mypanel.setSize(1170, 590);
        mypanel.setVisible(true);
        mypanel.setFocusable(true);// TODO add your handling code here:
    }//GEN-LAST:event_jPanel41MouseClicked

    private void jPanel42MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel42MouseClicked
        MyPanel mypanel = new MyPanel();
        try {
            mypanel.item("cloths", 5);
        } catch (SQLException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.getContentPane().add(mypanel);
        System.out.println(mypanel.isVisible());
        mypanel.setLocation(200, 100);
        mypanel.setSize(1170, 590);
        mypanel.setVisible(true);
        mypanel.setFocusable(true);// TODO add your handling code here:
    }//GEN-LAST:event_jPanel42MouseClicked

    private void jPanel43MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel43MouseClicked
        MyPanel mypanel = new MyPanel();
        try {
            mypanel.item("cloths", 6);
        } catch (SQLException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.getContentPane().add(mypanel);
        System.out.println(mypanel.isVisible());
        mypanel.setLocation(200, 100);
        mypanel.setSize(1170, 590);
        mypanel.setVisible(true);
        mypanel.setFocusable(true);// TODO add your handling code here:
    }//GEN-LAST:event_jPanel43MouseClicked

    private void jPanel66MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel66MouseClicked
        MyPanel mypanel = new MyPanel();
        try {
            mypanel.item("shoes", 1);
        } catch (SQLException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.getContentPane().add(mypanel);
        System.out.println(mypanel.isVisible());
        mypanel.setLocation(200, 100);
        mypanel.setSize(1170, 590);
        mypanel.setVisible(true);
        mypanel.setFocusable(true);// TODO add your handling code here:
    }//GEN-LAST:event_jPanel66MouseClicked

    private void jPanel67MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel67MouseClicked
        MyPanel mypanel = new MyPanel();
        try {
            mypanel.item("shoes", 2);
        } catch (SQLException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.getContentPane().add(mypanel);
        System.out.println(mypanel.isVisible());
        mypanel.setLocation(200, 100);
        mypanel.setSize(1170, 590);
        mypanel.setVisible(true);
        mypanel.setFocusable(true);// TODO add your handling code here:
    }//GEN-LAST:event_jPanel67MouseClicked

    private void jPanel68MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel68MouseClicked
        MyPanel mypanel = new MyPanel();
        try {
            mypanel.item("shoes", 3);
        } catch (SQLException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.getContentPane().add(mypanel);
        System.out.println(mypanel.isVisible());
        mypanel.setLocation(200, 100);
        mypanel.setSize(1170, 590);
        mypanel.setVisible(true);
        mypanel.setFocusable(true);// TODO add your handling code here:
    }//GEN-LAST:event_jPanel68MouseClicked

    private void jPanel69MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel69MouseClicked
        MyPanel mypanel = new MyPanel();
        try {
            mypanel.item("shoes", 4);
        } catch (SQLException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.getContentPane().add(mypanel);
        System.out.println(mypanel.isVisible());
        mypanel.setLocation(200, 100);
        mypanel.setSize(1170, 590);
        mypanel.setVisible(true);
        mypanel.setFocusable(true);// TODO add your handling code here:
    }//GEN-LAST:event_jPanel69MouseClicked

    private void jPanel70MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel70MouseClicked
        MyPanel mypanel = new MyPanel();
        try {
            mypanel.item("shoes", 5);
        } catch (SQLException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.getContentPane().add(mypanel);
        System.out.println(mypanel.isVisible());
        mypanel.setLocation(200, 100);
        mypanel.setSize(1170, 590);
        mypanel.setVisible(true);
        mypanel.setFocusable(true);// TODO add your handling code here:
    }//GEN-LAST:event_jPanel70MouseClicked

    private void jPanel71MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel71MouseClicked
        MyPanel mypanel = new MyPanel();
        try {
            mypanel.item("shoes", 6);
        } catch (SQLException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.getContentPane().add(mypanel);
        System.out.println(mypanel.isVisible());
        mypanel.setLocation(200, 100);
        mypanel.setSize(1170, 590);
        mypanel.setVisible(true);
        mypanel.setFocusable(true);// TODO add your handling code here:
    }//GEN-LAST:event_jPanel71MouseClicked

    private void jPanel73MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel73MouseClicked
        MyPanel mypanel = new MyPanel();
        try {
            mypanel.item("bags", 1);
        } catch (SQLException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.getContentPane().add(mypanel);
        System.out.println(mypanel.isVisible());
        mypanel.setLocation(200, 100);
        mypanel.setSize(1170, 590);
        mypanel.setVisible(true);
        mypanel.setFocusable(true);// TODO add your handling code here:
    }//GEN-LAST:event_jPanel73MouseClicked

    private void jPanel74MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel74MouseClicked
        MyPanel mypanel = new MyPanel();
        try {
            mypanel.item("bags", 2);
        } catch (SQLException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.getContentPane().add(mypanel);
        System.out.println(mypanel.isVisible());
        mypanel.setLocation(200, 100);
        mypanel.setSize(1170, 590);
        mypanel.setVisible(true);
        mypanel.setFocusable(true);// TODO add your handling code here:
    }//GEN-LAST:event_jPanel74MouseClicked

    private void jPanel75MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel75MouseClicked
        MyPanel mypanel = new MyPanel();
        try {
            mypanel.item("bags", 3);
        } catch (SQLException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.getContentPane().add(mypanel);
        System.out.println(mypanel.isVisible());
        mypanel.setLocation(200, 100);
        mypanel.setSize(1170, 590);
        mypanel.setVisible(true);
        mypanel.setFocusable(true);// TODO add your handling code here:
    }//GEN-LAST:event_jPanel75MouseClicked

    private void jPanel76MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel76MouseClicked
        MyPanel mypanel = new MyPanel();
        try {
            mypanel.item("bags", 4);
        } catch (SQLException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.getContentPane().add(mypanel);
        System.out.println(mypanel.isVisible());
        mypanel.setLocation(200, 100);
        mypanel.setSize(1170, 590);
        mypanel.setVisible(true);
        mypanel.setFocusable(true);// TODO add your handling code here:
    }//GEN-LAST:event_jPanel76MouseClicked

    private void jPanel77MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel77MouseClicked
        MyPanel mypanel = new MyPanel();
        try {
            mypanel.item("bags", 5);
        } catch (SQLException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.getContentPane().add(mypanel);
        System.out.println(mypanel.isVisible());
        mypanel.setLocation(200, 100);
        mypanel.setSize(1170, 590);
        mypanel.setVisible(true);
        mypanel.setFocusable(true);// TODO add your handling code here:
    }//GEN-LAST:event_jPanel77MouseClicked

    private void jPanel78MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel78MouseClicked
        MyPanel mypanel = new MyPanel();
        try {
            mypanel.item("bags", 1);
        } catch (SQLException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.getContentPane().add(mypanel);
        System.out.println(mypanel.isVisible());
        mypanel.setLocation(200, 100);
        mypanel.setSize(1170, 590);
        mypanel.setVisible(true);
        mypanel.setFocusable(true);// TODO add your handling code here:
    }//GEN-LAST:event_jPanel78MouseClicked

    private void jPanel80MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel80MouseClicked
        MyPanel mypanel = new MyPanel();
        try {
            mypanel.item("toys", 1);
        } catch (SQLException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.getContentPane().add(mypanel);
        System.out.println(mypanel.isVisible());
        mypanel.setLocation(200, 100);
        mypanel.setSize(1170, 590);
        mypanel.setVisible(true);
        mypanel.setFocusable(true);// TODO add your handling code here:
    }//GEN-LAST:event_jPanel80MouseClicked

    private void jPanel81MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel81MouseClicked
        MyPanel mypanel = new MyPanel();
        try {
            mypanel.item("toys", 2);
        } catch (SQLException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.getContentPane().add(mypanel);
        System.out.println(mypanel.isVisible());
        mypanel.setLocation(200, 100);
        mypanel.setSize(1170, 590);
        mypanel.setVisible(true);
        mypanel.setFocusable(true);// TODO add your handling code here:
    }//GEN-LAST:event_jPanel81MouseClicked

    private void jPanel82MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel82MouseClicked
        MyPanel mypanel = new MyPanel();
        try {
            mypanel.item("toys", 3);
        } catch (SQLException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.getContentPane().add(mypanel);
        System.out.println(mypanel.isVisible());
        mypanel.setLocation(200, 100);
        mypanel.setSize(1170, 590);
        mypanel.setVisible(true);
        mypanel.setFocusable(true);// TODO add your handling code here:
    }//GEN-LAST:event_jPanel82MouseClicked

    private void jPanel83MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel83MouseClicked
        MyPanel mypanel = new MyPanel();
        try {
            mypanel.item("toys", 4);
        } catch (SQLException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.getContentPane().add(mypanel);
        System.out.println(mypanel.isVisible());
        mypanel.setLocation(200, 100);
        mypanel.setSize(1170, 590);
        mypanel.setVisible(true);
        mypanel.setFocusable(true);// TODO add your handling code here:
    }//GEN-LAST:event_jPanel83MouseClicked

    private void jPanel84MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel84MouseClicked
        MyPanel mypanel = new MyPanel();
        try {
            mypanel.item("toys", 5);
        } catch (SQLException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.getContentPane().add(mypanel);
        System.out.println(mypanel.isVisible());
        mypanel.setLocation(200, 100);
        mypanel.setSize(1170, 590);
        mypanel.setVisible(true);
        mypanel.setFocusable(true);// TODO add your handling code here:
    }//GEN-LAST:event_jPanel84MouseClicked

    private void jPanel85MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel85MouseClicked
        MyPanel mypanel = new MyPanel();
        try {
            mypanel.item("toys", 1);
        } catch (SQLException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.getContentPane().add(mypanel);
        System.out.println(mypanel.isVisible());
        mypanel.setLocation(200, 100);
        mypanel.setSize(1170, 590);
        mypanel.setVisible(true);
        mypanel.setFocusable(true);// TODO add your handling code here:
    }//GEN-LAST:event_jPanel85MouseClicked

    //home page values
    public static void homefunction() throws SQLException {
        MainPage[] arr;
        arr = new MainPage[16];
        arr[0] = new MainPage("cloths", 1, "homecloth1p", "homecloth1n", "homecloth1");
        arr[1] = new MainPage("cloths", 2, "homecloth2p", "homecloth2n", "homecloth2");
        arr[2] = new MainPage("cloths", 3, "homecloth3p", "homecloth3n", "homecloth3");
        arr[3] = new MainPage("cloths", 4, "homecloth4p", "homecloth4n", "homecloth4");
        arr[4] = new MainPage("shoes", 1, "homeshoe1p", "homeshoe1n", "homeshoe1");
        arr[5] = new MainPage("shoes", 2, "homeshoe2p", "homeshoe2n", "homeshoe2");
        arr[6] = new MainPage("shoes", 3, "homeshoe3p", "homeshoe3n", "homeshoe3");
        arr[7] = new MainPage("shoes", 4, "homeshoe4p", "homeshoe4n", "homeshoe4");
        arr[8] = new MainPage("bags", 1, "homebag1p", "homebag1n", "homebag1");
        arr[9] = new MainPage("bags", 2, "homebag2p", "homebag2n", "homebag2");
        arr[10] = new MainPage("bags", 3, "homebag3p", "homebag3n", "homebag3");
        arr[11] = new MainPage("bags", 4, "homebag4p", "homebag4n", "homebag4");
        arr[12] = new MainPage("toys", 1, "hometoy1p", "hometoy1n", "hometoy1");
        arr[13] = new MainPage("toys", 2, "hometoy2p", "hometoy2n", "hometoy2");
        arr[14] = new MainPage("toys", 3, "hometoy3p", "hometoy3n", "hometoy3");
        arr[15] = new MainPage("toys", 4, "hometoy4p", "hometoy4n", "hometoy4");

        for (int i = 0; i < 16; i++) {
            String sql = "select * from " + arr[i].catagery + " WHERE id = " + arr[i].id;
            String itemname = null;
            String itemprice = null;
            String itemimage = null;
            Statement stmt = sqlconnection();
            ResultSet rs = stmt.executeQuery(sql);
            rs.next();
            itemname = rs.getString(2);
            itemprice = rs.getString(3);
            itemimage = rs.getString(4);
            if ("homecloth1".equals(arr[i].link)) {
                homecloth1n = itemname;
                homecloth1p = itemprice;
                homecloth1 = itemimage;
            } else if ("homecloth2".equals(arr[i].link)) {
                homecloth2n = itemname;
                homecloth2p = itemprice;
                homecloth2 = itemimage;

            } else if ("homecloth3".equals(arr[i].link)) {
                homecloth3n = itemname;
                homecloth3p = itemprice;
                homecloth3 = itemimage;

            } else if ("homecloth4".equals(arr[i].link)) {
                homecloth4n = itemname;
                homecloth4p = itemprice;
                homecloth4 = itemimage;

            } else if ("homeshoe1".equals(arr[i].link)) {
                homeshoe1n = itemname;
                homeshoe1p = itemprice;
                homeshoe1 = itemimage;

            } else if ("homeshoe2".equals(arr[i].link)) {
                homeshoe2n = itemname;
                homeshoe2p = itemprice;
                homeshoe2 = itemimage;

            } else if ("homeshoe3".equals(arr[i].link)) {
                homeshoe3n = itemname;
                homeshoe3p = itemprice;
                homeshoe3 = itemimage;

            } else if ("homeshoe4".equals(arr[i].link)) {
                homeshoe4n = itemname;
                homeshoe4p = itemprice;
                homeshoe4 = itemimage;

            } else if ("homebag1".equals(arr[i].link)) {
                homebag1n = itemname;
                homebag1p = itemprice;
                homebag1 = itemimage;

            } else if ("homebag2".equals(arr[i].link)) {
                homebag2n = itemname;
                homebag2p = itemprice;
                homebag2 = itemimage;

            } else if ("homebag3".equals(arr[i].link)) {
                homebag3n = itemname;
                homebag3p = itemprice;
                homebag3 = itemimage;

            } else if ("homebag4".equals(arr[i].link)) {
                homebag4n = itemname;
                homebag4p = itemprice;
                homebag4 = itemimage;

            } else if ("hometoy1".equals(arr[i].link)) {
                hometoy1n = itemname;
                hometoy1p = itemprice;
                hometoy1 = itemimage;

            } else if ("hometoy2".equals(arr[i].link)) {
                hometoy2n = itemname;
                hometoy2p = itemprice;
                hometoy2 = itemimage;

            } else if ("hometoy3".equals(arr[i].link)) {
                hometoy3n = itemname;
                hometoy3p = itemprice;
                hometoy3 = itemimage;

            } else if ("hometoy4".equals(arr[i].link)) {
                hometoy4n = itemname;
                hometoy4p = itemprice;
                hometoy4 = itemimage;

            }
        }
    }

    public static void catageryfunction1() throws SQLException {
        CatageryPage[] arr;

        arr = new CatageryPage[6];
        arr[0] = new CatageryPage(1, "item1");
        arr[1] = new CatageryPage(2, "item2");
        arr[2] = new CatageryPage(3, "item3");
        arr[3] = new CatageryPage(4, "item4");
        arr[4] = new CatageryPage(5, "item5");
        arr[5] = new CatageryPage(6, "item6");

        for (int i = 0; i < 6; i++) {
            String sql = "select * from cloths WHERE id = " + arr[i].id;
            String itemname = null;
            String itemprice = null;
            String itemimage = null;
            Statement stmt = sqlconnection();
            ResultSet rs = stmt.executeQuery(sql);
            rs.next();
            itemname = rs.getString(2);
            itemprice = rs.getString(3);
            itemimage = rs.getString(4);
            if ("item1".equals(arr[i].link)) {
                item1n = itemname;
                item1p = itemprice;
                item1 = itemimage;

            } else if ("item2".equals(arr[i].link)) {
                item2n = itemname;
                item2p = itemprice;
                item2 = itemimage;

            } else if ("item3".equals(arr[i].link)) {
                item3n = itemname;
                item3p = itemprice;
                item3 = itemimage;

            } else if ("item4".equals(arr[i].link)) {
                item4n = itemname;
                item4p = itemprice;
                item4 = itemimage;

            } else if ("item5".equals(arr[i].link)) {
                item5n = itemname;
                item5p = itemprice;
                item5 = itemimage;

            } else if ("item6".equals(arr[i].link)) {
                item6n = itemname;
                item6p = itemprice;
                item6 = itemimage;

            }
        }
    }

    public static void catageryfunction2() throws SQLException {
        CatageryPage[] arr;

        arr = new CatageryPage[6];
        arr[0] = new CatageryPage(1, "item7");
        arr[1] = new CatageryPage(2, "item8");
        arr[2] = new CatageryPage(3, "item9");
        arr[3] = new CatageryPage(4, "item10");
        arr[4] = new CatageryPage(5, "item11");
        arr[5] = new CatageryPage(6, "item12");

        for (int i = 0; i < 6; i++) {
            String sql = "select * from shoes WHERE id = " + arr[i].id;
            String itemname = null;
            String itemprice = null;
            String itemimage = null;
            Statement stmt = sqlconnection();
            ResultSet rs = stmt.executeQuery(sql);
            rs.next();
            itemname = rs.getString(2);
            itemprice = rs.getString(3);
            itemimage = rs.getString(4);
            if ("item7".equals(arr[i].link)) {
                item7n = itemname;
                item7p = itemprice;
                item7 = itemimage;

            } else if ("item8".equals(arr[i].link)) {
                item8n = itemname;
                item8p = itemprice;
                item8 = itemimage;

            } else if ("item9".equals(arr[i].link)) {
                item9n = itemname;
                item9p = itemprice;
                item9 = itemimage;

            } else if ("item10".equals(arr[i].link)) {
                item10n = itemname;
                item10p = itemprice;
                item10 = itemimage;

            } else if ("item11".equals(arr[i].link)) {
                item11n = itemname;
                item11p = itemprice;
                item11 = itemimage;

            } else if ("item12".equals(arr[i].link)) {
                item12n = itemname;
                item12p = itemprice;
                item12 = itemimage;

            }
        }
    }

    public static void catageryfunction3() throws SQLException {
        CatageryPage[] arr;

        arr = new CatageryPage[6];
        arr[0] = new CatageryPage(1, "item13");
        arr[1] = new CatageryPage(2, "item14");
        arr[2] = new CatageryPage(3, "item15");
        arr[3] = new CatageryPage(4, "item16");
        arr[4] = new CatageryPage(5, "item17");
        arr[5] = new CatageryPage(1, "item18");

        for (int i = 0; i < 6; i++) {
            String sql = "select * from bags WHERE id = " + arr[i].id;
            String itemname = null;
            String itemprice = null;
            String itemimage = null;
            Statement stmt = sqlconnection();
            ResultSet rs = stmt.executeQuery(sql);
            rs.next();
            itemname = rs.getString(2);
            itemprice = rs.getString(3);
            itemimage = rs.getString(4);
            if ("item13".equals(arr[i].link)) {
                item13n = itemname;
                item13p = itemprice;
                item13 = itemimage;

            } else if ("item14".equals(arr[i].link)) {
                item14n = itemname;
                item14p = itemprice;
                item14 = itemimage;

            } else if ("item15".equals(arr[i].link)) {
                item15n = itemname;
                item15p = itemprice;
                item15 = itemimage;

            } else if ("item16".equals(arr[i].link)) {
                item16n = itemname;
                item16p = itemprice;
                item16 = itemimage;

            } else if ("item17".equals(arr[i].link)) {
                item17n = itemname;
                item17p = itemprice;
                item17 = itemimage;

            } else if ("item18".equals(arr[i].link)) {
                item18n = itemname;
                item18p = itemprice;
                item18 = itemimage;

            }
        }
    }

    public static void catageryfunction4() throws SQLException {
        CatageryPage[] arr;

        arr = new CatageryPage[6];
        arr[0] = new CatageryPage(1, "item19");
        arr[1] = new CatageryPage(2, "item20");
        arr[2] = new CatageryPage(3, "item21");
        arr[3] = new CatageryPage(4, "item22");
        arr[4] = new CatageryPage(5, "item23");
        arr[5] = new CatageryPage(1, "item24");

        for (int i = 0; i < 6; i++) {
            String sql = "select * from toys WHERE id = " + arr[i].id;
            String itemname = null;
            String itemprice = null;
            String itemimage = null;
            Statement stmt = sqlconnection();
            ResultSet rs = stmt.executeQuery(sql);
            rs.next();
            itemname = rs.getString(2);
            itemprice = rs.getString(3);
            itemimage = rs.getString(4);
            if ("item19".equals(arr[i].link)) {
                item19n = itemname;
                item19p = itemprice;
                item19 = itemimage;

            } else if ("item20".equals(arr[i].link)) {
                item20n = itemname;
                item20p = itemprice;
                item20 = itemimage;

            } else if ("item21".equals(arr[i].link)) {
                item21n = itemname;
                item21p = itemprice;
                item21 = itemimage;

            } else if ("item22".equals(arr[i].link)) {
                item22n = itemname;
                item22p = itemprice;
                item22 = itemimage;

            } else if ("item23".equals(arr[i].link)) {
                item23n = itemname;
                item23p = itemprice;
                item23 = itemimage;

            } else if ("item24".equals(arr[i].link)) {
                item24n = itemname;
                item24p = itemprice;
                item24 = itemimage;

            }
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws SQLException, MalformedURLException {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        jLabel133 = new JLabel();
        jLabel134 = new JLabel();
        jLabel135 = new JLabel();
        jLabel145 = new JLabel();
        jLabel146 = new JLabel();
        jLabel147 = new JLabel();
        jLabel148 = new JLabel();
        jLabel149 = new JLabel();
        jLabel150 = new JLabel();
        jLabel151 = new JLabel();
        jLabel152 = new JLabel();
        jLabel153 = new JLabel();
        jLabel154 = new JLabel();
        jLabel155 = new JLabel();
        jLabel156 = new JLabel();
        jLabel157 = new JLabel();
        jLabel158 = new JLabel();
        jLabel159 = new JLabel();
        jLabel160 = new JLabel();
        jLabel162 = new JLabel();
        jLabel163 = new JLabel();
        jLabel164 = new JLabel();
        jLabel165 = new JLabel();
        jLabel166 = new JLabel();
        jLabel167 = new JLabel();
        jLabel168 = new JLabel();
        jLabel169 = new JLabel();
        jLabel170 = new JLabel();
        jLabel171 = new JLabel();
        jLabel172 = new JLabel();
        jLabel173 = new JLabel();
        jLabel174 = new JLabel();
        jLabel175 = new JLabel();
        jLabel176 = new JLabel();
        jLabel177 = new JLabel();
        jLabel178 = new JLabel();
        jLabel179 = new JLabel();
        jLabel180 = new JLabel();

        jLabel207 = new JLabel();
        jLabel208 = new JLabel();
        jLabel209 = new JLabel();
        jLabel210 = new JLabel();
        jLabel211 = new JLabel();
        jLabel212 = new JLabel();
        jLabel213 = new JLabel();
        jLabel214 = new JLabel();
        jLabel215 = new JLabel();
        jLabel216 = new JLabel();
        jLabel217 = new JLabel();
        jLabel218 = new JLabel();
        jLabel219 = new JLabel();
        jLabel220 = new JLabel();
        jLabel221 = new JLabel();
        jLabel222 = new JLabel();
        jLabel223 = new JLabel();
        jLabel224 = new JLabel();

        jLabel279 = new JLabel();
        jLabel280 = new JLabel();
        jLabel281 = new JLabel();
        jLabel282 = new JLabel();
        jLabel283 = new JLabel();
        jLabel284 = new JLabel();
        jLabel285 = new JLabel();
        jLabel286 = new JLabel();
        jLabel287 = new JLabel();
        jLabel288 = new JLabel();
        jLabel289 = new JLabel();
        jLabel290 = new JLabel();
        jLabel291 = new JLabel();
        jLabel292 = new JLabel();
        jLabel293 = new JLabel();
        jLabel294 = new JLabel();
        jLabel295 = new JLabel();
        jLabel296 = new JLabel();

        jLabel297 = new JLabel();
        jLabel298 = new JLabel();
        jLabel299 = new JLabel();
        jLabel300 = new JLabel();
        jLabel301 = new JLabel();
        jLabel302 = new JLabel();
        jLabel303 = new JLabel();
        jLabel304 = new JLabel();
        jLabel305 = new JLabel();
        jLabel306 = new JLabel();
        jLabel307 = new JLabel();
        jLabel308 = new JLabel();
        jLabel309 = new JLabel();
        jLabel310 = new JLabel();
        jLabel311 = new JLabel();
        jLabel312 = new JLabel();
        jLabel313 = new JLabel();
        jLabel314 = new JLabel();

        jLabel315 = new JLabel();
        jLabel316 = new JLabel();
        jLabel317 = new JLabel();
        jLabel318 = new JLabel();
        jLabel319 = new JLabel();
        jLabel320 = new JLabel();
        jLabel321 = new JLabel();
        jLabel322 = new JLabel();
        jLabel323 = new JLabel();
        jLabel324 = new JLabel();
        jLabel325 = new JLabel();
        jLabel326 = new JLabel();
        jLabel327 = new JLabel();
        jLabel328 = new JLabel();
        jLabel329 = new JLabel();
        jLabel330 = new JLabel();
        jLabel331 = new JLabel();
        jLabel332 = new JLabel();

        homefunction();
        catageryfunction1();
        catageryfunction2();
        catageryfunction3();
        catageryfunction4();

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
        //item("cloths", 2);
        //image23= "C:/Users/user/Documents/NetBeansProjects/Team09-shoppingapp/src/main/java/images/home.jpg";
        //image23="https://drive.google.com/file/d/1y3doTqYjcaYHfeW72ON_RzuLl5tfu81d/view?usp=sharing";
        //System.out.println(image23);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel aboutus;
    private javax.swing.JPanel catagerylistpanel;
    private javax.swing.JPanel catagorypanel;
    private javax.swing.JPanel contact;
    private javax.swing.JPanel contact1;
    private javax.swing.JPanel delivery;
    private javax.swing.JPanel helppanel;
    public static javax.swing.JPanel homepanel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel103;
    private javax.swing.JLabel jLabel104;
    private javax.swing.JLabel jLabel105;
    private javax.swing.JLabel jLabel106;
    private javax.swing.JLabel jLabel107;
    private javax.swing.JLabel jLabel108;
    private javax.swing.JLabel jLabel109;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel110;
    private javax.swing.JLabel jLabel111;
    private javax.swing.JLabel jLabel112;
    private javax.swing.JLabel jLabel113;
    private javax.swing.JLabel jLabel114;
    private javax.swing.JLabel jLabel115;
    private javax.swing.JLabel jLabel116;
    private javax.swing.JLabel jLabel117;
    private javax.swing.JLabel jLabel118;
    private javax.swing.JLabel jLabel119;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel120;
    private javax.swing.JLabel jLabel121;
    private javax.swing.JLabel jLabel122;
    private javax.swing.JLabel jLabel123;
    private javax.swing.JLabel jLabel124;
    private javax.swing.JLabel jLabel125;
    private javax.swing.JLabel jLabel126;
    private javax.swing.JLabel jLabel127;
    private javax.swing.JLabel jLabel128;
    private javax.swing.JLabel jLabel129;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel130;
    private javax.swing.JLabel jLabel131;
    public static javax.swing.JLabel jLabel133;
    public static javax.swing.JLabel jLabel134;
    public static javax.swing.JLabel jLabel135;
    private javax.swing.JLabel jLabel14;
    public static javax.swing.JLabel jLabel145;
    public static javax.swing.JLabel jLabel146;
    public static javax.swing.JLabel jLabel147;
    public static javax.swing.JLabel jLabel148;
    public static javax.swing.JLabel jLabel149;
    private javax.swing.JLabel jLabel15;
    public static javax.swing.JLabel jLabel150;
    public static javax.swing.JLabel jLabel151;
    public static javax.swing.JLabel jLabel152;
    public static javax.swing.JLabel jLabel153;
    public static javax.swing.JLabel jLabel154;
    public static javax.swing.JLabel jLabel155;
    public static javax.swing.JLabel jLabel156;
    public static javax.swing.JLabel jLabel157;
    public static javax.swing.JLabel jLabel158;
    public static javax.swing.JLabel jLabel159;
    private javax.swing.JLabel jLabel16;
    public static javax.swing.JLabel jLabel160;
    public static javax.swing.JLabel jLabel161;
    public static javax.swing.JLabel jLabel162;
    public static javax.swing.JLabel jLabel163;
    public static javax.swing.JLabel jLabel164;
    public static javax.swing.JLabel jLabel165;
    public static javax.swing.JLabel jLabel166;
    public static javax.swing.JLabel jLabel167;
    public static javax.swing.JLabel jLabel168;
    public static javax.swing.JLabel jLabel169;
    private javax.swing.JLabel jLabel17;
    public static javax.swing.JLabel jLabel170;
    public static javax.swing.JLabel jLabel171;
    public static javax.swing.JLabel jLabel172;
    public static javax.swing.JLabel jLabel173;
    public static javax.swing.JLabel jLabel174;
    public static javax.swing.JLabel jLabel175;
    public static javax.swing.JLabel jLabel176;
    public static javax.swing.JLabel jLabel177;
    public static javax.swing.JLabel jLabel178;
    public static javax.swing.JLabel jLabel179;
    private javax.swing.JLabel jLabel18;
    public static javax.swing.JLabel jLabel180;
    public static javax.swing.JLabel jLabel181;
    public static javax.swing.JLabel jLabel182;
    public static javax.swing.JLabel jLabel183;
    public static javax.swing.JLabel jLabel184;
    public static javax.swing.JLabel jLabel185;
    public static javax.swing.JLabel jLabel186;
    public static javax.swing.JLabel jLabel187;
    public static javax.swing.JLabel jLabel188;
    public static javax.swing.JLabel jLabel189;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel190;
    private javax.swing.JLabel jLabel191;
    private javax.swing.JLabel jLabel192;
    private javax.swing.JLabel jLabel193;
    private javax.swing.JLabel jLabel194;
    private javax.swing.JLabel jLabel195;
    private javax.swing.JLabel jLabel196;
    private javax.swing.JLabel jLabel197;
    private javax.swing.JLabel jLabel198;
    private javax.swing.JLabel jLabel199;
    public static javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel200;
    private javax.swing.JLabel jLabel201;
    private javax.swing.JLabel jLabel202;
    private javax.swing.JLabel jLabel203;
    private javax.swing.JLabel jLabel204;
    private javax.swing.JLabel jLabel205;
    private javax.swing.JLabel jLabel206;
    public static javax.swing.JLabel jLabel207;
    public static javax.swing.JLabel jLabel208;
    public static javax.swing.JLabel jLabel209;
    private javax.swing.JLabel jLabel21;
    public static javax.swing.JLabel jLabel210;
    public static javax.swing.JLabel jLabel211;
    public static javax.swing.JLabel jLabel212;
    public static javax.swing.JLabel jLabel213;
    public static javax.swing.JLabel jLabel214;
    public static javax.swing.JLabel jLabel215;
    public static javax.swing.JLabel jLabel216;
    public static javax.swing.JLabel jLabel217;
    public static javax.swing.JLabel jLabel218;
    public static javax.swing.JLabel jLabel219;
    private javax.swing.JLabel jLabel22;
    public static javax.swing.JLabel jLabel220;
    public static javax.swing.JLabel jLabel221;
    public static javax.swing.JLabel jLabel222;
    public static javax.swing.JLabel jLabel223;
    public static javax.swing.JLabel jLabel224;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    public static javax.swing.JLabel jLabel279;
    private javax.swing.JLabel jLabel28;
    public static javax.swing.JLabel jLabel280;
    public static javax.swing.JLabel jLabel281;
    public static javax.swing.JLabel jLabel282;
    public static javax.swing.JLabel jLabel283;
    public static javax.swing.JLabel jLabel284;
    public static javax.swing.JLabel jLabel285;
    public static javax.swing.JLabel jLabel286;
    public static javax.swing.JLabel jLabel287;
    public static javax.swing.JLabel jLabel288;
    public static javax.swing.JLabel jLabel289;
    private javax.swing.JLabel jLabel29;
    public static javax.swing.JLabel jLabel290;
    public static javax.swing.JLabel jLabel291;
    public static javax.swing.JLabel jLabel292;
    public static javax.swing.JLabel jLabel293;
    public static javax.swing.JLabel jLabel294;
    public static javax.swing.JLabel jLabel295;
    public static javax.swing.JLabel jLabel296;
    public static javax.swing.JLabel jLabel297;
    public static javax.swing.JLabel jLabel298;
    public static javax.swing.JLabel jLabel299;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    public static javax.swing.JLabel jLabel300;
    public static javax.swing.JLabel jLabel301;
    public static javax.swing.JLabel jLabel302;
    public static javax.swing.JLabel jLabel303;
    public static javax.swing.JLabel jLabel304;
    public static javax.swing.JLabel jLabel305;
    public static javax.swing.JLabel jLabel306;
    public static javax.swing.JLabel jLabel307;
    public static javax.swing.JLabel jLabel308;
    public static javax.swing.JLabel jLabel309;
    private javax.swing.JLabel jLabel31;
    public static javax.swing.JLabel jLabel310;
    public static javax.swing.JLabel jLabel311;
    public static javax.swing.JLabel jLabel312;
    public static javax.swing.JLabel jLabel313;
    public static javax.swing.JLabel jLabel314;
    public static javax.swing.JLabel jLabel315;
    public static javax.swing.JLabel jLabel316;
    public static javax.swing.JLabel jLabel317;
    public static javax.swing.JLabel jLabel318;
    public static javax.swing.JLabel jLabel319;
    private javax.swing.JLabel jLabel32;
    public static javax.swing.JLabel jLabel320;
    public static javax.swing.JLabel jLabel321;
    public static javax.swing.JLabel jLabel322;
    public static javax.swing.JLabel jLabel323;
    public static javax.swing.JLabel jLabel324;
    public static javax.swing.JLabel jLabel325;
    public static javax.swing.JLabel jLabel326;
    public static javax.swing.JLabel jLabel327;
    public static javax.swing.JLabel jLabel328;
    public static javax.swing.JLabel jLabel329;
    private javax.swing.JLabel jLabel33;
    public static javax.swing.JLabel jLabel330;
    public static javax.swing.JLabel jLabel331;
    public static javax.swing.JLabel jLabel332;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel32;
    private javax.swing.JPanel jPanel33;
    private javax.swing.JPanel jPanel34;
    private javax.swing.JPanel jPanel35;
    private javax.swing.JPanel jPanel36;
    private javax.swing.JPanel jPanel37;
    private javax.swing.JPanel jPanel38;
    private javax.swing.JPanel jPanel39;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel40;
    private javax.swing.JPanel jPanel41;
    private javax.swing.JPanel jPanel42;
    private javax.swing.JPanel jPanel43;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel65;
    private javax.swing.JPanel jPanel66;
    private javax.swing.JPanel jPanel67;
    private javax.swing.JPanel jPanel68;
    private javax.swing.JPanel jPanel69;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel70;
    private javax.swing.JPanel jPanel71;
    private javax.swing.JPanel jPanel72;
    private javax.swing.JPanel jPanel73;
    private javax.swing.JPanel jPanel74;
    private javax.swing.JPanel jPanel75;
    private javax.swing.JPanel jPanel76;
    private javax.swing.JPanel jPanel77;
    private javax.swing.JPanel jPanel78;
    private javax.swing.JPanel jPanel79;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel80;
    private javax.swing.JPanel jPanel81;
    private javax.swing.JPanel jPanel82;
    private javax.swing.JPanel jPanel83;
    private javax.swing.JPanel jPanel84;
    private javax.swing.JPanel jPanel85;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    public static javax.swing.JTextField jTextField4;
    public static javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JPanel loginpanal;
    private javax.swing.JPanel loginpanel;
    private javax.swing.JPanel logopanel;
    public static javax.swing.JPanel mainpanel;
    private javax.swing.JPanel navpanel;
    private javax.swing.JPanel privacy;
    private javax.swing.JPanel returnexchange;
    private javax.swing.JPanel servicepanell;
    private javax.swing.JPanel signuppanal;
    private javax.swing.JPanel terms;
    // End of variables declaration//GEN-END:variables
}
