package com.bit_etland.web.controller;


import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bit_etland.web.service.SeqService;

@Controller
@RequestMapping("/algo")
public class AlgoController {
	static final Logger Logger = LoggerFactory.getLogger(AlgoController.class);
	@Autowired SeqService seqService;
	@Autowired Map<String,Object> map;
	@RequestMapping(value="/seq/{kind}",method=RequestMethod.POST)
	@ResponseBody
	public Map<String,Object> sequnce(
			@PathVariable String kind,
			@RequestBody Map<String,Object> param) {
		Logger.info("\n-----------algoController 진입 --------------");
		map = new HashMap<String,Object>();
		String start = (String)param.get("start");
		String end = (String)param.get("end");;
		String diff = (String)param.get("diff");
		System.out.println("--------보내온아이디 :  ------"+ kind);
		System.out.println("--------보내온값 시작 ------"+ start);
		System.out.println("--------보내온값  끝------"+ end);
		System.out.println("--------보내온값 공비------"+ diff);
		map.put("startNum",start);
		map.put("endNum",end);
		map.put("diff",diff);
		String result = "";
		switch (kind) {
		case "ari":
			result = seqService.ArithmeticSequence(map);
			break;
		case "geo":
			result = seqService.GeometricSequence(map);
			break;
		case "fac":
			result = seqService.FactorySequence(map);
			break;
		case "fibo":
			result = seqService.FibonacciNumbers(map);
			break;
		default:
			break;
		}
		System.out.println(result);
		map.put("result",result);
		return map;
	}
	
}
