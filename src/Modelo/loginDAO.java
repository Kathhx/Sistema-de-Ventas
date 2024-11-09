
package Modelo;

import java.sql.Connection; //Se usa para establecer una conexión con la base de datos.
import java.sql.PreparedStatement; //Permite ejecutar sentencias SQL con parámetros.
import java.sql.ResultSet; //Almacena el resultado de una consulta SQL.
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class loginDAO {
    
    Connection con; // Almacena la conexión a la base de datos
    PreparedStatement ps; //Contendrá el objeto PreparedStatement para ejecutar la consulta SQL
    ResultSet rs; //Guardará el resultado de la consulta SQL.
    conexion cn=new conexion();
    
    public login log(String correo, String pass){
        login l=new login(); //Crear objeto de login
        
        String sql="select * from USUARIOS where correo=? and contraseña=?";
        try{
            con = cn.getConnection(); // Abre la conexión a la base de datos
            ps = con.prepareCall(sql); // Prepara la consulta
            
            ps.setString(1, correo); // Asigna el valor de correo al primer '?'
            ps.setString(2, pass);   // Asigna el valor de pass al segundo '?'
            
            rs = ps.executeQuery();  // Ejecuta la consulta y guarda el resultado en rs
            if(rs.next()){ //Verifica si la consulta encontró un usuario con las credenciales proporcionadas
                l.setId(rs.getInt("id")); //guarda en el objeto l el valor encontrado en la base de datos
                l.setCorreo(rs.getString("correo"));
                l.setContraseña(rs.getString("contraseña"));
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
        return l;
    }
    
    
    
}
