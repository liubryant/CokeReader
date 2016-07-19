package com.marktrace.sendinterface;

public interface SendCommandInterface {

	/**
	 * ��ʼ��ȡ
	 */
	public void start();

	/**
	 * ֹͣ��ȡ
	 */
	public void stop();

	/**
	 * ��ȡ��¼
	 */
	public void pickRecord();

	/**
	 * ͬ��ʱ��
	 */
	public void syncTime();

	/**
	 * �޸��豸����
	 * 
	 * @param name
	 *            �µ��豸����
	 */
	public void updateDeviceName(String name);

	/**
	 * �޸��������
	 * 
	 * @param password
	 *            �µ��������
	 */
	public void updateDevicePassword(String password);

	/**
	 * ��ȡ�豸��Ϣ
	 */
	public void getDeviceInfo();

	/**
	 * ��ȡ��ǰ���豸���ƺ��������
	 */
	public void getCurrentNameAndPassword();

	/**
	 * ��ȡ��ǰ������״̬
	 * 
	 * @return ����״̬
	 */
	public int getState();

	public UpdateUserName getUpdateName();

	public void setUpdateState(UpdateState updateState);

	public void setDeviceInfoResult(DeviceInfoDataResult deviceInfoResult);

	public void destroy();

	public void setUpdateName(UpdateUserName updateName);

	public void setSyncTime(SyncTime syncTime);
	
	public void setUpdatePass(UpdatePassword updatePass);
	
	public void setTagDataResult(ReadTagDataResult tagDataResult);
	
	public void setState(final int state);

}
