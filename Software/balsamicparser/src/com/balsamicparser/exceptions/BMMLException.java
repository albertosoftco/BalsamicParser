/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.balsamicparser.exceptions;

/**
 *
 * @author labcisco
 */
public class BMMLException extends Exception {

    /**
     * Creates a new instance of <code>BMMLException</code> without detail message.
     */
    public BMMLException() {
    }


    /**
     * Constructs an instance of <code>BMMLException</code> with the specified detail message.
     * @param msg the detail message.
     */
    public BMMLException(String msg) {
        super(msg);
    }
}
