package org.abc.repo;

import org.abc.facturation.entites.ProductItm;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource
public interface ProductItemRepo extends JpaRepository<ProductItm, Long> {

}
