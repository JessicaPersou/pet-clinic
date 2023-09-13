package br.com.jps.petclinic.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Veterinarian {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String birthdate;
    private String document;
    private String phone;
    private String email;
    private String address;
    private String crmv;

    @OneToOne
    @JoinColumn(name = "consult_id")
    private Consult consult;

}
