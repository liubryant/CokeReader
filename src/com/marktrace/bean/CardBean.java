package com.marktrace.bean;

/**
 * ������ʾ�ı�ǩʵ�����
 * 
 * @author Administrator
 * 
 */
public class CardBean {
	/**
	 * ��ǩ
	 */
	private String cardNo;
	/**
	 * ʱ��
	 */
	private String time;
	/**
	 * ����
	 */
	private int cardCount = 1;

	public String getCardNo() {
		return cardNo;
	}

	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public int getCardCount() {
		return cardCount;
	}

	public void setCardCount(int cardCount) {
		this.cardCount = cardCount;
	}

}
