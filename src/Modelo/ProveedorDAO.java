
package Modelo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.List;

public class ProveedorDAO {
    Connection con;
    conexion cn=new conexion();
    PreparedStatement ps;
    ResultSet rs;
    
    //REGISTRAR PROVEEDOR
    public boolean RegistrarProveedor(Proveedor pr){
     String sql="insert into proveedor (ruc,nombre,telefono,dirreccion,razon) values(?,?,?,?,?)" ;
     try{
         con=cn.getConnection();
         ps=con.prepareStatement(sql);
         ps.setInt(1, pr.getCod());
         ps.setString(2, pr.getNombre());
         ps.setInt(3, pr.getTelefono());
         ps.setString(4, pr.getDireccion());
         ps.setString(5, pr.getRazon());
         ps.execute();
         return true;
         
         
     }catch(SQLException e){
         JOptionPane.showMessageDialog(null, e);
         return false;
         
     }finally{
         try{
             con.close();
         }catch(SQLException e){
             System.out.println(e.toString());
         }
     }
    }

    //MOSTRAR PROVEEDOR
    public List ListarProveedor(){
        List <Proveedor> ListaProveedor=new ArrayList();
        String sql="SELECT * FROM PROVEEDOR";
        try{
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                Proveedor pr=new Proveedor();
                pr.setId(rs.getInt("id"));
                pr.setCod(rs.getInt("ruc"));
                pr.setNombre(rs.getString("nombre"));
                pr.setTelefono(rs.getInt("telefono"));
                pr.setDireccion(rs.getString("dirreccion"));
                pr.setRazon(rs.getString("razon"));
                ListaProveedor.add(pr);
                
                
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
        return ListaProveedor;
    }

    //ELIMINAR PROVEEDOR
    public  boolean EliminarProveedor(int id){
        String sql="DELETE FROM PROVEEDOR WHERE id=?";
        try{
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.setInt(1, id);
            ps.execute();
            return true;
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
            return false;
        }finally{
           
            try{
                 con.close();
            }catch(SQLException e){
                System.out.println(e.toString());
            }
        }
    }

    //MODIFICAR PROVEEDOR
    public boolean ModificarProveedor(Proveedor pr){
        String sql="UPDATE PROVEEDOR SET ruc=?, nombre=?, telefono=?, dirreccion=?, razon=? WHERE id=?";
        
        try{
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.setInt(1, pr.getCod());
            ps.setString(2, pr.getNombre());
            ps.setInt(3, pr.getTelefono());
            ps.setString(4, pr.getDireccion());
            ps.setString(5, pr.getRazon());
            ps.setInt(6, pr.getId());
            ps.execute();
            return true;
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
            return false;
        }finally{
            try{
                con.close();
            }catch(SQLException e){
                System.out.println(e.toString());
            }
        }
    }



}
