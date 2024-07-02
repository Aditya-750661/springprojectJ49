package com.controller;

import javax.swing.plaf.synth.SynthOptionPaneUI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.model.Laptop;

public class TestController {

	public static void main(String[] args) {
		
		ApplicationContext appContext = new ClassPathXmlApplicationContext("s.xml");
		Laptop laptop = (Laptop) appContext.getBean("lap");
		
		System.out.println(laptop);

	}

}
