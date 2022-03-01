package com.www.designmode.structural.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>@Description 2、子容器构建实现，如文件夹类 </p>
 * <p>@Version 1.0 </p>
 * <p>@Author www </p>
 * <p>@Date 2022/3/1 21:51 </p>
 */
public class Folder extends Component{
    /** 文件夹名称 **/
    private String name;
    /** 文件夹内容 **/
    private List<Component> subList = new ArrayList<Component>();
    /** 文件层级 **/
    private Integer level;
    /**
     * <p>@Description 构造方法 </p>
     * <p>@Author www </p>
     * <p>@Date 2022/3/1 21:53 </p>
     * @param name 文件夹名称
     * @return
     */
    public Folder(String name) {
        this.name = name;
    }

    /**
     * <p>@Description 获取名称 </p>
     * <p>@Author www </p>
     * <p>@Date 2022/3/1 21:49 </p>
     * @return java.lang.String
     */
    @Override
    public String getName() {
        return this.name;
    }

    /**
     * <p>@Description 添加文件或文件夹 </p>
     * <p>@Author www </p>
     * <p>@Date 2022/3/1 21:49 </p>
     * @param component
     * @return void
     */
    @Override
    public void add(Component component) {
        subList.add(component);
    }

    /**
     * <p>@Description 删除文件或文件夹 </p>
     * <p>@Author www </p>
     * <p>@Date 2022/3/1 21:50 </p>
     * @param component
     * @return void
     */
    @Override
    public void remove(Component component) {
        subList.remove(component);
    }

    /**
     * <p>@Description 打印文件或文件夹 </p>
     * <p>@Author www </p>
     * <p>@Date 2022/3/1 21:50 </p>
     *
     * @return void
     */
    @Override
    public void print() {
        System.out.println("文件夹：" + name);
        if (this.level == null) {
            this.level = 1;
        }
        String prefix = "";
        for (int i = 0; i < this.level; i++) {
            prefix += "-";
        }
        for (Component component : subList) {
            if (component instanceof Folder){
                ((Folder)component).level = this.level + 1;
            }
            System.out.print(prefix);
            component.print();
        }
        this.level = null;
    }
}
