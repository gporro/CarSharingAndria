package com.CSA.CarSharingAndria.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the trip database table.
 * 
 */
@Entity
@NamedQuery(name="Trip.findAll", query="SELECT t FROM Trip t")
public class Trip implements Serializable {
	private static final long serialVersionUID = 1L;

	public Trip() {
	}

}