/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.balsamiqparser.objects;

import java.util.List;

/**
 *
 * @author Alberto
 */
public class ClassMethod {
    private String methodName;
    private String returnValue;
    private String encaps;
    
    private List<MethodParameter> parameters;
    
    public ClassMethod(String methodName,String rtnValue,String encaps, List<MethodParameter>parameters){
        this.methodName = methodName;
        this.returnValue = rtnValue;
        this.encaps = encaps;
        this.parameters = parameters;
    }
    
    public ClassMethod(){
        this(null,null,null,null);
    }

    public String getEncaps() {
        return encaps;
    }

    public void setEncaps(String encaps) {
        this.encaps = encaps;
    }

    public String getMethodName() {
        return methodName;
    }

    public void setMethodName(String methodName) {
        this.methodName = methodName;
    }

    public List<MethodParameter> getParameters() {
        return parameters;
    }

    public void setParameters(List<MethodParameter> parameters) {
        this.parameters = parameters;
    }

    public String getReturnValue() {
        return returnValue;
    }

    public void setReturnValue(String returnValue) {
        this.returnValue = returnValue;
    }
    
    
}
