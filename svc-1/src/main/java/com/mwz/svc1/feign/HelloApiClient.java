package com.mwz.svc1.feign;

import com.mwz.svc2.api.HelloApi;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(value = HelloApi.SERVICE_ID)
public interface HelloApiClient extends HelloApi {

}
