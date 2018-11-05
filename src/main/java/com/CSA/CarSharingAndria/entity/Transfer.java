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

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int transferID;

	//bi-directional many-to-one association to Member
	@ManyToOne
	@JoinColumn(name="memberID")
	private Member member;

	//bi-directional many-to-one association to Trip
	@ManyToOne
	@JoinColumn(name="tripID")
	private Trip trip;

	public Transfer() {
	}

	public int getTransferID() {
		return this.transferID;
	}

	public void setTransferID(int transferID) {
		this.transferID = transferID;
	}

	public Member getMember() {
		return this.member;
	}

	public void setMember(Member member) {
		this.member = member;
	}

	public Trip getTrip() {
		return this.trip;
	}

	public void setTrip(Trip trip) {
		this.trip = trip;
	}

}