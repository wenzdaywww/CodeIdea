package com.www.designmode.creation.builder.impl;

import com.www.designmode.creation.builder.inf.PersonBuilder;
import com.www.designmode.creation.builder.model.Alien;
import com.www.designmode.creation.builder.model.Man;
import com.www.designmode.creation.builder.model.Person;

import java.util.AbstractSet;

/**
 * <p>@Description 4、外星人建造器 </p>
 * <p>@Version 1.0 </p>
 * <p>@Author www </p>
 * <p>@Date 2022/2/23 20:33 </p>
 */
public class AlienBuilder implements PersonBuilder {
    /** 人类对象 **/
    private Person person;
    /**
     * <p>@Description 构造方法 </p>
     * <p>@Author www </p>
     * <p>@Date 2022/2/23 20:36 </p>
     * @return
     */
    public AlienBuilder(){
        //创造一个外星人
        person = new Alien();
    }
    /**
     * <p>@Description 构建头部 </p>
     * <p>@Author www </p>
     * <p>@Date 2022/2/23 20:27 </p>
     * @return void
     */
    @Override
    public void buildHead() {
        System.out.println("开始造外星人脑袋...");
        person.setHead("外星人脑袋");
    }

    /**
     * <p>@Description 构建身体 </p>
     * <p>@Author www </p>
     * <p>@Date 2022/2/23 20:27 </p>
     * @return void
     */
    @Override
    public void buildBody() {
        System.out.println("开始造外星人身体...");
        person.setBody("外星人身体");
    }

    /**
     * <p>@Description 构建腿部 </p>
     * <p>@Author www </p>
     * <p>@Date 2022/2/23 20:27 </p>
     * @return void
     */
    @Override
    public void buildFoot() {
        System.out.println("开始造外星人腿部...");
        person.setFoot("外星人腿部");
    }

    /**
     * <p>@Description 建造人类 </p>
     * <p>@Author www </p>
     * <p>@Date 2022/2/23 20:27 </p>
     * @return void
     */
    @Override
    public Person buildPerson() {
        this.buildHead();
        this.buildBody();
        this.buildFoot();
        return person;
    }
}
