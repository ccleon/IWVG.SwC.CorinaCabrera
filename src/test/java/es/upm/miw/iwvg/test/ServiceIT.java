package es.upm.miw.iwvg.test;

import static org.junit.Assert.*;

import org.junit.Test;

import es.upm.miw.iwvg.test.Service;

public class ServiceIT {

    @Test
    public void test() {
        Service service = new Service();
        assertNotNull(service.getValue());
    }

}
