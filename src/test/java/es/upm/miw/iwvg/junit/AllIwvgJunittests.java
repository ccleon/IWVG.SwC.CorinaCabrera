package es.upm.miw.iwvg.junit;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({
    PointTest.class, DecimalCollectionTest.class,
    //FractionTest.class,
    //UserTest.class
})
public class AllIwvgJunittests {

}
