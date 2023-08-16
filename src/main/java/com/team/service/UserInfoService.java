package com.team.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.team.common.Mybatis;
import com.team.mapper.UserInfoMapper;
import com.team.vo.UserInfoVO;

//service는 원래 인터페이스, 인터페이스 impl을 만들어 거기에 구현-> 하지만 인터페이스 역할을 제대로 하지 못하기 때문에 그냥 여기 구현!
public class UserInfoService {
	public List<UserInfoVO> getUserInfos(UserInfoVO user){
		try(SqlSession session=Mybatis.getFactory().openSession()){
			UserInfoMapper uiMapper=session.getMapper(UserInfoMapper.class);
			return uiMapper.selectUserInfoList(user);
		}
	}
	
	public UserInfoVO getUserInfo(int uiNum){
		try(SqlSession session=Mybatis.getFactory().openSession()){
			UserInfoMapper uiMapper=session.getMapper(UserInfoMapper.class);
			return uiMapper.selectUserInfo(uiNum);
		}
	}
	

}
