package com.team.vo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class OrderInfoVO {
	private int oiNum;
	private String oiId;
	private String oiName;
	private String oiDate;
	private String oiPhone;
	private String oiAddress;
	private int oiAmount;
	private String oiPayment;
	private int oiDelivery;

}
