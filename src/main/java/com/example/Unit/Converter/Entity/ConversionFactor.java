package com.example.Unit.Converter.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="conversionfactor")
public class ConversionFactor {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@ManyToOne
	@JoinColumn(name = "from_unit_id")
	private Unit fromUnit;

	@ManyToOne
	@JoinColumn(name = "to_unit_id")
	private Unit toUnit;

	private double factor;

	public ConversionFactor() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Unit getFromunit() {
		return fromUnit;
	}

	public void setFromunit(Unit fromunit) {
		this.fromUnit = fromunit;
	}

	public Unit getTounit() {
		return toUnit;
	}

	public void setTounit(Unit tounit) {
		this.toUnit = tounit;
	}

	public double getFactor() {
		return factor;
	}

	public void setFactor(double factor) {
		this.factor = factor;
	}

	@Override
	public String toString() {
		return "ConversionFactor [id=" + id + ", fromunit=" + fromUnit + ", tounit=" + toUnit + ", factor=" + factor
				+ "]";
	}

 	 }
