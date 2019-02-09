package com.practice.ecommerce.repository;

import com.practice.ecommerce.model.OrderProduct;
import com.practice.ecommerce.model.OrderProductPK;
import org.springframework.data.repository.CrudRepository;

public interface OrderProductRepository extends CrudRepository<OrderProduct, OrderProductPK> {
}
