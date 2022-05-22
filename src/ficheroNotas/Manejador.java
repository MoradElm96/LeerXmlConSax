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

    //crear el arraylist
    ArrayList<Alumno> listaAlumnos = new ArrayList<>();
    //instanciamos un objeto
    Alumno al;

    //buffer con stringbuilder
    StringBuilder sb = new StringBuilder();

    //implementar los metodos override, endElement, startElement y characters
    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        sb.append(ch, start, length); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        switch (qName) {

            case "nombre":
                
                al.setNombre(sb.toString());
                
                break;
                
            case "nota1":
                al.setNota1(Integer.parseInt(sb.toString()));
                break;
            case "nota2":
                al.setNota2(Integer.parseInt(sb.toString()));
                break;
            case "proyecto":
                al.setProyecto(Integer.parseInt(sb.toString()));
                break;
            case "practica":
                al.setPractica(Integer.parseInt(sb.toString()));
                break;

        }
    }

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {

        switch (qName) {
            case "alumno":
                        al = new Alumno();
                        listaAlumnos.add(al);
                        al.setId(attributes.getValue("id"));
             break;
             
            case "nombre":
               
            case "nota1":
                
            case "nota2":
               
            case "proyecto":
                
            case "practica":
                sb.delete(0, sb.length());
                
                break;

        }
    }
    
    public ArrayList<Alumno> obtenerLista(){
        
        return listaAlumnos;
    }

}
