
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;



/**
 *
 * @author 50661
 */
public class ArchivoRopa {
    
    //SE ESTABLECE METODO PARA CREAR UN NUEVO ARCHIVO
    public void crear_archivo(ArrayList<Annadir_producto> array){      
        FileWriter personas = null;
        BufferedWriter escritura = null;
        try {
            personas = new FileWriter("");
            escritura = new BufferedWriter(personas);
            for (int i = 0; i < array.size() ;i++) {
                escritura.write(array.get(i).getCantidad() + " , " + array.get(i).getPrecio_unidad() + " , " + array.get(i).getAmericana_nueva() + " , " + array.get(i).getFecha_ingreso() + " , " + array.get(i).getCategoria()
                        + " , " + array.get(i).getTipo_ropa()+ " , " + array.get(i).getPrecio() + "\n");
            }
            
        } catch (IOException e) {
            
        }
        finally{
            if (escritura != null) {
                try {
                    escritura.close();
                } catch (IOException e) {
                    
                }
            }
            if (personas != null) {
                try {
                    personas.close();
                } catch (IOException e) {
                    
                }
            }
        }
    }
    
    //SE ESTABLCE METOOD PARA AGREGAR LINEA AL ARCHIVO
    public void agregarLineasArchivo(ArrayList<Annadir_producto> array){
        FileWriter personas = null;
        BufferedWriter escritura = null;
        try {
            personas = new FileWriter("");//true
            escritura = new BufferedWriter(personas);
            for (Annadir_producto inventario : array) {
                escritura.write(inventario.getCantidad() + " , " + inventario.getPrecio_unidad() + " , " + inventario.getAmericana_nueva() + " , " + inventario.getFecha_ingreso() + " , " + inventario.getCategoria()
                        + " , " + inventario.getTipo_ropa() + " , " + inventario.getPrecio() + "\n");
            }
        } catch (IOException e) {
            
        }
        finally{
            if (escritura != null) {
                try {
                    escritura.close();
                } catch (IOException e) {
                    
                }
            }
            if (personas != null) {
                try {
                    personas.close();
                } catch (IOException e) {
                    
                }
            }
        }
    }
    
    //SE ESTABLECE METODO PARA BORRAR EL CONTENIDO DEL ARCHIVO
    public void borrar_archivo(ArrayList<Annadir_producto> array){
        FileWriter personas = null;
        BufferedWriter escritura = null;
        try {
            personas = new FileWriter("");
            escritura = new BufferedWriter(personas);
            for (int i = 0; i < array.size() ;i++) {
                escritura.write("");
            }
            
        } catch (IOException e) {
            
        }
        finally{
            if (escritura != null) {
                try {
                    escritura.close();
                } catch (IOException e) {
                    
                }
            }
            if (personas != null) {
                try {
                    personas.close();
                } catch (IOException e) {
                    
                }
            }
        }
    }
    
    //SE ESTABLECE METODO PARA LEER ARCHIVO
    public ArrayList<Annadir_producto> leerArchivo(){             //-------------------------------HACE TODO BIEN, PERO RETORNA UN ARRAY VACIO, POR ENDE NO ENTRA AL FOR Y NO FUNCIONA-----------------------------------------------
        File personas = new File("");
        ArrayList<Annadir_producto> listaInvent = new ArrayList<Annadir_producto>();
        if(listaInvent.isEmpty()){
            if (personas.exists()) {
                Scanner leer;
                try {
                    leer = new Scanner(personas);
                    while(leer.hasNextLine()){
                        String inventario =leer.nextLine();
                        Scanner lineaInvent = new Scanner(inventario);
                        lineaInvent.useDelimiter("\\s*,\\s*");
                        Annadir_producto p = new Annadir_producto();
                        p.setCantidad(Integer.parseInt(lineaInvent.next()));
                        p.setPrecio_unidad(Integer.parseInt(lineaInvent.next()));
                        p.setAmericana_nueva(lineaInvent.next());
                        p.setFecha_ingreso(lineaInvent.next());
                        p.setCategoria(lineaInvent.next());
                        p.setTipo_ropa(lineaInvent.next());
                        p.setPrecio(Integer.parseInt(lineaInvent.next()));
                        listaInvent.add(p);
                        lineaInvent.close();
                    }
                    leer.close();
                } catch (FileNotFoundException e) {
                }
            }else{
                JOptionPane.showMessageDialog(null, "Archivo no encontrado");
            }
        }else{
            
        }
        
        return listaInvent;
    }
    
}
