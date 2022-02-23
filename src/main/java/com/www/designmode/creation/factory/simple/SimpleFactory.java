package com.www.designmode.creation.factory.simple;

import com.www.designmode.creation.factory.simple.impl.MailSender;
import com.www.designmode.creation.factory.simple.impl.SmsSender;
import com.www.designmode.creation.factory.simple.inf.Sender;
import org.apache.commons.lang3.StringUtils;

/**
 * <p>@Description 3、简单工厂类 </p>
 * <p>@Version 1.0 </p>
 * <p>@Author www </p>
 * <p>@Date 2022/2/23 19:27 </p>
 */
public class SimpleFactory {
    /**
     * <p>@Description 获取实例对象 </p>
     * <p>@Author www </p>
     * <p>@Date 2022/2/23 19:28 </p>
     * @param type 实例类型
     * @return com.www.designpattern.creation.factory.simple.inf.Sender
     */
    public Sender getSender(String type){
        if(StringUtils.equals(type,"sms")){
            return new SmsSender();
        }else {
            return new MailSender();
        }
    }
}
