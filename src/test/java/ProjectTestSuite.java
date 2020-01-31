import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.nous.project.template.controller.ProductDAOTest;
import com.nous.project.template.controller.UserDAOTest;


//Class to run the projectTestSuite
@RunWith(Suite.class)
@SuiteClasses({UserDAOTest.class, ProductDAOTest.class})
public class ProjectTestSuite {

}
