package com.mx.spring.service.imp;



import com.mx.spring.dao.IMedicoDAO;
import com.mx.spring.entities.Medico;
import com.mx.spring.service.MedicoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class MedicoServiceImp implements MedicoService{

    @Autowired
    private IMedicoDAO medicoDAO;
    
        
    @Override
    public List<Medico> getAll() {
        return medicoDAO.getAll();
    }
    
}
