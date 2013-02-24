/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.balsamiqparser.generator;

import com.balsamiqparser.objects.ClassAttribute;
import com.balsamiqparser.objects.ControlNode;
import com.balsamiqparser.objects.JavaClass;
import com.balsamiqparser.objects.MockupNode;

/**
 *
 * @author Alberto
 */
public class BalsamicJavaClassConverter {
    private JavaClass javaClass;
    private MockupNode mockup;
    private String fileName;
    public BalsamicJavaClassConverter(){
        
    }
    
    public JavaClass generateJavaClass(String fileName,MockupNode mockup){
        this.fileName = fileName;
        this.mockup = mockup;
        javaClass = new JavaClass(fileName);
        //add all controls to attributes list 
        for(ControlNode cn : mockup.getControls()){
            ClassAttribute controlAtt = new ClassAttribute(cn.getControlTypeId().substring(cn.getControlTypeId().indexOf(":")+1, cn.getControlTypeId().length()), 
                    fileName, fileName);
            javaClass.getAttributes().add(controlAtt);
            
            
        }
        return javaClass;
    }
    
    
    
}
