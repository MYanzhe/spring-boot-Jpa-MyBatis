package com.vvJee.spring_boot_MyBatis.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vvJee.spring_boot_MyBatis.domain.Test;

public interface TestRepository extends JpaRepository<Test, Integer>{

	public List<Test> findByName(String name);
	
}
