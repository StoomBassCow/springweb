/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mx.spring.service.imp;

import com.mx.spring.entities.Paciente;
import com.mx.spring.repository.PacienteRepository;
import com.mx.spring.service.PacienteService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author cesar.huerta
 */
public class PacienteServiceImp implements PacienteService {
    
    @Autowired
    private PacienteRepository repository;

    @Override
    public List<Paciente> getAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
