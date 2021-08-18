package com.example.acessingCepDB.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.acessingCepDB.entity.CepEntity;

public interface CepRepository extends CrudRepository<CepEntity, Long> {

}
