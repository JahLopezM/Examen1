/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.service;

import com.example.entity.artista;
import java.util.List;

/**
 *
 * @author Sky
 */

    public interface IdatosService {
    public List<artista> getAllPersona();
    public artista getById (long id);
    public void saveArtista (artista artista);
    public void delete (long id);
     
}
    

