/**
 *
 */
package com.www.designmode.creation.builder;

import java.util.ArrayList;
import java.util.List;

import com.www.designmode.creation.builder.interfaces.Sender;

/**
 * 建造者类
 * @author www
 *
 */
public class Builder {

    private List<Sender> list = new ArrayList<Sender>();
    /**
     * 创建邮件发送
     * @param count
     */
    public void produceMailSender(int count){
        for(int i=0; i<count; i++){
            list.add(new MailSender());
        }
    }
    /**
     * 创建SMS发送
     * @param count
     */
    public void produceSmsSender(int count){
        for(int i=0; i<count; i++){
            list.add(new SmsSender());
        }
    }
}
