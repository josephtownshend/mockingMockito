package com.mockitoMocking1.business;

import static org.junit.Assert.*;
import java.util.List;
import org.junit.Test;

import com.mockitoMocking1.data.api.TodoService;
import com.mockitoMocking1.data.api.TodoServiceStub;

public class TodoBusinessImpleStubTest {

	@Test
	public void testRetrieveRelatedToSpring_UsingAStub() {
		TodoService todoServiceStub = new TodoServiceStub();
		TodoBusinessImpl todoBusinessImpl = 
				new TodoBusinessImpl(todoServiceStub);
		List<String> filteredTodos = todoBusinessImpl
				.retrieveTodosRelatedToSpring("Dummy");
		assertEquals(2, filteredTodos.size());
	
	}

}
