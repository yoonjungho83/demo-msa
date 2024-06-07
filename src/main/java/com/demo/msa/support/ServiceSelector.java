package com.demo.msa.support;

import java.util.HashMap;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import com.demo.msa.model.enums.SiteKey;

import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
@Component
public class ServiceSelector {

	private final ApplicationContext context;
	private final Map<Class , Object> serviceMap = new HashMap<>();
	
	@PostConstruct
	private void init() {
		log.info("                                                            ");
		log.info("############################################################");
		log.info("################### ServiceSelector init ###################");
		log.info("############################################################");
		log.info("                                                            ");
		for(final var site : SiteKey.values()) {
//			final Class<?> key = site.getService();
			final var key = site.getService();
			this.serviceMap.put(key, context.getBean(key));
		}
	}
	
	@SuppressWarnings("unchecked")
	public <T> T select(final SiteKey key,  final Class<T> t ) throws Exception{
		
		final var service = this.serviceMap.get(key.getService());
		
		if(!t.isInstance(service)) {
			throw new Exception("service not support!!");
		}
		
		return (T)service;
	}
	
}
