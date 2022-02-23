/**
 *
 */
package com.www.designmode.behavior.memento;

/**
 * 原始类
 * @author www
 *
 */
public class Original {
	private String value;

    public Original(String value) {
        this.value = value;
    }
    /**
     * 创建备份类
     * @return
     */
    public Memento createMemento(){
        return new Memento(value);
    }
    /**
     * 恢复备份
     * @param memento
     */
    public void restoreMemento(Memento memento){
        this.value = memento.getValue();
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
