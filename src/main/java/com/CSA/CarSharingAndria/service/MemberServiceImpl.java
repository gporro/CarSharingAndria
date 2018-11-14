package com.CSA.CarSharingAndria.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.CSA.CarSharingAndria.entity.Member;
import com.CSA.CarSharingAndria.repository.MemberRepository;

@Service("memberService")
@Transactional
public class MemberServiceImpl implements MemberService{

	@Autowired
    private MemberRepository memberRepository;
	
	public Member findByName(String name){
		return memberRepository.findByName(name);
	}
	
	public Member findByAlias(String alias){
		return memberRepository.findByAlias(alias);
	}
	
	public List<Member> findAllMembers(){
		return memberRepository.findAll();
	}
}
