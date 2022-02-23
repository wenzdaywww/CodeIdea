package com.www.designmode.creation.builder.impl;

import com.www.designmode.creation.builder.inf.PersonBuilder;
import com.www.designmode.creation.builder.model.Person;
import com.www.designmode.creation.builder.model.Woman;

/**
 * <p>@Description 4、女人建造器 </p>
 * <p>@Version 1.0 </p>
 * <p>@Author www </p>
 * <p>@Date 2022/2/23 20:33 </p>
 */
public class WomanBuilder implements PersonBuilder {
    /** 人类对象 **/
    private Person person;
    /**
     * <p>@Description 构造方法 </p>
     * <p>@Author www </p>
     * <p>@Date 2022/2/23 20:36 </p>
     * @return
     */
    public WomanBuilder(){
        //创造一个女人
        person = new Woman();
    }
    /**
     * <p>@Description 构建头部 </p>
     * <p>@Author www </p>
     * <p>@Date 2022/2/23 20:27 </p>
     * @return void
     */
    @Override
    public void buildHead() {
        System.out.println("开始捏女人脑袋...");
        person.setHead("女人脑袋");
    }

    /**
     * <p>@Description 构建身体 </p>
     * <p>@Author www </p>
     * <p>@Date 2022/2/23 20:27 </p>
     * @return void
     */
    @Override
    public void buildBody() {
        System.out.println("开始捏女人身体...");
        person.setBody("女人身体");
    }

    /**
     * <p>@Description 构建腿部 </p>
     * <p>@Author www </p>
     * <p>@Date 2022/2/23 20:27 </p>
     * @return void
     */
    @Override
    public void buildFoot() {
        System.out.println("开始捏女人腿部...");
        person.setFoot("女人腿部");
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
