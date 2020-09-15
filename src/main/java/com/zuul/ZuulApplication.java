package com.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

import com.zuul.Filters.RouteURLFilter;
import com.zuul.Filters.PostFilter;
import com.zuul.Filters.PreFilter;
import com.zuul.Filters.PreRewriteFilter;

@SpringBootApplication
@EnableDiscoveryClient
@EnableZuulProxy
public class ZuulApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZuulApplication.class, args);
	}
	
	@Bean
    public RouteURLFilter routerFilter() {
        return new RouteURLFilter();
    }
    @Bean
    public PreFilter preFilter() {
        return new PreFilter();
    }
    @Bean
    public PreRewriteFilter preRewriteFilter() {
        return new PreRewriteFilter();
    }
    @Bean
    public PostFilter postFilter() {
        return new PostFilter();
    }

}
