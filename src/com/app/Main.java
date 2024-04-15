package com.app;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		BeanFactory bf = new FileSystemXmlApplicationContext("bean.xml");
		System.out.println("*********************Item 1****************");
		Items i1 = (Items) bf.getBean("item1");
		System.out.println(i1.toString());
		System.out.println("*********************Item 2****************");
		ItemDetail i2 = (ItemDetail) bf.getBean("item2");
		System.out.println(i2.toString());
	}

}
