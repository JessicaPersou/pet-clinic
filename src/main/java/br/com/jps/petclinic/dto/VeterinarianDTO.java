package br.com.jps.petclinic.dto;

import br.com.jps.petclinic.model.Veterinarian;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class VeterinarianDTO {
    private Long id;
    private String name;
    private String birthdate;
    private String document;
    private String phone;
    private String email;
    private String address;
    private String crmv;

    public VeterinarianDTO(Veterinarian veterinarian) {
        this.id = veterinarian.getId();
        this.name = veterinarian.getName();
        this.birthdate = veterinarian.getBirthdate();
        this.document = veterinarian.getDocument();
        this.phone = veterinarian.getPhone();
        this.email = veterinarian.getEmail();
        this.address = veterinarian.getAddress();
        this.crmv = veterinarian.getCrmv();
    }
}
