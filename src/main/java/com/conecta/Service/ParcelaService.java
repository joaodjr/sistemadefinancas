package com.conecta.Service;

import com.conecta.Repository.ParcelaRepository;
import com.conecta.entidades.Parcela;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * Created by JOAO on 09/05/2019.
 */
@Service
public class ParcelaService {

    @Autowired
    private ParcelaRepository repository;

    public Optional<Parcela> findById(Long id){
        Optional<Parcela> obj = repository.findById(id);
        return obj;
    }
}
