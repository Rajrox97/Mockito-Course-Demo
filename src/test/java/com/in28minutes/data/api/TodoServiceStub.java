package com.in28minutes.data.api;

import java.util.Arrays;
import java.util.List;

public class TodoServiceStub implements TodoService {
	//Dynamic conditions 
	//Service Definitions
		
		
		public List<String> retrieveTodos(String user) {
			// TODO Auto-generated method stub
			return Arrays.asList("Learn Spring MVC","Learn Spring","Learn to Dance");
			
		}

//		public List<String> configureSomething(String user) {
//			// TODO Auto-generated method stub
//			return null;
//		}

	}
