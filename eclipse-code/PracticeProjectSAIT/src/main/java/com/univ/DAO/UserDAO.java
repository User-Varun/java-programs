package com.univ.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.univ.DB.DBConnection;
import com.univ.DTO.UserDTO;

public class UserDAO {
      
	public int insert(UserDTO dto) {
		
		int x = 0;
		
		try {
			
			Connection con1 = DBConnection.getConn();
			
			PreparedStatement ps =  con1.prepareStatement("insert into users(unm , mob , pw) values( ? , ? , ?) ");
			
			
			ps.setString(1 , dto.getUserName());
			ps.setLong(2, dto.getMob());
			ps.setString(3, dto.getPassword());
			
			x = ps.executeUpdate();
			
			
		}catch(Exception tt) {System.out.println(tt);}
		
		return x;
	} // insert close
	
	public List loginCheck(String userName , String password) {
		
		List lst2 = new ArrayList();
		
		try {
			
			Connection con2 = DBConnection.getConn();
			
			PreparedStatement ps = con2.prepareStatement("select * from users where unm=? AND pw=?");
			
			ps.setString(1, userName);
			ps.setString(2, password);
			
			ResultSet rs = ps.executeQuery();
			
			if(rs.next()) {
				lst2.add(rs.getString(1));
				lst2.add(rs.getLong(2));
				lst2.add(rs.getString(3));
             }
			
			
		}catch(Exception tt) {System.out.println(tt); }
		
		return lst2;
		
	} // loginCheck close
}
