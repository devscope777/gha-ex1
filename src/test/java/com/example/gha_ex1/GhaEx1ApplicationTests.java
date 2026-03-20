package com.example.gha_ex1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class GhaEx1ApplicationTests {
	@Autowired
	private GhaEx1Application ghaEx1Application;

	@Test
	@DisplayName("Give correct sum of 2 numbers")
	void addTwoNumbers() {
		int expected = 5;
		int actual = ghaEx1Application.add(2, 3);
		assertThat(actual).isEqualTo(expected);
	}

}
