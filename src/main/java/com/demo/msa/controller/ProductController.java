package com.demo.msa.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.msa.model.entity.prod.StoreProduct;
import com.demo.msa.model.enums.SiteKey;
import com.demo.msa.service.interfaces.prod.ProductMngService;
import com.demo.msa.service.interfaces.prod.ProductService;
import com.demo.msa.support.ServiceSelector;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/open/api/v1")
@RequiredArgsConstructor
public class ProductController {

	private final ServiceSelector serviceSelector ;
	
	
	@GetMapping("/{siteId}/prod/{prodId}")
	public ResponseEntity<?> getProdItem(@PathVariable("siteId") String siteId,@PathVariable("prodId") String prodId) throws Exception {
		
		Object result = null;
		if(siteId.equals("sample_store1")) {
			result = serviceSelector.select(SiteKey.sample_store1,ProductService.class).selectProductItem(prodId);
		}
		
		
		if(result == null) {
			return new ResponseEntity<>("not support item : " + prodId , HttpStatus.OK);
		}
		return new ResponseEntity<>("request product Data : " + result , HttpStatus.OK);
	}
	@GetMapping("/{siteId}/prod")
	public ResponseEntity<?> getProdList(@PathVariable("siteId") String siteId) throws Exception {
		
		Object result = null;
		if(siteId.equals("sample_store1")) {
			result = serviceSelector.select(SiteKey.sample_store1,ProductService.class).selectProductList();
		}
		
		
		if(result == null) {
			return new ResponseEntity<>("not support  "  , HttpStatus.OK);
		}
		return new ResponseEntity<>("request product list Data : " + result , HttpStatus.OK);
	}
	
	@PostMapping("/{siteId}/prod/")
	public ResponseEntity<?> insert(@PathVariable("siteId") String siteId, @RequestBody StoreProduct sp) throws Exception {
		
		Object result = null;
		if(siteId.equals("sample_store1")) {
			result = serviceSelector.select(SiteKey.sample_store1,ProductMngService.class).insertProductItem(sp);
		}
		
		
		if(result == null) {
			return new ResponseEntity<>("not support fn : "  , HttpStatus.OK);
		}
		return new ResponseEntity<>("request product insert Data : " + result , HttpStatus.OK);   
	}
	
	@PutMapping("/{siteId}/prod/")
	public ResponseEntity<?> modify(@PathVariable("siteId") String siteId, @RequestBody StoreProduct sp) throws Exception {
		
		Object result = null;
		if(siteId.equals("sample_store1")) {
			result = serviceSelector.select(SiteKey.sample_store1,ProductMngService.class).modifyProductItem(sp);
		}
		
		
		if(result == null) {
			return new ResponseEntity<>("not support fn : "  , HttpStatus.OK);
		}
		return new ResponseEntity<>("request product modify Data : " + result , HttpStatus.OK);   
	}
	@DeleteMapping("/{siteId}/prod/{prodId}")
	public ResponseEntity<?> delete(@PathVariable("siteId") String siteId, @PathVariable("prodId") String prodId) throws Exception {
		
		Object result = null;
		if(siteId.equals("sample_store1")) {
			result = serviceSelector.select(SiteKey.sample_store1,ProductMngService.class).deleteProductItem(prodId);
		}
		
		
		if(result == null) {
			return new ResponseEntity<>("not support fn : "  , HttpStatus.OK);
		}
		return new ResponseEntity<>("request product delete Data : " + result , HttpStatus.OK);   
	}
	
	
	
	
	
	
	
	
}
