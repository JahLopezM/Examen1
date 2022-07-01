/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.controller;

import com.example.entity.artista;
import com.example.service.IdatosService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 *
 * @author Sky
 */
public class datosController {
    
      @Autowired
       private IdatosService datosService;
       @GetMapping("/persona")
    public String index(Model model) {
        List<artista> Listaartista;
          Listaartista = datosService.getAllPersona();
        model.addAttribute("titulo", "Tabla de eventos");
        model.addAttribute("personas", Listaartista);
        return "datos";
    }
     @GetMapping("/eventoN")
    public String CrearPersona(Model model) {
        List<artista> Listaartista;
          Listaartista = datosService.getAllPersona();
        model.addAttribute("evento",new artista());
        model.addAttribute("Artista", Listaartista);
        return "crear";}
    
    
       @GetMapping("/delete/{id}")
    public String eliminarPersona(@PathVariable("id")long ldartista){
    datosService.delete(ldartista);
    return "redirect:/datos";
    }
    
    
     
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
