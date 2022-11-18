/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.utng.chainofresponsability;

/**
 *
 * @author topd0
 */
public class blueHandler extends Handler {

    @Override
    public void ProcessRequest(request Request) {
        if (Request.getColor().equals("Blue"))
            System.out.println(this.getClass().getName()+" aprobo la solicitud, "+Request.getCode()+" como "+Request.getColor());
        else 
            System.out.println(this.getClass().getName()+" denego la solicitud, "+Request.getCode()+" como "+Request.getColor()+". La solicitud no se puede valida.");
        }
    }
