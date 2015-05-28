package testing;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ ContainerBuilderTest.class, ContainerTest.class, SoferTest.class,
		StocCumparatTest.class, StocTest.class, StocVandutTest.class })
public class AllTests {

}

