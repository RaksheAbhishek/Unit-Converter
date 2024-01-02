package com.example.Unit.Converter.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Unit.Converter.Entity.Unit;
import com.example.Unit.Converter.Repositary.ConversionFactoryRepositary;
import com.example.Unit.Converter.Repositary.UnitRepositary;

@Service
public class UnitConversionService {

	
	private UnitRepositary unitRepositary;


	 ConversionFactoryRepositary cfr;

	public List<Unit> getAllUnits() {

		return unitRepositary.findAll();

	}

	public double convertUnits(Long fromunitid, Long tounitid, double value) {

		Unit fromunit = unitRepositary.findById(fromunitid)
				.orElseThrow(() -> new RuntimeException("From unit not found"));
		Unit tounit = unitRepositary.findById(tounitid).orElseThrow(() -> new RuntimeException("To unit not found"));

		Unit conversionFactor = cfr.findByFromUnitAndToUnit(fromunit, tounit)
				.orElseThrow(() -> new RuntimeException("Conversion factor not found"));

		return value * conversionFactor.getFactor();

	}

}
