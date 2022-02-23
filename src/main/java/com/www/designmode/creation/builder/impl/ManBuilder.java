package com.www.designmode.creation.builder.impl;

import com.www.designmode.creation.builder.inf.PersonBuilder;
import com.www.designmode.creation.builder.model.Man;
import com.www.designmode.creation.builder.model.Person;

/**
 * <p>@Description 4、男人建造器 </p>
 * <p>@Version 1.0 </p>
 * <p>@Author www </p>
 * <p>@Date 2022/2/23 20:33 </p>
 */
public class ManBuilder implements PersonBuilder {
    /** 人类对象 **/
    private Person person;
    /**
     * <p>@Description 构造方法 </p>
     * <p>@Author www </p>
     * <p>@Date 2022/2/23 20:36 </p>
     * @return
     */
    public ManBuilder(){
        //创造一个男人
        person = new Man();
    }
    /**
     * <p>@Description 构建头部 </p>
     * <p>@Author www </p>
     * <p>@Date 2022/2/23 20:27 </p>
     * @return void
     */
    @Override
    public void buildHead() {
        System.out.println("开始捏男人脑袋...");
        person.setHead("男人脑袋");
    }

    /**
     * <p>@Description 构建身体 </p>
     * <p>@Author www </p>
     * <p>@Date 2022/2/23 20:27 </p>
     * @return void
     */
    @Override
    public void buildBody() {
        System.out.println("开始捏男人身体...");
        person.setBody("男人身体");
    }

    /**
     * <p>@Description 构建腿部 </p>
     * <p>@Author www </p>
     * <p>@Date 2022/2/23 20:27 </p>
     * @return void
     */
    @Override
    public void buildFoot() {
        System.out.println("开始捏男人腿部...");
        person.setFoot("男人腿部");
    }

    /**
     * <p>@Description 建造人类 </p>
     * <p>@Author www </p>
     * <p>@Date 2022/2/23 20:27 </p>
     * @return void
     */
    @Override
    public Person buildPerson() {
        return person;
    }
}
