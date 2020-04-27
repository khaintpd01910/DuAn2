package edu.poly.spring.services;

import java.util.List;
import java.util.Optional;

import edu.poly.spring.models.Admin;

public interface AdminService {

	void deleteAll();

	void deleteAll(List<Admin> entities);

	void delete(Admin entity);

	void deleteById(Integer id);

	long count();

	List<Admin> findAllById(List<Integer> ids);

	Iterable<Admin> findAll();

	boolean existsById(Integer id);

	Optional<Admin> findById(Integer id);

	List<Admin> saveAll(List<Admin> entities);

	Admin save(Admin entity);
}
