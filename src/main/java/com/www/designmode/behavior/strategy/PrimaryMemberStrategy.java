/**
 *
 */
package com.www.designmode.behavior.strategy;

import com.www.designmode.behavior.strategy.interfaces.MemberStrategy;

/**
 * 初级会员折扣类
 * @author www
 *
 */
public class PrimaryMemberStrategy implements MemberStrategy {

	@Override
	public double calcPrice(double booksPrice) {
		System.out.println("对于初级会员的没有折扣");
        return booksPrice;
	}

}
