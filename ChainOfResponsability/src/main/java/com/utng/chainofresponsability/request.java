/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.utng.chainofresponsability;

/**
 *
 * @author topd0
 */
public class request {
     public request(String code, String color)
        {
            Code = code;
            Color = color;
            Approved = false;
        }

        
        public String Code;
        public String Color;
        public boolean Approved;

    public String getCode() {
        return Code;
    }

    public void setCode(String Code) {
        this.Code = Code;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    public boolean isApproved() {
        return Approved;
    }

    public void setApproved(boolean Approved) {
        this.Approved = Approved;
    }
        
        
}
