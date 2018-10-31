package com.CSA.CarSharingAndria.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the transfer database table.
 * 
 */
@Entity
@NamedQuery(name="Transfer.findAll", query="SELECT t FROM Transfer t")
public class Transfer implements Serializable {
	private static final long serialVersionUID = 1L;

	public Transfer() {
	}

}