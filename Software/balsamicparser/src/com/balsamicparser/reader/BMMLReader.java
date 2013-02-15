/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.balsamicparser.reader;

import com.balsamicparser.exceptions.BMMLReaderException;
import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;

/**
 *
 * @author labcisco
 */
public class BMMLReader {

    private String fileName;
    private Document currentDocument;

    public BMMLReader(){
        fileName = null;
        currentDocument = null;
    }


    
    public Document readBMML(String fileName)throws BMMLReaderException{
        this.fileName = fileName;
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        
        try{
            DocumentBuilder db = dbf.newDocumentBuilder();
            currentDocument = db.parse(new File(fileName));
            
            //normalize the document
            currentDocument.getDocumentElement().normalize();
            
            //return the document ti start process
           return 
           currentDocument; 
        }catch(ParserConfigurationException ex){
            throw new BMMLReaderException("Looks like the configuration on parser is not well x(");
        }catch(SAXException ex){
            throw new BMMLReaderException("Error getting data from BMML file ");
        }catch(IOException ex){
            throw new BMMLReaderException("Could not read file");
        }
    }

}
