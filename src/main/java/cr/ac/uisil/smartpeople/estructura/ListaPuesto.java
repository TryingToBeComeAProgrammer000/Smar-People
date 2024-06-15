/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cr.ac.uisil.smartpeople.estructura;

import java.util.LinkedList;

/**
 *
 * @author Bernal Santiago
 */
public class ListaPuesto {
    private LinkedList<Puesto> puestos;
    
    public void agregar (Puesto puesto){
    puestos.add(puesto);
    }
    
    public void eliminar(int indice){
    puestos.remove(indice);
    }
    
    public int total(){
    return puestos.size();
    }
    
    public Puesto obtener(int indice){
    return puestos.get(indice);
    }
}
