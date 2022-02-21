/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.team09.shoppingapp;

/**
 *
 * @author user
 */
public class MainPage {
    public String catagery;
    public int id;
    public String price;
    public String name;
    public String link;
    MainPage(String catagery,int id, String price, String name, String link)
    {
        this.price = price;
        this.name = name;
        this.catagery=catagery;
        this.id=id;
        this.link=link;
    }
}
