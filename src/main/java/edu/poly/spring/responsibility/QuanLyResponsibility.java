package edu.poly.spring.responsibility;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import edu.poly.spring.models.QuanLy;

@Repository
public interface QuanLyResponsibility extends CrudRepository<QuanLy, String> {

}
