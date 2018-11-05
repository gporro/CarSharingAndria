package com.CSA.CarSharingAndria.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the member database table.
 * 
 */
@Entity
@Table(name="member")
public class Member implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int memberID;

	private String alias;

	private String name;

	//bi-directional many-to-one association to Report
	@OneToMany(mappedBy="member1")
	private List<Report> reports1;

	//bi-directional many-to-one association to Report
	@OneToMany(mappedBy="member2")
	private List<Report> reports2;

	//bi-directional many-to-one association to Transfer
	@OneToMany(mappedBy="member")
	private List<Transfer> transfers;

	//bi-directional many-to-one association to Trip
	@OneToMany(mappedBy="member")
	private List<Trip> trips;

	public Member() {
	}

	public int getMemberID() {
		return this.memberID;
	}

	public void setMemberID(int memberID) {
		this.memberID = memberID;
	}

	public String getAlias() {
		return this.alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Report> getReports1() {
		return this.reports1;
	}

	public void setReports1(List<Report> reports1) {
		this.reports1 = reports1;
	}

	public Report addReports1(Report reports1) {
		getReports1().add(reports1);
		reports1.setMember1(this);

		return reports1;
	}

	public Report removeReports1(Report reports1) {
		getReports1().remove(reports1);
		reports1.setMember1(null);

		return reports1;
	}

	public List<Report> getReports2() {
		return this.reports2;
	}

	public void setReports2(List<Report> reports2) {
		this.reports2 = reports2;
	}

	public Report addReports2(Report reports2) {
		getReports2().add(reports2);
		reports2.setMember2(this);

		return reports2;
	}

	public Report removeReports2(Report reports2) {
		getReports2().remove(reports2);
		reports2.setMember2(null);

		return reports2;
	}

	public List<Transfer> getTransfers() {
		return this.transfers;
	}

	public void setTransfers(List<Transfer> transfers) {
		this.transfers = transfers;
	}

	public Transfer addTransfer(Transfer transfer) {
		getTransfers().add(transfer);
		transfer.setMember(this);

		return transfer;
	}

	public Transfer removeTransfer(Transfer transfer) {
		getTransfers().remove(transfer);
		transfer.setMember(null);

		return transfer;
	}

	public List<Trip> getTrips() {
		return this.trips;
	}

	public void setTrips(List<Trip> trips) {
		this.trips = trips;
	}

	public Trip addTrip(Trip trip) {
		getTrips().add(trip);
		trip.setMember(this);

		return trip;
	}

	public Trip removeTrip(Trip trip) {
		getTrips().remove(trip);
		trip.setMember(null);

		return trip;
	}

}