package com.marktrace.sendinterface;

import java.util.List;

import com.marktrace.bean.CardBean;

/**
 * �õ��豸��ȡ�ı�ǩ����, ���ɽ�����ʵ��������ʾ
 * 
 * @author Administrator
 * 
 */
public interface ReadTagDataResult {
	/**
	 * �õ��豸��ȡ�ı�ǩ����
	 * 
	 * @param data
	 */
	public void visble(List<CardBean> data);
}
