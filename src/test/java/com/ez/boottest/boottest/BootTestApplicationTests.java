package com.ez.boottest.boottest;

import com.ez.boottest.boottest.dao.PlaceDAO;
import com.ez.boottest.boottest.model.Place;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BootTestApplicationTests {

	@Autowired
	PlaceDAO placeDAO;
	@Test
	public void contextLoads() {
		Place p = placeDAO.getByName("test");



	}

}
