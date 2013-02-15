/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.balsamicparser.exceptions;

/**
 *
 * @author Alberto
 */
public class BMMLReaderException extends Exception {

    /**
     * Creates a new instance of <code>BMMLReaderException</code> without detail message.
     */
    public BMMLReaderException() {
    }

    /**
     * Constructs an instance of <code>BMMLReaderException</code> with the specified detail message.
     * @param msg the detail message.
     */
    public BMMLReaderException(String msg) {
        super(msg);
    }
}
