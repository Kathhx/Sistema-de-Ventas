
package Modelo2;

import Modelo.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class loginDAO {
    
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    conexion cn=new conexion();
    public login log(String correo, String pass){
        login l=new login();
        
        String sql="select * from USUARIOS where correo=? and contraseña=?";
        try{
            con=cn.getConnection();
            ps=con.prepareCall(sql);
            ps.setString(1, correo);
            ps.setString(2,pass);
            rs=ps.executeQuery();
            if(rs.next()){ //recorrer
                l.setId(rs.getInt("id"));
                l.setCorreo(rs.getString("correo"));
                l.setContraseña(rs.getString("contraseña"));
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
        return l;
    }
    
    
    
}
