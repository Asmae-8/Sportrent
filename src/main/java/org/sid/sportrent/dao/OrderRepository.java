package org.sid.sportrent.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import org.sid.sportrent.entities.Orders;

@CrossOrigin("*")
@RepositoryRestResource
public interface OrderRepository extends JpaRepository<Orders, Long> {

}
