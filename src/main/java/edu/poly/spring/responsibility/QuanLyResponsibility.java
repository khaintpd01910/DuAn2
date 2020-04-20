package edu.poly.spring.responsibility;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import edu.poly.spring.models.Admin;

@Repository
public interface QuanLyResponsibility extends CrudRepository<Admin, String> {

}
