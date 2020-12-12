package com.jeyun.test.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.jeyun.test.mapper.testMapper;
import com.jeyun.test.service.testService;
import com.jeyun.test.vo.sample;

@Service("testServie")
public class testImpl implements testService  {
	
	@Resource(name="testMapper")
	testMapper mapper;
	
	@Override
	public List<sample> serviceTest() {
		// TODO Auto-generated method stub
		System.out.println("여기까지 왔나?");
		return mapper.testDB();
	}


}
