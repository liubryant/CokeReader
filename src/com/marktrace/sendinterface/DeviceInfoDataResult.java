package com.marktrace.sendinterface;

import com.marktrace.bean.DeviceInfo;

/**
 * �õ��豸����Ϣ���� , ���ɽ�����ʵ��������ʾ
 * 
 * @author Administrator
 * 
 */
public interface DeviceInfoDataResult {
	/**
	 * �õ��豸����Ϣ
	 * 
	 * @param card
	 */
	public void getDeviceInfo(DeviceInfo info);
}
