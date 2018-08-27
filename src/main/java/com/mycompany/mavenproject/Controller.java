/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/config")
public class Controller {
    
    
    @Autowired
    public EjemploServicio ejemploServicio;
    
    @RequestMapping(value = "/horas/", method = RequestMethod.GET)
    public ResponseEntity<String> obtenerHoraActual() {
        String hora = ejemploServicio.horaDelSistema();
        return new ResponseEntity<String>(hora, HttpStatus.OK);
    }
    
    
}