package com.utn.TPApiRest.repositories;

import com.utn.TPApiRest.entities.Base;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.io.Serializable;

// Para que se instancie
@NoRepositoryBean

public interface BaseRepository <E extends Base,ID extends Serializable> extends JpaRepository<E,ID> {
}