/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.balsamicparser.facades;

import com.balsamicparser.interfaces.IBalsamicParser;
import com.balsamicparser.objects.MockupNode;
import com.balsamicparser.parser.BalsamicParser;

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
