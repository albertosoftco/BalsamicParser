/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.balsamiqparser.facades;

import com.balsamiqparser.generator.BalsamicGenerator;
import com.balsamiqparser.interfaces.IBalsamicGenerator;
import com.balsamiqparser.objects.MockupNode;

/**
 *
 * @author Alberto
 */
public class BalsamicGeneratorFacade implements IBalsamicGenerator{
    private MockupNode mockup;
    private BalsamicGenerator gen;
    public BalsamicGeneratorFacade(){
        mockup = new MockupNode();
        gen = new BalsamicGenerator();
    }
    public StringBuffer generateJavaClass(String fileName) {
        return gen.generateJavaString(fileName);
    }
    
    
}
