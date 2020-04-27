package edu.poly.spring.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.poly.spring.models.Promotion;
import edu.poly.spring.responsibility.PromotionResposibility;



@Service
public class PromotionServiceImp implements PromotionService{
	@Autowired
	private PromotionResposibility promotionResposibility;

	@Override
	public Promotion save(Promotion entity) {
		return promotionResposibility.save(entity);
	}

	@Override
	public List<Promotion> saveAll(List<Promotion> entities) {
		return (List<Promotion>) promotionResposibility.saveAll(entities);
	}

	@Override
	public Optional<Promotion> findById(Integer id) {
		return promotionResposibility.findById(id);
	}

	@Override
	public boolean existsById(Integer id) {
		return promotionResposibility.existsById(id);
	}

	@Override
	public Iterable<Promotion> findAll() {
		return promotionResposibility.findAll();
	}

	@Override
	public Iterable<Promotion> findAllById(List<Integer> ids) {
		return promotionResposibility.findAllById(ids);
	}

	@Override
	public long count() {
		return promotionResposibility.count();
	}

	@Override
	public void deleteById(Integer id) {
		promotionResposibility.deleteById(id);
	}

	@Override
	public void delete(Promotion entity) {
		promotionResposibility.delete(entity);
	}

	@Override
	public void deleteAll(List<Promotion> entities) {
		promotionResposibility.deleteAll(entities);
	}

	@Override
	public void deleteAll() {
		promotionResposibility.deleteAll();
	}
}
