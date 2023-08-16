package com.team.common;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.team.mapper.UserInfoMapper;
import com.team.vo.UserInfoVO;

public class Mybatis {
	private static SqlSessionFactory ssf;
	private static final String CONFIG_PATH = "config/mybatis-config.xml";
	static {
		try {
			InputStream is = Resources.getResourceAsStream(CONFIG_PATH);
			SqlSessionFactoryBuilder ssfb = new SqlSessionFactoryBuilder();
			ssf = ssfb.build(is);
		} catch (IOException e) {

			e.printStackTrace();
		}
	}

	public static SqlSessionFactory getFactory() {
		return ssf;
	}

	public static void main(String[] args) {
		//System.out.println(getFactory()); 안됨 ㅠ 다시
		/*
		SqlSession session=ssf.openSession();
		
		UserInfoMapper uiMapper=session.getMapper(UserInfoMapper.class);
		List<UserInfoVO> userList=uiMapper.selectUserInfoList(null);
		//위와 같은 것 -> List<UserInfoVO> userList=session.selectList("com.team.mapper.UserInfoMapper");
		-> UserInfoService로!
		*/
		
		//System.out.println(userList);
	}
}
