package com.CSA.CarSharingAndria.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the report database table.
 * 
 */
@Entity
@NamedQuery(name="Report.findAll", query="SELECT r FROM Report r")
public class Report implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int reportID;

	private int diff;

	private int give;

	private int have;

	//bi-directional many-to-one association to Member
	@ManyToOne
	@JoinColumn(name="memberID")
	private Member member1;

	//bi-directional many-to-one association to Member
	@ManyToOne
	@JoinColumn(name="passengerID")
	private Member member2;

	public Report() {
	}

	public int getReportID() {
		return this.reportID;
	}

	public void setReportID(int reportID) {
		this.reportID = reportID;
	}

	public int getDiff() {
		return this.diff;
	}

	public void setDiff(int diff) {
		this.diff = diff;
	}

	public int getGive() {
		return this.give;
	}

	public void setGive(int give) {
		this.give = give;
	}

	public int getHave() {
		return this.have;
	}

	public void setHave(int have) {
		this.have = have;
	}

	public Member getMember1() {
		return this.member1;
	}

	public void setMember1(Member member1) {
		this.member1 = member1;
	}

	public Member getMember2() {
		return this.member2;
	}

	public void setMember2(Member member2) {
		this.member2 = member2;
	}

}