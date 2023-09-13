package br.com.jps.petclinic.controller;

import br.com.jps.petclinic.dto.VeterinarianDTO;
import br.com.jps.petclinic.business.businessImpl.VeterinarianBusinessImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/veterinarian")
public class VeterinarianController {

    @Autowired
    private VeterinarianBusinessImpl veterinarianBusiness;

    @org.jetbrains.annotations.NotNull
    @GetMapping
    private ResponseEntity<List<VeterinarianDTO>> allVeterinarians() {
        return ResponseEntity.ok(veterinarianBusiness.findAll());
    }

    @GetMapping("/")
    private ResponseEntity<VeterinarianDTO> findOneVeterinarian(@PathVariable Long id){
        return ResponseEntity.ok(veterinarianBusiness.findById(id));
    }

}
