package com.training.expense.model;

import java.util.ArrayList;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
@Entity
public class Category {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,
	generator="category_generator")
	@SequenceGenerator(name="category_generator")	
	@Column(name="id")
	private int id;
	
	@Column(name="name")
	private String name;
	
	@OneToOne(mappedBy = "category")
	private Transaction transaction;
	
	public Category() {
		super();
	}
	
	public Category(int id, String name, Transaction transaction) {
		super();
		this.id = id;
		this.name = name;
		this.transaction = transaction;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Transaction getTransaction() {
		return transaction;
	}


	public void setTransaction(Transaction transaction) {
		this.transaction = transaction;
	}

}
