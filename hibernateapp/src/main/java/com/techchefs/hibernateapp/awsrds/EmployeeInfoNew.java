package com.techchefs.hibernateapp.awsrds;

import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import lombok.Data;

@Data
@Entity
@Table(name="employee_info_new")
@Cacheable
@Cache(usage = CacheConcurrencyStrategy.READ_ONLY)
public class EmployeeInfoNew {
	@Id
	@Column(name="eid")
	private int id;
	private String name;
	private String email;
}
