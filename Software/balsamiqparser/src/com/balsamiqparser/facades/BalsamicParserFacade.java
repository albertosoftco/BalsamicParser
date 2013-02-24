/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.balsamiqparser.facades;

import com.balsamiqparser.interfaces.IBalsamicParser;
import com.balsamiqparser.objects.MockupNode;
import com.balsamiqparser.parser.BalsamicParser;

/**
 *
 * @author Alberto
 */
public class BalsamicParserFacade implements IBalsamicParser{

    private BalsamicParser parser;
    
    public BalsamicParserFacade(){
        parser = new BalsamicParser();
    }
    public MockupNode parseBMML(String fileName) {
        return parser.processBMML(fileName);
    }
    
}
