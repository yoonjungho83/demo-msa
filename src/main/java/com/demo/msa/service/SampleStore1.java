package com.demo.msa.service;

import org.springframework.stereotype.Service;

import com.demo.msa.model.entity.prod.StoreProduct;
import com.demo.msa.service.interfaces.prod.ProductMngService;
import com.demo.msa.service.interfaces.prod.ProductService;

@Service
public class SampleStore1 implements ProductMngService , ProductService{

	@Override
	public Object selectProductList() {
		// TODO Auto-generated method stub
		return "product all data list";
	}

	@Override
	public Object selectProductListPagging(Integer size, Integer offset) {
		// TODO Auto-generated method stub
		return "product pagging size : [" + size + "] offset : [" +  offset + "]";
	}

	@Override
	public Object selectProductItem(String prodId) {
		// TODO Auto-generated method stub
		return "select item : " + prodId;
	}

	@Override
	public Object insertProductItem(StoreProduct prod) {
		// TODO Auto-generated method stub
		return "insert success : " + prod.getProdId();
	}

	@Override
	public Object modifyProductItem(StoreProduct prod) {
		// TODO Auto-generated method stub
		return "modify success : " + prod.getProdId();
	}

	@Override
	public Object deleteProductItem(String prodId) {
		// TODO Auto-generated method stub
		return "delete success : " + prodId;
	}

}
