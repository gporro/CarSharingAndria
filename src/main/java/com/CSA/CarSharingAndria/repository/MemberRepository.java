package com.CSA.CarSharingAndria.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.CSA.CarSharingAndria.entity.Member;

@Repository
public interface MemberRepository extends JpaRepository<Member, Integer> {

	Member findByName(String name);
	Member findByAlias(String alias);
	
}
