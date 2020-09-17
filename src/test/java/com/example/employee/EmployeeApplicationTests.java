package com.example.employee;

import com.example.employee.controller.EmployeeController;
import com.example.employee.model.Employee;
import com.example.employee.repository.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@SpringBootTest

class EmployeeApplicationTests {

	@InjectMocks
	EmployeeController employeeController;

	@Mock
	EmployeeRepository employeeRepository;

	@Test
	public void testAllEmployees(){
		when(employeeRepository.findAll()).thenReturn(Stream.of(new Employee(1,"William","USA",24),
				new Employee(2,"Smith","UAE",30)).collect(Collectors.toList()));
		assertEquals(2 , employeeController.allEmployees().size());
	}

	@Test
	public void testRegister(){
		Employee employee = new Employee(5,"John","India",35);
		assertThat(employee).isNotNull();
		when(employeeRepository.save(employee)).thenReturn(employee);
		assertEquals("success",employeeController.register(employee));
	}

	@Test
	void contextLoads() {
	}

}
