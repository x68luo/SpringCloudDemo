package com.evan.serviceconsumer.client;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "ServiceProvider")
public interface ProviderFeignClient {
    /**
     * Define ServiceProvider Interface
     * Parameters: Match with Provider
     * Signature: Not required for match
     * Return: Match with Provider
     * URL: Match with Provider path
     */
    @RequestMapping("/hello")
    public String helloWorld();
    @RequestMapping("/echo")
    public String echo(@RequestParam("text") String text);
}
