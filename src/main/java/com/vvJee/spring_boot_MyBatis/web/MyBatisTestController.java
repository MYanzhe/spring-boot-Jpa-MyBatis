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

import com.vvJee.spring_boot_MyBatis.domain.Result;
import com.vvJee.spring_boot_MyBatis.domain.Test;
import com.vvJee.spring_boot_MyBatis.mapper.TestMapper;
import com.vvJee.spring_boot_MyBatis.utils.ResultUtil;


@RestController
@RequestMapping("/mtest")
public class MyBatisTestController {

	
	@Autowired
	private TestMapper testMapper;
	
    @GetMapping(value = "/list")
    public Result<Test> list(){
        return ResultUtil.success(testMapper.getAll());
    }
    
    @PostMapping(value = "/add")
    public Result<Test> add(Test test){
    	testMapper.insert(test);
    	return ResultUtil.success();
    }
    
    @GetMapping(value = "/{id}")
    public Result<Test> findOne(@PathVariable("id") Integer id){
    	return ResultUtil.success(testMapper.getOne(id));
    }
    
    @PutMapping(value = "/{id}")
    public Result<Test> update(@PathVariable("id") Integer id,Test test){
    	test.setId(id);
    	testMapper.update(test);
    	return ResultUtil.success();
    }
    
    @DeleteMapping(value = "/{id}")
    public Result<Test> delete(@PathVariable("id") Integer id){
    	testMapper.delete(id);
    	return ResultUtil.success();
    }
    
    @GetMapping(value = "/name/{name}")
    public Result<List<Test>> findByName(@PathVariable("name") String name){
    	return ResultUtil.success(testMapper.findByName(name));
    }
    
}
