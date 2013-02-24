/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.balsamiqparser.interfaces;


import com.balsamiqparser.exceptions.BMMLReaderException;
import org.w3c.dom.Document;

/**
 *
 * @author Alberto
 */
public interface IBMMLReader {

    public Document readBMML(String fileName)throws BMMLReaderException;
}
