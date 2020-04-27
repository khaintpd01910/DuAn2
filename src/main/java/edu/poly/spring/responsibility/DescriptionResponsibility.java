package edu.poly.spring.responsibility;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import edu.poly.spring.models.Description;

@Repository
public interface DescriptionResponsibility extends CrudRepository<Description, Integer> {

}
