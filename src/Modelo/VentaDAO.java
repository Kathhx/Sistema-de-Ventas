
package Modelo;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class VentaDAO {
 
    Connection con;
    conexion cn=new conexion();
    PreparedStatement ps;
    ResultSet rs;
    int r;
    DefaultTableModel modelo;
    
    
    public int IdVenta(){
        int id=0;
        String sql="SELECT MAX(id) FROM VENTAS ";
        try{
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            if(rs.next()){
                id=rs.getInt(1);
            }
            
        }catch(SQLException e){
            System.out.println(e.toString());
        }
        return id;
    }
    
    public int RegistrarVenta(Venta v){
        String sql="insert into ventas (cliente,vendedor,total) values (?,?,?)";
        try{
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.setString(1, v.getCliente());
            ps.setString(2, v.getVendedor());
            ps.setDouble(3, v.getTotal());
            ps.execute();
            
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }finally{
        try{
            con.close();
        }catch(SQLException e){
            System.out.println(e.toString());
        }
    }
        return r;
    }
    
    
    public int RegistrarDetalle(Detalle Dv){
        String sql="insert into DETALLE (codigoProducto,cantidad,precio,idVenta) values (?,?,?,?)";
        try{
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            
            ps.setString(1, Dv.getCodigoProducto());
            ps.setInt(2, Dv.getCantidad());
            ps.setDouble(3, Dv.getPrecio());
            ps.setInt(4, Dv.getIdVenta());
            ps.execute();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }finally{
        try{
            con.close();
        }catch(SQLException e){
            System.out.println(e.toString());
        }
    }
        return r;
    }
    
    public boolean ActualizarStock(int cant,String cod){
        String sql="update PRODUCTOS set cantidad=? where codigo=?";
        
        try{
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.setInt(1, cant);
            ps.setString(2, cod);
            ps.execute();
            return true;
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
            return false;
        }
            
    }
}





