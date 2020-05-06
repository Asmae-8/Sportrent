package org.sid.sportrent.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import javax.persistence.criteria.Order;

@CrossOrigin("*")
@RepositoryRestResource
public interface OrderRepository extends JpaRepository<Order, Long> {

}
