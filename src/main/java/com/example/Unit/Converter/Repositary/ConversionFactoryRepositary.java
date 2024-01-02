package com.example.Unit.Converter.Repositary;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.example.Unit.Converter.Entity.ConversionFactor;
import com.example.Unit.Converter.Entity.Unit;


@EnableJpaRepositories
@Repository
public interface ConversionFactoryRepositary extends JpaRepository<ConversionFactor, Long> {

	Optional<Unit> findByFromUnitAndToUnit(Unit fromunit, Unit tounit);

}
