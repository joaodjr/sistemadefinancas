package com.conecta.Source;

import com.conecta.Service.PessoaService;
import com.conecta.entidades.Person;
import com.conecta.entidades.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

/**
 * Created by JOAO on 09/05/2019.
 */
@RestController
@RequestMapping(value = "person")
public class PersonSource {

    @Autowired
    private PessoaService service;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<?> findById(@RequestParam(value = "id", defaultValue = "0") Long id){
        Optional<Person> obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }

    @RequestMapping(value = "all", method = RequestMethod.GET)
    public ResponseEntity<List<Person>> findAll(){
        List<Person> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }
}
