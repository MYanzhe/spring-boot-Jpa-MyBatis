package com.vvJee.spring_boot_MyBatis.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vvJee.spring_boot_MyBatis.dao.TestRepository;
import com.vvJee.spring_boot_MyBatis.domain.Result;
import com.vvJee.spring_boot_MyBatis.domain.Test;
import com.vvJee.spring_boot_MyBatis.utils.ResultUtil;


@RestController
@RequestMapping("/test")
public class TestController {

	
	@Autowired
	private TestRepository testRepository;
	
    @GetMapping(value = "/list")
    public Result<Test> list(){
        return ResultUtil.success(testRepository.findAll());
    }
    
    @PostMapping(value = "/add")
    public Test add(Test test){
    	return testRepository.save(test);
    }
    
    @GetMapping(value = "/{id}")
    public Test findOne(@PathVariable("id") Integer id){
    	return testRepository.findOne(id);
    }
    
    @PutMapping(value = "/{id}")
    public Test update(@PathVariable("id") Integer id,Test test){
    	test.setId(id);
    	return testRepository.save(test);
    }
    
    @DeleteMapping(value = "/{id}")
    public String delete(@PathVariable("id") Integer id){
    	testRepository.delete(id);
    	return "success";
    }
    
    @GetMapping(value = "/name/{name}")
    public List<Test> findByName(@PathVariable("name") String name){
    	return testRepository.findByName(name);
    }
    
}
