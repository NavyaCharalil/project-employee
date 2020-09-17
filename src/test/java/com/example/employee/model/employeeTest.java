package com.example.employee.model;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.assertj.core.api.Assertions.assertThat;


@SpringBootTest

public class employeeTest {
    private static final int ID = 1;
    private static final String NAME = "Smith";
    private static final String ADDRESS = "USA";
    private static final long AGE = 30;


    Employee employee = new Employee();

    @Test
    public void getIdTest() {
        employee.setId(ID);
        int actual = employee.getId();
        assertEquals(ID, actual);
    }
    @Test
    public void setIdTest() {
        employee.setId(ID);
        assertNotNull(employee.getId());
    }

    @Test
    public void getNameTest() {
        employee.setName(NAME);
        String actual = employee.getName();
        assertEquals(NAME, actual);
    }
    @Test
    public void setNameTest() {
        employee.setName(NAME);
        assertNotNull(employee.getName());
    }

    @Test
    public void getAddressTest() {
        employee.setAddress(ADDRESS);
        String actual = employee.getAddress();
        assertEquals(ADDRESS, actual);
    }
    @Test
    public void setAddressTest() {
        employee.setAddress(ADDRESS);
        assertNotNull(employee.getAddress());
    }

    @Test
    public void getAgeTest() {
        employee.setAge(AGE);
        long actual = employee.getAge();
        assertEquals(AGE, actual);
        assertThat(AGE).isNotZero();
    }
    @Test
    public void setAgeTest() {
        employee.setAge(AGE);
        assertNotNull(employee.getAge());
    }

}
