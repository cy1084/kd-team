package com.team.vo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@ToString
@Getter
public class UserInfoVO {
	private int uiNum;
	private String uiName;
	private String uiId;
	private String uiPwd;
	private String uiImgPath;
	private String uiDesc;
	private String uiBirth;
	private String credat;
	private String cretim;
	private String lmodat;
	private String lmotim;
	private String active;

}