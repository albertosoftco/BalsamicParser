/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.balsamicparser.interfaces;

import com.balsamicparser.exceptions.BMMLReaderException;
import org.w3c.dom.Document;

/**
 *
 * @author Alberto
 */
public interface IBMMLReader {

    public Document readBMML(String fileName)throws BMMLReaderException;
}
