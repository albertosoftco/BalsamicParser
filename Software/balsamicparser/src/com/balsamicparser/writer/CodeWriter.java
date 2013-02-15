/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.balsamicparser.writer;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Alberto
 */
public class CodeWriter {
    
    private BufferedWriter writer;
    private StringBuffer completeText;
    private String fileName;
    
    public CodeWriter(){
        completeText = new StringBuffer();
        fileName = new String();
    }
    
    public void writeFile(String fileName,String source){
        
    }
    
}
