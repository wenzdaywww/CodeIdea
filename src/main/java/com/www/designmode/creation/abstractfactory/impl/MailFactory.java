package com.www.designmode.creation.abstractfactory.impl;

import com.www.designmode.creation.abstractfactory.inf.AbstractFactory;
import com.www.designmode.creation.factory.simple.impl.MailSender;
import com.www.designmode.creation.factory.simple.inf.Sender;

/**
 * <p>@Description 4、邮箱发送工厂 </p>
 * <p>@Version 1.0 </p>
 * <p>@Author www </p>
 * <p>@Date 2022/2/23 20:03 </p>
 */
public class MailFactory implements AbstractFactory {
    /**
     * <p>@Description 获取发送实例对象 </p>
     * <p>@Author www </p>
     * <p>@Date 2022/2/23 20:03 </p>
     * @return com.www.designmode.creation.factory.simple.inf.Sender
     */
    @Override
    public Sender getSender() {
        return new MailSender();
    }
}
