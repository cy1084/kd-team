package com.team.mapper;

import java.util.List;

import com.team.vo.UserInfoVO;

public interface UserInfoMapper {
	List<UserInfoVO> selectUserInfoList(UserInfoVO user);	//리스트
	UserInfoVO selectUserInfo(int uiNum);	//단일
}
