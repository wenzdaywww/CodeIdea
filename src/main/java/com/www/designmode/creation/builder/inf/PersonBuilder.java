package com.www.designmode.creation.builder.inf;

import com.www.designmode.creation.builder.model.Person;

/**
 * <p>@Description 3、人类建造器 </p>
 * <p>@Version 1.0 </p>
 * <p>@Author www </p>
 * <p>@Date 2022/2/23 20:26 </p>
 */
public interface PersonBuilder {
    /**
     * <p>@Description 构建头部 </p>
     * <p>@Author www </p>
     * <p>@Date 2022/2/23 20:27 </p>
     * @return void
     */
    void buildHead();
    /**
     * <p>@Description 构建身体 </p>
     * <p>@Author www </p>
     * <p>@Date 2022/2/23 20:27 </p>
     * @return void
     */
    void buildBody();
    /**
     * <p>@Description 构建腿部 </p>
     * <p>@Author www </p>
     * <p>@Date 2022/2/23 20:27 </p>
     * @return void
     */
    void buildFoot();
    /**
     * <p>@Description 建造人类 </p>
     * <p>@Author www </p>
     * <p>@Date 2022/2/23 20:27 </p>
     * @return void
     */
    Person buildPerson();
}
