package br.com.jps.petclinic.business.businessImpl;

import br.com.jps.petclinic.business.VeterinarianBusiness;
import br.com.jps.petclinic.dto.VeterinarianDTO;
import br.com.jps.petclinic.model.Veterinarian;
import br.com.jps.petclinic.repository.VeterinarianRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.List;

@Service
public class VeterinarianBusinessImpl implements VeterinarianBusiness {

    @Autowired
    private VeterinarianRepository veterinarianRepository;

    @Override
    public List<VeterinarianDTO> findAll(){
        List<Veterinarian> allVeterinarians = veterinarianRepository.findAll();
        List<VeterinarianDTO> dtos = new ArrayList<>();

        for (Veterinarian vet: allVeterinarians) {
            VeterinarianDTO veterinarianDTO = new VeterinarianDTO();
            veterinarianDTO.setId(vet.getId());
            veterinarianDTO.setName(vet.getName());
            veterinarianDTO.setBirthdate(vet.getBirthdate());
            veterinarianDTO.setDocument(vet.getDocument());
            veterinarianDTO.setPhone(vet.getPhone());
            veterinarianDTO.setEmail(vet.getEmail());
            veterinarianDTO.setAddress(vet.getAddress());
            veterinarianDTO.setCrmv(vet.getCrmv());
            dtos.add(veterinarianDTO);
        }
        return dtos;
    }

    @Override
    public VeterinarianDTO findById(Long id) {
        Veterinarian vet = veterinarianRepository.findById(id).orElseThrow(() -> new RuntimeException("Erro ao consultar ID " + id));
        return new VeterinarianDTO(vet);
    }
}
