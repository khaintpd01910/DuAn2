package edu.poly.spring.services;

import java.util.List;
import java.util.Optional;

import edu.poly.spring.models.Admin;

public interface QuanLyService {

	Admin save(Admin entity);

	void deleteAll();

	void deleteAll(List<Admin> entities);

	void delete(Admin entity);

	void deleteById(String id);

	long count();

	List<Admin> findAllById(List<String> ids);

	Iterable<Admin> findAll();

	boolean existsById(String id);

	Optional<Admin> findById(String id);

	List<Admin> saveAll(List<Admin> entities);

}
