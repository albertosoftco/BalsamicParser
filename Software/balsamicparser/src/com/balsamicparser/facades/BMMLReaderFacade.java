/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.balsamicparser.facades;

import com.balsamicparser.exceptions.BMMLReaderException;
import com.balsamicparser.interfaces.IBMMLReader;
import com.balsamicparser.reader.BMMLReader;
import org.w3c.dom.Document;

/**
 *  class implementing IBMMLReader
 * @author labcisco
 */
public class BMMLReaderFacade implements IBMMLReader{

    private BMMLReader reader ;

    
    public BMMLReaderFacade(){
        reader = new BMMLReader();
    }

    public Document readBMML(String fileName)throws BMMLReaderException {
       return reader.readBMML(fileName);
       
    }
    

}
