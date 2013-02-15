/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.balsamicparser.interfaces;

import com.balsamicparser.objects.MockupNode;

/**
 *
 * @author Alberto
 */
public interface IBalsamicParser {
    
    public MockupNode parseBMML(String fileName);
}
