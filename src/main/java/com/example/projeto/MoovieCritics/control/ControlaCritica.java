/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.projeto.MoovieCritics.control;

import com.example.projeto.MoovieCritics.data.criticEntity;
import com.example.projeto.MoovieCritics.data.filmeEntity;
import com.example.projeto.MoovieCritics.service.criticaService;
import com.example.projeto.MoovieCritics.service.filmeService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/critica")
public class ControlaCritica {
    

@Autowired 
criticaService criticaService;
@GetMapping("/listadecriticas") 
public ResponseEntity<List> getAllFilmes() { 
List<criticEntity> criticasList = criticaService.listarTodasCriticas();
return new ResponseEntity<>(criticasList, HttpStatus.OK); 
} 

@PostMapping("/criticar") 

public ResponseEntity<criticEntity> addFuncionario(@RequestBody criticEntity critica) { 

var novaCritica = criticaService.addCritica(critica);

return new ResponseEntity<>(novaCritica, HttpStatus.CREATED); 

} 

}    
    

