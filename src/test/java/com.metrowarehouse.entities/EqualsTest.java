package com.metrowarehouse.entities;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class EqualsTest {

    private final String COKE_ID = "32932cf3-8ba7-4e22-a4d9-c1e9f8baf12b";

    private final String MILK_ID = "9ec11179-6bd0-46cd-b52f-706fb27faa64";

    @Test
    public void pickingArticleEqualsTest() {
        PickingArticle cokeArticle = new PickingArticle(COKE_ID,"Coke",StorageArea.MAIN,"123",5);
        cokeArticle.setPickingLocation("Picking-MAIN-1");

        PickingArticle cokeArticle2 = new PickingArticle(COKE_ID,"Coke",StorageArea.MAIN,"123",5);
        cokeArticle2.setPickingLocation("Picking-MAIN-1");

        boolean same = cokeArticle.equals(cokeArticle2);

        assertEquals(true,same);
    }

    @Test
    public void orderArticleTrueEqualsTest() {
        PickingArticle cokeArticle = new PickingArticle(COKE_ID,"Coke",StorageArea.MAIN,"123",5);
        cokeArticle.setPickingLocation("Picking-MAIN-1");

        PickingArticle cokeArticle2 = new PickingArticle(COKE_ID,"Coke",StorageArea.MAIN,"123",5);
        cokeArticle2.setPickingLocation("Picking-MAIN-1");

        OrderArticle cokeOrderArticle = cokeArticle;
        OrderArticle coke2OrderArticle = cokeArticle2;

        boolean same = cokeOrderArticle.equals(coke2OrderArticle);

        assertEquals(true,same);
    }

    @Test
    public void orderArticleFalseEqualsTest() {
        PickingArticle cokeArticle = new PickingArticle(COKE_ID,"Coke",StorageArea.MAIN,"123",5);
        cokeArticle.setPickingLocation("Picking-MAIN-2");

        PickingArticle cokeArticle2 = new PickingArticle(COKE_ID,"Coke",StorageArea.MAIN,"123",5);
        cokeArticle2.setPickingLocation("Picking-MAIN-1");

        OrderArticle cokeOrderArticle = cokeArticle;
        OrderArticle coke2OrderArticle = cokeArticle2;

        boolean same = cokeOrderArticle.equals(coke2OrderArticle);

        assertEquals(false,same);
    }

    @Test
    public void checkedAvailabilityOrdersTrueEqualsTest() {
        PickingArticle cokeArticle = new PickingArticle(COKE_ID,"Coke",StorageArea.MAIN,"123",5);
        cokeArticle.setPickingLocation("Picking-MAIN-2");

        PickingArticle cokeArticle2 = new PickingArticle(COKE_ID,"Coke",StorageArea.MAIN,"123",5);
        cokeArticle2.setPickingLocation("Picking-MAIN-1");

        CheckingAvailabilityOrder checkingAvailabilityOrder1 = new CheckingAvailabilityOrder(Arrays.asList(cokeArticle,cokeArticle2),OrderStockStatus.Available);
        CheckingAvailabilityOrder checkingAvailabilityOrder2 = new CheckingAvailabilityOrder(createListOfArticlesForCheckedAvailability(),OrderStockStatus.Available);

        boolean equals = checkingAvailabilityOrder1.equals(checkingAvailabilityOrder2);

        assertEquals(true,equals);

    }

    @Test
    public void checkedAvailabilityOrdersFalseEqualsTest() {
        PickingArticle cokeArticle = new PickingArticle(COKE_ID,"Coke",StorageArea.MAIN,"123",5);
        cokeArticle.setPickingLocation("Picking-MAIN-2");

        PickingArticle cokeArticle2 = new PickingArticle(COKE_ID,"Coke2",StorageArea.MAIN,"123",5);
        cokeArticle2.setPickingLocation("Picking-MAIN-1");

        CheckingAvailabilityOrder checkingAvailabilityOrder1 = new CheckingAvailabilityOrder(Arrays.asList(cokeArticle,cokeArticle2),OrderStockStatus.Available);
        CheckingAvailabilityOrder checkingAvailabilityOrder2 = new CheckingAvailabilityOrder(createListOfArticlesForCheckedAvailability(),OrderStockStatus.Available);

        boolean equals = checkingAvailabilityOrder1.equals(checkingAvailabilityOrder2);

        assertEquals(false,equals);

    }

    private List<OrderArticle> createListOfArticlesForCheckedAvailability() {
        PickingArticle cokeArticle = new PickingArticle(COKE_ID,"Coke",StorageArea.MAIN,"123",5);
        cokeArticle.setPickingLocation("Picking-MAIN-2");

        PickingArticle cokeArticle2 = new PickingArticle(COKE_ID,"Coke",StorageArea.MAIN,"123",5);
        cokeArticle2.setPickingLocation("Picking-MAIN-1");

        return Arrays.asList(cokeArticle,cokeArticle2);
    }


}
