package com.baeldung.dependency.exception.repository;

import org.springframework.stereotype.Repository;

@Repository("dresses")
public class DressRepository implements InventoryRepository {
}
