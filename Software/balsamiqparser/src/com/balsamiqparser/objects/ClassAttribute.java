/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.balsamiqparser.objects;

/**
 *
 * @author Alberto
 */
public class ClassAttribute {
    private String attName;
    private String attKind;
    private String AttEncaps;
    private String [] ENCAPSULATIONS ={"public","protected","private"};
    
    public ClassAttribute(String attributeName,String attributeKind,String attributeEncapsulation){
        this.attName = attributeName;
        this.attKind = attributeKind;
        this.AttEncaps = attributeEncapsulation;
    }
    
    public ClassAttribute(){
        this(null,null,null);
    }

    public String getAttEncaps() {
        return AttEncaps;
    }

    public void setAttEncaps(String AttEncaps) {
        this.AttEncaps = AttEncaps;
    }

    public String[] getENCAPSULATIONS() {
        return ENCAPSULATIONS;
    }

    public void setENCAPSULATIONS(String[] ENCAPSULATIONS) {
        this.ENCAPSULATIONS = ENCAPSULATIONS;
    }

    public String getAttKind() {
        return attKind;
    }

    public void setAttKind(String attKind) {
        this.attKind = attKind;
    }

    public String getAttName() {
        return attName;
    }

    public void setAttName(String attName) {
        this.attName = attName;
    }
    
    
    
}
