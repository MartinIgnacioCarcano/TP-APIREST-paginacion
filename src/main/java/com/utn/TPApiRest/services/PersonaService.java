package com.utn.TPApiRest.services;

import com.utn.TPApiRest.entities.Persona;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;


import java.util.List;

public interface PersonaService extends BaseService<Persona,Long>{

    List<Persona> findByNombre(String filtro) throws Exception;

    Page<Persona> findByNombre(String filtro, Pageable pageable) throws Exception;

}
