package co.com.ps.JAC18.controller;

import co.com.ps.JAC18.modelo.Evento;
import co.com.ps.JAC18.repository.EventoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EventoController {

    @Autowired
    EventoRepository eventoRepository;

    @PostMapping("/evento")
    public String lanzadorDeMensajes(@RequestBody Evento evento){

        eventoRepository.save(evento);

        return "Evento lanzado exitosamente";
    }

    @GetMapping()
    public String ping(){
       return "ok";
    }


}
