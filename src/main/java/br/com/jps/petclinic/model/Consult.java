package br.com.jps.petclinic.model;

import lombok.Data;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
@Data
@Entity
public class Consult {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date date;
    private Date hour;

    private BigDecimal value;

    @OneToOne(mappedBy = "consult")
    private Veterinarian veterinarian;

    @OneToOne(mappedBy = "consult")
    private Guardian guardian;

    @OneToOne(mappedBy = "consult")
    private Pet pet;

    private String description;
}
