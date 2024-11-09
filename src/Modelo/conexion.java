
package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class conexion {
   Connection con=null;
   
   public Connection getConnection(){
       try{
           String myBD="jdbc:mysql://localhost:3307/CRUMBL";
           con=DriverManager.getConnection(myBD,"root","Mariposa%11");
       }catch(SQLException e){
           JOptionPane.showMessageDialog(null, e);
       }
       return con;
   }
}
