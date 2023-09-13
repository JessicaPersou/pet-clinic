package br.com.jps.petclinic.dto;

import br.com.jps.petclinic.model.Guardian;
import br.com.jps.petclinic.model.Pet;
import br.com.jps.petclinic.model.Veterinarian;

import java.math.BigDecimal;
import java.util.Date;

public class ConsultDTO {

    private Long id;
    private Date date;
    private Date hour;
    private BigDecimal value;
    private Veterinarian doctorVet;
    private Guardian guardian;
    private Pet pet;
    private String description;
}
