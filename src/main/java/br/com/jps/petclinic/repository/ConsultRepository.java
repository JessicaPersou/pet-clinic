package br.com.jps.petclinic.repository;

import br.com.jps.petclinic.model.Consult;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConsultRepository extends JpaRepository<Consult, Long> {
}
