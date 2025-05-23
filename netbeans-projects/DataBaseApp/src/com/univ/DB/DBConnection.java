/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.univ.DB;

import java.sql.*;
public class DBConnection implements DBConfig {
    
    public static Connection getConn(){
    
    Connection con = null;
    
    try{
        Class.forName(DRIVER);
        con = DriverManager.getConnection(URL , UserName , Password);
 
    }catch(Exception tt){
        System.out.println(tt);
    }
    
    return con;
  }
}
