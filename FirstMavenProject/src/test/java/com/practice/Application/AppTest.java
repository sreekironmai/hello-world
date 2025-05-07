package com.practice.Application;

import com.practice.dto.Employee;
import junit.framework.Assert;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.mockito.Mockito;
import org.springframework.lang.Nullable;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */

    public void AppTestMockObject(){
        App appMock=Mockito.mock(App.class);

    }

    public void testApp()
    {
        assertTrue( true );
    }


    public void testEmployeeName(){
       Employee empNameMock =Mockito.mock(Employee.class);
Mockito.when(empNameMock.getEmployeeName()).thenReturn("John Steve");
String result= empNameMock.getEmployeeName();
    Assert.assertEquals("John Steve", result);
    }

    public void testEmployeeID(){
        Employee empIDMock=Mockito.mock(Employee.class);
        Mockito.when(empIDMock.getEmployeeId()).thenReturn(10);
int resultId=empIDMock.getEmployeeId();
Assert.assertEquals( 10,resultId);
    }
    public void testEmployeeSalary(){
        Employee empSalaryMock=Mockito.mock(Employee.class);

        Mockito.when(empSalaryMock.getEmployeeSalary()).thenReturn(10000.0);
        double resultSalary=empSalaryMock.getEmployeeSalary();
        Assert.assertEquals(10000.0,resultSalary);
    }
}
