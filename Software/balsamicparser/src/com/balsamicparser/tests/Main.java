/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.balsamicparser.tests;

import com.balsamicparser.facades.BMMLReaderFacade;
import com.balsamicparser.interfaces.IBMMLReader;
import com.balsamicparser.parser.BalsamicParser;

/**
 *
 * @author Alberto
 */
public class Main {

    public static void main(String args[]){
        BalsamicParser parser = new BalsamicParser();
        
        parser.processBMML("Help.bmml");
    }
}
