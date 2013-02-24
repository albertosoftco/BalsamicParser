/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.balsamiqparser.objects;

/**
 *
 * @author Alberto
 */
public class MethodParameter {
    private String parameterName;
    private String parameterKind;
    
    public MethodParameter(String parName,String parKind){
        this.parameterKind = parKind;
        this.parameterName = parName;
    }
    
    public MethodParameter(){
        this(null,null);
    }

    public String getParameterKind() {
        return parameterKind;
    }

    public void setParameterKind(String parameterKind) {
        this.parameterKind = parameterKind;
    }

    public String getParameterName() {
        return parameterName;
    }

    public void setParameterName(String parameterName) {
        this.parameterName = parameterName;
    }
    
    
}
