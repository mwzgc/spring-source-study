package com.mwz.grpc.client;

import org.springframework.context.annotation.Configuration;

@Configuration(proxyBeanMethods = false)
public class Config {

//    @Bean
//    public GrpcChannelConfigurer keepAliveClientConfigurer() {
//        return (channelBuilder, name) -> {
//            if (channelBuilder instanceof NettyChannelBuilder) {
//                ((NettyChannelBuilder) channelBuilder)
//                        .keepAliveTime(30, TimeUnit.SECONDS)
//                        .keepAliveTimeout(5, TimeUnit.SECONDS);
//            }
//        };
//        };
//    }

}
