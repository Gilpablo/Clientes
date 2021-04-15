/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modulo;

/**
 *
 * @author daw-B
 */
public class Clientes {
        
    private String nombre;    
    private String PriApellido;
    private String SegApellido;
    private Integer edad;
    private String EstadoCivil;
    private String sexo;
    
    
    public Clientes(String nombre, String PriApellido, String SegApellido, Integer edad, String EstadoCivil, String sexo) {
        this.nombre = nombre;
        this.PriApellido = PriApellido;
        this.SegApellido = SegApellido;
        this.edad = edad;
        this.EstadoCivil = EstadoCivil;
        this.sexo = sexo;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPriApellido() {
        return PriApellido;
    }

    public void setPriApellido(String PriApellido) {
        this.PriApellido = PriApellido;
    }

    public String getSegApellido() {
        return SegApellido;
    }

    public void setSegApellido(String SegApellido) {
        this.SegApellido = SegApellido;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getEstadoCivil() {
        return EstadoCivil;
    }

    public void setEstadoCivil(String EstadoCivil) {
        this.EstadoCivil = EstadoCivil;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

   

    @Override
    public String toString() {
        return nombre + " " + PriApellido + " " + SegApellido + " " + sexo + " "+ EstadoCivil + " " + edad + "\n";
    }

    
}
