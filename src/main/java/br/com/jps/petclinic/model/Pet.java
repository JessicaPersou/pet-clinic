package br.com.jps.petclinic.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Pet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String birthdate;
    private String specie;
    private String port;
    private String race;
    private String gender;

    @OneToOne
    @JoinColumn(name = "consult_id")
    private Consult consult;
}
