package com.hongao.jms.dto.base;

/**
 * 交易消息
 * @author iTeller_zc
 *
 * @date 2018年1月24日 上午9:18:41
 */
public class HaTxnMsg extends HaJmsMsg{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * 交易编号
	 */
	private Long txnId;

	public Long getTxnId() {
		return txnId;
	}

	public void setTxnId(Long txnId) {
		this.txnId = txnId;
	}

}
