/**
 *
 */
package com.www.designmode.behavior.state;

/**
 * 状态类
 * @author www
 *
 */
public class State {
    private String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public void online(){
        System.out.println("QQ上线");
    }

    public void offline(){
        System.out.println("QQ下线");
    }
}
