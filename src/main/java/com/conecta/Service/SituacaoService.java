package com.conecta.Service;

import com.conecta.Repository.SituationRepository;
import com.conecta.entidades.Situation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * Created by JOAO on 09/05/2019.
 */
@Service
public class SituacaoService {

    @Autowired
    private SituationRepository repository;

    public Optional<Situation> findById(Long id){
        Optional<Situation> obj = repository.findById(id);
        return obj;
    }
}
