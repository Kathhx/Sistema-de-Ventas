
package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.List;


public class ClienteDAO {
    conexion cn=new conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    
    
    //FUNCION REGISTRAR CLIENTE
    public boolean RegistrarCliente(Cliente cl){
        String sql="insert into clientes (dpi, nombre,telefono,direccion,razon) values(?,?,?,?,?)";
        try{
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.setInt(1, cl.getDpi());
            ps.setString(2, cl.getNombre());
            ps.setInt(3, cl.getTelefono());
            ps.setString(4, cl.getDireccion());
            ps.setString(5, cl.getRazon());
            ps.execute();
            return true;
            
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.toString());
            return false;
        }finally{
            try{
                con.close();
            }catch(SQLException e){
                System.out.println(e.toString());
            }
        }
        
    }
    //update tabla1 set descripcionProducto="Manzana",precioProducto=5.2 where idProducto=1;
    
    
    //FUNCION MOSTRAR CLIENTE
    public List ListarCliente(){
        List <Cliente> ListaCL=new ArrayList();
        String sql="select * from clientes";
        try{
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                Cliente cl=new Cliente();
                cl.setId(rs.getInt("id"));
                cl.setDpi(rs.getInt("dpi"));
                cl.setNombre(rs.getString("nombre"));
                cl.setTelefono(rs.getInt("telefono"));
                cl.setDireccion(rs.getString("direccion"));
                cl.setRazon(rs.getString("razon"));
                ListaCL.add(cl);
            }
            
        }catch(SQLException e){{
            JOptionPane.showMessageDialog(null, e);
            }
        }
        return ListaCL;
    }

    
    //FUNCION ELIMINAR QUE RECIBE EL ID COMO PARÁNETRO
    public boolean EliminarCLiente(int id){
        String sql="Delete from CLIENTES where id = ?";
        try{
            ps=con.prepareStatement(sql); //preparar la consulta
            ps.setInt(1, id); //Mandar el id al signo de interrogación
            ps.execute(); //ejecutar la consulta
            return true;
            
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.toString());
            return false;
        }
        //CERRAR LA CONEXION
        finally{
            try{
                con.close();
            }catch(SQLException e){
                System.out.println(e.toString());
            }
        }
        
    }
    
    //FUNCION MODIFICAR CLIENTE
    public boolean ModificarCliente(Cliente cl){
        String sql="UPDATE CLIENTES SET dpi=?, nombre=?, telefono=?, direccion=?, razon=? WHERE id=?";
        try{
            ps=con.prepareStatement(sql);
            ps.setInt(1, cl.getDpi());
            ps.setString(2, cl.getNombre());
            ps.setInt(3, cl.getTelefono());
            ps.setString(4, cl.getDireccion());
            ps.setString(5, cl.getRazon());
            ps.setInt(6, cl.getId());
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
    
    public Cliente BuscarCliente(int dpi){
        Cliente cl=new Cliente();
        String sql="Select * from clientes where dpi=?";
        
        try{
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.setInt(1, dpi);
            rs=ps.executeQuery();
            if(rs.next()){
                cl.setNombre(rs.getString("nombre"));
                cl.setTelefono(rs.getInt("telefono"));
                cl.setDireccion(rs.getString("direccion"));
                cl.setRazon(rs.getString("razon"));
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
        return cl;
    }
}


