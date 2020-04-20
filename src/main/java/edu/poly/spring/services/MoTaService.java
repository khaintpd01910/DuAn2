package edu.poly.spring.services;

import java.util.List;
import java.util.Optional;

import edu.poly.spring.models.Description;

public interface MoTaService {

	void deleteAll();

	void deleteAll(List<Description> entities);

	void delete(Description entity);

	void deleteById(String id);

	long count();

	List<Description> findAllById(List<String> ids);

	Iterable<Description> findAll();

	boolean existsById(String id);

	Optional<Description> findById(String id);

	List<Description> saveAll(List<Description> entities);

	Description save(Description entity);

}
