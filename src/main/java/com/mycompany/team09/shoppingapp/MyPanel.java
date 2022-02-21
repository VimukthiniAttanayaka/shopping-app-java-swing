/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.team09.shoppingapp;

import static com.mycompany.team09.shoppingapp.MainFrame.avalibleitem;
import static com.mycompany.team09.shoppingapp.MainFrame.itempagemainimage;
import static com.mycompany.team09.shoppingapp.MainFrame.name1;
import static com.mycompany.team09.shoppingapp.MainFrame.price1;
import static com.mycompany.team09.shoppingapp.MainFrame.sqlconnection;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class MyPanel extends JOptionPane{
    public void item(String catagery, int id) throws SQLException{
        JLabel iname = new JLabel();
        JLabel iprice = new JLabel();
        JLabel iimage = new JLabel();
        JLabel ialable = new JLabel();
        JLabel iaitem = new JLabel();
        JLabel iqlabel = new JLabel();
        JLabel iqitem = new JLabel();
        JLabel idescription = new JLabel();
        JLabel up = new JLabel();
        JLabel down = new JLabel();
        JButton cartsend = new JButton();
        JButton close = new JButton();
        String sql = "select * from " + catagery + " WHERE id = " + id;
        String itemname = null;
        String itemprice = null;
        String itemimage = null;
        String itemquentity = null;
        String itemdescription = null;
        Statement stmt = sqlconnection();
        ResultSet rs = stmt.executeQuery(sql);
        while (rs.next()) {
            itemname = rs.getString(2);
            itemprice = rs.getString(3);
            itemimage = rs.getString(4);
            itemquentity = rs.getString("total_item");
            itemdescription = rs.getString("discription");
        }
        name1 = itemname;
        price1 = itemprice;
        itempagemainimage = itemimage;
        avalibleitem = "4";
        
        
        this.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        iname.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        iname.setText(name1);
        this.add(iname, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 70, 380, 40));
        
        iprice.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        iprice.setText(price1);
        this.add(iprice, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 120, 300, -1));
        
        iimage.setBackground(new java.awt.Color(255, 0, 0));
        iimage.setIcon(new javax.swing.ImageIcon(itempagemainimage));
        iimage.setOpaque(true);
        this.add(iimage, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, 340, 340));

        ialable.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ialable.setText("Avalible Item");
        this.add(ialable, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 170, -1, -1));

        iaitem.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        iaitem.setText(avalibleitem);
        this.add(iaitem, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 170, 90, 20));

        iqlabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        iqlabel.setText("Quentity");
        this.add(iqlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 210, -1, 30));

        up.setBackground(new java.awt.Color(255, 255, 255));
        up.setIcon(new javax.swing.ImageIcon("src/img/up.jpg")); // NOI18N
        up.setOpaque(true);
        this.add(up, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 210, 30, 30));

        /*itemquentity.setBackground(new java.awt.Color(255, 255, 255));
        itemquentity.setOpaque(true);
        this.add(itemquentity, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 210, 30, 30));*/

        down.setBackground(new java.awt.Color(255, 255, 255));
        down.setIcon(new javax.swing.ImageIcon("src/img/down.jpg")); // NOI18N
        down.setOpaque(true);
        this.add(down, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 210, 30, 30));

        idescription.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        idescription.setText("Discription");
        this.add(idescription, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 380, 400, 70));

        cartsend.setBackground(new java.awt.Color(0, 51, 255));
        cartsend.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        cartsend.setText("Add To Cart");
        cartsend.setToolTipText("");
        cartsend.setRolloverEnabled(false);
        this.add(cartsend, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 290, 240, 40));

        close.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        close.setIcon(new javax.swing.ImageIcon("src/img/close.png"));
        close.setToolTipText("");
        this.add(close, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 70, 40, 40));
        this.setBackground(Color.white);      
        close.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);//throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
        });
        
        
        
    }
}
