package com.team.mapper;

import java.util.List;

import com.team.vo.OrderInfoVO;

public interface OrderInfoMapper {
	List<OrderInfoVO> selectOrderInfoList(OrderInfoVO order);

	OrderInfoVO selectOrderInfo(int oiNum);

	int insertOrderInfo(OrderInfoVO order);

	int updateOrderInfo(OrderInfoVO order);

	int deleteOrderInfo(int oiNum);

}
