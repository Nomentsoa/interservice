package ca.lazanomentsoa.consummer.Feign;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/feign")
@RequiredArgsConstructor
public class FeignController {

    private final FeignClientInterface feignClientInterface;

    @GetMapping("/instance")
    public String getInstance(){
        return feignClientInterface.getInstanceInfo();
    }
}
