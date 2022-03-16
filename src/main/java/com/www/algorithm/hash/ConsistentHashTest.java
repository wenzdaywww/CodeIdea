package com.www.algorithm.hash;

import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

/**
 * <p>@Description 一致性Hash算法 </p>
 * <p>@Version 1.0 </p>
 * <p>@Author www </p>
 * <p>@Date 2022/3/16 21:54 </p>
 */
public class ConsistentHashTest {
    /**
     * <p>@Description 测试 </p>
     * <p>@Author www </p>
     * <p>@Date 2022/3/16 21:55 </p>
     * @return void
     */
    @Test
    public void test() {
        Set<String> nodes = new HashSet<String>();
        nodes.add("A");
        nodes.add("B");
        nodes.add("C");
        ConsistentHash<String> consistentHash = new ConsistentHash<String>(2, nodes);
        consistentHash.add("D");
        System.out.println("一致hash环节点数: " + consistentHash.getSize());
        System.out.println("节点的hash值: ");
        consistentHash.printKey();
        String node = consistentHash.get("apple");
        System.out.println("临近的节点:" + node);
    }
}
