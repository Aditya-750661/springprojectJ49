package com.controller1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.model1.Bank;

public class TestBankAndBranch {

	public static void main(String[] args) {
		
		ApplicationContext context = new  ClassPathXmlApplicationContext("bank.xml");
		
		Bank bank = (Bank) context.getBean("bank");
		
		System.out.println(bank);

	}

}
