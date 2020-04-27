package edu.poly.spring.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.poly.spring.models.Admin;
import edu.poly.spring.responsibility.AdminResponsibility;

@Service
public class AdminServiceImp implements AdminService{
	@Autowired
	private AdminResponsibility adminResponsibility;

	@Override
	public Admin save(Admin entity) {
		return adminResponsibility.save(entity);
	}

	@Override
	public List<Admin> saveAll(List<Admin> entities) {
		return (List<Admin>) adminResponsibility.saveAll(entities);
	}

	@Override
	public Optional<Admin> findById(Integer id) {
		return adminResponsibility.findById(id);
	}

	@Override
	public boolean existsById(Integer id) {
		return adminResponsibility.existsById(id);
	}

	@Override
	public Iterable<Admin> findAll() {
		return adminResponsibility.findAll();
	}

	@Override
	public List<Admin> findAllById(List<Integer> ids) {
		return (List<Admin>) adminResponsibility.findAllById(ids);
	}

	@Override
	public long count() {
		return adminResponsibility.count();
	}

	@Override
	public void deleteById(Integer id) {
		adminResponsibility.deleteById(id);
	}

	@Override
	public void delete(Admin entity) {
		adminResponsibility.delete(entity);
	}

	@Override
	public void deleteAll(List<Admin> entities) {
		adminResponsibility.deleteAll(entities);
	}

	@Override
	public void deleteAll() {
		adminResponsibility.deleteAll();
	}
	
}
