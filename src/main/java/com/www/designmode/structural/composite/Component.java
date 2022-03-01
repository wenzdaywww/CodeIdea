package com.www.designmode.structural.composite;

/**
 * <p>@Description 1、定义抽象部件类，如文件夹和文件的方法类 </p>
 * <p>@Version 1.0 </p>
 * <p>@Author www </p>
 * <p>@Date 2022/3/1 21:48 </p>
 */
public abstract class Component {
    /**
     * <p>@Description 获取名称 </p>
     * <p>@Author www </p>
     * <p>@Date 2022/3/1 21:49 </p>
     * @return java.lang.String
     */
    public String getName() {
        throw new UnsupportedOperationException("不支持获取名称操作");
    }
    /**
     * <p>@Description 添加文件或文件夹 </p>
     * <p>@Author www </p>
     * <p>@Date 2022/3/1 21:49 </p>
     * @param component
     * @return void
     */
    public void add(Component component) {
        throw new UnsupportedOperationException("不支持添加操作");
    }
    /**
     * <p>@Description 删除文件或文件夹 </p>
     * <p>@Author www </p>
     * <p>@Date 2022/3/1 21:50 </p>
     * @param component
     * @return void
     */
    public void remove(Component component) {
        throw new UnsupportedOperationException("不支持删除操作");
    }
    /**
     * <p>@Description 打印文件或文件夹 </p>
     * <p>@Author www </p>
     * <p>@Date 2022/3/1 21:50 </p>
     * @return void
     */
    public void print() {
        throw new UnsupportedOperationException("不支持打印操作");
    }
    /**
     * <p>@Description 获取文件或文件夹内容 </p>
     * <p>@Author www </p>
     * <p>@Date 2022/3/1 21:50 </p>
     * @return java.lang.String
     */
    public String getContent() {
        throw new UnsupportedOperationException("不支持获取内容操作");
    }

}
