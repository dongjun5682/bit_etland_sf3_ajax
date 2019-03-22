package com.bit_etland.web.service;

import java.util.Map;

import org.springframework.stereotype.Component;

@Component
public interface SeqService {
	public String ArithmeticSequence(Map<?,?>param);
	public String GeometricSequence(Map<?,?>param);
	public String FactorySequence(Map<?,?>param);
	public String FibonacciNumbers(Map<?,?>param);
}
