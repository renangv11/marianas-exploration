package com.vivere.marianasExploration.rest.response;

public class CoordinatesResponse {
	private Integer submarine;
	private Integer x;
	private Integer y;
	private Integer z;
	private String direction;

	public Integer getSubmarine() {
		return submarine;
	}

	public void setSubmarine(Integer submarine) {
		this.submarine = submarine;
	}

	public Integer getX() {
		return x;
	}

	public void setX(Integer x) {
		this.x = x;
	}

	public Integer getY() {
		return y;
	}

	public void setY(Integer y) {
		this.y = y;
	}

	public Integer getZ() {
		return z;
	}

	public void setZ(Integer z) {
		this.z = z;
	}

	public String getDirection() {
		return direction;
	}

	public void setDirection(String direction) {
		this.direction = direction;
	}
}
