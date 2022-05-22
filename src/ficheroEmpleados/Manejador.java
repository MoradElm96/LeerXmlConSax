/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ficheroEmpleados;

import java.util.ArrayList;
import org.xml.sax.Attributes;



import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

/**
 *
 * @author Morad
 */
public class Manejador extends DefaultHandler {

    //extender de defaulthandler
    ArrayList<Empleado> listaEmpleados = new ArrayList<>();
    Empleado em;

    StringBuilder buffer = new StringBuilder();

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        buffer.append(ch, start, length); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        switch (qName) {
            case "nombre":  em.setNombre(buffer.toString());
                break;
            case "edad":  em.setEdad(Integer.parseInt(buffer.toString()));
                break;
            case "sexo":   em.setSexo(buffer.toString());
                break;
            case "categoria":  em.setCategoria(buffer.toString());
                break;

        }
    }

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
         switch (qName) {
            case "Empleado":
                em = new Empleado();
                listaEmpleados.add(em);
                em.setId(attributes.getValue("id"));
                break;

            case "nombre":
            case "edad":
            case "sexo":
            case "categoria":
                buffer.delete(0, buffer.length());//borramos
                break;
        }
    }
    
    //metodo para usar en la clase principal
    public ArrayList<Empleado> obtenerLista(){
    
        return listaEmpleados;
    }

}
