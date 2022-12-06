package org.abc.repo;

import org.abc.facturation.entites.Facture;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface FacturationRepo extends JpaRepository<Facture, Long> {

}
