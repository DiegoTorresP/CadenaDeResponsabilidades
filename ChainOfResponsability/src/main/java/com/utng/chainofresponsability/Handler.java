/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.utng.chainofresponsability;

/**
 *
 * @author topd0
 */
public abstract class Handler {

    protected Handler NextHandler;
    
    public void SetNextHandler(Handler nextHandler){
        NextHandler = nextHandler;
    }
    
     public abstract void ProcessRequest(request Request);
}
