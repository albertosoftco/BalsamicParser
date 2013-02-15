/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.balsamicparser.parser;

import com.balsamicparser.exceptions.BMMLReaderException;
import com.balsamicparser.facades.BMMLReaderFacade;
import com.balsamicparser.interfaces.IBMMLReader;
import com.balsamicparser.objects.ControlNode;
import com.balsamicparser.objects.ControlPropertiesNode;
import com.balsamicparser.objects.MockupNode;
import java.util.ArrayList;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/**
 *
@author Alberto
 */
public class BalsamicParser {

    private Document currentDoc;
    private String fileName;
    private IBMMLReader reader;
    private MockupNode mockupData;
    private ControlNode controlsData;
    
    
    public BalsamicParser() {
        
        reader = new BMMLReaderFacade();
        mockupData = new MockupNode();
        mockupData.setControls(new ArrayList<ControlNode>());
        controlsData = new ControlNode();
        controlsData.setProperties(new ArrayList<ControlPropertiesNode>());
        
        
    }

    private void processMockupTag(){
        Node mockup = currentDoc.getElementsByTagName("mockup").item(0);
        NamedNodeMap mockupAttributes = mockup.getAttributes();
        mockupData.setFontFace(mockupAttributes.getNamedItem("fontFace").getNodeValue());
        mockupData.setHeight(Integer.parseInt(mockupAttributes.getNamedItem("mockupH").getNodeValue()));
        mockupData.setWeight(Integer.parseInt(mockupAttributes.getNamedItem("mockupW").getNodeValue()));
        mockupData.setSkin(mockupAttributes.getNamedItem("skin").getNodeValue());
        //show all attributes from the mockup
        System.out.println("General mockup data:\nSkin: "+mockupData.getSkin()+
                "\nFont Face: "+mockupData.getFontFace()+"\nHeight: "+mockupData.getHeight()+
                "\nWeight: "+mockupData.getWeight());
        System.out.println("===============");
    }
    
    
    public MockupNode processBMML(String fileName) {
        this.fileName = fileName;
        try {
            //get the document from file
            this.currentDoc = reader.readBMML(fileName);

        } catch (BMMLReaderException ex) {
        }
        processMockupTag();
        processControlTags();
        processControlPropertiesTag();
        return this.mockupData;
    }
    
    private void processControlTags(){
        //get all controls from the BMML file 
        NodeList controls = currentDoc.getElementsByTagName("control");
        if(controls.getLength() > 0) {
            //iterates over the nodes list
            for(int i = 0;i < controls.getLength();i ++){
                Node node = controls.item(i);
                if(node.getNodeType() == Node.ELEMENT_NODE){
                    NamedNodeMap map = node.getAttributes();
                    controlsData.setControlID(Integer.parseInt(map.getNamedItem("controlID").getNodeValue()));
                    controlsData.setControlTypeId(map.getNamedItem("controlTypeID").getNodeValue());
                    controlsData.setH(Integer.parseInt(map.getNamedItem("h").getNodeValue()));
                    controlsData.setW(Integer.parseInt(map.getNamedItem("w").getNodeValue()));
                    controlsData.setX(Integer.parseInt(map.getNamedItem("x").getNodeValue()));
                    controlsData.setY(Integer.parseInt(map.getNamedItem("y").getNodeValue()));
                    controlsData.setzOrder(Integer.parseInt(map.getNamedItem("zOrder").getNodeValue()));
                    
                    System.out.println("General Control Data:\nControl ID: "+controlsData.getControlID()+
                            "\nControl Type ID: "+controlsData.getControlTypeId()+
                            "\nHeight: "+controlsData.getH()+"\nWeight: "+controlsData.getW()+
                            "\nX Position: "+controlsData.getX()+"\nY Position: "+controlsData.getY()+
                            "\nZ Order: "+controlsData.getzOrder());
                    System.out.println("===============");
                    //adds the control to the controls list
                    mockupData.getControls().add(controlsData);
                    
                }
            }
        }
        
        
    }
    
    private void processControlPropertiesTag(){
        //gets all control properties from a <control> tag
        NodeList nodeList = currentDoc.getElementsByTagName("control");
        
        if(nodeList.getLength() > 0){
            //start iterating over the nodes list and search for childs nodes 
            for(int i =0; i < nodeList.getLength(); i++){
                Node node = nodeList.item(i);
                // if this element is an ELEMENT_NODE
                if(node.getNodeType() == Node.ELEMENT_NODE){
                    //Parse Element
                    Element element = (Element)node;
                    //get all text properties
                    NodeList textList = element.getElementsByTagName("text");
                    
                    Element textElement = (Element)textList.item(0);
                    NodeList text = textElement.getChildNodes();
                    ControlPropertiesNode cpn = new ControlPropertiesNode();
                    cpn.setText(((Node)text.item(0)).getNodeValue());
                    mockupData.getControls().get(i).getProperties().add(cpn);
                    System.out.println("Control Text: "+((Node)text.item(0)).getNodeValue());
                            
                }
            }
        }
    }

    
}
