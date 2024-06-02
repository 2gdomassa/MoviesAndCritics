package com.example.projeto.MoovieCritics.service;
import com.example.projeto.MoovieCritics.data.criticaRepository;
import com.example.projeto.MoovieCritics.data.criticEntity;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class criticaService {

@Autowired
private criticaRepository criticaRepository;

    public criticEntity addCritica(criticEntity critic) {
        critic.setId(null);
        return criticaRepository.save(critic);
    }

    public criticEntity atualizarC(Integer criticID, criticEntity criticRequest) {
        criticEntity critic = getCriticID(criticID);
        if (critic != null) {
            critic.setTitleopinion(criticRequest.getTitleopinion());
            critic.setDescriptionopinion(criticRequest.getDescriptionopinion());
            critic.setScore(criticRequest.getScore());
            return criticaRepository.save(critic);
        }
        return null;
    }

    public criticEntity getCriticID(Integer criticID) {
        return criticaRepository.findById(criticID).orElse(null);
    }

    public List<criticEntity> listarTodasCriticas() {
        return criticaRepository.findAll();
    }

    public void deletarCritica(Integer criticID) {
        criticEntity critic = getCriticID(criticID);
        if (critic != null) {
            criticaRepository.deleteById(critic.getId());
        }
    }
}
