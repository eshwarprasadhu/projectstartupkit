package com.nous.project.template.test.suite;
import org.junit.runners.Suite;
import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;

import com.nous.project.template.test.dao.TestProductDAO;
import com.nous.project.template.test.dao.TestUserDAO;

@RunWith(Suite.class)
@SuiteClasses({TestUserDAO.class, TestProductDAO.class})
public class TestProjectSuite {
    // code relevant to test suite goes here
}