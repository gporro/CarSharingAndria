package com.CSA.CarSharingAndria.service;

import java.util.List;

import com.CSA.CarSharingAndria.entity.Member;

public interface MemberService{

	Member findByName(String name);
	Member findByAlias(String alias);
	List<Member> findAllMembers();
}
