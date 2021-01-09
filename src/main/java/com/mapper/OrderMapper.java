package com.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.pojo.Order;

public interface OrderMapper {
	List<Order> selectAll();
	void insertOrder(@Param("order") Order order);
}
