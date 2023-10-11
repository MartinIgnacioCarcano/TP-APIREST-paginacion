package com.utn.TPApiRest.controllers;

import com.utn.TPApiRest.entities.Localidad;
import com.utn.TPApiRest.services.LocalidadServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/localidades")
public class LocalidadController extends BaseControllerImpl <Localidad, LocalidadServiceImpl> {
}
