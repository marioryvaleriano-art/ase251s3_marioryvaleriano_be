package com.bodegapeirano.cosechas;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CosechaController {

    @GetMapping("/cosechas")
    public String listarCosechas(){
        return "Listado de cosechas de la Bodega Peirano";
    }

}