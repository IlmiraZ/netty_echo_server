package ru.ilmira;

import io.netty.channel.ChannelInitializer;
import io.netty.channel.socket.SocketChannel;
import io.netty.handler.codec.DelimiterBasedFrameDecoder;
import io.netty.handler.codec.Delimiters;
import io.netty.handler.codec.string.StringDecoder;
import io.netty.handler.codec.string.StringEncoder;

public class ServerInitializer extends ChannelInitializer<SocketChannel> {
    @Override
    protected void initChannel(SocketChannel ch) {
        ch.pipeline().addLast(new DelimiterBasedFrameDecoder(1024 * 4, Delimiters.lineDelimiter()));

        ch.pipeline().addLast(new StringDecoder());

        ch.pipeline().addLast(new StringEncoder());

        ch.pipeline().addLast(new ServerHandler());
    }
}
