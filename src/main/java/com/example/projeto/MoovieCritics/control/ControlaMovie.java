/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.projeto.MoovieCritics.control;

import com.example.projeto.MoovieCritics.data.filmeEntity;


import jakarta.persistence.*;
import java.util.List;
import lombok.Data;
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
import com.example.projeto.MoovieCritics.service.criticaService;
import com.example.projeto.MoovieCritics.service.filmeService;

@RestController
@RequestMapping("/mooviec")
public class ControlaMovie {
  

@Autowired 
filmeService moovieService;
@GetMapping("/listadefilmes") 

public ResponseEntity<List> getAllFilmes() { 

List<filmeEntity> filmesList = moovieService.listarTodosFilmes(); 

return new ResponseEntity<>(filmesList, HttpStatus.OK); 
} 

@GetMapping("/pesquisarFilme/{id}") 

public ResponseEntity<filmeEntity> getFilmeById(@PathVariable Integer id) { 

filmeEntity film = moovieService.getFilmeID(id); 

return new ResponseEntity<>(film, HttpStatus.OK); 

} 

@PostMapping("/adicionarfilme") 

public ResponseEntity<filmeEntity> addFuncionario(@RequestBody filmeEntity film) { 

var novoFilme = moovieService.addFilme(film); 

return new ResponseEntity<>(novoFilme, HttpStatus.CREATED); 

} 

@PutMapping("/atualizarfilme/{id}")
public ResponseEntity<filmeEntity> atualizarFilme(@PathVariable Integer id, @RequestBody filmeEntity film) {
    var filmeAtualizado = moovieService.atualizarF(id, film);
    return new ResponseEntity<>(filmeAtualizado, HttpStatus.OK);
}

 

@DeleteMapping("/deletarfilme/{id}") 

public ResponseEntity deletarFilme(@PathVariable Integer id) { 
moovieService.deletarFilme(id);
return new ResponseEntity<>(HttpStatus.OK); 

} 

} 
   
    
    
    

