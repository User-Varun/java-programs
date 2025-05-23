/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package databasedemo;

/**
 *
 * @author Varun
 */

import java.sql.*;

public class DataBaseDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        try{
            
            Class.forName("com.mysql.cj.jdbc.Driver");
//            System.out.println("Driver Open");
            
            
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sait" , "varun" , "1234"); 
            
//            System.out.print("Connection Created");
            

            Statement stmt = con.createStatement();
            
//             stmt.executeUpdate("insert into student values(111 ,'pramod' , 'mumbai' , 8984334 , 'CS' , 'pr123' , '12345' , 0)");
             
             stmt.executeUpdate("insert into student values(112 ,'pramilla' , 'gangu-chameli' , 98260 , 'mangement' , 'sharmilla-tagor' , '12345' , 0)");
            
            
            ResultSet rs = stmt.executeQuery("select * from student");
            
            while(rs.next()){
                
                System.out.print(rs.getInt(1));
                System.out.print(" "+rs.getString(2));
                System.out.print(" "+ rs.getString(3));
                System.out.print(" "+rs.getInt(4));
                System.out.print(" "+rs.getString(5));
                System.out.print(" "+rs.getString(6));
                System.out.print(" "+rs.getString(7));
                System.out.println(" "+rs.getString(8));
            }
            
            
            
        }catch(Exception tt){
            System.out.print(tt);
        }
       
    }
    
}
