package com.zyh.handler;

import io.netty.channel.group.ChannelGroup;
import io.netty.channel.group.DefaultChannelGroup;
import io.netty.util.concurrent.GlobalEventExecutor;

public class ChannelHandler {
    public static ChannelGroup channelGroup = new DefaultChannelGroup((GlobalEventExecutor.INSTANCE));
}
