package com.mozilla.bandar.dnt;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class TestData {

    @Test
    public void test() {
    	Data data = new Data();
    	data.readData("DESKTOP", "DAILY", "AGGREGATE", "data/");
    	String jsonData = data.displayNumbers("DESKTOP", "DAILY", "AGGREGATE");
        System.err.println("data: " + jsonData);
        assertNotNull(jsonData);
    }
}
