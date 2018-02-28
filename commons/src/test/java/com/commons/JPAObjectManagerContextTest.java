package com.commons;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;
import java.util.Properties;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import com.commons.entities.Customer;
import com.commons.entities.User;
import com.commons.manager.ApplicationManagerContext;
import com.commons.manager.objectmanagers.DBObjectManager;
import com.commons.manager.objectmanagers.DataAccessObject;
import com.commons.service.UserService;

public class JPAObjectManagerContextTest {

	ApplicationManagerContext appManager;
	DBObjectManager dbManager;
	DataAccessObject objectManager;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("testing...");
		appManager = new ApplicationManagerContext();
		dbManager = new DBObjectManager(appManager);
		objectManager = new DataAccessObject(appManager, dbManager);
		dbManager.createMasterDBFactory();
	}

	@After
	public void tearDown() throws Exception {
		appManager = null;
		dbManager = null;
		objectManager = null;
	}
	
	@Test
	public void findUserByEmailTest() {
		UserService us = new UserService(objectManager);
		
		System.out.println("searching for user");
		User p = us.findUserByEmail("o@m.com");
		
		System.out.println(p.getEmail() + ",  " + p.getFirstName());
	}

	@Test
	@Ignore
	public void createCustomerTest()  {
		Customer c1;
		try {
			System.out.println("saving the object");
			c1 = new Customer("Jim", "x8", "Jim", "Button", "j@b.com", "27/05/1956");

			dbManager.createMasterDBFactory();
			objectManager.persist(c1);
			System.out.println("saved to db...");
		} catch (ParseException e) {
			System.out.println(e);
		}
	}
	
	@Ignore
	@Test
	public void readPropertiesFile() {
		Properties kwMappingProperties = new Properties();
		
		try {
			kwMappingProperties.load(new FileInputStream("src/main/resources/kw_mapping.properties"));
			System.out.println(
					kwMappingProperties.getProperty("46B6488DD72C62D1E10000000A1553F7"));
			
		} catch (FileNotFoundException e) {
			System.out.println(e);
		} catch (IOException e) {
			System.out.println(e);
		}
		System.out.println("temp test");
	}
	
//	@Test
//	public void tempTest() {
//		 String url = "http://www.%20test.com/home/user/";
//		    String decoded;
//			try {
//				decoded = URLDecoder.decode(url, "UTF-8");
//				
//				System.out.println(decoded);
//			} catch (UnsupportedEncodingException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		    
//	}

}
