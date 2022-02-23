/**
 * 策略模式：
 * 策略模式是对算法的包装，是把使用算法的责任和算法本身分割开来，委派给不同的对象管理。策略模式通常把一个系列的算法包装到一系列的策略类里面，
 * 作为一个抽象策略类的子类。用一句话来说，就是：“准备一组算法，并将每一个算法封装起来，使得它们可以互换”。
 */
package com.www.designmode.behavior.strategy;

import com.www.designmode.behavior.strategy.interfaces.MemberStrategy;

/**
 * @author www
 *
 */
public class StrategyTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//选择并创建需要使用的策略对象
        MemberStrategy strategy = new AdvancedMemberStrategy();
        //创建环境
        Price price = new Price(strategy);
        //计算价格
        double quote = price.quote(300);
        System.out.println("图书的最终价格为：" + quote);
	}

}
