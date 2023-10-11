package com.utn.TPApiRest.services;

import com.utn.TPApiRest.entities.Autor;
import com.utn.TPApiRest.repositories.AutorRepository;
import com.utn.TPApiRest.repositories.BaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AutorServiceImpl extends BaseServiceImpl <Autor, Long> implements AutorService{

    @Autowired
    private AutorRepository autorRepositoryRepository;

    public AutorServiceImpl(BaseRepository<Autor, Long> baseRepository, AutorRepository autorRepositoryRepository) {
        super(baseRepository);
        this.autorRepositoryRepository = autorRepositoryRepository;
    }
}
