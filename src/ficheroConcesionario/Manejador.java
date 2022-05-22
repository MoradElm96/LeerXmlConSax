/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ficheroConcesionario;

import java.util.ArrayList;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

/**
 *
 * @author Morad
 */
public class Manejador extends DefaultHandler {

    
    ArrayList<Coche> listaCoches = new ArrayList<>();
    Coche coche;
    
    
    StringBuilder sb = new StringBuilder();
    
    
    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        sb.append(ch, start, length); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        
        switch(qName){
            case "marca":  coche.setMarca(sb.toString());
                break;
            case "modelo": coche.setModelo(sb.toString());
                break;
            case "cilindrada": coche.setCilindrada(Double.parseDouble(sb.toString()));
                break;
        }
        
    }

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        
    switch(qName){
        
        case "coche":
             coche= new Coche();
             listaCoches.add(coche);
             coche.setId("id");
            break;
            
        case "marca":  
        case "modelo": 
        case "cilindrada": sb.delete(0, sb.length());
            break;
        
    }
        
        
    }
    
    public ArrayList<Coche> obtenerLista(){
        
        return listaCoches;
    }
    
    
    
    
    
    
}
