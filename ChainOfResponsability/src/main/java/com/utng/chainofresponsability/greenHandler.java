/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.utng.chainofresponsability;

/**
 *
 * @author topd0
 */
public class greenHandler extends Handler{

    @Override
    public void ProcessRequest(request Request) {
        
        if (Request.getColor().equals("Green"))
        {
            System.out.println(this.getClass().getName()+" aprobo la solicitud, "+Request.getCode()+" como "+Request.getColor());
            Request.setApproved(true);
        }
        else if (Request.isApproved()==false && NextHandler != null)
        {
            System.out.println(this.getClass().getName()+" rechazó la solicitud, "+Request.getCode()+" como "+Request.getColor()+". Se trasfiere...");
            NextHandler.ProcessRequest(Request);
        }
    }
    
}
