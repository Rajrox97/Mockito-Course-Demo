package com.in28minutes.mockito;

//import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.Matchers.hasItems;
import static org.hamcrest.Matchers.hasSize;
import static org.junit.Assert.assertThat;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class HamcrestMatchersTest {

	@Test
	public void test() {
		List<Integer> scores = Arrays.asList(99,100,101,105);
		//score has 4 items
		assertThat(scores,hasSize(4));
		assertThat(scores,hasItems(99,100));
	}

}
