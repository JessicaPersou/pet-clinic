package br.com.jps.petclinic.business.businessImpl;

import br.com.jps.petclinic.repository.ConsultRepository;
import br.com.jps.petclinic.business.ConsultBusiness;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConsultBusinessImpl implements ConsultBusiness {

    @Autowired
    private ConsultRepository consultRepository;



}
