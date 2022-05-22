/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ficheroEmpleados2;

/**
 *
 * @author Morad
 */
public class Empleado {
    
    private String nombre,apellidos,nif,empresa,direccion;
    private int cp;
    private String localidad;
    private int tlf_fijo,tlf_movil;

    public Empleado() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getCp() {
        return cp;
    }

    public void setCp(int cp) {
        this.cp = cp;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public int getTlf_fijo() {
        return tlf_fijo;
    }

    public void setTlf_fijo(int tlf_fijo) {
        this.tlf_fijo = tlf_fijo;
    }

    public int getTlf_movil() {
        return tlf_movil;
    }

    public void setTlf_movil(int tlf_movil) {
        this.tlf_movil = tlf_movil;
    }

    
    
    @Override
    public String toString() {
        return "Empleado2{" + "nombre=" + nombre + ", apellidos=" + apellidos + ", nif=" + nif + ", empresa=" + empresa + ", direccion=" + direccion + ", cp=" + cp + ", localidad=" + localidad + ", tlf_fijo=" + tlf_fijo + ", tlf_movil=" + tlf_movil + '}';
    }

    
    
    public Empleado(String nombre, String apellidos, String nif, String empresa, String direccion, int cp, String localidad, int tlf_fijo, int tlf_movil) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.nif = nif;
        this.empresa = empresa;
        this.direccion = direccion;
        this.cp = cp;
        this.localidad = localidad;
        this.tlf_fijo = tlf_fijo;
        this.tlf_movil = tlf_movil;
    }
    
    
   
    
}
