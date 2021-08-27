package com.yorgato.spring.demo.db.entity;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.lang.NonNull;

/**
 * Object for the representation of coin
 * 
 * @author User
 *
 */
@Entity
@Table(name = "cripto")
public class Cripto implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * id of coin
	 */
	@Id
	@Column(name = "cripto_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long cripto_id;
	
	/**
	 * code of coin
	 */
	@Column(name = "code")
	@NonNull
	public String code;
	/**
	 * name of coin
	 */
	@Column(name = "name")
	@NonNull
	public String name;
	/**
	 * value of coin in US
	 */
	@Column(name = "value")
	@NonNull
	public Double value;
	/**
	 * percent of change in the last hour
	 */
	@Column(name = "percent_change_1h")
	public Double percent_change_1h;
	/**
	 * percent of change in the last 24 hours
	 */
	@Column(name = "percent_change_24h")
	public Double percent_change_24h;
	/**
	 * date of creation
	 */
	@Column(name = "date")
	@NonNull
	public Timestamp date;
	
	

	public Long getCripto_id() {
		return cripto_id;
	}

	public void setCripto_id(Long cripto_id) {
		this.cripto_id = cripto_id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getValue() {
		return value;
	}

	public void setValue(Double value) {
		this.value = value;
	}

	public Double getPercent_change_1h() {
		return percent_change_1h;
	}

	public void setPercent_change_1h(Double percent_change_1h) {
		this.percent_change_1h = percent_change_1h;
	}

	public Double getPercent_change_24h() {
		return percent_change_24h;
	}

	public void setPercent_change_24h(Double percent_change_24h) {
		this.percent_change_24h = percent_change_24h;
	}

	public Timestamp getDate() {
		return date;
	}

	public void setDate(Timestamp date) {
		this.date = date;
	}

	/**
	 * Default constructor
	 * 
	 * @param code
	 * @param name
	 * @param value
	 * @param percent_change_1h
	 * @param percent_change_24h
	 * @param date
	 */
	public Cripto(String code, String name, Double value, Double percent_change_1h, Double percent_change_24h,
			Timestamp date) {
		super();
		this.code = code;
		this.name = name;
		this.value = value;
		this.percent_change_1h = percent_change_1h;
		this.percent_change_24h = percent_change_24h;
		this.date = date;
	}

	public Cripto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
