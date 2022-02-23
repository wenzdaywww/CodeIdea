package com.www.designmode.creation.factory.simple.impl;

import com.www.designmode.creation.factory.simple.inf.Sender;

/**
 * <p>@Description 通过短信发送消息 </p>
 * <p>@Version 1.0 </p>
 * <p>@Author www </p>
 * <p>@Date 2022/2/23 19:24 </p>
 */
public class SmsSender implements Sender {
    /**
     * <p>@Description 发送消息 </p>
     * <p>@Author www </p>
     * <p>@Date 2022/2/23 19:19 </p>
     */
    @Override
    public void send() {
        System.out.println("通过短信发送消息...");
    }
}
