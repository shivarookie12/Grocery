package com.main.product;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Solution {
	public static void main(String[] args) throws IOException {
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter Quantity : ");
		int quantity = Integer.valueOf(bf.readLine());
		System.out.print("Enter Price : ");
		float price = Float.valueOf(bf.readLine());
		System.out.print("Enter Stock : ");
		int stock = Integer.valueOf(bf.readLine());
		System.out.print("Enter ItemName : ");
		String itemName = bf.readLine();
		Product product = new Product(quantity, price, itemName, stock);
		session.save(product);
		session.getTransaction().commit();

		session.close();
	}

}
