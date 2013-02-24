/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.balsamiqparser.facades;



import com.balsamiqparser.exceptions.BMMLReaderException;

import com.balsamiqparser.interfaces.IBMMLReader;
import com.balsamiqparser.reader.BMMLReader;
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

    @Override
    public Document readBMML(String fileName)throws BMMLReaderException {
       return reader.readBMML(fileName);
       
    }
    

}
