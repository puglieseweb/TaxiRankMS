// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.puglieseweb.test.trms.server.domain;

import com.google.appengine.tools.development.testing.LocalServiceTestHelper;
import com.puglieseweb.test.trms.server.domain.TaxiRankDataOnDemand;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

privileged aspect TaxiRankIntegrationTest_Roo_IntegrationTest {
    
    declare @type: TaxiRankIntegrationTest: @RunWith(SpringJUnit4ClassRunner.class);
    
    declare @type: TaxiRankIntegrationTest: @ContextConfiguration(locations = "classpath:/META-INF/spring/applicationContext.xml");
    
    declare @type: TaxiRankIntegrationTest: @Transactional;
    
    @Autowired
    private TaxiRankDataOnDemand TaxiRankIntegrationTest.dod;
    
    private static final LocalServiceTestHelper TaxiRankIntegrationTest.helper = new LocalServiceTestHelper(new com.google.appengine.tools.development.testing.LocalDatastoreServiceTestConfig());
    
    @BeforeClass
    public static void TaxiRankIntegrationTest.setUp() {
        helper.setUp();
    }
    
    @AfterClass
    public static void TaxiRankIntegrationTest.tearDown() {
        helper.tearDown();
    }
    
    @Test
    public void TaxiRankIntegrationTest.testCountTaxiRanks() {
        org.junit.Assert.assertNotNull("Data on demand for 'TaxiRank' failed to initialize correctly", dod.getRandomTaxiRank());
        long count = com.puglieseweb.test.trms.server.domain.TaxiRank.countTaxiRanks();
        org.junit.Assert.assertTrue("Counter for 'TaxiRank' incorrectly reported there were no entries", count > 0);
    }
    
    @Test
    public void TaxiRankIntegrationTest.testFindTaxiRank() {
        com.puglieseweb.test.trms.server.domain.TaxiRank obj = dod.getRandomTaxiRank();
        org.junit.Assert.assertNotNull("Data on demand for 'TaxiRank' failed to initialize correctly", obj);
        java.lang.Long id = obj.getId();
        org.junit.Assert.assertNotNull("Data on demand for 'TaxiRank' failed to provide an identifier", id);
        obj = com.puglieseweb.test.trms.server.domain.TaxiRank.findTaxiRank(id);
        org.junit.Assert.assertNotNull("Find method for 'TaxiRank' illegally returned null for id '" + id + "'", obj);
        org.junit.Assert.assertEquals("Find method for 'TaxiRank' returned the incorrect identifier", id, obj.getId());
    }
    
    @Test
    public void TaxiRankIntegrationTest.testFindAllTaxiRanks() {
        org.junit.Assert.assertNotNull("Data on demand for 'TaxiRank' failed to initialize correctly", dod.getRandomTaxiRank());
        long count = com.puglieseweb.test.trms.server.domain.TaxiRank.countTaxiRanks();
        org.junit.Assert.assertTrue("Too expensive to perform a find all test for 'TaxiRank', as there are " + count + " entries; set the findAllMaximum to exceed this value or set findAll=false on the integration test annotation to disable the test", count < 250);
        java.util.List<com.puglieseweb.test.trms.server.domain.TaxiRank> result = com.puglieseweb.test.trms.server.domain.TaxiRank.findAllTaxiRanks();
        org.junit.Assert.assertNotNull("Find all method for 'TaxiRank' illegally returned null", result);
        org.junit.Assert.assertTrue("Find all method for 'TaxiRank' failed to return any data", result.size() > 0);
    }
    
    @Test
    public void TaxiRankIntegrationTest.testFindTaxiRankEntries() {
        org.junit.Assert.assertNotNull("Data on demand for 'TaxiRank' failed to initialize correctly", dod.getRandomTaxiRank());
        long count = com.puglieseweb.test.trms.server.domain.TaxiRank.countTaxiRanks();
        if (count > 20) count = 20;
        java.util.List<com.puglieseweb.test.trms.server.domain.TaxiRank> result = com.puglieseweb.test.trms.server.domain.TaxiRank.findTaxiRankEntries(0, (int) count);
        org.junit.Assert.assertNotNull("Find entries method for 'TaxiRank' illegally returned null", result);
        org.junit.Assert.assertEquals("Find entries method for 'TaxiRank' returned an incorrect number of entries", count, result.size());
    }
    
    @Test
    public void TaxiRankIntegrationTest.testFlush() {
        com.puglieseweb.test.trms.server.domain.TaxiRank obj = dod.getRandomTaxiRank();
        org.junit.Assert.assertNotNull("Data on demand for 'TaxiRank' failed to initialize correctly", obj);
        java.lang.Long id = obj.getId();
        org.junit.Assert.assertNotNull("Data on demand for 'TaxiRank' failed to provide an identifier", id);
        obj = com.puglieseweb.test.trms.server.domain.TaxiRank.findTaxiRank(id);
        org.junit.Assert.assertNotNull("Find method for 'TaxiRank' illegally returned null for id '" + id + "'", obj);
        boolean modified =  dod.modifyTaxiRank(obj);
        java.lang.Integer currentVersion = obj.getVersion();
        obj.flush();
        org.junit.Assert.assertTrue("Version for 'TaxiRank' failed to increment on flush directive", (currentVersion != null && obj.getVersion() > currentVersion) || !modified);
    }
    
    @Test
    public void TaxiRankIntegrationTest.testMerge() {
        com.puglieseweb.test.trms.server.domain.TaxiRank obj = dod.getRandomTaxiRank();
        org.junit.Assert.assertNotNull("Data on demand for 'TaxiRank' failed to initialize correctly", obj);
        java.lang.Long id = obj.getId();
        org.junit.Assert.assertNotNull("Data on demand for 'TaxiRank' failed to provide an identifier", id);
        obj = com.puglieseweb.test.trms.server.domain.TaxiRank.findTaxiRank(id);
        boolean modified =  dod.modifyTaxiRank(obj);
        java.lang.Integer currentVersion = obj.getVersion();
        com.puglieseweb.test.trms.server.domain.TaxiRank merged = (com.puglieseweb.test.trms.server.domain.TaxiRank) obj.merge();
        obj.flush();
        org.junit.Assert.assertEquals("Identifier of merged object not the same as identifier of original object", merged.getId(), id);
        org.junit.Assert.assertTrue("Version for 'TaxiRank' failed to increment on merge and flush directive", (currentVersion != null && obj.getVersion() > currentVersion) || !modified);
    }
    
    @Test
    public void TaxiRankIntegrationTest.testPersist() {
        org.junit.Assert.assertNotNull("Data on demand for 'TaxiRank' failed to initialize correctly", dod.getRandomTaxiRank());
        com.puglieseweb.test.trms.server.domain.TaxiRank obj = dod.getNewTransientTaxiRank(Integer.MAX_VALUE);
        org.junit.Assert.assertNotNull("Data on demand for 'TaxiRank' failed to provide a new transient entity", obj);
        org.junit.Assert.assertNull("Expected 'TaxiRank' identifier to be null", obj.getId());
        obj.persist();
        obj.flush();
        org.junit.Assert.assertNotNull("Expected 'TaxiRank' identifier to no longer be null", obj.getId());
    }
    
    @Test
    @Transactional(propagation = Propagation.SUPPORTS)
    public void TaxiRankIntegrationTest.testRemove() {
        com.puglieseweb.test.trms.server.domain.TaxiRank obj = dod.getRandomTaxiRank();
        org.junit.Assert.assertNotNull("Data on demand for 'TaxiRank' failed to initialize correctly", obj);
        java.lang.Long id = obj.getId();
        org.junit.Assert.assertNotNull("Data on demand for 'TaxiRank' failed to provide an identifier", id);
        obj = com.puglieseweb.test.trms.server.domain.TaxiRank.findTaxiRank(id);
        obj.remove();
        obj.flush();
        org.junit.Assert.assertNull("Failed to remove 'TaxiRank' with identifier '" + id + "'", com.puglieseweb.test.trms.server.domain.TaxiRank.findTaxiRank(id));
    }
    
}
