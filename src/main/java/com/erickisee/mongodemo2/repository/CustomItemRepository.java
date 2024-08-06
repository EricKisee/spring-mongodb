package com.erickisee.mongodemo2.repository;

public interface CustomItemRepository {
    void updateItemQuantity(String itemName, float newQuantity);
}
