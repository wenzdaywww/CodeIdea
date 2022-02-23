package com.www.designmode.creation.factory.method;

import com.www.designmode.creation.factory.simple.impl.MailSender;
import com.www.designmode.creation.factory.simple.impl.SmsSender;
import com.www.designmode.creation.factory.simple.inf.Sender;

/**
 * <p>@Description 3、工厂方法模式 </p>
 * <p>@Version 1.0 </p>
 * <p>@Author www </p>
 * <p>@Date 2022/2/23 19:54 </p>
 */
public class MethodFactory {
    /**
     * <p>@Description 获取短信发送实例 </p>
     * <p>@Author www </p>
     * <p>@Date 2022/2/23 19:55 </p>
     * @return com.www.designmode.creation.factory.simple.inf.Sender
     */
    public static Sender getSmsSender(){
        return new SmsSender();
    }
    /**
     * <p>@Description 获取邮箱发送实例 </p>
     * <p>@Author www </p>
     * <p>@Date 2022/2/23 19:55 </p>
     * @return com.www.designmode.creation.factory.simple.inf.Sender
     */
    public static Sender getMailSender(){
        return new MailSender();
    }
}
