/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject;

import java.util.Calendar;
import org.springframework.stereotype.Component;

@Component
public class EjemploServicio {
    
    
    public String horaDelSistema(){
        Calendar now = Calendar.getInstance();
        String hora = now.get(Calendar.HOUR_OF_DAY) + ":" + now.get(Calendar.MINUTE);
        System.out.println(""+hora);
        return hora;
    }
    
}