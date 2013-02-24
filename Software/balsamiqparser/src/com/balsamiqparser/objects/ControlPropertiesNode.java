/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.balsamiqparser.objects;

/**
 *
 * @author Alberto
 */
public class ControlPropertiesNode {
   
    private String text;
    
    /**
     * initialize a control properties node 
     * @param text 
     */
    public ControlPropertiesNode(String text){
        this.text = text;
     }
    
    public ControlPropertiesNode(){
        this(null);
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

}
