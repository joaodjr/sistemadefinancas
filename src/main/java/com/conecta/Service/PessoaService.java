package com.conecta.Service;

import com.conecta.Repository.PersonRepository;
import com.conecta.entidades.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * Created by JOAO on 09/05/2019.
 */
@Service
public class PessoaService {

    @Autowired
    private PersonRepository repository;

    public Optional<Person> findById(Long id){
        Optional<Person> obj = repository.findById(id);
        return obj;
    }

    public List<Person> findAll(){
        List<Person> obj = repository.findAll();
        return obj;
    }
}
