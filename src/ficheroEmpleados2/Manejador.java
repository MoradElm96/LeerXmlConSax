/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ficheroEmpleados2;

import java.util.ArrayList;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

/**
 *
 * @author Morad
 */
public class Manejador extends DefaultHandler {
    
    ArrayList<Empleado> listaEmpleados = new ArrayList<>();
    Empleado emp;
    
    StringBuilder sb = new StringBuilder();

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        sb.append(ch, start, length); 
        
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        switch(qName){
            case "nombre": 
                
                emp.setNombre(sb.toString());
                
                break;
            case "apellido":
                emp.setApellidos(sb.toString());
                break;
            case "nif":
                emp.setNif(sb.toString());
                break;
            case "empresa":
                emp.setEmpresa(sb.toString());
                break;
            case "direccion":
                emp.setDireccion(sb.toString());
                break;
            case "cp":
                emp.setCp(Integer.parseInt(sb.toString()));
                break;
            case "localidad":
                emp.setLocalidad(sb.toString());
                break;
            case "tlf_fijo":
                emp.setTlf_fijo(Integer.parseInt(sb.toString()));
                break;
            case "tlf_movil":
                emp.setTlf_movil(Integer.parseInt(sb.toString()));
                break;
        }
        
    }

    
    
    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        switch(qName){
            case "empleado":
                emp = new Empleado();
                listaEmpleados.add(emp);
                break;
            case "nombre":
            case "apellido":
            case "nif":
            case "empresa":
            case "direccion":
            case "cp":
            case "localidad":
            case "tlf_fijo":
            case "tlf_movil":
                sb.delete(0, sb.length());
                break;
        }
        
    }
    
    
    
    
    
    
    
    
    
    public ArrayList<Empleado> obtenerEmpleados(){
        return listaEmpleados;
    }
    
    
}
