/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.balsamiqparser.exceptions;

/**
 *
 * @author Alberto
 */
public class JavaClassGenException extends Exception {

    /**
     * Creates a new instance of <code>JavaClassGenException</code> without detail message.
     */
    public JavaClassGenException() {
    }

    /**
     * Constructs an instance of <code>JavaClassGenException</code> with the specified detail message.
     * @param msg the detail message.
     */
    public JavaClassGenException(String msg) {
        super(msg);
    }
}
