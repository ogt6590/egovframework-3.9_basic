package com.jeyun.test.mapper;

import java.util.List;

import com.jeyun.test.vo.sample;

import egovframework.rte.psl.dataaccess.mapper.Mapper;


@Mapper("testMapper")
public interface testMapper {
	
	public List<sample> testDB ();
	
}
