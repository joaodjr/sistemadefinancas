package com.conecta.Service;

import com.conecta.Repository.DividaRepository;
import com.conecta.entidades.Divida;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * Created by JOAO on 09/05/2019.
 */
@Service
public class DividaService {

    @Autowired
    private DividaRepository repository;


    public Optional<Divida> findById(Long id){
        Optional<Divida> obj = repository.findById(id);
        return obj;
    }
}
