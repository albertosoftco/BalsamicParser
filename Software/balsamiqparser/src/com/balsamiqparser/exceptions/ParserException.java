/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.balsamiqparser.exceptions;

/**
 *
 * @author Alberto
 */
public class ParserException extends Exception {

    /**
     * Creates a new instance of <code>ParserException</code> without detail message.
     */
    public ParserException() {
    }

    /**
     * Constructs an instance of <code>ParserException</code> with the specified detail message.
     * @param msg the detail message.
     */
    public ParserException(String msg) {
        super(msg);
    }
}
