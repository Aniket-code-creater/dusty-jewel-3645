package com.sweetopia.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sweetopia.entity.Cart;
import com.sweetopia.entity.Customer;

public interface CartRepository extends JpaRepository<Cart, Long>{

}
