package com.utn.TPApiRest.services;

import com.utn.TPApiRest.entities.Persona;
import com.utn.TPApiRest.repositories.BaseRepository;
import com.utn.TPApiRest.repositories.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaServiceImpl extends BaseServiceImpl<Persona,Long> implements PersonaService{

    @Autowired
    private PersonaRepository personaRepositoryRepository;

    public PersonaServiceImpl(BaseRepository<Persona, Long> baseRepository, PersonaRepository personaRepositoryRepository){
        super(baseRepository);
        this.personaRepositoryRepository = personaRepositoryRepository;
    }
}
