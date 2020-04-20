package edu.poly.spring.responsibility;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import edu.poly.spring.models.Events;

@Repository
public interface SuKienResponsibility extends CrudRepository<Events, String> {

}
