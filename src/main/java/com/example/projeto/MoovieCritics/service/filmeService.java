package com.example.projeto.MoovieCritics.service;
import com.example.projeto.MoovieCritics.data.filmeEntity;
import com.example.projeto.MoovieCritics.data.filmeRepository;
import java.util.List; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.stereotype.Service; 
@Service
public class filmeService {
@Autowired
filmeRepository filmeRepository; 
public filmeEntity addFilme(filmeEntity film) { 
  film.setId(null); 
filmeRepository.save(film); 
return film; 
} 
public filmeEntity atualizarF(Integer filmeID, filmeEntity filmeRequest) { 
filmeEntity film = getFilmeID(filmeID); 
film.setTitle(filmeRequest.getTitle()); 
film.setDescriptionn(filmeRequest.getDescriptionn()); 
film.setGender(filmeRequest.getGender()); 
film.setReleasedyear(filmeRequest.getReleasedyear()); 
filmeRepository.save(film); 
return film; 
} 
public filmeEntity getFilmeID(Integer filmId) { 
return filmeRepository.findById(filmId).orElse(null); 
} 
public List<filmeEntity> listarTodosFilmes() { 
return filmeRepository.findAll(); 
} 
public void deletarFilme(Integer filmeID) { 
filmeEntity film = getFilmeID(filmeID); 
filmeRepository.deleteById(film.getId()); 
}   
}
