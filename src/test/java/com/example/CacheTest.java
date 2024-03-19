package com.example;

import com.exemple.Cache;
import org.junit.Assert;
import org.junit.Test;

public class CacheTest {

    @Test
    public void testSingletonInstance() {
        Cache instance1 = Cache.getInstance();
        Cache instance2 = Cache.getInstance();

        Assert.assertSame("Instances should be the same", instance1, instance2);
    }

    @Test
    public void testSetAndGetConfiguration() {
        Cache cache = Cache.getInstance();

        String testKey = "testKey";
        Object testValue = "testValue";

        cache.setConfiguration(testKey, testValue);

        Object retrievedValue = cache.getConfiguration(testKey);

        Assert.assertEquals("Retrieved value should match the set value", testValue, retrievedValue);
    }

    @Test
    public void testGetConfigurationNotSet() {
        Cache cache = Cache.getInstance();

        Object retrievedValue = cache.getConfiguration("nonExistentKey");

        Assert.assertNull("Retrieved value for a non-existent key should be null", retrievedValue);
    }
}
