package com.project.farzane.sus.repository;

import com.project.farzane.sus.model.Sus;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SusRepository extends CrudRepository<Sus, Long> {
}
