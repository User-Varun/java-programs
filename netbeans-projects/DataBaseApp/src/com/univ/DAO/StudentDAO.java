/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.univ.DAO;

import com.univ.DB.DBConnection;
import com.univ.DTO.StudentDTO;

import java.sql.*;
import java.util.Vector;

// DAO means data access object

/**
 *
 * @author Varun
 */
public class StudentDAO {
    
    public int insert(StudentDTO dto){
        int x = 0;
        try{
            Connection con1  = DBConnection.getConn();
           PreparedStatement ps =  con1.prepareStatement("insert into student values(? , ? , ? , ? , ? ,? ,? ,?)");
           
           ps.setInt(1, dto.getSid());
           ps.setString(2 , dto.getSname());
           ps.setString(3, dto.getSadd());
           ps.setInt(4 , dto.getMob());
           ps.setString(5, dto.getBranch());
           ps.setString(6, dto.getUnm());
           ps.setString(7, dto.getPw());
           ps.setInt(8, dto.getStatus());
           
           x = ps.executeUpdate();
           
            
        }catch(Exception tt){
            System.out.println(tt);
        }
        return x;
    } // close insert 
    
    
    public int update(StudentDTO dto){
        
        int x = 0;
        try{
           Connection con2 = DBConnection.getConn();
           PreparedStatement ps = con2.prepareStatement("UPDATE student SET sname = ?, sadd = ?, mob = ?, branch = ?, unm = ?, pw = ?, status = ? WHERE sid = ?");

        ps.setString(1, dto.getSname());
        ps.setString(2, dto.getSadd());
        ps.setInt(3, dto.getMob());
        ps.setString(4, dto.getBranch());
        ps.setString(5, dto.getUnm());
        ps.setString(6, dto.getPw());
        ps.setInt(7, dto.getStatus());
        ps.setInt(8, dto.getSid());  // sid in WHERE clause

        x = ps.executeUpdate();

           
            
        }catch(Exception tt){
            System.out.println(tt);
        }
        return x;
        
    }// update close
    
    public int getID(){
        int id = 0;
        
        try{
          Connection con = DBConnection.getConn();
          Statement stm = con.createStatement();
          
         ResultSet rs =  stm.executeQuery("select sid from student");
         
         while(rs.next()){
             id = rs.getInt(1);
         }
         if(id == 0){
             id = 101;
         }else{
             id = id+1;
         }
         
        }catch(Exception tt){System.out.println(tt); }
        
        
        return id;
        
    } // getID close
    
    public Vector GetData(int id){
        Vector v1 = new Vector();
        
        try{
           
            Connection con2 = DBConnection.getConn();
            
            Statement stm = con2.createStatement();
            
            ResultSet rs = stm.executeQuery("select * from student where sid="+id);
            
            
            if(rs.next()){
                
                v1.add(rs.getInt(1));
                v1.add(rs.getString(2));
                v1.add(rs.getString(3));
                v1.add(rs.getString(4));
                v1.add(rs.getString(5));
                v1.add(rs.getString(6));
                v1.add(rs.getString(7));
                
            }
            
        }catch(Exception tt){System.out.println(tt);}
        
        
        return v1;
    }
    
       
} // DAO close
