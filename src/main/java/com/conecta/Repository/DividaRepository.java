package com.conecta.Repository;

import com.conecta.entidades.Divida;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * Created by JOAO on 09/05/2019.
 */
@Repository
public interface DividaRepository extends JpaRepository<Divida, Long> {


}


