package edu.poly.spring.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.poly.spring.models.Description;
import edu.poly.spring.responsibility.MoTaResponsibility;

@Service
public class MoTaServiceImp implements MoTaService {
	@Autowired
	private MoTaResponsibility moTaResponsibility;

	@Override
	public Description save(Description entity) {
		return moTaResponsibility.save(entity);
	}

	@Override
	public List<Description> saveAll(List<Description> entities) {
		return (List<Description>)moTaResponsibility.saveAll(entities);
	}

	@Override
	public Optional<Description> findById(String id) {
		return moTaResponsibility.findById(id);
	}

	@Override
	public boolean existsById(String id) {
		return moTaResponsibility.existsById(id);
	}

	@Override
	public Iterable<Description> findAll() {
		return moTaResponsibility.findAll();
	}

	@Override
	public List<Description> findAllById(List<String> ids) {
		return (List<Description>)moTaResponsibility.findAllById(ids);
	}

	@Override
	public long count() {
		return moTaResponsibility.count();
	}

	@Override
	public void deleteById(String id) {
		moTaResponsibility.deleteById(id);
	}

	@Override
	public void delete(Description entity) {
		moTaResponsibility.delete(entity);
	}

	@Override
	public void deleteAll(List<Description> entities) {
		moTaResponsibility.deleteAll(entities);
	}

	@Override
	public void deleteAll() {
		moTaResponsibility.deleteAll();
	}
	
}
