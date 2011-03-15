// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.puglieseweb.test.trms.server.domain;

import com.google.appengine.tools.development.testing.LocalServiceTestHelper;
import com.puglieseweb.test.trms.server.domain.TaxiDataOnDemand;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

privileged aspect TaxiIntegrationTest_Roo_IntegrationTest {
    
    declare @type: TaxiIntegrationTest: @RunWith(SpringJUnit4ClassRunner.class);
    
    declare @type: TaxiIntegrationTest: @ContextConfiguration(locations = "classpath:/META-INF/spring/applicationContext.xml");
    
    declare @type: TaxiIntegrationTest: @Transactional;
    
    @Autowired
    private TaxiDataOnDemand TaxiIntegrationTest.dod;
    
    private static final LocalServiceTestHelper TaxiIntegrationTest.helper = new LocalServiceTestHelper(new com.google.appengine.tools.development.testing.LocalDatastoreServiceTestConfig());
    
    @BeforeClass
    public static void TaxiIntegrationTest.setUp() {
        helper.setUp();
    }
    
    @AfterClass
    public static void TaxiIntegrationTest.tearDown() {
        helper.tearDown();
    }
    
    @Test
    public void TaxiIntegrationTest.testCountTaxis() {
        org.junit.Assert.assertNotNull("Data on demand for 'Taxi' failed to initialize correctly", dod.getRandomTaxi());
        long count = com.puglieseweb.test.trms.server.domain.Taxi.countTaxis();
        org.junit.Assert.assertTrue("Counter for 'Taxi' incorrectly reported there were no entries", count > 0);
    }
    
    @Test
    public void TaxiIntegrationTest.testFindTaxi() {
        com.puglieseweb.test.trms.server.domain.Taxi obj = dod.getRandomTaxi();
        org.junit.Assert.assertNotNull("Data on demand for 'Taxi' failed to initialize correctly", obj);
        java.lang.Long id = obj.getId();
        org.junit.Assert.assertNotNull("Data on demand for 'Taxi' failed to provide an identifier", id);
        obj = com.puglieseweb.test.trms.server.domain.Taxi.findTaxi(id);
        org.junit.Assert.assertNotNull("Find method for 'Taxi' illegally returned null for id '" + id + "'", obj);
        org.junit.Assert.assertEquals("Find method for 'Taxi' returned the incorrect identifier", id, obj.getId());
    }
    
    @Test
    public void TaxiIntegrationTest.testFindAllTaxis() {
        org.junit.Assert.assertNotNull("Data on demand for 'Taxi' failed to initialize correctly", dod.getRandomTaxi());
        long count = com.puglieseweb.test.trms.server.domain.Taxi.countTaxis();
        org.junit.Assert.assertTrue("Too expensive to perform a find all test for 'Taxi', as there are " + count + " entries; set the findAllMaximum to exceed this value or set findAll=false on the integration test annotation to disable the test", count < 250);
        java.util.List<com.puglieseweb.test.trms.server.domain.Taxi> result = com.puglieseweb.test.trms.server.domain.Taxi.findAllTaxis();
        org.junit.Assert.assertNotNull("Find all method for 'Taxi' illegally returned null", result);
        org.junit.Assert.assertTrue("Find all method for 'Taxi' failed to return any data", result.size() > 0);
    }
    
    @Test
    public void TaxiIntegrationTest.testFindTaxiEntries() {
        org.junit.Assert.assertNotNull("Data on demand for 'Taxi' failed to initialize correctly", dod.getRandomTaxi());
        long count = com.puglieseweb.test.trms.server.domain.Taxi.countTaxis();
        if (count > 20) count = 20;
        java.util.List<com.puglieseweb.test.trms.server.domain.Taxi> result = com.puglieseweb.test.trms.server.domain.Taxi.findTaxiEntries(0, (int) count);
        org.junit.Assert.assertNotNull("Find entries method for 'Taxi' illegally returned null", result);
        org.junit.Assert.assertEquals("Find entries method for 'Taxi' returned an incorrect number of entries", count, result.size());
    }
    
    @Test
    public void TaxiIntegrationTest.testFlush() {
        com.puglieseweb.test.trms.server.domain.Taxi obj = dod.getRandomTaxi();
        org.junit.Assert.assertNotNull("Data on demand for 'Taxi' failed to initialize correctly", obj);
        java.lang.Long id = obj.getId();
        org.junit.Assert.assertNotNull("Data on demand for 'Taxi' failed to provide an identifier", id);
        obj = com.puglieseweb.test.trms.server.domain.Taxi.findTaxi(id);
        org.junit.Assert.assertNotNull("Find method for 'Taxi' illegally returned null for id '" + id + "'", obj);
        boolean modified =  dod.modifyTaxi(obj);
        java.lang.Integer currentVersion = obj.getVersion();
        obj.flush();
        org.junit.Assert.assertTrue("Version for 'Taxi' failed to increment on flush directive", (currentVersion != null && obj.getVersion() > currentVersion) || !modified);
    }
    
    @Test
    public void TaxiIntegrationTest.testMerge() {
        com.puglieseweb.test.trms.server.domain.Taxi obj = dod.getRandomTaxi();
        org.junit.Assert.assertNotNull("Data on demand for 'Taxi' failed to initialize correctly", obj);
        java.lang.Long id = obj.getId();
        org.junit.Assert.assertNotNull("Data on demand for 'Taxi' failed to provide an identifier", id);
        obj = com.puglieseweb.test.trms.server.domain.Taxi.findTaxi(id);
        boolean modified =  dod.modifyTaxi(obj);
        java.lang.Integer currentVersion = obj.getVersion();
        com.puglieseweb.test.trms.server.domain.Taxi merged = (com.puglieseweb.test.trms.server.domain.Taxi) obj.merge();
        obj.flush();
        org.junit.Assert.assertEquals("Identifier of merged object not the same as identifier of original object", merged.getId(), id);
        org.junit.Assert.assertTrue("Version for 'Taxi' failed to increment on merge and flush directive", (currentVersion != null && obj.getVersion() > currentVersion) || !modified);
    }
    
    @Test
    public void TaxiIntegrationTest.testPersist() {
        org.junit.Assert.assertNotNull("Data on demand for 'Taxi' failed to initialize correctly", dod.getRandomTaxi());
        com.puglieseweb.test.trms.server.domain.Taxi obj = dod.getNewTransientTaxi(Integer.MAX_VALUE);
        org.junit.Assert.assertNotNull("Data on demand for 'Taxi' failed to provide a new transient entity", obj);
        org.junit.Assert.assertNull("Expected 'Taxi' identifier to be null", obj.getId());
        obj.persist();
        obj.flush();
        org.junit.Assert.assertNotNull("Expected 'Taxi' identifier to no longer be null", obj.getId());
    }
    
    @Test
    @Transactional(propagation = Propagation.SUPPORTS)
    public void TaxiIntegrationTest.testRemove() {
        com.puglieseweb.test.trms.server.domain.Taxi obj = dod.getRandomTaxi();
        org.junit.Assert.assertNotNull("Data on demand for 'Taxi' failed to initialize correctly", obj);
        java.lang.Long id = obj.getId();
        org.junit.Assert.assertNotNull("Data on demand for 'Taxi' failed to provide an identifier", id);
        obj = com.puglieseweb.test.trms.server.domain.Taxi.findTaxi(id);
        obj.remove();
        obj.flush();
        org.junit.Assert.assertNull("Failed to remove 'Taxi' with identifier '" + id + "'", com.puglieseweb.test.trms.server.domain.Taxi.findTaxi(id));
    }
    
}