package com.demo.msa.service.interfaces.prod;

public interface ProductService {

	public Object selectProductList();
	public Object selectProductListPagging(Integer size , Integer offset);
	public Object selectProductItem(String prodId);
}
