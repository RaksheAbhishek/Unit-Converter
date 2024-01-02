package com.example.Unit.Converter.Repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Unit.Converter.Entity.Unit;


@Repository
public interface UnitRepositary extends JpaRepository<Unit, Long>{
	

}
