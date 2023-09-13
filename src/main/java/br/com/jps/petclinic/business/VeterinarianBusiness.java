package br.com.jps.petclinic.business;

import br.com.jps.petclinic.dto.VeterinarianDTO;

import java.util.List;

public interface VeterinarianBusiness {

    List<VeterinarianDTO> findAll();

    VeterinarianDTO findById(Long id);
}
