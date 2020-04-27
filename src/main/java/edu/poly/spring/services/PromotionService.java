package edu.poly.spring.services;

import java.util.List;
import java.util.Optional;

import edu.poly.spring.models.Promotion;

public interface PromotionService {

	void deleteAll();

	void deleteAll(List<Promotion> entities);

	void delete(Promotion entity);

	void deleteById(Integer id);

	long count();

	Iterable<Promotion> findAllById(List<Integer> ids);

	Iterable<Promotion> findAll();

	boolean existsById(Integer id);

	Optional<Promotion> findById(Integer id);

	List<Promotion> saveAll(List<Promotion> entities);

	Promotion save(Promotion entity);

}
