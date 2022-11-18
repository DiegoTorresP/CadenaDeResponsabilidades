/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.utng.chainofresponsability;

/**
 *
 * @author topd0
 */
public class ChainOfResponsability {

    public static void main(String[] args) {
         // Setup Chain of Responsibility
        Handler redHandler = new redHandler();
        Handler greenHandler = new greenHandler();
        Handler blueHandler = new blueHandler();

        redHandler.SetNextHandler(greenHandler);
        greenHandler.SetNextHandler(blueHandler);

        // Requests
        request Request = null;
        Request = new request("001", "Red");
        redHandler.ProcessRequest(Request);
        System.out.println("-------------------------------------------------------------------------------");
        Request = new request("002", "Green");
        redHandler.ProcessRequest(Request);
        System.out.println("-------------------------------------------------------------------------------");
        Request = new request("003", "Blue");
        redHandler.ProcessRequest(Request);
        System.out.println("-------------------------------------------------------------------------------");
        Request = new request("999", "White");
        redHandler.ProcessRequest(Request);
    }
}
