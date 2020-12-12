package com.jeyun.test.controller;

import java.sql.Connection;

import javax.sql.DataSource;
import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;



import com.jeyun.test.Test;

@Controller
public class testController {

	// 루트컨테이너에서 빈(Bean)을 받아와서 자동으로 넣어줌
	@Inject
	private DataSource dataSource;

	// "/list" URI에 대한 요청 처리
	@RequestMapping(value = "/list.do")
	public String home2(@ModelAttribute Test test) {

		try {
			Connection conn = (Connection) dataSource.getConnection();
			System.out.println("성공 : " + conn);

		} catch (Exception ex) {
			System.out.println("실패..!");
			ex.printStackTrace();
		}

		return "/board/list";
	}

	@RequestMapping("/test.do")
	public String test() throws Exception {
		System.out.println("여기까지 왔다");
		return "main/test";
	}

}
