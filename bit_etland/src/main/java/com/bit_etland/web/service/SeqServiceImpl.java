package com.bit_etland.web.service;

import java.util.Map;

import org.springframework.stereotype.Service;

@Service
public class SeqServiceImpl implements SeqService{

	@Override
	public String ArithmeticSequence(Map<?, ?> param) {
		String startNum = (String)param.get("startNum"),
				endNum = (String)param.get("endNum"),
				diff = (String)param.get("diff"),
						result ="";
		int A = Integer.parseInt(startNum);
		int E = Integer.parseInt(endNum);
		int D = Integer.parseInt(diff); //공비
		int S = A;
		int N = 2;
		int AN = 0;
		
		while (true) {
			AN = A + (N-1) * D;
			S = S + AN;
			N = N +1;
			if(N > E) {break;}
		}
		/*
		 * for(int i=A; i<=E; i++) { S += D; D++;}
		 */
		result = String.valueOf(S);
		return result;
	}

	@Override
	public String GeometricSequence(Map<?, ?> param) {
		String result = "";
		int R =3; //공비
		int A =2; //초항
		int S = A; //합
		int N = 2; //순서
		
		while (true) {
			A = A*R;
			S = S+A;
			N = N+1;
			if(N >100)break;
		}
		result = String.valueOf(S);
		return result;
	}

	@Override
	public String FactorySequence(Map<?, ?> param) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String FibonacciNumbers(Map<?, ?> param) {
		// TODO Auto-generated method stub
		return null;
	}

}
