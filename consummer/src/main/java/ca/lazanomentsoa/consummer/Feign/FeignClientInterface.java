package ca.lazanomentsoa.consummer.Feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

//@FeignClient(name = "provider-service", url="http://localhost:8081")
@FeignClient(name = "provider")
//feign does not need @loadbalanced, it is already there
public interface FeignClientInterface {

    @GetMapping("/instance-info")
    String getInstanceInfo();
}
