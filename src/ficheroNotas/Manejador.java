/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ficheroNotas;

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
    public void characters(char[] chars, int i, int i1) throws SAXException   {
        buffer.append(chars, i, i1); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void endElement(String string, String string1, String string2) throws SAXException {
        switch (string2) {
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
    //importante importar todo con org

    @Override
    public void startElement(String string, String string1, String string2, Attributes atrbts) throws SAXException {

        switch (string2) {
            case "Empleado":
                em = new Empleado();
                listaEmpleados.add(em);
                em.setId(atrbts.getValue("id"));
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
