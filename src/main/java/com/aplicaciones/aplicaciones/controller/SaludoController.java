package com.aplicaciones.aplicaciones.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
@RequestMapping("/saludos")
public class SaludoController {
    
    
    @GetMapping("/hola")
    public String saludo() {
    return ("Tu primer script");
}

@GetMapping("/hola2")
public String saludo2() {
return ("Un segundo saludo");
}

@GetMapping("/holanombre/{nombre}/{edad}")
public String saludonombre(@PathVariable String nombre,
                            @PathVariable int edad) {
    return "hola "+nombre+" tu edad es:"+edad;
}

}
