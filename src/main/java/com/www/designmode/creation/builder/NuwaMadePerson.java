package com.www.designmode.creation.builder;

import com.www.designmode.creation.builder.inf.PersonBuilder;
import com.www.designmode.creation.builder.model.Person;

/**
 * <p>@Description 5、人类创造器 </p>
 * <p>@Version 1.0 </p>
 * <p>@Author www </p>
 * <p>@Date 2022/2/23 20:39 </p>
 */
public class NuwaMadePerson {
    /**
     * <p>@Description 创建人类 </p>
     * <p>@Author www </p>
     * <p>@Date 2022/2/23 20:40 </p>
     * @param builder 人类构造器
     * @return com.www.designmode.creation.builder.model.Person
     */
    public Person createOnePerson(PersonBuilder builder){
        builder.buildHead();
        builder.buildBody();
        builder.buildFoot();
        return builder.buildPerson();
    }
}
