
package com.mx.spring.test;

import com.mx.spring.dao.IMedicoDAO;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertNotNull;



public class MedicoDAOTest {
    
    private IMedicoDAO medicoDAO;
    
    
    public MedicoDAOTest() {
    }

  
    @Test
    public void getAllTest() {
    
        assertNotNull(medicoDAO.getAll());
        
        
    
    }
}
