package edu.poly.spring.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.poly.spring.models.Description;
import edu.poly.spring.responsibility.DescriptionResponsibility;

@Service
public class DescriptionServiceImp implements DescriptionService {
	@Autowired
	private DescriptionResponsibility descriptionResponsibility;

	@Override
	public Description save(Description entity) {
		return descriptionResponsibility.save(entity);
	}

	@Override
	public List<Description> saveAll(List<Description> entities) {
		return (List<Description>) descriptionResponsibility.saveAll(entities);
	}

	@Override
	public Optional<Description> findById(Integer id) {
		return descriptionResponsibility.findById(id);
	}

	@Override
	public boolean existsById(Integer id) {
		return descriptionResponsibility.existsById(id);
	}

	@Override
	public Iterable<Description> findAll() {
		return descriptionResponsibility.findAll();
	}

	@Override
	public List<Description> findAllById(List<Integer> ids) {
		return (List<Description>) descriptionResponsibility.findAllById(ids);
	}

	@Override
	public long count() {
		return descriptionResponsibility.count();
	}

	@Override
	public void deleteById(Integer id) {
		descriptionResponsibility.deleteById(id);
	}

	@Override
	public void delete(Description entity) {
		descriptionResponsibility.delete(entity);
	}

	@Override
	public void deleteAll(List<Description> entities) {
		descriptionResponsibility.deleteAll(entities);
	}

	@Override
	public void deleteAll() {
		descriptionResponsibility.deleteAll();
	}

}
