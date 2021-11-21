package ru.ilmira;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

public class ServerHandler extends SimpleChannelInboundHandler<String> {
    @Override
    protected void channelRead0(ChannelHandlerContext ctx, String msg) {
        System.out.println(ctx.channel().remoteAddress() + ": " + msg);
        ctx.writeAndFlush(msg + "\n");
    }

    @Override
    public void channelActive(ChannelHandlerContext ctx) {
        System.out.println("RemoteAddress: " + ctx.channel().remoteAddress() + " connected!");
        ctx.writeAndFlush("Connected...\n");
    }
}
