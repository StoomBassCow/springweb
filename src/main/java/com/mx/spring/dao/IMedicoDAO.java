/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mx.spring.dao;

import com.mx.spring.entities.Medico;
import java.util.List;

/**
 *
 * @author cesar.huerta
 */
public interface IMedicoDAO {
    
    public List<Medico> getAll();
    
}
