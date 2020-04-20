package edu.poly.spring.services;

import java.util.List;
import java.util.Optional;

import edu.poly.spring.models.Events;

public interface SuKienService {

	void deleteAll();

	void deleteAll(List<Events> entities);

	void delete(Events entity);

	void deleteById(String id);

	long count();

	List<Events> findAllById(List<String> ids);

	Iterable<Events> findAll();

	boolean existsById(String id);

	Optional<Events> findById(String id);

	List<Events> saveAll(List<Events> entities);

	Events save(Events entity);

}
