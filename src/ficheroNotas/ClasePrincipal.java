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
    
    public static void main(String[] args) throws ParserConfigurationException, SAXException,IOException {
        
        File f = new File("empleados2.xml");
        SAXParserFactory spf = SAXParserFactory.newInstance();
        SAXParser sp = spf.newSAXParser();//importar con javax y arrojar las excepciones
        
        Manejador m = new Manejador();
        
        sp.parse(f,m);
        
        ArrayList<Empleado> lista = m.obtenerLista();
        
        lista.forEach((empleado) -> {
            System.out.println(empleado);
        });
        
        
        
        
        
    }
    
}
