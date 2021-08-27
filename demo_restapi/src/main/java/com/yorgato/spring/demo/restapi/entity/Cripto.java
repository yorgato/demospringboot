package com.yorgato.spring.demo.restapi.entity;

import java.sql.Timestamp;

/**
 * Object for the representation of coin
 * 
 * @author User
 *
 */
public class Cripto {

	/**
	 * code of coin
	 */
	public String code;
	/**
	 * name of coin
	 */
	public String name;
	/**
	 * value of coin in US
	 */
	public Double value;
	/**
	 * percent of change in the last hour
	 */
	public Double percent_change_1h;
	/**
	 * percent of change in the last 24 hours
	 */
	public Double percent_change_24h;
	/**
	 * date of creation
	 */
	public Timestamp date;

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
}
