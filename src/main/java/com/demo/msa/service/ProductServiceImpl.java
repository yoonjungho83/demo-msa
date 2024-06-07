package com.demo.msa.service;

import com.demo.msa.model.entity.prod.StoreProduct;
import com.demo.msa.service.interfaces.prod.ProductMngService;
import com.demo.msa.service.interfaces.prod.ProductService;

public class ProductServiceImpl implements ProductMngService , ProductService{

	@Override
	public Object insertProductItem(StoreProduct prod) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object modifyProductItem(StoreProduct prod) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object deleteProductItem(String prodId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object selectProductList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object selectProductListPagging(Integer size, Integer offset) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object selectProductItem(String prodId) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
