package com.www.algorithm.hash;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 * <p>@Description 一致性Hash算法 </p>
 * <p>@Version 1.0 </p>
 * <p>@Author www </p>
 * <p>@Date 2022/3/16 21:28 </p>
 */
public class ConsistentHash<T> {
    /** 节点的复制因子,实际节点个数 * numberOfReplicas = 虚拟节点个数 **/
    private final int numberOfReplicas;
    /** 存储虚拟节点的hash值到真实节点的映射 */
    private final SortedMap<Integer, T> circleMap = new TreeMap<Integer, T>();
    /**
     * <p>@Description 构造方法 </p>
     * <p>@Author www </p>
     * <p>@Date 2022/3/16 21:49 </p>
     * @param numberOfReplicas 节点的复制因子
     * @param nodes 节点数据
     */
    public ConsistentHash(int numberOfReplicas, Collection<T> nodes) {
        this.numberOfReplicas = numberOfReplicas;
        for (T node : nodes) {
            add(node);
        }
    }
    /**
     * <p>@Description 添加节点 </p>
     * <p>@Author www </p>
     * <p>@Date 2022/3/16 21:50 </p>
     * @param node 节点数据
     * @return void
     */
    public void add(T node) {
        for (int i = 0; i < numberOfReplicas; i++) {
            // 对于一个实际机器节点 node, 对应 numberOfReplicas 个虚拟节点
            //不同的虚拟节点(i不同)有不同的hash值,但都对应同一个实际机器node
            //虚拟node一般是均衡分布在环上的,数据存储在顺时针方向的虚拟node上
            String nodestr = node.toString() + i;
            int hashcode = nodestr.hashCode();
            circleMap.put(hashcode, node);
        }
    }
    /**
     * <p>@Description 删除节点 </p>
     * <p>@Author www </p>
     * <p>@Date 2022/3/16 21:51 </p>
     * @param node 节点信息
     * @return void
     */
    public void remove(T node) {
        for (int i = 0; i < numberOfReplicas; i++) {
            circleMap.remove((node.toString() + i).hashCode());
        }
    }
    /**
     * <p>@Description 获得一个最近的顺时针节点,根据给定的key 取Hash
     * 然后再取得顺时针方向上最近的一个虚拟节点对应的实际节点
     * 再从实际节点中取得 数据 </p>
     * <p>@Author www </p>
     * <p>@Date 2022/3/16 21:52 </p>
     * @param key
     * @return T
     */
    public T get(Object key) {
        if (circleMap.isEmpty()) {
            return null;
        }
        // node 用String来表示,获得node在哈希环中的hashCode
        int hash = key.hashCode();
        System.out.println("key的hashcode:" + hash);
        //数据映射在两台虚拟机器所在环之间,就需要按顺时针方向寻找机器
        if (!circleMap.containsKey(hash)) {
            SortedMap<Integer, T> tailMap = circleMap.tailMap(hash);
            hash = tailMap.isEmpty() ? circleMap.firstKey() : tailMap.firstKey();
        }
        return circleMap.get(hash);
    }
    /**
     * <p>@Description hash环节点数 </p>
     * <p>@Author www </p>
     * <p>@Date 2022/3/16 21:52 </p>
     * @return long
     */
    public long getSize() {
        return circleMap.size();
    }
    /**
     * <p>@Description 查看表示整个哈希环中各个虚拟节点位置 </p>
     * <p>@Author www </p>
     * <p>@Date 2022/3/16 21:53 </p>
     * @return void
     */
    public void printKey() {
        //获得TreeMap中所有的Key
        Set<Integer> sets = circleMap.keySet();
        //将获得的Key集合排序
        SortedSet<Integer> sortedSets = new TreeSet<Integer>(sets);
        for (Integer hashCode : sortedSets) {
            System.out.println(hashCode);
        }
        System.out.println("----查看相邻两个hashCode的差值: ----");
        //查看相邻两个hashCode的差值
        Iterator<Integer> it = sortedSets.iterator();
        Iterator<Integer> it2 = sortedSets.iterator();
        if (it2.hasNext()) {
            it2.next();
        }
        long keyPre, keyAfter;
        while (it.hasNext() && it2.hasNext()) {
            keyPre = it.next();
            keyAfter = it2.next();
            System.out.println(keyAfter - keyPre);
        }
    }



}

