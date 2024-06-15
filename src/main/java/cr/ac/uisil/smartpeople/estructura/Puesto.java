/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cr.ac.uisil.smartpeople.estructura;

/**
 *
 * @author Bernal Santiago
 */
public class Puesto {
    private long id;
    private int codigo;
    private String nombre;
    private float salario_Por_Hora;
    private float salario_Por_Hora_Extra;
    private boolean es_Jefatura;

    public Puesto(long id, int codigo, String nombre, float salario_Por_Hora, float salario_Por_Hora_Extra, boolean es_Jefatura) {
        this.id = id;
        this.codigo = codigo;
        this.nombre = nombre;
        this.salario_Por_Hora = salario_Por_Hora;
        this.salario_Por_Hora_Extra = salario_Por_Hora_Extra;
        this.es_Jefatura = es_Jefatura;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getSalario_Por_Hora() {
        return salario_Por_Hora;
    }

    public void setSalario_Por_Hora(float salario_Por_Hora) {
        this.salario_Por_Hora = salario_Por_Hora;
    }

    public float getSalario_Por_Hora_Extra() {
        return salario_Por_Hora_Extra;
    }

    public void setSalario_Por_Hora_Extra(float salario_Por_Hora_Extra) {
        this.salario_Por_Hora_Extra = salario_Por_Hora_Extra;
    }

    public boolean isEs_Jefatura() {
        return es_Jefatura;
    }

    public void setEs_Jefatura(boolean es_Jefatura) {
        this.es_Jefatura = es_Jefatura;
    }
    
    
    
}
