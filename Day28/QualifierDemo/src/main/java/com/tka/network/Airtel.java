package com.tka.network;

import org.springframework.stereotype.Component;

import com.tka.utility.Sim;

@Component("airtel")
public class Airtel implements Sim
{

	@Override
	public void calling() {
		// TODO Auto-generated method stub
		
		System.out.println("U r called by Airtel network");
		
	}

	
}
