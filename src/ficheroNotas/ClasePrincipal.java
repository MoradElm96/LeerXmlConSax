/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ficheroNotas;

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
        
        File f = new File("notas.xml");
        
        SAXParserFactory spf =  SAXParserFactory.newInstance();
        SAXParser sp = spf.newSAXParser();//javax
        
        Manejador m = new Manejador();
        
        sp.parse(f, m);
        
        ArrayList<Alumno> lista = m.obtenerLista();
        
        
        for (Alumno alumno : lista) {
            
            System.out.println(alumno);
            
        }
        
        
        
        
        
    }
    
}
