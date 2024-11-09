
package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JComboBox;


public class ProductosDAO {
    Connection con;
    conexion cn=new conexion();
    PreparedStatement ps;
    ResultSet rs;
    
    //METODO INSERTAR
    public boolean RegistrarProductos(Productos pro){
        String sql="Insert into productos (codigo,descripcion,cantidad,precio,nombreProveedor) VALUES (?,?,?,?,?)";
        try{
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.setString(1,pro.getCodigo());
            ps.setString(2,pro.getDescripcion());
            ps.setInt(3,pro.getStock());
            ps.setDouble(4,pro.getPrecio());
            ps.setString(5,pro.getProveedor());
            ps.execute();
            return true;
            
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
            return false;
            
        }
    }

    //METODO LISTAR PROVEEDORES EN EL COMBOBOX
    public void CondultarProveedor(JComboBox proveedor){
        String sql="select * from proveedor";
        try{
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                proveedor.addItem(rs.getString("nombre"));
            }
            
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
        
    }

//FUNCION MOSTRAR PRODUCTOS
    public List ListarProductos(){
        List <Productos> ListaPro=new ArrayList();
        String sql="SELECT * FROM PRODUCTOS";
        try{
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                Productos pro=new Productos();
                pro.setId(rs.getInt("id"));
                pro.setCodigo(rs.getString("codigo"));
                pro.setDescripcion(rs.getString("descripcion"));
                pro.setProveedor(rs.getString("nombreProveedor"));
                pro.setStock(rs.getInt("cantidad"));
                pro.setPrecio(rs.getDouble("precio"));
                ListaPro.add(pro);
            }
            
        }catch(SQLException e){{
            JOptionPane.showMessageDialog(null, e);
            }
        }
        return ListaPro;
    }


  //FUNCION ELIMINAR QUE RECIBE EL ID COMO PARÁNETRO
    public boolean EliminarProductos(int id){
        String sql="Delete from PRODUCTOS where id = ?";
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
    
 //FUNCION MODIFICAR PRODUCTO
    public boolean ModificaProductos(Productos pro){
        String sql="UPDATE PRODUCTOS SET codigo=?, descripcion=?, cantidad=?, precio=?, nombreProveedor=? WHERE id=?";
        try{
            ps=con.prepareStatement(sql);
            ps.setString(1, pro.getCodigo());
            ps.setString(2, pro.getDescripcion());
            ps.setInt(3, pro.getStock());
            ps.setDouble(4, pro.getPrecio());
            ps.setString(5, pro.getProveedor());
            ps.setInt(6, pro.getId());
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

    public Productos BuscarProducto(String cod){
        Productos producto=new Productos();
        String sql="Select * from productos where codigo=?";
        try{
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.setString(1, cod);
            rs=ps.executeQuery();
            if(rs.next()){
                producto.setDescripcion(rs.getString("descripcion"));
                producto.setPrecio(rs.getDouble("precio"));
                producto.setStock(rs.getInt("cantidad"));
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
        return producto;

    }
    
    
 public Productos BuscarDescripcionProd(String nom){
     Productos producto=new Productos();
     String sql="Select * from productos where descripcion=?";
     
     try{
         con=cn.getConnection();
         ps=con.prepareStatement(sql);
         ps.setString(1, nom);
         rs=ps.executeQuery();
         if(rs.next()){
             producto.setCodigo(rs.getString("codigo"));
             producto.setStock(rs.getInt("cantidad"));
             producto.setPrecio(rs.getDouble("precio"));
             producto.setDescripcion(rs.getString("nombreProveedor"));
             
         }
     }catch(SQLException e){
         JOptionPane.showMessageDialog(null, e);
     }
     return producto;
    }





}
