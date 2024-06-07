package com.demo.msa.service.interfaces.prod;

import com.demo.msa.model.entity.prod.StoreProduct;

public interface ProductMngService {

	public Object insertProductItem(StoreProduct prod);
	public Object modifyProductItem(StoreProduct prod);
	public Object deleteProductItem(String prodId);
}
