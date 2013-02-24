/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.balsamiqparser.utils;

/**
 *
 * @author Alberto
 */
public class ComponentGenerator {
    
    public static final String[]CONTROLS={"com.balsamiq.mockups::TitleWindow","com.balsamiq.mockups::MenuBar","com.balsamiq.mockups::CheckBox",
        "com.balsamiq.mockups::ComboBox","com.balsamiq.mockups::Button","com.balsamiq.mockups::DataGrid","com.balsamiq.mockups::Label","com.balsamiq.mockups::VerticalScrollBar","com.balsamiq.mockups::HorizontalScrollBar",
        "com.balsamiq.mockups::RadioButton","com.balsamiq.mockups::TextArea","com.balsamiq.mockups::TextInput ","com.balsamiq.mockups::NumericStepper" };
    
    public ComponentGenerator(){
        
    }
    
    public void generateForm(String controlType){
        if(controlType.equals("com.balsamiq.mockups::TitleWindow")){
            
        }
                
    }
//    public void generateComponent(String component){
//        for(String control: CONTROLS ){
//            if(control.equals(component)){
//                if()
//            }
//        }
//    }
}
