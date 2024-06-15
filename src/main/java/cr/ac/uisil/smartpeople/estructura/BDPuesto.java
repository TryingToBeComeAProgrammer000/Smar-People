/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cr.ac.uisil.smartpeople.estructura;

import java.util.StringTokenizer;

/**
 *
 * @author Bernal Santiago
 */
public class BDPuesto {
    
    public LinkedList<Puesto> obtener(){
    LinkedList<Puesto> puestos = null;
    Archivo archivo = new Archivo("puestos.txt");
    LinkedList<String> lineas = archivo.obtenerTextoDelArchivo();
        if (lineas != null) {
         productos = new LinkedList();
            for (int i = 0; i < lineas.size(); i++) {
            String linea = lineas.get(i);
            StringTokenizer tokens = new StringTokenizer(linea,";");
            String codigo = tokens.nextToken();
            String nombre = tokens.nextToken();
            String descripcion = tokens.nextToken();
            float precio = Float.parseFloat(tokens.nextToken());
            int totalPuestos = Integer.parseInt(tokens.nextToken());
            puestos.add(new Puesto())
            }
        }
        
    }
    
}
