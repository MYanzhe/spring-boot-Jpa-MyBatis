package com.vvJee.spring_boot_MyBatis.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.vvJee.spring_boot_MyBatis.domain.Test;

public interface TestMapper {
	@Select("SELECT * FROM test")
	@Results({
		@Result(property = "id",  column = "id", javaType = Integer.class),
		@Result(property = "name", column = "name")
	})
	List<Test> getAll();
	
	@Select("SELECT * FROM test WHERE id = #{id}")
	@Results({
		@Result(property = "id",  column = "id", javaType = Integer.class),
		@Result(property = "name", column = "name")
	})
	Test getOne(Integer id);

	@Insert("INSERT INTO test(name) VALUES(#{name})")
	void insert(Test test);

	@Update("UPDATE test SET name=#{name} WHERE id =#{id}")
	void update(Test test);

	@Delete("DELETE FROM test WHERE id =#{id}")
	void delete(Integer id);

	@Select("SELECT * FROM test WHERE name = #{name}")
	@Results({
		@Result(property = "id",  column = "id", javaType = Integer.class),
		@Result(property = "name", column = "name")
	})
	List<Test> findByName(String name);
	
}
