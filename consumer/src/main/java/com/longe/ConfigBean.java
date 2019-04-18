package com.longe;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigBean {

    @Bean
    public IRule myRule(){
        //用随机策略替换轮询策略
        return new RandomRule();
    }
}
