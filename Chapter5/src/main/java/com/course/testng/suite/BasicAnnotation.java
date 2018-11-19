package com.course.testng;

import org.testng.annotations.*;

public class BasicAnnotation {
    @Test
    public void testCase1() {
        System.out.println("这是测试用例1");
    }

    @Test
    public void testCase2() {

        System.out.println("这是测试用例2");
    }

    @BeforeMethod
    public void BeforMethod() {

        System.out.println("这是测试方法之前运行");
    }

    @AfterMethod
    public void AfterMethod() {
        System.out.println("这是测试方法之后运行");
    }

    @BeforeClass
    public void BeforClass() {
        System.out.println("这是在类运行之前运行的方法");
    }

    @AfterClass
    public void AfterClass() {
        System.out.println("这是在类运行之后运行的方法");
    }

    @BeforeSuite
    public void BeforeSuite() {
        System.out.println("BeforeSuite ************ 测试套件");
    }

    @AfterSuite
    public void AfterSuite() {
        System.out.println("AfterSuite ************* 测试套件");
    }
}
