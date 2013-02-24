/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.balsamiqparser.generator;

import com.balsamiqparser.facades.BalsamicParserFacade;
import com.balsamiqparser.interfaces.IBalsamicParser;
import com.balsamiqparser.objects.MockupNode;


/**
 *
 * @author Alberto
 */
public class BalsamicGenerator {
    
    private IBalsamicParser parser;
    private MockupNode mockup;
    private StringBuffer sb;
    private String fileName;
    private static final String PACKAGES[] ={"import javax.swing.*;"};
    public BalsamicGenerator(){
        parser = new BalsamicParserFacade();
        sb = new StringBuffer();
    }
    
    private void generateClassName(String className){
        sb.append("public class ".concat(className).concat(" extends javax.swing.JFrame{"));
    }
    
    private void generateImportLines(){
        for(String s : PACKAGES){
            sb.append(s.concat("\n"));
        }
    }
    public StringBuffer generateJavaString(String fileName){
        this.fileName = fileName;
        mockup = parser.parseBMML(fileName);
        String className = fileName.substring(0,fileName.indexOf("."));
        generateImportLines();
        generateClassName(className);
        return sb;
    }
}
