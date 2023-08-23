package com.javatechie.saga;

import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.springframework.boot.test.context.SpringBootTest;

import com.javatechie.saga.commons.dto.SampleForCoverage;

@SpringBootTest
public class SampleForCoverageTest {
	
	@InjectMocks
	public SampleForCoverage sampleForCoverage;

	/*
	 * @Test public void getDataTest() {
	 * //when(sampleForCoverage.getDataOfUser("Rakesh")).thenReturn(true);
	 * when(sampleForCoverage.getDataOfUser("Rakesh")).thenReturn("YES");
	 * 
	 * }
	 */
}
