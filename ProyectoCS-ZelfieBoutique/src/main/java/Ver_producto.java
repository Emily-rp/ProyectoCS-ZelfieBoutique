
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author 50661
 */
public class Ver_producto extends javax.swing.JFrame {

    public ArrayList<Annadir_producto> arrayRopa = new ArrayList<Annadir_producto>();

    public ArrayList<Annadir_producto> getArrayRopa() {
        return arrayRopa;
    }

    public void setArrayRopa(ArrayList<Annadir_producto> arrayRopa) {
        this.arrayRopa = arrayRopa;
    }
    
    public Ver_producto() {
        initComponents();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        JTableRopa = new javax.swing.JTable();
        jbtnCargarInvt = new javax.swing.JButton();
        jbtnAtras = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        JTableRopa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Unidades", "Precio Unitario", "Usada o Nueva", "Fecha de Ingreso", "Categoría", "Tipo Prenda", "Precio Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(JTableRopa);

        jbtnCargarInvt.setText("Cargar Inventario");
        jbtnCargarInvt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCargarInvtActionPerformed(evt);
            }
        });

        jbtnAtras.setText("Atrás");
        jbtnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnAtrasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 838, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbtnCargarInvt, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                    .addComponent(jbtnAtras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jbtnCargarInvt)
                .addGap(18, 18, 18)
                .addComponent(jbtnAtras)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 644, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnCargarInvtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCargarInvtActionPerformed
        
        //CUANDO EL USUARIO PRESIONA CARGAR INVENTARIO
        mostrar();
    }//GEN-LAST:event_jbtnCargarInvtActionPerformed

    private void jbtnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAtrasActionPerformed
        
        //CUANDO EL USUARIO PRESIONA ATRAS
        this.setVisible(false);
        
    }//GEN-LAST:event_jbtnAtrasActionPerformed

    
    //SE ESTABLECE METODO MOSTRAR, PARA VER EL CONTENIDO DEL ARRAYLIST
    public void mostrar(){
        
        ArchivoRopa miarchivo = new ArchivoRopa();
        arrayRopa = miarchivo.leerArchivo();
        DefaultTableModel modelPersona = (DefaultTableModel)JTableRopa.getModel();
        for(int q = 0; q < arrayRopa.size(); q++){
            modelPersona.addRow(new Object[]{arrayRopa.get(q).getCantidad(), arrayRopa.get(q).getPrecio_unidad(), arrayRopa.get(q).getAmericana_nueva()
                                            ,arrayRopa.get(q).getFecha_ingreso(),arrayRopa.get(q).getCategoria(),arrayRopa.get(q).getTipo_ropa(),arrayRopa.get(q).getPrecio()});
        }  
        arrayRopa.clear();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable JTableRopa;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtnAtras;
    private javax.swing.JButton jbtnCargarInvt;
    // End of variables declaration//GEN-END:variables
}
