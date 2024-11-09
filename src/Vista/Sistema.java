package Vista;


import Modelo.Cliente;
import Modelo.ClienteDAO;
import Modelo.Detalle;
import Modelo.Productos;
import Modelo.ProductosDAO;
import Modelo.Proveedor;
import Modelo.ProveedorDAO;
import Modelo.Venta;
import Modelo.VentaDAO;
import Modelo.conexion;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.io.File;
import java.sql.Statement;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;


public class Sistema extends javax.swing.JFrame {

    
    
    void mostrar(String valor) {
    conexion cn=new conexion();
    Connection cc=cn.getConnection();
    DefaultTableModel tx;
    try {
        String[] titulo = {"ID", "CODIGO", "DESCRIPCION", "CANTIDAD", "PRECIO", "PROVEEDOR"};
        String sql = "select * from PRODUCTOS where descripcion like '%" + valor + "%'";
        tx = new DefaultTableModel(null, titulo);
        Statement xx = cc.createStatement();
        ResultSet go = xx.executeQuery(sql);
        String[] fila = new String[10];
        
        while (go.next()) {
            fila[0] = go.getString("id");
            fila[1] = go.getString("codigo");
            fila[2] = go.getString("descripcion");
            fila[3] = go.getString("cantidad");
            fila[4] = go.getString("precio");
            fila[5] = go.getString("nombreProveedor");
            tx.addRow(fila);
        }
        
        tablaProdBuscado.setModel(tx);
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error" + e);
    }finally{
        try{
            cc.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
}

    
    
    Cliente cl=new Cliente();
    ClienteDAO client=new ClienteDAO();
    
    DefaultTableModel modelo = new DefaultTableModel();
    
    Proveedor pr=new Proveedor();
    ProveedorDAO prDao=new ProveedorDAO();
    
    Productos pro=new Productos();
    ProductosDAO proDao= new ProductosDAO(); 
    
    int item;
    double totalPagar=0.00;
    
    Venta v=new Venta();
    VentaDAO vDao=new VentaDAO();
    
    Detalle Dv=new Detalle();
    
     DefaultTableModel modelo2= new DefaultTableModel();
    
     
      
    public Sistema() {
        initComponents();
        this.setLocationRelativeTo(null);
        txtIdCliente.setVisible(false);
        txtIdProveedor.setVisible(false);
        txtidProduct.setVisible(false);
        txtIdVenta.setVisible(false);
        txtTelefonoClienteVenta.setVisible(false);
        txtDireccionClienteVenta.setVisible(false);
        txtRazonClienteVenta.setVisible(false);
        proDao.CondultarProveedor(cmbProveedorProduct);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        btnNuevaVenta = new javax.swing.JButton();
        btnClientes = new javax.swing.JButton();
        btnProveedor = new javax.swing.JButton();
        btnProductos = new javax.swing.JButton();
        btnVentas = new javax.swing.JButton();
        lblLogo1 = new javax.swing.JLabel();
        lblVendedor = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtCodigoVenta = new javax.swing.JTextField();
        txtDescripcionVenta = new javax.swing.JTextField();
        txtCantidadVenta = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtPrecioVenta = new javax.swing.JTextField();
        txtStockVenta = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaVenta = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        txtRucVenta = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtNombreClienteVenta = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        btnEliminarVenta = new javax.swing.JButton();
        btnGenerarVenta = new javax.swing.JButton();
        txtTelefonoClienteVenta = new javax.swing.JTextField();
        txtDireccionClienteVenta = new javax.swing.JTextField();
        txtRazonClienteVenta = new javax.swing.JTextField();
        lblTotal = new javax.swing.JLabel();
        txtIdVenta = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        txtDPICliente = new javax.swing.JTextField();
        txtDireccionCliente = new javax.swing.JTextField();
        txtTelefonoCliente = new javax.swing.JTextField();
        txtRazonCliente = new javax.swing.JTextField();
        txtNombreCliente = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaCliente = new javax.swing.JTable();
        btnGuardarCliente = new javax.swing.JButton();
        btnEditarCliente = new javax.swing.JButton();
        btnNuevoCliente = new javax.swing.JButton();
        btnEliminarCliente = new javax.swing.JButton();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        txtIdCliente = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        txtRucProveedor = new javax.swing.JTextField();
        txtNombreProveedor = new javax.swing.JTextField();
        txtTelefonoProveedor = new javax.swing.JTextField();
        txtDireccionProveedor = new javax.swing.JTextField();
        txtRazonProveedor = new javax.swing.JTextField();
        jScrollPane5 = new javax.swing.JScrollPane();
        tablaProveedor = new javax.swing.JTable();
        btnGuardarProveedor = new javax.swing.JButton();
        btnEditarProveedor = new javax.swing.JButton();
        btnEliminarProveedor = new javax.swing.JButton();
        btnNuevoProveedor = new javax.swing.JButton();
        txtIdProveedor = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        txtCodigoProduct = new javax.swing.JTextField();
        txtDescripcionProduct = new javax.swing.JTextField();
        txtCantidadProduct = new javax.swing.JTextField();
        txtPrecioProduct = new javax.swing.JTextField();
        cmbProveedorProduct = new javax.swing.JComboBox<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        tablaProducto = new javax.swing.JTable();
        btnGuardarProduct = new javax.swing.JButton();
        btnEditarProduct = new javax.swing.JButton();
        btnEliminarProduct = new javax.swing.JButton();
        btnNuevoProduct = new javax.swing.JButton();
        txtidProduct = new javax.swing.JTextField();
        btnExcelProduct = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        tablaProdBuscado = new javax.swing.JTable();
        btnGuardarCliente1 = new javax.swing.JButton();
        txtBuscarNombreProd = new javax.swing.JTextField();
        jLabel45 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        lblFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        btnNuevaVenta.setBackground(new java.awt.Color(204, 204, 255));
        btnNuevaVenta.setFont(new java.awt.Font("MingLiU_HKSCS-ExtB", 1, 12)); // NOI18N
        btnNuevaVenta.setText("NUEVA VENTA");
        btnNuevaVenta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNuevaVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevaVentaActionPerformed(evt);
            }
        });

        btnClientes.setBackground(new java.awt.Color(204, 204, 255));
        btnClientes.setFont(new java.awt.Font("MingLiU_HKSCS-ExtB", 1, 12)); // NOI18N
        btnClientes.setText("CLIENTES");
        btnClientes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClientesActionPerformed(evt);
            }
        });

        btnProveedor.setBackground(new java.awt.Color(204, 204, 255));
        btnProveedor.setFont(new java.awt.Font("MingLiU_HKSCS-ExtB", 1, 12)); // NOI18N
        btnProveedor.setText("PROVEEDOR");
        btnProveedor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProveedorActionPerformed(evt);
            }
        });

        btnProductos.setBackground(new java.awt.Color(204, 204, 255));
        btnProductos.setFont(new java.awt.Font("MingLiU_HKSCS-ExtB", 1, 12)); // NOI18N
        btnProductos.setText("PRODUCTOS");
        btnProductos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProductosActionPerformed(evt);
            }
        });

        btnVentas.setBackground(new java.awt.Color(204, 204, 255));
        btnVentas.setFont(new java.awt.Font("MingLiU_HKSCS-ExtB", 1, 12)); // NOI18N
        btnVentas.setText("BUSCAR PROD");
        btnVentas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVentasActionPerformed(evt);
            }
        });

        lblLogo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Crumlogo.png"))); // NOI18N
        lblLogo1.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                lblLogo1ComponentResized(evt);
            }
        });

        lblVendedor.setText("Katherine");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblLogo1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(btnClientes, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnNuevaVenta, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                    .addComponent(btnProductos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnProveedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnVentas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(lblVendedor)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addComponent(lblLogo1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblVendedor)
                .addGap(16, 16, 16)
                .addComponent(btnNuevaVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(btnProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(btnVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, 470));

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("MingLiU_HKSCS-ExtB", 1, 14)); // NOI18N
        jLabel3.setText("CODIGO");

        jLabel4.setFont(new java.awt.Font("MingLiU_HKSCS-ExtB", 1, 14)); // NOI18N
        jLabel4.setText("DESCRIPCIÓN");

        jLabel5.setFont(new java.awt.Font("MingLiU_HKSCS-ExtB", 1, 14)); // NOI18N
        jLabel5.setText("CANTIDAD");

        txtCodigoVenta.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtCodigoVenta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCodigoVentaKeyPressed(evt);
            }
        });

        txtDescripcionVenta.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        txtCantidadVenta.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtCantidadVenta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCantidadVentaKeyPressed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("MingLiU_HKSCS-ExtB", 1, 14)); // NOI18N
        jLabel6.setText("PRECIO");

        txtPrecioVenta.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        txtStockVenta.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jLabel7.setFont(new java.awt.Font("MingLiU_HKSCS-ExtB", 1, 14)); // NOI18N
        jLabel7.setText("STOCK");

        tablaVenta.setBackground(new java.awt.Color(204, 204, 255));
        tablaVenta.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        tablaVenta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CODIGO", "DESCRIPCIÓN", "CANTIDAD", "PRECIO", "TOTAL"
            }
        ));
        jScrollPane1.setViewportView(tablaVenta);
        if (tablaVenta.getColumnModel().getColumnCount() > 0) {
            tablaVenta.getColumnModel().getColumn(0).setPreferredWidth(30);
            tablaVenta.getColumnModel().getColumn(1).setPreferredWidth(100);
            tablaVenta.getColumnModel().getColumn(2).setPreferredWidth(30);
            tablaVenta.getColumnModel().getColumn(3).setPreferredWidth(30);
            tablaVenta.getColumnModel().getColumn(4).setPreferredWidth(30);
        }

        jLabel9.setFont(new java.awt.Font("MingLiU-ExtB", 1, 12)); // NOI18N
        jLabel9.setText("DPI_CLIENTE");

        txtRucVenta.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtRucVenta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtRucVentaKeyPressed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("MingLiU-ExtB", 1, 12)); // NOI18N
        jLabel10.setText("NOMBRE_CLIENTE:");

        txtNombreClienteVenta.setEditable(false);
        txtNombreClienteVenta.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jLabel12.setFont(new java.awt.Font("MingLiU-ExtB", 1, 12)); // NOI18N
        jLabel12.setText("TOTAL PAGO:");

        btnEliminarVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/borrar.png"))); // NOI18N
        btnEliminarVenta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminarVenta.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                btnEliminarVentaComponentResized(evt);
            }
        });
        btnEliminarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarVentaActionPerformed(evt);
            }
        });

        btnGenerarVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/impresora.png"))); // NOI18N
        btnGenerarVenta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGenerarVenta.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                btnGenerarVentaComponentResized(evt);
            }
        });
        btnGenerarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarVentaActionPerformed(evt);
            }
        });

        txtTelefonoClienteVenta.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N

        txtDireccionClienteVenta.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N

        txtRazonClienteVenta.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N

        lblTotal.setFont(new java.awt.Font("MingLiU_HKSCS-ExtB", 1, 14)); // NOI18N

        jLabel11.setFont(new java.awt.Font("Bernard MT Condensed", 0, 24)); // NOI18N
        jLabel11.setText("INGRESAR VENTA");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(138, 138, 138)
                        .addComponent(txtIdVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(106, 106, 106))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtRucVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtNombreClienteVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(txtTelefonoClienteVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDireccionClienteVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtRazonClienteVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(btnGenerarVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(61, 61, 61)
                        .addComponent(jLabel12)
                        .addGap(27, 27, 27)
                        .addComponent(lblTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCodigoVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(80, 80, 80))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtDescripcionVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCantidadVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPrecioVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtStockVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btnEliminarVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 749, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txtIdVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel11)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCodigoVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDescripcionVenta)
                            .addComponent(txtCantidadVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(6, 6, 6)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtPrecioVenta, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtStockVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(btnEliminarVenta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnGenerarVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtNombreClienteVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtRucVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtTelefonoClienteVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtDireccionClienteVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtRazonClienteVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("tab1", jPanel1);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        tablaCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "DPI", "NOMBRE", "TELEFONO", "DIRECCION", "RAZON"
            }
        ));
        tablaCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaClienteMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tablaCliente);
        if (tablaCliente.getColumnModel().getColumnCount() > 0) {
            tablaCliente.getColumnModel().getColumn(0).setPreferredWidth(20);
            tablaCliente.getColumnModel().getColumn(1).setPreferredWidth(80);
            tablaCliente.getColumnModel().getColumn(2).setPreferredWidth(80);
            tablaCliente.getColumnModel().getColumn(3).setPreferredWidth(80);
            tablaCliente.getColumnModel().getColumn(4).setPreferredWidth(80);
            tablaCliente.getColumnModel().getColumn(5).setPreferredWidth(80);
        }

        btnGuardarCliente.setBackground(new java.awt.Color(255, 204, 255));
        btnGuardarCliente.setText("GUARDAR");
        btnGuardarCliente.setBorder(null);
        btnGuardarCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGuardarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarClienteActionPerformed(evt);
            }
        });

        btnEditarCliente.setBackground(new java.awt.Color(255, 153, 153));
        btnEditarCliente.setText("EDITAR");
        btnEditarCliente.setBorder(null);
        btnEditarCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEditarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarClienteActionPerformed(evt);
            }
        });

        btnNuevoCliente.setBackground(new java.awt.Color(204, 255, 255));
        btnNuevoCliente.setText("NUEVO");
        btnNuevoCliente.setBorder(null);
        btnNuevoCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNuevoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoClienteActionPerformed(evt);
            }
        });

        btnEliminarCliente.setBackground(new java.awt.Color(255, 255, 204));
        btnEliminarCliente.setText("ELIMINAR");
        btnEliminarCliente.setBorder(null);
        btnEliminarCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarClienteActionPerformed(evt);
            }
        });

        jLabel35.setFont(new java.awt.Font("MingLiU-ExtB", 1, 12)); // NOI18N
        jLabel35.setText("DPI:");

        jLabel36.setFont(new java.awt.Font("MingLiU-ExtB", 1, 12)); // NOI18N
        jLabel36.setText("NOMBRE:");

        jLabel37.setFont(new java.awt.Font("MingLiU-ExtB", 1, 12)); // NOI18N
        jLabel37.setText("TELEFONO: ");

        jLabel38.setFont(new java.awt.Font("MingLiU-ExtB", 1, 12)); // NOI18N
        jLabel38.setText("DIRECCIÓN:");

        jLabel39.setFont(new java.awt.Font("MingLiU-ExtB", 1, 12)); // NOI18N
        jLabel39.setText("RAZÓN SOCIAL:");

        jLabel13.setFont(new java.awt.Font("Bernard MT Condensed", 0, 24)); // NOI18N
        jLabel13.setText("INGRESAR CLIENTES");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(24, 24, 24)
                                .addComponent(txtDireccionCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(24, 24, 24))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                        .addComponent(txtIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(43, 43, 43)))
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtTelefonoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtDPICliente, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtRazonCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(btnGuardarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnEditarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(btnEliminarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnNuevoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(26, 26, 26)))
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 543, Short.MAX_VALUE)
                .addGap(18, 18, 18))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(256, 256, 256))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDPICliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel35))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel36))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTelefonoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel37))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDireccionCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel38))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtRazonCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel39))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnGuardarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEditarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnNuevoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEliminarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51))
        );

        jTabbedPane1.addTab("tab2", jPanel3);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jLabel24.setFont(new java.awt.Font("MingLiU-ExtB", 1, 12)); // NOI18N
        jLabel24.setText("RUC:");

        jLabel25.setFont(new java.awt.Font("MingLiU-ExtB", 1, 12)); // NOI18N
        jLabel25.setText("NOMBRE:");

        jLabel26.setFont(new java.awt.Font("MingLiU-ExtB", 1, 12)); // NOI18N
        jLabel26.setText("TELEFONO: ");

        jLabel27.setFont(new java.awt.Font("MingLiU-ExtB", 1, 12)); // NOI18N
        jLabel27.setText("DIRECCIÓN:");

        jLabel28.setFont(new java.awt.Font("MingLiU-ExtB", 1, 12)); // NOI18N
        jLabel28.setText("RAZÓN SOCIAL:");

        tablaProveedor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "CODIGO", "NOMBRE:", "TELÉFONO", "DIRECCIÓN", "RAZÓN SOCIAL"
            }
        ));
        tablaProveedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaProveedorMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(tablaProveedor);
        if (tablaProveedor.getColumnModel().getColumnCount() > 0) {
            tablaProveedor.getColumnModel().getColumn(0).setPreferredWidth(20);
            tablaProveedor.getColumnModel().getColumn(1).setPreferredWidth(50);
            tablaProveedor.getColumnModel().getColumn(2).setPreferredWidth(50);
            tablaProveedor.getColumnModel().getColumn(3).setPreferredWidth(50);
            tablaProveedor.getColumnModel().getColumn(4).setPreferredWidth(50);
            tablaProveedor.getColumnModel().getColumn(5).setPreferredWidth(50);
        }

        btnGuardarProveedor.setBackground(new java.awt.Color(255, 204, 255));
        btnGuardarProveedor.setText("GUARDAR");
        btnGuardarProveedor.setBorder(null);
        btnGuardarProveedor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGuardarProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarProveedorActionPerformed(evt);
            }
        });

        btnEditarProveedor.setBackground(new java.awt.Color(255, 153, 153));
        btnEditarProveedor.setText("EDITAR");
        btnEditarProveedor.setBorder(null);
        btnEditarProveedor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEditarProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarProveedorActionPerformed(evt);
            }
        });

        btnEliminarProveedor.setBackground(new java.awt.Color(255, 255, 204));
        btnEliminarProveedor.setText("ELIMINAR");
        btnEliminarProveedor.setBorder(null);
        btnEliminarProveedor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminarProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarProveedorActionPerformed(evt);
            }
        });

        btnNuevoProveedor.setBackground(new java.awt.Color(204, 255, 255));
        btnNuevoProveedor.setText("NUEVO");
        btnNuevoProveedor.setBorder(null);
        btnNuevoProveedor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNuevoProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoProveedorActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Bernard MT Condensed", 0, 24)); // NOI18N
        jLabel8.setText("INGRESAR PROVEEDOR");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addGap(17, 17, 17)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(txtIdProveedor, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel24, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)))
                                    .addGap(24, 24, 24)
                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtTelefonoProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtRucProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtNombreProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtRazonProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(24, 24, 24)
                            .addComponent(txtDireccionProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addComponent(btnGuardarProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnEditarProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addComponent(btnEliminarProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnNuevoProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 544, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(272, 272, 272))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addComponent(txtIdProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtRucProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel24))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNombreProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel25))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTelefonoProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel26))
                        .addGap(22, 22, 22)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDireccionProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel27))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtRazonProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel28))
                        .addGap(34, 34, 34)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnGuardarProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEditarProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnNuevoProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEliminarProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );

        jTabbedPane1.addTab("tab3", jPanel4);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jLabel29.setFont(new java.awt.Font("MingLiU_HKSCS-ExtB", 1, 12)); // NOI18N
        jLabel29.setText("CODIGO:");

        jLabel30.setFont(new java.awt.Font("MingLiU_HKSCS-ExtB", 1, 12)); // NOI18N
        jLabel30.setText("DESCRIPCION:");

        jLabel31.setFont(new java.awt.Font("MingLiU_HKSCS-ExtB", 1, 12)); // NOI18N
        jLabel31.setText("CANTIDAD:");

        jLabel32.setFont(new java.awt.Font("MingLiU_HKSCS-ExtB", 1, 12)); // NOI18N
        jLabel32.setText("PRECIO:");

        jLabel33.setFont(new java.awt.Font("MingLiU_HKSCS-ExtB", 1, 12)); // NOI18N
        jLabel33.setText("PROVEEDOR:");

        cmbProveedorProduct.setEditable(true);

        tablaProducto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "CODIGO", "DESCRIPCION", "PROVEEDOR", "STOCK", "PRECIO"
            }
        ));
        tablaProducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaProductoMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tablaProducto);
        if (tablaProducto.getColumnModel().getColumnCount() > 0) {
            tablaProducto.getColumnModel().getColumn(0).setPreferredWidth(20);
            tablaProducto.getColumnModel().getColumn(1).setPreferredWidth(50);
            tablaProducto.getColumnModel().getColumn(2).setPreferredWidth(100);
            tablaProducto.getColumnModel().getColumn(3).setPreferredWidth(60);
            tablaProducto.getColumnModel().getColumn(4).setPreferredWidth(40);
            tablaProducto.getColumnModel().getColumn(5).setPreferredWidth(50);
        }

        btnGuardarProduct.setBackground(new java.awt.Color(255, 204, 255));
        btnGuardarProduct.setText("GUARDAR");
        btnGuardarProduct.setBorder(null);
        btnGuardarProduct.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGuardarProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarProductActionPerformed(evt);
            }
        });

        btnEditarProduct.setBackground(new java.awt.Color(255, 153, 153));
        btnEditarProduct.setText("EDITAR");
        btnEditarProduct.setBorder(null);
        btnEditarProduct.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEditarProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarProductActionPerformed(evt);
            }
        });

        btnEliminarProduct.setBackground(new java.awt.Color(255, 255, 204));
        btnEliminarProduct.setText("ELIMINAR");
        btnEliminarProduct.setBorder(null);
        btnEliminarProduct.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminarProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarProductActionPerformed(evt);
            }
        });

        btnNuevoProduct.setBackground(new java.awt.Color(204, 255, 255));
        btnNuevoProduct.setText("NUEVO");
        btnNuevoProduct.setBorder(null);
        btnNuevoProduct.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        btnExcelProduct.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/exc.jpg"))); // NOI18N
        btnExcelProduct.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnExcelProduct.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                btnExcelProductComponentResized(evt);
            }
        });
        btnExcelProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcelProductActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Bernard MT Condensed", 0, 24)); // NOI18N
        jLabel14.setText("INGRESAR PRODUCTOS");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel32, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtPrecioProduct, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                                    .addComponent(txtCantidadProduct, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                                    .addComponent(cmbProveedorProduct, 0, 0, Short.MAX_VALUE)))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel30)
                                    .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtDescripcionProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCodigoProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnGuardarProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnEliminarProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnNuevoProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnEditarProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 539, Short.MAX_VALUE)
                        .addGap(11, 11, 11))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(txtidProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(167, 167, 167)
                        .addComponent(btnExcelProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28))))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(txtidProduct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(btnExcelProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel29)
                            .addComponent(txtCodigoProduct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel30)
                            .addComponent(txtDescripcionProduct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel31)
                            .addComponent(txtCantidadProduct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel32))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addComponent(jLabel33))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(txtPrecioProduct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cmbProveedorProduct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnGuardarProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEditarProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnEliminarProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnNuevoProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(38, 38, 38))
        );

        jTabbedPane1.addTab("tab4", jPanel5);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        tablaProdBuscado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane6.setViewportView(tablaProdBuscado);

        btnGuardarCliente1.setBackground(new java.awt.Color(255, 204, 255));
        btnGuardarCliente1.setText("BUSCAR");
        btnGuardarCliente1.setBorder(null);
        btnGuardarCliente1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGuardarCliente1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarCliente1ActionPerformed(evt);
            }
        });

        jLabel45.setFont(new java.awt.Font("MingLiU-ExtB", 1, 12)); // NOI18N
        jLabel45.setText("PRODUCTO A BUSCAR");

        jLabel15.setFont(new java.awt.Font("Bernard MT Condensed", 0, 24)); // NOI18N
        jLabel15.setText("BUSCAR PRODUCTO POR DESCRIPCION");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane6)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtBuscarNombreProd, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 98, Short.MAX_VALUE)
                        .addComponent(btnGuardarCliente1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(161, 161, 161)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(202, 202, 202))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addComponent(jLabel15)
                .addGap(39, 39, 39)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBuscarNombreProd, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGuardarCliente1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel45))
                .addGap(29, 29, 29)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66))
        );

        jTabbedPane1.addTab("tab5", jPanel6);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, -1, 460));

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/crumbl45.jpg"))); // NOI18N
        lblFondo.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                lblFondoComponentResized(evt);
            }
        });
        getContentPane().add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 970, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    

    //FUNCION LISTAR LOS CLIENTES EN LA TABLA
    public void ListarCliente(){
        List<Cliente> ListarCL=client.ListarCliente();
        modelo=(DefaultTableModel) tablaCliente.getModel();
        Object [] ob =new Object[6];
        for (int i = 0; i < ListarCL.size(); i++) {
            ob[0]=ListarCL.get(i).getId();
            ob[1]=ListarCL.get(i).getDpi();
            ob[2]=ListarCL.get(i).getNombre();
            ob[3]=ListarCL.get(i).getTelefono();
            ob[4]=ListarCL.get(i).getDireccion();
            ob[5]=ListarCL.get(i).getRazon();
            modelo.addRow(ob);
            tablaCliente.setModel(modelo);
            
        }
    }
    
    //FUNCION LISTAR LOS PROVEEDOR EN LA TABLA
    public void ListarProveedor(){
        List<Proveedor> ListarPr=prDao.ListarProveedor();
        modelo=(DefaultTableModel) tablaProveedor.getModel();
        Object [] ob =new Object[6];
        for (int i = 0; i < ListarPr.size(); i++) {
            ob[0]=ListarPr.get(i).getId();
            ob[1]=ListarPr.get(i).getCod();
            ob[2]=ListarPr.get(i).getNombre();
            ob[3]=ListarPr.get(i).getTelefono();
            ob[4]=ListarPr.get(i).getDireccion();
            ob[5]=ListarPr.get(i).getRazon();
            modelo.addRow(ob);
            tablaProveedor.setModel(modelo);
            
        }
    }
    
    //FUNCON LISTRAR LOS PRODUCTOS
    public void ListarProductos(){
        List<Productos> ListarPro=proDao.ListarProductos();
        modelo=(DefaultTableModel) tablaProducto.getModel();
        Object [] ob =new Object[6];
        for (int i = 0; i < ListarPro.size(); i++) {
            ob[0]=ListarPro.get(i).getId();
            ob[1]=ListarPro.get(i).getCodigo();
            ob[2]=ListarPro.get(i).getDescripcion();
            ob[3]=ListarPro.get(i).getProveedor();
            ob[4]=ListarPro.get(i).getStock();
            ob[5]=ListarPro.get(i).getPrecio();
            
            modelo.addRow(ob);
            tablaProducto.setModel(modelo);
        }
    }
 
    
    
    
    //FUNCION LIMPIAR TABLA
    public void LimpiarTabla(){
        for (int i = 0; i < modelo.getRowCount(); i++) {
            modelo.removeRow(i);
            i=i-1;
        }
    }
    
    private void limpiarTablaVenta(){
      modelo2=(DefaultTableModel) tablaVenta.getModel();
      int filas=tablaVenta.getRowCount();
        for (int i = 0; i < filas; i++) {
            modelo2.removeRow(0);
        }
    }
    
    
    
    //LIMPIAR LAS CAJITAS DEL CLIENTE 
    private void LimpiarCliente(){
        txtIdCliente.setText("");
        txtDPICliente.setText("");
        txtNombreCliente.setText("");
        txtTelefonoCliente.setText("");
        txtDireccionCliente.setText("");
        txtRazonCliente.setText("");
    } 
   
    
    //LIMPIAR LAS CAJITAS DEL PROVEEDOR
    private void LimpiarProveedor(){
        txtIdProveedor.setText("");
        txtRucProveedor.setText("");
        txtNombreProveedor.setText("");
        txtTelefonoProveedor.setText("");
        txtDireccionProveedor.setText("");
        txtRazonProveedor.setText("");
    }
    
    //LIMPIAR LAS CAJITAS DEL PRODUCTOS
    private void LimpiarProductos(){
        txtidProduct.setText("");
        txtCodigoProduct.setText("");
        txtDescripcionProduct.setText("");
        txtCantidadProduct.setText("");
        txtPrecioProduct.setText("");
        cmbProveedorProduct.setSelectedItem(null);
    }
    
    //LIMPIAR VENTAS
        private void limpiarVenta(){
        txtCodigoVenta.setText("");
        txtDescripcionVenta.setText("");
        txtCantidadVenta.setText("");
        txtStockVenta.setText("");
        txtPrecioVenta.setText("");
        txtIdVenta.setText("");
    }
    
    //LIMPIAR LOS DATOS DEL CLIENTE DE LA VENTA
        private void LimpiarClienteVenta(){
            txtRucVenta.setText("");
            txtNombreClienteVenta.setText("");
            txtTelefonoClienteVenta.setText("");
            txtDireccionClienteVenta.setText("");
            txtRazonClienteVenta.setText("");
        }
    
//------------------------------EVENTO RESIZED PARA ADAPTAR LAS IMAGENES A LAS ETIQUETAS---------------------------------------------------------------------------------------
    
    private void lblFondoComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_lblFondoComponentResized
        int ancho = lblFondo.getWidth();
        int largo = lblFondo.getHeight();
        ImageIcon icon = (ImageIcon) lblFondo.getIcon();
        if (icon != null) {
            Image imagen = icon.getImage();
            Image medidas = imagen.getScaledInstance(ancho, largo, Image.SCALE_SMOOTH);
            lblFondo.setIcon(new ImageIcon(medidas));
        }

    }//GEN-LAST:event_lblFondoComponentResized
 
    private void lblLogo1ComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_lblLogo1ComponentResized
        // Obtener el ancho y alto actuales del JLabel
        int labelWidth = lblLogo1.getWidth();
        int labelHeight = lblLogo1.getHeight();

        // Obtener el icono actual del JLabel (que ya cargaste desde las propiedades)
        ImageIcon icon = (ImageIcon) lblLogo1.getIcon();

        if (icon != null) {
            // Obtener la imagen desde el icono
            Image originalImage = icon.getImage();

            // Escalar la imagen al tamaño del JLabel
            Image scaledImage = originalImage.getScaledInstance(labelWidth, labelHeight, Image.SCALE_SMOOTH);

            // Establecer la imagen redimensionada en el JLabel
            lblLogo1.setIcon(new ImageIcon(scaledImage));
        }
    }//GEN-LAST:event_lblLogo1ComponentResized

    private void btnEliminarVentaComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_btnEliminarVentaComponentResized
        // TODO add your handling code here:
        int ancho = btnEliminarVenta.getWidth();
        int largo = btnEliminarVenta.getHeight();

        ImageIcon icon = (ImageIcon) btnEliminarVenta.getIcon();
        if (icon != null) {
            Image imagen = icon.getImage();
            Image medidas = imagen.getScaledInstance(ancho, largo, Image.SCALE_SMOOTH);
            btnEliminarVenta.setIcon(new ImageIcon(medidas));
        }
    }//GEN-LAST:event_btnEliminarVentaComponentResized

    private void btnGenerarVentaComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_btnGenerarVentaComponentResized
        // TODO add your handling code here:
        int ancho = btnGenerarVenta.getWidth();
        int largo = btnGenerarVenta.getHeight();

        ImageIcon icon = (ImageIcon) btnGenerarVenta.getIcon();
        if (icon != null) {
            Image imagen = icon.getImage();
            Image medidas = imagen.getScaledInstance(ancho, largo, Image.SCALE_SMOOTH);
            btnGenerarVenta.setIcon(new ImageIcon(medidas));
        }
    }//GEN-LAST:event_btnGenerarVentaComponentResized

    
    
//----------------------------------------BOTONES PARA EL CLIENTE-------------------------------------------------------------------------------    
   
    //BOTON INSERTAR DATOS
    private void btnGuardarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarClienteActionPerformed
      
        if(!"".equals(txtDPICliente.getText()) || !"".equals(txtNombreCliente.getText()) || !"".equals(txtTelefonoCliente.getText()) || !"".equals(txtDireccionCliente.getText())){
            cl.setDpi(Integer.parseInt(txtDPICliente.getText()));
            cl.setNombre(txtNombreCliente.getText());
            cl.setTelefono(Integer.parseInt(txtTelefonoCliente.getText()));
            cl.setDireccion(txtDireccionCliente.getText());
            cl.setRazon(txtRazonCliente.getText());
            client.RegistrarCliente(cl);
            LimpiarTabla();
            LimpiarCliente();
            ListarCliente();
            JOptionPane.showMessageDialog(null, "CLIENTE REGISTRADO");
        }else{
            JOptionPane.showMessageDialog(null, "POR FAVOR LLENE TODOS LOS DATOS");
        }
    }//GEN-LAST:event_btnGuardarClienteActionPerformed

    //BOTON EDITAR CLIENTE
    private void btnEditarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarClienteActionPerformed
        if("".equals(txtIdCliente.getText())){
            JOptionPane.showMessageDialog(null, "Seleccione una fila");
            
        }else{
            
            if (!"".equals(txtDPICliente.getText()) && 
                !"".equals(txtNombreCliente.getText()) && 
                !"".equals(txtTelefonoCliente.getText()) && 
                !"".equals(txtDireccionCliente.getText())){
                cl.setDpi(Integer.parseInt(txtDPICliente.getText())); //Mandando los datos al objeto cl
                cl.setNombre(txtNombreCliente.getText());
                cl.setTelefono(Integer.parseInt(txtTelefonoCliente.getText()));
                cl.setDireccion(txtDireccionCliente.getText());
                cl.setRazon(txtRazonCliente.getText());
                cl.setId(Integer.parseInt(txtIdCliente.getText()));
               client.ModificarCliente(cl);
               LimpiarTabla();
               LimpiarCliente();
               ListarCliente();
               JOptionPane.showMessageDialog(null, "CLIENTE MODIFICADO");

           }else{
               JOptionPane.showMessageDialog(null, "Llene todos los campos");
           }
           
        }
    }//GEN-LAST:event_btnEditarClienteActionPerformed

    //BOTON ELIMINAR CLIENTE
    private void btnEliminarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarClienteActionPerformed
       if(!"".equals(txtIdCliente.getText())){
           int pregunta=JOptionPane.showConfirmDialog(null, "¿Seguro de eliminar registro?");
           if(pregunta==0){
               int id=Integer.parseInt(txtIdCliente.getText());
               
               client.EliminarCLiente(id);
               LimpiarTabla();
               LimpiarCliente();
               ListarCliente();
               JOptionPane.showMessageDialog(null, "CLIENTE ELIMINADO");

           }
           
       }
    }//GEN-LAST:event_btnEliminarClienteActionPerformed
    
    //BOTON LIMPIAR CAMPOS DEL CLIENTE
    private void btnNuevoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoClienteActionPerformed
        LimpiarCliente();
    }//GEN-LAST:event_btnNuevoClienteActionPerformed

    
//-----------------------------------------BOTONES DEL MENU LATERAL----------------------------------------------------------------------------    
    
    private void btnClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClientesActionPerformed
        LimpiarTabla();
        ListarCliente();
        jTabbedPane1.setSelectedIndex(1);
    }//GEN-LAST:event_btnClientesActionPerformed

    private void btnNuevaVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevaVentaActionPerformed
       jTabbedPane1.setSelectedIndex(0);
    }//GEN-LAST:event_btnNuevaVentaActionPerformed

    private void btnProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProveedorActionPerformed
       LimpiarTabla();
       jTabbedPane1.setSelectedIndex(2);
       ListarProveedor();
       
    }//GEN-LAST:event_btnProveedorActionPerformed
 
    private void btnProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductosActionPerformed
         LimpiarTabla();
         jTabbedPane1.setSelectedIndex(3);
         ListarProductos();
    }//GEN-LAST:event_btnProductosActionPerformed

    private void btnVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVentasActionPerformed
        jTabbedPane1.setSelectedIndex(4);
    }//GEN-LAST:event_btnVentasActionPerformed


//-----------------------EVENTO MAUSE CLICKED PARA ASIGNAR LOS DATOS A LAS CAJITAS DE TEXTO DEL CLIENTE------------------------------------------
    //
    private void tablaClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaClienteMouseClicked
        int fila=tablaCliente.rowAtPoint(evt.getPoint()); //capturar la fila que se hace click
        txtIdCliente.setText(tablaCliente.getValueAt(fila, 0).toString());
        txtDPICliente.setText(tablaCliente.getValueAt(fila, 1).toString());
        txtNombreCliente.setText(tablaCliente.getValueAt(fila, 2).toString());
        txtTelefonoCliente.setText(tablaCliente.getValueAt(fila, 3).toString());
        txtDireccionCliente.setText(tablaCliente.getValueAt(fila, 4).toString());
        txtRazonCliente.setText(tablaCliente.getValueAt(fila, 5).toString());
    }//GEN-LAST:event_tablaClienteMouseClicked

    
    
    
//---------------------------------------------PESTAÑA PROVEEDOR------------------------------------------------------------------------    

    
    //GUARDAR PRODUCTOS
    private void btnGuardarProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarProveedorActionPerformed
       if(!"".equals(txtRucProveedor.getText()) || !"".equals(txtNombreProveedor.getText()) || !"".equals(txtTelefonoProveedor.getText()) || !"".equals(txtDireccionProveedor.getText())|| !"".equals(txtRazonProveedor.getText())){
           pr.setCod(Integer.parseInt(txtRucProveedor.getText()));
           pr.setNombre(txtNombreProveedor.getText());
           pr.setTelefono(Integer.parseInt(txtTelefonoProveedor.getText()));
           pr.setDireccion(txtDireccionProveedor.getText());
           pr.setRazon(txtRazonProveedor.getText());
           prDao.RegistrarProveedor(pr);
           LimpiarTabla();
           ListarProveedor();
           LimpiarProveedor();
           JOptionPane.showMessageDialog(null, "DATOS INSERTADOS");

 
       }else{
           JOptionPane.showMessageDialog(null, "Los campos están vacios");
       }
    }//GEN-LAST:event_btnGuardarProveedorActionPerformed

    //EVENTO DE CLICKED EN PROVEEDOR
    private void tablaProveedorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaProveedorMouseClicked
        int fila=tablaProveedor.rowAtPoint(evt.getPoint()); //Para obtener la fila seleccionada
        txtIdProveedor.setText(tablaProveedor.getValueAt(fila, 0).toString());
        txtRucProveedor.setText(tablaProveedor.getValueAt(fila, 1).toString());
        txtNombreProveedor.setText(tablaProveedor.getValueAt(fila, 2).toString());
        txtTelefonoProveedor.setText(tablaProveedor.getValueAt(fila, 3).toString());
        txtDireccionProveedor.setText(tablaProveedor.getValueAt(fila, 4).toString());
        txtRazonProveedor.setText(tablaProveedor.getValueAt(fila, 5).toString());
        
        
    }//GEN-LAST:event_tablaProveedorMouseClicked

    //ELIMINAR PROVEEDOR
    private void btnEliminarProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarProveedorActionPerformed
        if(!"".equals(txtIdProveedor.getText())){
            int pregunta=JOptionPane.showConfirmDialog(null, "¿Seguro de eliminar el registro?");
            if(pregunta==0){
                int id=Integer.parseInt(txtIdProveedor.getText());
                prDao.EliminarProveedor(id);
                JOptionPane.showMessageDialog(null, "REGISTRO ELIMINADO");
                LimpiarTabla();
                LimpiarProveedor();
                ListarProveedor();
            }
        }else{
            JOptionPane.showMessageDialog(null, "Seleccione una fila");
        }
    }//GEN-LAST:event_btnEliminarProveedorActionPerformed

    //MODIFICAR PROVEEDOR
    private void btnEditarProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarProveedorActionPerformed
        if("".equals(txtIdProveedor.getText())){
            JOptionPane.showMessageDialog(null, "Seleccione una fila");
        }else{
            if(!"".equals(txtRucProveedor.getText()) || !"".equals(txtNombreProveedor.getText()) || !"".equals(txtTelefonoProveedor.getText()) || !"".equals(txtDireccionProveedor.getText()) || !"".equals(txtRazonProveedor.getText()) ){
                pr.setCod(Integer.parseInt(txtRucProveedor.getText()));
                pr.setNombre(txtNombreProveedor.getText());
                pr.setTelefono(Integer.parseInt(txtTelefonoProveedor.getText()));
                pr.setDireccion(txtDireccionProveedor.getText());
                pr.setRazon(txtRazonProveedor.getText());
                pr.setId(Integer.parseInt(txtIdProveedor.getText()));
                prDao.ModificarProveedor(pr);
                LimpiarTabla();
                ListarProveedor();
                LimpiarProveedor();
                JOptionPane.showMessageDialog(null, "REGISTRO MODIFICADO");
                
            }
        }
        
    }//GEN-LAST:event_btnEditarProveedorActionPerformed

    //LIMPIAR CAJITAS PARA PROVEEDOR
    private void btnNuevoProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoProveedorActionPerformed
        LimpiarProveedor();
    }//GEN-LAST:event_btnNuevoProveedorActionPerformed

    
    
//----------------------------------------------------PESTAÑA PRODUCTOS--------------------------------------------------------------------------
    //INSERTAR PRODUCTO
    private void btnGuardarProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarProductActionPerformed
        if(!"".equals(txtCodigoProduct.getText()) || !"".equals(txtDescripcionProduct.getText())|| !"".equals(txtCantidadProduct.getText())|| !"".equals(txtPrecioProduct.getText()) || !"".equals(cmbProveedorProduct.getSelectedItem())){
            pro.setCodigo(txtCodigoProduct.getText());
            pro.setDescripcion(txtDescripcionProduct.getText());
            pro.setStock(Integer.parseInt(txtCantidadProduct.getText()));
            pro.setPrecio(Double.parseDouble(txtPrecioProduct.getText()));
            pro.setProveedor(cmbProveedorProduct.getSelectedItem().toString());
            proDao.RegistrarProductos(pro);
            JOptionPane.showMessageDialog(null, "Producto REGISTRADO");
            LimpiarTabla();
            ListarProductos();
            LimpiarProductos();
        }else{
            JOptionPane.showMessageDialog(null, "Los campos están vacios");
            
        }
    }//GEN-LAST:event_btnGuardarProductActionPerformed

    //EVENTO CLICKED PARA SELECCIONAR PRODUCTOS
    private void tablaProductoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaProductoMouseClicked
        int fila=tablaProducto.rowAtPoint(evt.getPoint()); //capturar la fila que se hace click
        txtidProduct.setText(tablaProducto.getValueAt(fila, 0).toString());
        txtCodigoProduct.setText(tablaProducto.getValueAt(fila, 1).toString());
        txtDescripcionProduct.setText(tablaProducto.getValueAt(fila, 2).toString());
        cmbProveedorProduct.setSelectedItem(tablaProducto.getValueAt(fila, 3).toString());
        txtCantidadProduct.setText(tablaProducto.getValueAt(fila, 4).toString());
        txtPrecioProduct.setText(tablaProducto.getValueAt(fila, 5).toString());
        
    }//GEN-LAST:event_tablaProductoMouseClicked
  
    //ELIMINAR PRODUCTO
    private void btnEliminarProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarProductActionPerformed
       
         if(!"".equals(txtidProduct.getText())){
            int pregunta=JOptionPane.showConfirmDialog(null, "¿Seguro de eliminar el registro?");
            if(pregunta==0){
                int id=Integer.parseInt(txtidProduct.getText());
                proDao.EliminarProductos(id);
                JOptionPane.showMessageDialog(null, "REGISTRO ELIMINADO");
                LimpiarTabla();
                LimpiarProductos();
                ListarProductos();
            }
        }else{
            JOptionPane.showMessageDialog(null, "Seleccione una fila");
        }
    }//GEN-LAST:event_btnEliminarProductActionPerformed

    //EDITAR PRODUCTO
    private void btnEditarProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarProductActionPerformed
        if("".equals(txtidProduct.getText())){
            JOptionPane.showMessageDialog(null, "Seleccione una fila");
        }else{
            if(!"".equals(txtCodigoProduct.getText()) || !"".equals(txtDescripcionProduct.getText()) || !"".equals(cmbProveedorProduct.getSelectedItem()) || !"".equals(txtCantidadProduct.getText()) || !"".equals(txtPrecioProduct.getText()) ){
                pro.setCodigo(txtCodigoProduct.getText());
                pro.setDescripcion(txtDescripcionProduct.getText());
                pro.setProveedor(cmbProveedorProduct.getSelectedItem().toString());
                pro.setStock(Integer.parseInt(txtCantidadProduct.getText()));
                pro.setPrecio(Double.parseDouble(txtPrecioProduct.getText()));
                pro.setId(Integer.parseInt(txtidProduct.getText()));
                proDao.ModificaProductos(pro);
                LimpiarTabla();
                ListarProductos();
                LimpiarProductos();
                JOptionPane.showMessageDialog(null, "REGISTRO MODIFICADO");
                
            }
        }
    }//GEN-LAST:event_btnEditarProductActionPerformed

    
    
    
    
    private void btnExcelProductComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_btnExcelProductComponentResized
            int ancho = btnExcelProduct.getWidth();
            int largo = btnExcelProduct.getWidth();
            ImageIcon icon = (ImageIcon) btnExcelProduct.getIcon();
            if (icon != null) {
            Image imagen = icon.getImage();
            Image medidas = imagen.getScaledInstance(ancho, largo, Image.SCALE_SMOOTH);
            btnExcelProduct.setIcon(new ImageIcon(medidas));
         }
    }//GEN-LAST:event_btnExcelProductComponentResized

    
//-----------------------------------------------GENERAR REPORTE-----------------------------------------------------------------------
    private void btnExcelProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcelProductActionPerformed
        Excel.reporte();
    }//GEN-LAST:event_btnExcelProductActionPerformed

    
//----------------------------------------------CODIGO GENERAR VENTA------------------------------------------------------------
    private void txtCodigoVentaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoVentaKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            if(!"".equals(txtCodigoVenta.getText())){
                String cod=txtCodigoVenta.getText();
                pro=proDao.BuscarProducto(cod); //mandar codigo
                
                if(pro.getDescripcion()!=null){
                    txtDescripcionVenta.setText(""+pro.getDescripcion());
                    txtPrecioVenta.setText(""+pro.getPrecio());
                    txtStockVenta.setText(""+pro.getStock());
                    txtCantidadVenta.requestFocus();
                    JOptionPane.showMessageDialog(null, "Ingrese cantidad 😄");
                    
                }else{
                    limpiarVenta();
                    JOptionPane.showMessageDialog(null, "No se encontro producto👎🏻");
                }
            }else{
                //si el campo esta vacio
                JOptionPane.showMessageDialog(null, "Ingrese codigo de producto 😑");
                txtCodigoVenta.requestFocus();
            }
            
            
        }
        
        
        
    }//GEN-LAST:event_txtCodigoVentaKeyPressed

    private void txtCantidadVentaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantidadVentaKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            
            if(!"".equals(txtCantidadVenta.getText())){
                String cod=txtCodigoVenta.getText();
                String descripcion=txtDescripcionVenta.getText();
                int cant=Integer.parseInt(txtCantidadVenta.getText());
                Double precio=Double.parseDouble(txtPrecioVenta.getText());
                int stock=Integer.parseInt(txtStockVenta.getText());
                Double total=cant*precio;
                
                if(stock>=cant){
                    item=item+1;
                    modelo2=(DefaultTableModel) tablaVenta.getModel();
                    for (int i = 0; i < tablaVenta.getRowCount(); i++) {
                        if(tablaVenta.getValueAt(i, 1).equals(txtDescripcionVenta.getText())){
                            JOptionPane.showMessageDialog(null, "El producto ya esta registrado");
                            return;
                        }
                           
                    }
                    ArrayList lista=new ArrayList();
                    lista.add(item);
                    lista.add(cod);
                    lista.add(descripcion);
                    lista.add(cant);
                    lista.add(precio);
                    lista.add(total);
                   
                    Object [] o=new Object[5];
                    o[0]=lista.get(1);
                    o[1]=lista.get(2);
                    o[2]=lista.get(3);
                    o[3]=lista.get(4);
                    o[4]=lista.get(5);
                    modelo2.addRow(o);
                    tablaVenta.setModel(modelo2);
                    totalPagar();
                    limpiarVenta();
                    txtCodigoVenta.requestFocus();
                }else{
                    JOptionPane.showMessageDialog(null, "STOCK NO DISPOBIBLE!!!");
                    txtCantidadVenta.setText("");
                }
            }else{
                JOptionPane.showMessageDialog(null, "INGRESE CANTIDAD!!!");

            }
            
        }else{
            
        }
    }//GEN-LAST:event_txtCantidadVentaKeyPressed

    private void btnEliminarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarVentaActionPerformed
        modelo =(DefaultTableModel) tablaVenta.getModel();
        modelo.removeRow(tablaVenta.getSelectedRow());
        totalPagar();
        txtCodigoVenta.requestFocus();
    }//GEN-LAST:event_btnEliminarVentaActionPerformed

    private void txtRucVentaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRucVentaKeyPressed
       if(evt.getKeyCode()==KeyEvent.VK_ENTER){
           if(!"".equals(txtRucVenta.getText())){
              int dpi=Integer.parseInt(txtRucVenta.getText());
               cl=client.BuscarCliente(dpi);
               if(cl.getNombre()!=null){
                   txtNombreClienteVenta.setText(""+cl.getNombre());
                   txtTelefonoClienteVenta.setText(""+cl.getTelefono());
                   txtDireccionClienteVenta.setText(""+cl.getDireccion());
                   txtRazonClienteVenta.setText(""+cl.getRazon());
               }else{
                   txtRucVenta.setText("");
                   JOptionPane.showMessageDialog(null, "NO SE ENCONTRO CLIENTE");
               }
           }else{
               
           }
       }
        
    }//GEN-LAST:event_txtRucVentaKeyPressed

    
    //GENERAR VENTA
    private void btnGenerarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarVentaActionPerformed
        RegistrarVenta();
        RegistrarDetalle();
        ActualizarStock();
        limpiarTablaVenta();
        LimpiarClienteVenta();
    }//GEN-LAST:event_btnGenerarVentaActionPerformed

 
    
    private void btnGuardarCliente1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarCliente1ActionPerformed
    
    if(!"".equals(txtBuscarNombreProd.getText())){
        String proBus=txtBuscarNombreProd.getText();
        mostrar(proBus); 
    }else{
        JOptionPane.showMessageDialog(null, "INGRESE UN PRODUCTO");
    }
    
    }//GEN-LAST:event_btnGuardarCliente1ActionPerformed

   
    
    private void totalPagar(){
        totalPagar=0.00;
        int numFila=tablaVenta.getRowCount();
        for (int i = 0; i < numFila; i++) {
            double calcular=Double.parseDouble(String.valueOf(tablaVenta.getModel().getValueAt(i, 4)));
            totalPagar=totalPagar+calcular;
        }
        
        lblTotal.setText(String.format("%.2f", totalPagar));
        
    }
      

    private void RegistrarVenta(){
        String cliente= txtNombreClienteVenta.getText();
        String vendedor=lblVendedor.getText();
        double monto=totalPagar;
        v.setCliente(cliente);
        v.setVendedor(vendedor);
        v.setTotal(monto);
        vDao.RegistrarVenta(v);
        JOptionPane.showMessageDialog(null, "Venta registrada");
        
    }
            
            
    private void RegistrarDetalle(){
        
        int id=vDao.IdVenta();
        //obtener tabla
        for (int i = 0; i < tablaVenta.getRowCount(); i++) {
            String cod=tablaVenta.getValueAt(i, 0).toString();
            int cant=Integer.parseInt(tablaVenta.getValueAt(i, 2).toString());
            double precio=Double.parseDouble(tablaVenta.getValueAt(i, 3).toString());
            
           
            Dv.setCodigoProducto(cod);
            Dv.setCantidad(cant);
            Dv.setPrecio(precio);
            Dv.setIdVenta(id);
            vDao.RegistrarDetalle(Dv);
        }
    }
            
    
    private void ActualizarStock(){
        for (int i = 0; i<tablaVenta.getRowCount() ; i++) {
            String cod=tablaVenta.getValueAt(i, 0).toString();
            int cant=Integer.parseInt(tablaVenta.getValueAt(i, 2).toString());
            pro=proDao.BuscarProducto(cod);
            int StockActual=pro.getStock()-cant;
            vDao.ActualizarStock(StockActual, cod);
        }
    }
    
  
            
    
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Sistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sistema().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClientes;
    private javax.swing.JButton btnEditarCliente;
    private javax.swing.JButton btnEditarProduct;
    private javax.swing.JButton btnEditarProveedor;
    private javax.swing.JButton btnEliminarCliente;
    private javax.swing.JButton btnEliminarProduct;
    private javax.swing.JButton btnEliminarProveedor;
    private javax.swing.JButton btnEliminarVenta;
    private javax.swing.JButton btnExcelProduct;
    private javax.swing.JButton btnGenerarVenta;
    private javax.swing.JButton btnGuardarCliente;
    private javax.swing.JButton btnGuardarCliente1;
    private javax.swing.JButton btnGuardarProduct;
    private javax.swing.JButton btnGuardarProveedor;
    private javax.swing.JButton btnNuevaVenta;
    private javax.swing.JButton btnNuevoCliente;
    private javax.swing.JButton btnNuevoProduct;
    private javax.swing.JButton btnNuevoProveedor;
    private javax.swing.JButton btnProductos;
    private javax.swing.JButton btnProveedor;
    private javax.swing.JButton btnVentas;
    private javax.swing.JComboBox<String> cmbProveedorProduct;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblLogo1;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JLabel lblVendedor;
    private javax.swing.JTable tablaCliente;
    private javax.swing.JTable tablaProdBuscado;
    private javax.swing.JTable tablaProducto;
    private javax.swing.JTable tablaProveedor;
    private javax.swing.JTable tablaVenta;
    private javax.swing.JTextField txtBuscarNombreProd;
    private javax.swing.JTextField txtCantidadProduct;
    private javax.swing.JTextField txtCantidadVenta;
    private javax.swing.JTextField txtCodigoProduct;
    private javax.swing.JTextField txtCodigoVenta;
    private javax.swing.JTextField txtDPICliente;
    private javax.swing.JTextField txtDescripcionProduct;
    private javax.swing.JTextField txtDescripcionVenta;
    private javax.swing.JTextField txtDireccionCliente;
    private javax.swing.JTextField txtDireccionClienteVenta;
    private javax.swing.JTextField txtDireccionProveedor;
    private javax.swing.JTextField txtIdCliente;
    private javax.swing.JTextField txtIdProveedor;
    private javax.swing.JTextField txtIdVenta;
    private javax.swing.JTextField txtNombreCliente;
    private javax.swing.JTextField txtNombreClienteVenta;
    private javax.swing.JTextField txtNombreProveedor;
    private javax.swing.JTextField txtPrecioProduct;
    private javax.swing.JTextField txtPrecioVenta;
    private javax.swing.JTextField txtRazonCliente;
    private javax.swing.JTextField txtRazonClienteVenta;
    private javax.swing.JTextField txtRazonProveedor;
    private javax.swing.JTextField txtRucProveedor;
    private javax.swing.JTextField txtRucVenta;
    private javax.swing.JTextField txtStockVenta;
    private javax.swing.JTextField txtTelefonoCliente;
    private javax.swing.JTextField txtTelefonoClienteVenta;
    private javax.swing.JTextField txtTelefonoProveedor;
    private javax.swing.JTextField txtidProduct;
    // End of variables declaration//GEN-END:variables
}
