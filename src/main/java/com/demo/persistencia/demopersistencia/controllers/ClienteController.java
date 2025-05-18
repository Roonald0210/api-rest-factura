package com.demo.persistencia.demopersistencia.controllers;

//import java.time.LocalDate;
//import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//import com.demo.persistencia.demopersistencia.dto.DetalleFacturaRequest;
import com.demo.persistencia.demopersistencia.dto.FacturaDTO;
//import com.demo.persistencia.demopersistencia.dto.FacturaRequest;
//import com.demo.persistencia.demopersistencia.entidades.DetalleFactura;
import com.demo.persistencia.demopersistencia.entidades.Cliente;
import com.demo.persistencia.demopersistencia.services.ClienteService;

@RestController
@RequestMapping("/api")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;


    //busca clientes en la db por medio de un idCliente.
    @GetMapping("/cliente/{clienteId}")
    public List<FacturaDTO> getCliente(@PathVariable Long clienteId) {
        return clienteService.consultarCliente(clienteId);
    }

}
