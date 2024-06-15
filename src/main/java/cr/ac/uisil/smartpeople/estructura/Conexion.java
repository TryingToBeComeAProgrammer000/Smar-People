/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cr.ac.uisil.smartpeople.estructura;

import java.io.BufferedReader;
import java.net.URISyntaxException;
import java.net.URL;
import java.io.File;
import java.io.FileReader;
import java.util.LinkedList;
import javax.swing.JOptionPane;
/**
 *
 * @author Bernal Santiago
 */
public class Conexion {
    private String nombre;
    
    public Conexion(String nombre){
    this.nombre = nombre;
    }
    
    public LinkedList<String> obtenerTextoDelArchivo(){
    LinkedList<String> lineasDeTexto = null;
    try{
    File archivo = obtenerArchivo();
        if (archivo.exists()) {
        lineasDeTexto = new LinkedList();
        BufferedReader br = new BufferedReader(new FileReader(archivo));
        String linea;
        while((linea = br.readLine()) != null ){
                System.out.println(linea);
                lineasDeTexto.add(linea);
        }
        br.close();
        }else{
        JOptionPane.showMessageDialog(null, "El archivo de texto no existe");
        }
      }catch(Exception ex){
      ex.printStackTrace();
      JOptionPane.showMessageDialog(null, "Se produjo un error");
      }
        return lineasDeTexto;
    }     
    
    private File obtenerArchivo(){
        try{
        URL url = getClass().getClassLoader().getResource("archivos/"+nombre);
        return new File(url.toURI());
        }catch (URISyntaxException ex){
        ex.printStackTrace();
        return null;
        }
    }
    
}
