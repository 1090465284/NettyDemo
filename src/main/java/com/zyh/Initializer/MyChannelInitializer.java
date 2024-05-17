package com.zyh.Initializer;

import com.zyh.handler.MyServerHandler;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.socket.SocketChannel;
import io.netty.handler.codec.LineBasedFrameDecoder;
import io.netty.handler.codec.http.FullHttpRequest;
import io.netty.handler.codec.string.StringDecoder;
import io.netty.handler.codec.string.StringEncoder;

import java.nio.charset.StandardCharsets;

public class MyChannelInitializer extends ChannelInitializer<SocketChannel> {
    @Override
    protected void initChannel(SocketChannel channel) throws Exception {
//        System.out.println("链接报告开始");
//        System.out.println("链接报告信息：有一客户端链接到本服务端");
//        System.out.println("链接报告IP:" + channel.localAddress().getHostString());
//        System.out.println("链接报告Port:" + channel.localAddress().getPort());
//        System.out.println("链接报告完毕");

        channel.pipeline().addLast(new LineBasedFrameDecoder(1024));
        channel.pipeline().addLast(new StringDecoder(StandardCharsets.UTF_8));
        channel.pipeline().addLast(new StringEncoder(StandardCharsets.UTF_8));
        channel.pipeline().addLast(new MyServerHandler());
    }
}
