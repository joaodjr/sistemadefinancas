package com.conecta.Source;

import com.conecta.Service.DividaService;
import com.conecta.entidades.Divida;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityManager;
import java.util.Optional;

/**
 * Created by JOAO on 09/05/2019.
 */
@RestController
@RequestMapping(value = "/divida")
public class DividaSource {

    @Autowired
    private DividaService service;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<?> findById(@RequestParam(value = "id", defaultValue = "0") Long id){
        Optional<Divida> obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }
}
