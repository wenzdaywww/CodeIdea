package com.www.designmode.structural.composite;

/**
 * <p>@Description 2、叶子构建实现，如文件类 </p>
 * <p>@Version 1.0 </p>
 * <p>@Author www </p>
 * <p>@Date 2022/3/1 21:57 </p>
 */
public class File extends Component{
    /** 文件名称 **/
    private String name;
    /** 文件内容 **/
    private String content;
    /**
     * <p>@Description 构造方法 </p>
     * <p>@Author www </p>
     * <p>@Date 2022/3/1 21:58 </p>
     * @param name 文件名称
     * @param content 文件内容
     * @return
     */
    public File(String name, String content) {
        this.name = name;
        this.content = content;
    }

    /**
     * <p>@Description 获取名称 </p>
     * <p>@Author www </p>
     * <p>@Date 2022/3/1 21:49 </p>
     *
     * @return java.lang.String
     */
    @Override
    public String getName() {
        return name;
    }

    /**
     * <p>@Description 打印文件或文件夹 </p>
     * <p>@Author www </p>
     * <p>@Date 2022/3/1 21:50 </p>
     * @return void
     */
    @Override
    public void print() {
        System.out.println("文件：" + name);
    }

    /**
     * <p>@Description 获取文件或文件夹内容 </p>
     * <p>@Author www </p>
     * <p>@Date 2022/3/1 21:50 </p>
     *
     * @return java.lang.String
     */
    @Override
    public String getContent() {
        return content;
    }
}
