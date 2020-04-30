package edu.poly.spring.services;

import java.util.List;
import java.util.Optional;

import edu.poly.spring.models.Description;

public interface DescriptionService {

	void deleteAll();

	void deleteAll(List<Description> entities);

	void delete(Description entity);

	void deleteById(Integer id);

	long count();

	List<Description> findAllById(List<Integer> ids);

	Iterable<Description> findAll();

	boolean existsById(Integer id);

	Optional<Description> findById(Integer id);

	List<Description> saveAll(List<Description> entities);

	Description save(Description entity);

}
