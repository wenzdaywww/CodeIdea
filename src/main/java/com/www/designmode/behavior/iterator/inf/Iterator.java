package com.www.designmode.behavior.iterator.inf;

/**
 * <p>@Description 迭代器接口 </p>
 * <p>@Version 1.0 </p>
 * <p>@Author www </p>
 * <p>@Date 2022/3/2 21:30 </p>
 */
public interface Iterator {
    /**
     * <p>@Description 获取下一个 </p>
     * <p>@Author www </p>
     * <p>@Date 2022/3/2 21:31 </p>
     * @return java.lang.Object
     */
    Object next();
    /**
     * <p>@Description 是否有下一个值 </p>
     * <p>@Author www </p>
     * <p>@Date 2022/3/2 21:31 </p>
     * @return boolean
     */
    boolean hasNext();
}
