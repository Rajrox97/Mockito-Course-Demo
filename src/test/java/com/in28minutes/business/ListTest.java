package com.in28minutes.business;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.Test;

public class ListTest {

	@Test
	public void letsMockListSizeMethod() {
		List listMock = mock(List.class);
		when(listMock.size()).thenReturn(2);
		assertEquals(2,listMock.size());
		assertEquals(2,listMock.size());
		assertEquals(2,listMock.size());
	}
	
	@Test
	public void letsMockListSize_ReturnMultipleValues() {
		List listMock = mock(List.class);
		when(listMock.size()).thenReturn(2).thenReturn(3);
		assertEquals(2,listMock.size());
		assertEquals(3,listMock.size());
		assertEquals(3,listMock.size());
	}
	
	
	@Test(expected=RuntimeException.class)
	public void letsMockListGet() {
		List listMock = mock(List.class); //Nice mock behaviour of Mockito 
		//Argument matcher
		when(listMock.get(anyInt())).thenThrow(new RuntimeException("Something"));
		listMock.get(0);
	}
	
	@Test(expected=RuntimeException.class)
	public void letsMockList_mixingUp() {
		List listMock = mock(List.class); //Nice mock behaviour of Mockito 
		//Argument matcher
		when(listMock.subList(anyInt(),5)).thenThrow(new RuntimeException("Something"));
		  
		listMock.get(0);
	}

}
