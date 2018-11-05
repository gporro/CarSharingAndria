package com.CSA.CarSharingAndria.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the trip database table.
 * 
 */
@Entity
@NamedQuery(name="Trip.findAll", query="SELECT t FROM Trip t")
public class Trip implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int tripID;

	@Temporal(TemporalType.DATE)
	@Column(name="date_transfer")
	private Date dateTransfer;

	//bi-directional many-to-one association to Transfer
	@OneToMany(mappedBy="trip")
	private List<Transfer> transfers;

	//bi-directional many-to-one association to Member
	@ManyToOne
	@JoinColumn(name="driver")
	private Member member;

	public Trip() {
	}

	public int getTripID() {
		return this.tripID;
	}

	public void setTripID(int tripID) {
		this.tripID = tripID;
	}

	public Date getDateTransfer() {
		return this.dateTransfer;
	}

	public void setDateTransfer(Date dateTransfer) {
		this.dateTransfer = dateTransfer;
	}

	public List<Transfer> getTransfers() {
		return this.transfers;
	}

	public void setTransfers(List<Transfer> transfers) {
		this.transfers = transfers;
	}

	public Transfer addTransfer(Transfer transfer) {
		getTransfers().add(transfer);
		transfer.setTrip(this);

		return transfer;
	}

	public Transfer removeTransfer(Transfer transfer) {
		getTransfers().remove(transfer);
		transfer.setTrip(null);

		return transfer;
	}

	public Member getMember() {
		return this.member;
	}

	public void setMember(Member member) {
		this.member = member;
	}

}