/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.balsamicparser.generator;

import com.balsamicparser.facades.BMMLReaderFacade;
import com.balsamicparser.facades.BalsamicParserFacade;
import com.balsamicparser.interfaces.IBMMLReader;
import com.balsamicparser.interfaces.IBalsamicParser;
import com.balsamicparser.objects.MockupNode;

/**
 *
 * @author Alberto
 */
public class BalsamicGenerator {
    private IBMMLReader reader;
    private IBalsamicParser parser;
    private String fileName;
    private String source;
    private MockupNode mockup;
    private StringBuffer sourceBuffer;
    
    public BalsamicGenerator(){
        reader = new BMMLReaderFacade();
        parser = new BalsamicParserFacade();
        fileName = new String();
        source = new String();
        mockup = null;
        sourceBuffer = new StringBuffer();
    }
    
    public void generateSource(String fileName){
        //create the form from the mockup object
        
    }
    
    private void generateForm(MockupNode mockup){
        this.mockup = mockup;
        
    }
    
    private void generateClass(String className){
        this.fileName = className.concat(".java");
        
    }
    
    
    
    
    
}
