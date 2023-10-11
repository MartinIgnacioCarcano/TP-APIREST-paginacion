package com.utn.TPApiRest.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Localidad")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Localidad extends Base {

    @Column(name = "Denominacion")
    private String denominacion;


}
