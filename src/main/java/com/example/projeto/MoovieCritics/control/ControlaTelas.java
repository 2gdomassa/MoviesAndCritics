/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.projeto.MoovieCritics.control;

import ch.qos.logback.core.model.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class ControlaTelas {

@GetMapping("/cadastrarfilme")
public String mostraTelaCadastro(){
return "cadastraFilme"; // Retorna o nome do arquivo HTML a ser renderizado
    }
    
}
