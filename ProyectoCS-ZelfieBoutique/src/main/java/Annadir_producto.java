//prueba aiudaaaaaaaa xC
import java.io.File;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Annadir_producto extends javax.swing.JFrame {

    //jsadjsdjias
    
    //SE ESTABLECE EL ARRAYLIST
    ArrayList<Annadir_producto> array_ropa = new ArrayList<Annadir_producto>();
    
    //SE ESTABLECEN LOS ATRIBUTOS
    protected int precio;
    protected int cantidad;
    protected String americana_nueva;
    protected String fecha_ingreso;
    protected String categoria;
    protected String tipo_ropa;
    protected int precio_unidad;
    
    //SE ESTABLECE LOS GET AND SET
    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getAmericana_nueva() {
        return americana_nueva;
    }

    public void setAmericana_nueva(String americana_nueva) {
        this.americana_nueva = americana_nueva;
    }

    public String getFecha_ingreso() {
        return fecha_ingreso;
    }

    public void setFecha_ingreso(String fecha_ingreso) {
        this.fecha_ingreso = fecha_ingreso;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getTipo_ropa() {
        return tipo_ropa;
    }

    public void setTipo_ropa(String tipo_ropa) {
        this.tipo_ropa = tipo_ropa;
    }

    public ArrayList<Annadir_producto> getArray_ropa() {
        return array_ropa;
    }

    public void setArray_ropa(ArrayList<Annadir_producto> array_ropa) {
        this.array_ropa = array_ropa;
    }

    public int getPrecio_unidad() {
        return precio_unidad;
    }

    public void setPrecio_unidad(int precio_unidad) {
        this.precio_unidad = precio_unidad;
    }
    
    //SE ESTABLECE EL CONSTRUCTOR
    public Annadir_producto(int cantidad, int precio_unidad, String americana_nueva, String fecha_ingreso, String categoria, String tipo_ropa, int precio) {
        this.precio = precio;
        this.cantidad = cantidad;
        this.americana_nueva = americana_nueva;
        this.fecha_ingreso = fecha_ingreso;
        this.categoria = categoria;
        this.tipo_ropa = tipo_ropa;
        this.precio_unidad = precio_unidad;
        initComponents();
        this.jlblCheck.setVisible(false);
    }
    public Annadir_producto() {
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jlblPrecio = new javax.swing.JLabel();
        jlblCantidad = new javax.swing.JLabel();
        jlblFIngreso1 = new javax.swing.JLabel();
        jlblCategoria = new javax.swing.JLabel();
        jtxtPrecioUnidad = new javax.swing.JTextField();
        jtxtCantidad = new javax.swing.JTextField();
        jtxtIngreso = new javax.swing.JTextField();
        jtbnAtras = new javax.swing.JButton();
        jbtnLimpiar = new javax.swing.JButton();
        jbtnAgregar = new javax.swing.JButton();
        jlblTipoR = new javax.swing.JLabel();
        jcbCategoria = new javax.swing.JComboBox<>();
        jcbTipoRopa = new javax.swing.JComboBox<>();
        jrbUsado = new javax.swing.JRadioButton();
        jrbNuevo = new javax.swing.JRadioButton();
        jbtnGuardar = new javax.swing.JButton();
        jbtnEliminarTodo = new javax.swing.JButton();
        jtxtPrecioTotal = new javax.swing.JTextField();
        jlblPrecioUnidad = new javax.swing.JLabel();
        jlblCheck = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jlblImagenFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setMinimumSize(new java.awt.Dimension(1000, 650));
        jPanel1.setPreferredSize(new java.awt.Dimension(1000, 650));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlblPrecio.setFont(new java.awt.Font("Gotham", 0, 20)); // NOI18N
        jlblPrecio.setForeground(new java.awt.Color(112, 53, 0));
        jlblPrecio.setText("Precio Total");
        jPanel1.add(jlblPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 200, 120, -1));

        jlblCantidad.setFont(new java.awt.Font("Gotham", 0, 20)); // NOI18N
        jlblCantidad.setForeground(new java.awt.Color(112, 53, 0));
        jlblCantidad.setText("Unidades");
        jPanel1.add(jlblCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 200, 110, -1));

        jlblFIngreso1.setFont(new java.awt.Font("Gotham", 0, 20)); // NOI18N
        jlblFIngreso1.setForeground(new java.awt.Color(112, 53, 0));
        jlblFIngreso1.setText("Precio Unitario");
        jPanel1.add(jlblFIngreso1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 330, 150, -1));

        jlblCategoria.setFont(new java.awt.Font("Gotham", 0, 20)); // NOI18N
        jlblCategoria.setForeground(new java.awt.Color(112, 53, 0));
        jlblCategoria.setText("Categoría");
        jPanel1.add(jlblCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 360, 130, 30));

        jtxtPrecioUnidad.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jtxtPrecioUnidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 330, 170, 30));

        jtxtCantidad.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jtxtCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 200, 170, 30));

        jtxtIngreso.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jtxtIngreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 270, 170, 30));

        jtbnAtras.setBackground(new java.awt.Color(255, 255, 255));
        jtbnAtras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/HomeBoton.png"))); // NOI18N
        jtbnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtbnAtrasActionPerformed(evt);
            }
        });
        jPanel1.add(jtbnAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jbtnLimpiar.setFont(new java.awt.Font("Gotham", 0, 24)); // NOI18N
        jbtnLimpiar.setText("Limpiar");
        jbtnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnLimpiarActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 440, 140, 40));

        jbtnAgregar.setFont(new java.awt.Font("Gotham", 0, 24)); // NOI18N
        jbtnAgregar.setText("Agregar");
        jbtnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnAgregarActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 440, 140, 40));

        jlblTipoR.setBackground(new java.awt.Color(255, 255, 255));
        jlblTipoR.setFont(new java.awt.Font("Gotham", 0, 20)); // NOI18N
        jlblTipoR.setForeground(new java.awt.Color(112, 53, 0));
        jlblTipoR.setText("Tipo de Prenda");
        jPanel1.add(jlblTipoR, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 320, -1, -1));

        jcbCategoria.setBackground(new java.awt.Color(255, 255, 255));
        jcbCategoria.setFont(new java.awt.Font("Gotham", 0, 18)); // NOI18N
        jcbCategoria.setForeground(new java.awt.Color(112, 53, 0));
        jcbCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Camisas", "Blusas", "Pantalones", "Capas", "Vestidos", "Joggers", "Abrigos", "Sábanas", "Pantalonetas", "Mamelucos" }));
        jPanel1.add(jcbCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 320, 180, 30));

        jcbTipoRopa.setBackground(new java.awt.Color(255, 255, 255));
        jcbTipoRopa.setFont(new java.awt.Font("Gotham", 0, 18)); // NOI18N
        jcbTipoRopa.setForeground(new java.awt.Color(112, 53, 0));
        jcbTipoRopa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hombres", "Mujeres", "Niños", "Niñas", "Bebés" }));
        jPanel1.add(jcbTipoRopa, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 360, 180, 30));

        jrbUsado.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(jrbUsado);
        jrbUsado.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jrbUsado.setForeground(new java.awt.Color(112, 53, 0));
        jrbUsado.setSelected(true);
        jrbUsado.setText("Usado");
        jPanel1.add(jrbUsado, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 270, -1, -1));

        buttonGroup1.add(jrbNuevo);
        jrbNuevo.setFont(new java.awt.Font("Gotham", 0, 18)); // NOI18N
        jrbNuevo.setForeground(new java.awt.Color(112, 53, 0));
        jrbNuevo.setText("Nuevo");
        jPanel1.add(jrbNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 270, -1, -1));

        jbtnGuardar.setFont(new java.awt.Font("Gotham", 0, 24)); // NOI18N
        jbtnGuardar.setText("Guardar");
        jbtnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 440, 140, 40));

        jbtnEliminarTodo.setFont(new java.awt.Font("Gotham", 0, 18)); // NOI18N
        jbtnEliminarTodo.setText("Eliminar Inventario");
        jbtnEliminarTodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnEliminarTodoActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnEliminarTodo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 600, 200, -1));

        jtxtPrecioTotal.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jtxtPrecioTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 200, 170, 30));

        jlblPrecioUnidad.setFont(new java.awt.Font("Gotham", 0, 20)); // NOI18N
        jlblPrecioUnidad.setForeground(new java.awt.Color(112, 53, 0));
        jlblPrecioUnidad.setText("Fecha de Ingreso");
        jPanel1.add(jlblPrecioUnidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 270, 210, -1));

        jlblCheck.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/prendaAExito.jpg"))); // NOI18N
        jPanel1.add(jlblCheck, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 520, 220, 80));

        jLabel2.setBackground(new java.awt.Color(112, 53, 0));
        jLabel2.setFont(new java.awt.Font("Gotham", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(112, 53, 0));
        jLabel2.setText("INVENTARIO");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 100, 330, -1));

        jlblImagenFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Inventario.jpg"))); // NOI18N
        jPanel1.add(jlblImagenFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 650));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 650));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtbnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtbnAtrasActionPerformed
        
        //CUANDO EL USUARIO PRESIONA ATRAS
        this.setVisible(false); //se oculta la pantalla de agregar producto

    }//GEN-LAST:event_jtbnAtrasActionPerformed

    private void jbtnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnLimpiarActionPerformed
        
        //CUANDO EL USUARIO PRESIONA LIMPIAR
        this.jtxtCantidad.setText(""); //se borra la info del txt
        this.jtxtIngreso.setText(""); //se borra la info del txt
        this.jtxtPrecioUnidad.setText(""); //se borra la info del txt
        this.jlblCheck.setVisible(false);
        
    }//GEN-LAST:event_jbtnLimpiarActionPerformed

    private void jbtnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAgregarActionPerformed
        
        //CUANDO EL USUARIO PRESIONA AGREGAR
        //SE EXTRAEN LOS VALORES DIGITADOS PARA GUARDARLOS EN VARIABLES
        if(this.jtxtCantidad.getText().equals("") || this.jtxtPrecioUnidad.getText().equals("") ||  this.jtxtIngreso.getText().equals("") ||
          (this.jrbUsado.isSelected() && this.jrbNuevo.isSelected()) || this.jtxtPrecioUnidad.getText().equals("")){  //se verifica si deja campos vacios
            JOptionPane.showMessageDialog(null, "Falta Información","¡Asegúrese de completar todo!",JOptionPane.ERROR_MESSAGE);
        }else{   //de lo contrario, guarda la infromacion
            
            //se guarda la informacion de lo que digita el usuario
            this.cantidad = Integer.parseInt(this.jtxtCantidad.getText());  
            this.precio = Integer.parseInt(this.jtxtPrecioTotal.getText());
            this.fecha_ingreso = this.jtxtIngreso.getText();
            this.precio_unidad = Integer.parseInt(this.jtxtPrecioUnidad.getText());
            //se guarda la iformaciond de lo que seleccione el usuario
            categoria = (String)jcbCategoria.getSelectedItem();
            tipo_ropa = (String)jcbTipoRopa.getSelectedItem();
            //se guarda la informacion de lo que seleciionale usaurio
            this.americana_nueva = "";
            if(this.jrbUsado.isSelected()){
                this.americana_nueva = "Usada";
            }else if(this.jrbNuevo.isSelected()){
                this.americana_nueva = "Nueva";
            }
            array_ropa.add(new Annadir_producto(cantidad,precio_unidad, americana_nueva, fecha_ingreso, categoria, tipo_ropa, precio));  //se guarda los datos en un arraylist
        }   
    }//GEN-LAST:event_jbtnAgregarActionPerformed

    private void jbtnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnGuardarActionPerformed
        
        //CUANDO EL USUARIO PRECIOSA GUARDAR
        ArchivoRopa miarchivo = new ArchivoRopa();
        File file = new File("C:\\Users\\50661\\OneDrive\\Documentos\\GitHub\\Proyecto-ZelfieBotique\\inventario.txt");
        
        if(file.exists()){
            miarchivo.agregarLineasArchivo(array_ropa);
            this.jlblCheck.setVisible(true);
            array_ropa.clear();
        }else{
            miarchivo.crear_archivo(array_ropa);
            this.jlblCheck.setVisible(true);
            array_ropa.clear();
        } 
    }//GEN-LAST:event_jbtnGuardarActionPerformed

    private void jbtnEliminarTodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnEliminarTodoActionPerformed
        
        //CUANDO EL USUARIO PRECIOSA ELIMINAR DATOS
        int opcion = Integer.parseInt(JOptionPane.showInputDialog(null,"¿Está seguro de borrar todos los datos de forma PERMANENTE?\n\n"
                                                                     + "1 - Continuar\n"
                                                                     + "2 - Atrás\n"
                                                                      ,"¡¡ALERTA!!",JOptionPane.WARNING_MESSAGE));
        switch(opcion){
            case 1: 
                ArchivoRopa miarchivo = new ArchivoRopa();
                miarchivo.borrar_archivo(array_ropa);
                JOptionPane.showMessageDialog(null,"Datos borrados exitosamente.","¡!",JOptionPane.INFORMATION_MESSAGE);
                break;
                
            case 2:
                
                break;
        }
        
    }//GEN-LAST:event_jbtnEliminarTodoActionPerformed

    //SE ESTABLECE EL ToSTRING
    @Override
    public String toString() {
        return "Precio : " + precio + "\nCantidad : " + cantidad + "\nTipo de Ropa : " + americana_nueva + "\nFecha de Ingreso : " + fecha_ingreso + "\nCategoria : " + categoria + "\nTipo de Ropa : " + tipo_ropa  ;
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbtnAgregar;
    private javax.swing.JButton jbtnEliminarTodo;
    private javax.swing.JButton jbtnGuardar;
    private javax.swing.JButton jbtnLimpiar;
    private javax.swing.JComboBox<String> jcbCategoria;
    private javax.swing.JComboBox<String> jcbTipoRopa;
    private javax.swing.JLabel jlblCantidad;
    private javax.swing.JLabel jlblCategoria;
    private javax.swing.JLabel jlblCheck;
    private javax.swing.JLabel jlblFIngreso1;
    private javax.swing.JLabel jlblImagenFondo;
    private javax.swing.JLabel jlblPrecio;
    private javax.swing.JLabel jlblPrecioUnidad;
    private javax.swing.JLabel jlblTipoR;
    private javax.swing.JRadioButton jrbNuevo;
    private javax.swing.JRadioButton jrbUsado;
    private javax.swing.JButton jtbnAtras;
    private javax.swing.JTextField jtxtCantidad;
    private javax.swing.JTextField jtxtIngreso;
    private javax.swing.JTextField jtxtPrecioTotal;
    private javax.swing.JTextField jtxtPrecioUnidad;
    // End of variables declaration//GEN-END:variables
}
