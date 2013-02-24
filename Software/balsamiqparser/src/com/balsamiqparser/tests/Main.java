/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.balsamiqparser.tests;

import com.balsamiqparser.facades.BalsamicGeneratorFacade;
import com.balsamiqparser.facades.BalsamicParserFacade;

import com.balsamiqparser.interfaces.IBalsamicGenerator;
import com.balsamiqparser.interfaces.IBalsamicParser;

/**
 *
 * @author Alberto
 */
public class Main {

    public static void main(String args[]){
        IBalsamicGenerator gen = new BalsamicGeneratorFacade();
        System.out.println(gen.generateJavaClass("Help.bmml").toString());
    }
}
