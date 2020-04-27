package edu.poly.spring.responsibility;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import edu.poly.spring.models.Promotion;

@Repository
public interface PromotionResposibility extends CrudRepository<Promotion, Integer> {

}
