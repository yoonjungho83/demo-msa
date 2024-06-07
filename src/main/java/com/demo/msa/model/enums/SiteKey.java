package com.demo.msa.model.enums;

import com.demo.msa.service.NoticeApiService;
import com.demo.msa.service.OpenApiService;
import com.demo.msa.service.SampleStore1;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum SiteKey {

	 open_api   (OpenApiService.class)
	,notice_api (NoticeApiService.class)
	,sample_store1 (SampleStore1.class)
	;
	
	private final Class<?> service;
	
	public String getId() {
		
		return this.name();
	}
}
