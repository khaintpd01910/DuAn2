package edu.poly.spring.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.poly.spring.models.Events;
import edu.poly.spring.responsibility.SuKienResponsibility;

@Service
public class SuKienServiceImp implements SuKienService{
	@Autowired
	private SuKienResponsibility suKienResponsibility;

	@Override
	public Events save(Events entity) {
		return suKienResponsibility.save(entity);
	}

	@Override
	public List<Events> saveAll(List<Events> entities) {
		return (List<Events>)suKienResponsibility.saveAll(entities);
	}

	@Override
	public Optional<Events> findById(String id) {
		return suKienResponsibility.findById(id);
	}

	@Override
	public boolean existsById(String id) {
		return suKienResponsibility.existsById(id);
	}

	@Override
	public Iterable<Events> findAll() {
		return suKienResponsibility.findAll();
	}

	@Override
	public List<Events> findAllById(List<String> ids) {
		return (List<Events>)suKienResponsibility.findAllById(ids);
	}

	@Override
	public long count() {
		return suKienResponsibility.count();
	}

	@Override
	public void deleteById(String id) {
		suKienResponsibility.deleteById(id);
	}

	@Override
	public void delete(Events entity) {
		suKienResponsibility.delete(entity);
	}

	@Override
	public void deleteAll(List<Events> entities) {
		suKienResponsibility.deleteAll(entities);
	}

	@Override
	public void deleteAll() {
		suKienResponsibility.deleteAll();
	}
	
}
