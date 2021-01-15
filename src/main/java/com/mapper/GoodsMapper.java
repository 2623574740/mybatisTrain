package com.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.pojo.Goods;

public interface GoodsMapper {
	List<Goods> selectByName(@Param("name") String name);
	List<Goods> selectAll();
	List<Goods> selectTotal();
	List<Goods> selectGoodsByName(@Param("names") String[] names);
	
	void updateGoods(@Param("newgoods") Goods newgood);
	
	String selectParam();
}
