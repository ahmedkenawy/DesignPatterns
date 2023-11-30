package com.keno.designpatterns.creational.prototype;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ConcretePrototypeTest {

    CloneablePrototype prototype;
    CloneablePrototype clone1;
    CloneablePrototype clone2;
    @Before
    public void setUp() throws Exception {
        prototype=new ConcretePrototype("Kenawy");
        clone1=(ConcretePrototype) prototype.clone();
        clone2=(ConcretePrototype) prototype.clone();
    }

    @After
    public void tearDown() throws Exception {
        prototype=null;
        clone1=null;
        clone2=null;
    }

    @Test
    public void testClone() {
        assertEquals(clone1.hashCode(),clone2.hashCode());
    }


}