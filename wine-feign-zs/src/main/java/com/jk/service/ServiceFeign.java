package com.jk.service;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(value = "springcloud-pre", fallback = NewsServiceError.class)
public interface ServiceFeign extends JiuService{

}
