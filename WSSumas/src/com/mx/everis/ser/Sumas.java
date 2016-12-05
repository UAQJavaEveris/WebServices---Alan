package com.mx.everis.ser;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class Sumas {
	@WebMethod
	public int getSuma(int a, int b){
		return a+b;
	}
	@WebMethod
	public int getSumaT(int a, int b ,int c){
		return a+b+c;
	}
	@WebMethod
	public int getSumaArrayNum(int[] numEnteros){
		int sum =0;
		if(numEnteros != null && numEnteros.length > 0){
		for(int i =0;i<numEnteros.length;i++){
			sum = sum + numEnteros[i];
		}
		}
		return sum;
	}
}
