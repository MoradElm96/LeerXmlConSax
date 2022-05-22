/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ficheroConcesionario;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.SAXException;

/**
 *
 * @author Morad
 */
public class ClasePrincipal {
    public static void main(String[] args) throws SAXException, ParserConfigurationException, IOException {
        
        File f  = new File("concesionario.xml");
        
        SAXParserFactory spf = SAXParserFactory.newInstance();
        
        SAXParser sp = spf.newSAXParser();
        
        Manejador m = new Manejador();
        
        sp.parse(f, m);
        
        ArrayList<Coche> lista = m.obtenerLista();
        
        for (Coche coche : lista) {
            
            System.out.println(coche.toString());
        }
        
        
        
        
    }
}
