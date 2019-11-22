package com.spring.series.mvc.rest.model;

import java.util.Map;

public class ProductModel {
	String Name;
	String url;
	String categoryName;
	Map categoryAttributes;
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	public Map getCategoryAttributes() {
		return categoryAttributes;
	}
	public void setCategoryAttributes(Map categoryAttributes) {
		this.categoryAttributes = categoryAttributes;
	}
	

}
