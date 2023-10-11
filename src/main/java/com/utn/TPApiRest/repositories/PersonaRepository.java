package com.utn.TPApiRest.repositories;

import com.utn.TPApiRest.entities.Persona;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonaRepository extends BaseRepository <Persona, Long>{

    //Anotacion metodo de Query
    List<Persona> findByNombreContainingOrApellidoContaining(String nombre, String apellido);

    @Query(
            value = "SELECT p FROM Persona p WHERE p.nombre LIKE :filtro"
    )
    List<Persona> findByNombre(@Param("filtro") String filtro);

    @Query(
            value = "SELECT * FROM Persona p WHERE p.nombre = :filtro",
            nativeQuery = true
    )
    List<Persona> findByNombre1(@Param("filtro") String filtro);

    //-------------------
    //PAGEABLE
    //-------------------

    Page<Persona> findByNombreContainingOrApellidoContaining(String nombre, String apellido, Pageable pageable);

    @Query(
            value = "SELECT p FROM Persona p WHERE p.nombre LIKE :filtro"
    )
    Page<Persona> findByNombre(@Param("filtro") String filtro,Pageable pageable);

    @Query(
            value = "SELECT * FROM Persona p WHERE p.nombre = :filtro",
            countQuery = "SELECT count(*) FROM Persona",
            nativeQuery = true
    )
    Page<Persona> findByNombre1(@Param("filtro") String filtro,Pageable pageable);
}