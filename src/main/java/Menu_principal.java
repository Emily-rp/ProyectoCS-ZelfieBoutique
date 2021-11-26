
/**
 *
 * @author 50661
 */
public class Menu_principal extends javax.swing.JFrame {

    public Menu_principal() {
        initComponents();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem13 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        JMBBarraMenu = new javax.swing.JMenuBar();
        JMArchivo = new javax.swing.JMenu();
        jmiGuardar = new javax.swing.JMenuItem();
        jmiCerrarS = new javax.swing.JMenuItem();
        jmiSalir = new javax.swing.JMenuItem();
        JMVentas = new javax.swing.JMenu();
        jmiAgregarVenta = new javax.swing.JMenuItem();
        jmiVerVentas = new javax.swing.JMenuItem();
        jmiModificarVentas = new javax.swing.JMenuItem();
        jmiEliminarVentas = new javax.swing.JMenuItem();
        JMCliente = new javax.swing.JMenu();
        jmiAnadirCliente = new javax.swing.JMenuItem();
        jmiVerCliente = new javax.swing.JMenuItem();
        jmiModificarCliente = new javax.swing.JMenuItem();
        jmiEliminarCliente = new javax.swing.JMenuItem();
        JMAdministrarInventario = new javax.swing.JMenu();
        jmiAgregarProducto = new javax.swing.JMenuItem();
        jmiVerrProducto = new javax.swing.JMenuItem();
        jmiModificarProducto = new javax.swing.JMenuItem();
        jmiEliminarProducto = new javax.swing.JMenuItem();
        JMTienda = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        JMBuscar = new javax.swing.JMenu();
        jmiBuscarCatProducto = new javax.swing.JMenuItem();
        jmiBuscarCliente = new javax.swing.JMenuItem();

        jMenuItem7.setText("jMenuItem7");

        jMenuItem10.setText("jMenuItem10");

        jMenuItem11.setText("jMenuItem11");

        jMenuItem13.setText("jMenuItem13");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setExtendedState(6);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Inventario.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 668, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(182, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(111, 111, 111)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(197, Short.MAX_VALUE))
        );

        JMBBarraMenu.setBackground(new java.awt.Color(112, 53, 0));

        JMArchivo.setText("Archivo");
        JMArchivo.setToolTipText("");

        jmiGuardar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jmiGuardar.setText("Guardar");
        jmiGuardar.setToolTipText("Guarda los cambios hechos");
        jmiGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiGuardarActionPerformed(evt);
            }
        });
        JMArchivo.add(jmiGuardar);

        jmiCerrarS.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jmiCerrarS.setText("Cerrar Sesión");
        jmiCerrarS.setToolTipText("Vuelve al Login");
        jmiCerrarS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiCerrarSActionPerformed(evt);
            }
        });
        JMArchivo.add(jmiCerrarS);

        jmiSalir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jmiSalir.setText("Salir");
        jmiSalir.setToolTipText("Cierra el sistema");
        jmiSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiSalirActionPerformed(evt);
            }
        });
        JMArchivo.add(jmiSalir);

        JMBBarraMenu.add(JMArchivo);

        JMVentas.setText("Administrar Ventas");
        JMVentas.setToolTipText("Manipula las Ventas");

        jmiAgregarVenta.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.ALT_DOWN_MASK));
        jmiAgregarVenta.setText("Agregar Venta");
        jmiAgregarVenta.setToolTipText("Agrega nueva venta");
        JMVentas.add(jmiAgregarVenta);

        jmiVerVentas.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.ALT_DOWN_MASK));
        jmiVerVentas.setText("Ver listas de Ventas");
        jmiVerVentas.setToolTipText("Ver todas las Ventas");
        JMVentas.add(jmiVerVentas);

        jmiModificarVentas.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.ALT_DOWN_MASK));
        jmiModificarVentas.setText("Modificar Venta");
        jmiModificarVentas.setToolTipText("Edita datos de una Venta");
        JMVentas.add(jmiModificarVentas);

        jmiEliminarVentas.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.ALT_DOWN_MASK));
        jmiEliminarVentas.setText("Eliminar Venta");
        jmiEliminarVentas.setToolTipText("Elimina una Venta");
        JMVentas.add(jmiEliminarVentas);

        JMBBarraMenu.add(JMVentas);

        JMCliente.setText("Administrar Cliente");
        JMCliente.setToolTipText("Manipula los Clientes");

        jmiAnadirCliente.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jmiAnadirCliente.setText("Añadir Cliente");
        jmiAnadirCliente.setToolTipText("Añade un nuevo Cliente");
        JMCliente.add(jmiAnadirCliente);

        jmiVerCliente.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jmiVerCliente.setText("Ver lista de Clientes");
        jmiVerCliente.setToolTipText("Ver todos los Clientes");
        JMCliente.add(jmiVerCliente);

        jmiModificarCliente.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jmiModificarCliente.setText("Modificar Cliente");
        jmiModificarCliente.setToolTipText("Edita datos de un Cliente");
        JMCliente.add(jmiModificarCliente);

        jmiEliminarCliente.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jmiEliminarCliente.setText("Eliminar Cliente");
        jmiEliminarCliente.setToolTipText("Elimina al Cliente");
        JMCliente.add(jmiEliminarCliente);

        JMBBarraMenu.add(JMCliente);

        JMAdministrarInventario.setText("Administrar Inventario");
        JMAdministrarInventario.setToolTipText("Manipula el Inventario");

        jmiAgregarProducto.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        jmiAgregarProducto.setText("Añadir Producto");
        jmiAgregarProducto.setToolTipText("Añade un nuevo Producto");
        jmiAgregarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiAgregarProductoActionPerformed(evt);
            }
        });
        JMAdministrarInventario.add(jmiAgregarProducto);

        jmiVerrProducto.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        jmiVerrProducto.setText("Ver Productos");
        jmiVerrProducto.setToolTipText("Ver todos los Productos");
        jmiVerrProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiVerrProductoActionPerformed(evt);
            }
        });
        JMAdministrarInventario.add(jmiVerrProducto);

        jmiModificarProducto.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        jmiModificarProducto.setText("Modificar Producto");
        jmiModificarProducto.setToolTipText("Modifica dato del Producto");
        JMAdministrarInventario.add(jmiModificarProducto);

        jmiEliminarProducto.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        jmiEliminarProducto.setText("Eliminar Producto");
        jmiEliminarProducto.setToolTipText("Elimina un Producto");
        JMAdministrarInventario.add(jmiEliminarProducto);

        JMBBarraMenu.add(JMAdministrarInventario);

        JMTienda.setText("Información de la Tienda");
        JMTienda.setToolTipText("Muestra Información de la Tienda");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.ALT_DOWN_MASK));
        jMenuItem1.setText("Ver Información");
        jMenuItem1.setToolTipText("Despliega información de la Tienda");
        JMTienda.add(jMenuItem1);

        JMBBarraMenu.add(JMTienda);

        JMBuscar.setText("Buscar");
        JMBuscar.setToolTipText("Buscar cosas");

        jmiBuscarCatProducto.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jmiBuscarCatProducto.setText("Buscar Categoría Producto");
        jmiBuscarCatProducto.setToolTipText("Busca Productos por Categoría");
        JMBuscar.add(jmiBuscarCatProducto);

        jmiBuscarCliente.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jmiBuscarCliente.setText("Buscar Cliente");
        jmiBuscarCliente.setToolTipText("Busca Cliente por Cédula");
        JMBuscar.add(jmiBuscarCliente);

        JMBBarraMenu.add(JMBuscar);

        setJMenuBar(JMBBarraMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmiGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiGuardarActionPerformed
        
        //SE ESTABLEC ECODIGO CUANDO EL USUARIO SELECCIONA "GUARDAR"
        
    }//GEN-LAST:event_jmiGuardarActionPerformed

    private void jmiCerrarSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiCerrarSActionPerformed
        
        //SE ESTABLEC ECODIGO CUANDO EL USUARIO SELECCIONA "CERRAR SESION"
        this.setVisible(false); //se pone invisible la pantalla del menú
        Login jLogin = new Login(); // Llamamos el Login
        jLogin.intentos = 4;
        jLogin.setVisible(true); // aqui el Loging es visible
        jLogin.setResizable(false); // para no cambiar el tamaño 
    }//GEN-LAST:event_jmiCerrarSActionPerformed

    private void jmiSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiSalirActionPerformed
        
        //SE ESTABLEC ECODIGO CUANDO EL USUARIO SELECCIONA "SALIR"
        System.exit(0); //se sale del sistema
    }//GEN-LAST:event_jmiSalirActionPerformed

    private void jmiAgregarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiAgregarProductoActionPerformed
        
        //SE ESTABLEC ECODIGO CUANDO EL USUARIO SELECCIONA "AÑADIR PRODUCTO"
        Annadir_producto annadir_p = new Annadir_producto(0,0,"","","","",0);
        annadir_p.setVisible(true);
        annadir_p.setResizable(false);
        annadir_p.setLocationRelativeTo(null);
        
    }//GEN-LAST:event_jmiAgregarProductoActionPerformed

    private void jmiVerrProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiVerrProductoActionPerformed
        
        //SE ESTABLEC ECODIGO CUANDO EL USUARIO SELECCIONA "VER PRODUCTO"
        Ver_producto ver_p = new Ver_producto();
        ver_p.setVisible(true);
        ver_p.setResizable(false);
        ver_p.setLocationRelativeTo(null);
        
    }//GEN-LAST:event_jmiVerrProductoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu JMAdministrarInventario;
    private javax.swing.JMenu JMArchivo;
    private javax.swing.JMenuBar JMBBarraMenu;
    private javax.swing.JMenu JMBuscar;
    private javax.swing.JMenu JMCliente;
    private javax.swing.JMenu JMTienda;
    private javax.swing.JMenu JMVentas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenuItem jmiAgregarProducto;
    private javax.swing.JMenuItem jmiAgregarVenta;
    private javax.swing.JMenuItem jmiAnadirCliente;
    private javax.swing.JMenuItem jmiBuscarCatProducto;
    private javax.swing.JMenuItem jmiBuscarCliente;
    private javax.swing.JMenuItem jmiCerrarS;
    private javax.swing.JMenuItem jmiEliminarCliente;
    private javax.swing.JMenuItem jmiEliminarProducto;
    private javax.swing.JMenuItem jmiEliminarVentas;
    private javax.swing.JMenuItem jmiGuardar;
    private javax.swing.JMenuItem jmiModificarCliente;
    private javax.swing.JMenuItem jmiModificarProducto;
    private javax.swing.JMenuItem jmiModificarVentas;
    private javax.swing.JMenuItem jmiSalir;
    private javax.swing.JMenuItem jmiVerCliente;
    private javax.swing.JMenuItem jmiVerVentas;
    private javax.swing.JMenuItem jmiVerrProducto;
    // End of variables declaration//GEN-END:variables
}
