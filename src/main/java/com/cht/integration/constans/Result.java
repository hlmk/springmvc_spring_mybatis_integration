package com.cht.integration.constans;

/**
 * @category 公共结果返回类 ,提供返回封装
 */
public class Result {
	private String code;
	private String description;
	private Object detail;

	public Result() {
	}

	public Result(String code, String description, Object detail) {
		this.code = code;
		this.description = description;
		this.detail = detail;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Object getDetail() {
		return detail;
	}

	public void setDetail(Object detail) {
		this.detail = detail;
	}

}
