package com.bemyfriend.bmf.member.company.model.service.impl;

import com.bemyfriend.bmf.member.company.model.repository.CompanyRepository;
import com.bemyfriend.bmf.member.company.model.service.CompanyService;
import com.bemyfriend.bmf.member.company.model.vo.Company;


public class CompanyServiceImpl implements CompanyService{

	
	private CompanyRepository companyRepository;
	
	
	public CompanyServiceImpl(CompanyRepository companyRepository) {
		this.companyRepository = companyRepository;
	}
	
	
	@Override
	public Company memberAuthenticate(Company company) {
		
		String comId = company.getComId();
		String comPw = company.getComPw();
		
		return companyRepository.memberAuthenticate(comId, comPw);
	}

}
