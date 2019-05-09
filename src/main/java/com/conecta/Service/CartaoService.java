package com.conecta.Service;

import com.conecta.Repository.CardRepository;
import com.conecta.entidades.Card;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * Created by JOAO on 09/05/2019.
 */
@Service
public class CartaoService {

    @Autowired
    private CardRepository repository;

    public Optional<Card> findById(Long id){
        Optional<Card> obj = repository.findById(id);
        return obj;
    }

    public List<Card> findAll(){
        List<Card> list = repository.findAll();
        return list;
    }
}
