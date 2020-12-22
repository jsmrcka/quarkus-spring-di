package com.baeldung.dependency.exception.repository;

import org.springframework.stereotype.Repository;

@Repository("shoes")
public class ShoeRepository implements InventoryRepository {
}
