/**
 *
 */
package com.www.designmode.behavior.strategy;

import com.www.designmode.behavior.strategy.interfaces.MemberStrategy;

/**
 * 中级会员折扣类
 * @author www
 *
 */
public class IntermediateMemberStrategy implements MemberStrategy {

	@Override
	public double calcPrice(double booksPrice) {
		System.out.println("对于中级会员的折扣为10%");
        return booksPrice * 0.9;
	}

}
