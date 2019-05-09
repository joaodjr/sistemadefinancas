package com.conecta.Source;

import com.conecta.Service.CartaoService;
import com.conecta.entidades.Card;
import com.conecta.entidades.Card;
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
@RequestMapping(value = "/card")
public class CartaoSource {

    @Autowired
    private CartaoService service;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<?> findById(@RequestParam(value = "id", defaultValue = "0") Long id){
        Optional<Card> obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }

    @RequestMapping(value = "/all")
    public ResponseEntity<List<Card>> findAll(){
         List<Card> list = service.findAll();
         return ResponseEntity.ok().body(list);
    }
}
