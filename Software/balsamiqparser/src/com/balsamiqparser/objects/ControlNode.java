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
public class ControlNode {
    private int controlID;
    private String controlTypeId;
    private int x,y;
    private int w,h;
    private int zOrder;
    private List<ControlPropertiesNode>properties;
    
    /**
     * makes a suitable constructor to the control node 
     * @param controlTypeId
     * @param x
     * @param y
     * @param w
     * @param h
     * @param zOrder 
     * @param controlID
     */
    public ControlNode(int controlID,String controlTypeId,int x, int y, int w, int h, int zOrder){
        this.controlID = controlID;
        this.controlTypeId = controlTypeId;
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
        this.zOrder = zOrder;
                
    }
    
    public ControlNode(){
        this(0,null,0,0,0,0,0);
    }

    public int getControlID() {
        return controlID;
    }

    public void setControlID(int controlID) {
        this.controlID = controlID;
    }

    public String getControlTypeId() {
        return controlTypeId;
    }

    public void setControlTypeId(String controlTypeId) {
        this.controlTypeId = controlTypeId;
    }

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }

    public int getW() {
        return w;
    }

    public void setW(int w) {
        this.w = w;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getzOrder() {
        return zOrder;
    }

    public void setzOrder(int zOrder) {
        this.zOrder = zOrder;
    }

    public List<ControlPropertiesNode> getProperties() {
        return properties;
    }

    public void setProperties(List<ControlPropertiesNode> properties) {
        this.properties = properties;
    }
    
    
}
