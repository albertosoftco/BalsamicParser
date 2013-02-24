/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.balsamiqparser.interfaces;

import com.balsamiqparser.objects.MockupNode;

/**
 *
 * @author Alberto
 */
public interface IBalsamicParser {
    
    public MockupNode parseBMML(String fileName);
}
