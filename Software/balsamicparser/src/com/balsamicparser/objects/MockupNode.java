/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.balsamicparser.objects;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Alberto
 */
public class MockupNode {
    
    private String fontFace;
    private String skin;
    private int weight,height;
    private List<ControlNode> controls;
    
    public MockupNode(String fontFace,String skin, int w,int h, ArrayList<ControlNode> controls){
        this.fontFace = fontFace;
        this.skin = skin;
        this.weight = w;
        this.height = h;
        this.controls = controls;
                
    }
    
    public MockupNode(){
        this(null,null,0,0,null);
    }

    public String getFontFace() {
        return fontFace;
    }

    public void setFontFace(String fontFace) {
        this.fontFace = fontFace;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getSkin() {
        return skin;
    }

    public void setSkin(String skin) {
        this.skin = skin;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public List<ControlNode> getControls() {
        return controls;
    }

    public void setControls(List<ControlNode> controls) {
        this.controls = controls;
    }
    
    
    
    
}
