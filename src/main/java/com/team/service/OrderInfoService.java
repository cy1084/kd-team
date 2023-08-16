package com.team.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.team.common.Mybatis;
import com.team.mapper.OrderInfoMapper;
import com.team.vo.OrderInfoVO;

public class OrderInfoService {
	public List<OrderInfoVO> getOrderInfos(OrderInfoVO order){
		try(SqlSession session=Mybatis.getFactory().openSession()){
			OrderInfoMapper oiMapper=session.getMapper(OrderInfoMapper.class);
			return oiMapper.selectOrderInfoList(order);
		}
	}
	public OrderInfoVO getOrderInfo(int oiNum) {
		try(SqlSession session=Mybatis.getFactory().openSession()){
			OrderInfoMapper oiMapper=session.getMapper(OrderInfoMapper.class);
			return oiMapper.selectOrderInfo(oiNum);
		}
	}
	public int insertOrderInfo(OrderInfoVO order) {
		try(SqlSession session=Mybatis.getFactory().openSession()){
			OrderInfoMapper oiMapper=session.getMapper(OrderInfoMapper.class);
			return oiMapper.insertOrderInfo(order);
		}
	}
	public int updateOrderInfo(OrderInfoVO order) {
		try(SqlSession session=Mybatis.getFactory().openSession()){
			OrderInfoMapper oiMapper=session.getMapper(OrderInfoMapper.class);
			return oiMapper.updateOrderInfo(order);
		}
	}
	public int deleteOrderInfo(int oiNum) {
		try(SqlSession session=Mybatis.getFactory().openSession()){
			OrderInfoMapper oiMapper=session.getMapper(OrderInfoMapper.class);
			return oiMapper.deleteOrderInfo(oiNum);
		}
	}
}
