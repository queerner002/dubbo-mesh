package com.alibaba.dubbo.performance.demo.agent.dubbo.agent.provider.client;

import com.alibaba.dubbo.performance.demo.agent.protocol.dubbo.DubboRpcBatchDecoder;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.socket.SocketChannel;

/**
 * @author 徐靖峰
 * Date 2018-06-07
 */
public class DubboRpcInitializer extends ChannelInitializer<SocketChannel> {

    @Override
    protected void initChannel(SocketChannel ch) throws Exception {
        ch.pipeline()
                .addLast(new DubboRpcBatchDecoder())
                .addLast(new DubboRpcHandler());
    }
}
