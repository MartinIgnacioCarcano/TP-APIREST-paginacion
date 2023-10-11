package com.utn.TPApiRest.services;

import com.utn.TPApiRest.entities.Persona;
import com.utn.TPApiRest.repositories.BaseRepository;
import com.utn.TPApiRest.repositories.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaServiceImpl extends BaseServiceImpl<Persona,Long> implements PersonaService{

    @Autowired
    private PersonaRepository personaRepositoryRepository;

    public PersonaServiceImpl(BaseRepository<Persona, Long> baseRepository, PersonaRepository personaRepositoryRepository){
        super(baseRepository);
        this.personaRepositoryRepository = personaRepositoryRepository;
    }


    @Override
    public List<Persona> findByNombre(String filtro) throws Exception {
        try {
            //List<Persona> personas = personaRepositoryRepository.findByNombre1(filtro, filtro);
            //List<Persona> personas = personaRepositoryRepository.findByNombreContainingOrApellidoContaining(filtro);
            List<Persona> personas = personaRepositoryRepository.findByNombre(filtro);
            return personas;
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }
    @Override
    public Page<Persona> findByNombre(String filtro, Pageable pageable) throws Exception {
        try {
            //Page<Persona> personas = personaRepositoryRepository.findByNombre1(filtro, filtro, pageable);
            //Page<Persona> personas = personaRepositoryRepository.findByNombreContainingOrApellidoContaining(filtro, pageable);
            Page<Persona> personas = personaRepositoryRepository.findByNombre(filtro,pageable);
            return personas;
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }
}
