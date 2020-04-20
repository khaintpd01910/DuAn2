package edu.poly.spring.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.poly.spring.models.Admin;
import edu.poly.spring.responsibility.QuanLyResponsibility;

@Service
public class QuanLyServiceImp implements QuanLyService{
	@Autowired
	private QuanLyResponsibility quanLyResponsibility;

	@Override
	public Admin save(Admin entity) {
		return quanLyResponsibility.save(entity);
	}

	@Override
	public List<Admin> saveAll(List<Admin> entities) {
		return (List<Admin>) quanLyResponsibility.saveAll(entities);
	}

	@Override
	public Optional<Admin> findById(String id) {
		return quanLyResponsibility.findById(id);
	}

	@Override
	public boolean existsById(String id) {
		return quanLyResponsibility.existsById(id);
	}

	@Override
	public Iterable<Admin> findAll() {
		return quanLyResponsibility.findAll();
	}

	@Override
	public List<Admin> findAllById(List<String> ids) {
		return (List<Admin>) quanLyResponsibility.findAllById(ids);
	}

	@Override
	public long count() {
		return quanLyResponsibility.count();
	}

	@Override
	public void deleteById(String id) {
		quanLyResponsibility.deleteById(id);
	}

	@Override
	public void delete(Admin entity) {
		quanLyResponsibility.delete(entity);
	}

	@Override
	public void deleteAll(List<Admin> entities) {
		quanLyResponsibility.deleteAll(entities);
	}

	@Override
	public void deleteAll() {
		quanLyResponsibility.deleteAll();
	}
	
	
}
