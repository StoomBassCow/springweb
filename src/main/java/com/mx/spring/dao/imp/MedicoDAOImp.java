
package com.mx.spring.dao.imp;

import com.mx.spring.dao.IMedicoDAO;
import com.mx.spring.entities.Medico;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;

@Repository 
public class MedicoDAOImp implements IMedicoDAO {

    @Override
    public List<Medico> getAll() {
        List<Medico> medicos = new ArrayList<>();
        medicos.add(new Medico(1,"MEDICO 1"));
        medicos.add(new Medico(2,"MEDICO 2"));
        medicos.add(new Medico(3,"MEDICO 3"));
        medicos.add(new Medico(4,"MEDICO 4"));
        
        return medicos;
    }
    
}
