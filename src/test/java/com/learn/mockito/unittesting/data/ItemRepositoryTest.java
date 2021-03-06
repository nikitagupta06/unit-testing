package com.learn.mockito.unittesting.data;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import com.learn.mockito.unittesting.model.Item;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@DataJpaTest
public class ItemRepositoryTest {

	@Autowired
	private ItemRepository repository;
	
	@Test
	public void testFindAll() {
		List<Item> items = repository.findAll();
		assertEquals(3, items.size());
	}
}
