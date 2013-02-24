/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.balsamiqparser.objects;

import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author Alberto
 */
public class JavaClass {
    private MockupNode mockup;
    private String fileName;
    private List<ClassAttribute>attributes;
    private List<ClassMethod>methods;
    
    public JavaClass(String fileName,MockupNode mockup,List<ClassAttribute>atts,List<ClassMethod>methds){
        this.fileName = fileName;
        this.mockup = mockup;
        this.attributes = atts;
        this.methods = methds;
    }
    
    public JavaClass(String fileName){
        this(fileName,null,new ArrayList<ClassAttribute>(),new ArrayList<ClassMethod>());
    }
    
    
    public JavaClass(){
        this(null,null,new ArrayList<ClassAttribute>(),new ArrayList<ClassMethod>());
    }

    public List<ClassAttribute> getAttributes() {
        return attributes;
    }

    public void setAttributes(List<ClassAttribute> attributes) {
        this.attributes = attributes;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public List<ClassMethod> getMethods() {
        return methods;
    }

    public void setMethods(List<ClassMethod> methods) {
        this.methods = methods;
    }

    public MockupNode getMockup() {
        return mockup;
    }

    public void setMockup(MockupNode mockup) {
        this.mockup = mockup;
    }
    
    
    
}
