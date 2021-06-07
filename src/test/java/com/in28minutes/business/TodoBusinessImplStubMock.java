package com.in28minutes.business;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;

import java.util.List;

import org.junit.Test;

import com.in28minutes.data.api.TodoService;
//import com.in28minutes.data.api.TodoServiceStub;
//Mocking is creating objects that simulate behaviour of real objects. Unlike stubs, mocks can be dynamically be
//created from code- at runtime. Mocks offer more functionality than stubbing. You can verify method calls and 
//a lot of other things. 


public class TodoBusinessImplStubMock {

	@Test
	public void testRetrieveTodosRelatedToSpring_usingAMock() {
//		TodoService mockTodoService = mock(TodoService.class);
//		stub(mockTodoService.retrieveTodos("Parameter")).return("value");
//		
		TodoService todoServiceMock = mock(TodoService.class);
		TodoBusinessImpl todoBusinessImpl = new TodoBusinessImpl(todoServiceMock);
		List<String> filteredTodos = todoBusinessImpl.retrieveTodosRelatedToSpring("Dummy");
		assertEquals(2,filteredTodos.size());
	}

//	@Test
//	public void testRetrieveTodosRelatedToSpring_usingAStub2() {
//		TodoService todoServiceStub = new TodoServiceStub();
//		TodoBusinessImpl todoBusinessImpl = new TodoBusinessImpl(todoServiceStub);
//		List<String> filteredTodos = todoBusinessImpl.retrieveTodosRelatedToSpring("Dummy");
//		assertEquals(0,filteredTodos.size());
//	}
}
