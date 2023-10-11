package com.utn.TPApiRest.repositories;

import com.utn.TPApiRest.entities.Persona;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepository extends BaseRepository <Persona, Long>{
}