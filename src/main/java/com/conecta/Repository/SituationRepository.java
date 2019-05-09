package com.conecta.Repository;

import com.conecta.entidades.Situation;
import com.conecta.entidades.Situation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by JOAO on 09/05/2019.
 */
@Repository
public interface SituationRepository extends JpaRepository<Situation, Long> {
}
