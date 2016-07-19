package com.marktrace.sendinterface;

/**
 * �������������豸���ص�����
 * 
 * @author Administrator
 * @hide
 */
public interface AnalyseDataInterface {
	/**
	 * ��д�����ص�����
	 * 
	 * @param buffer
	 *            ÿ�δӹܵ����ж�ȡ���ֽ�����
	 * @param bytes
	 *            ÿ�δӹܵ����ж�ȡ���ֽ���
	 */
	public void readStatus(byte[] buffer, int bytes);
	/**
	 * ȡ����
	 */
	public void receiveTagData();
	/**
	 * ����
	 */
	public void receiveReadCard();

	/**
	 * ��ȡ��¼
	 */
	public void receivePickupNote();

	/**
	 * ��ȡ���к�
	 */
	public void receiveGetSN();
	/**
	 * ��ȡ�汾��
	 */
	public void receiveGetVerNum();

	/**
	 * ��ȡ�豸����
	 */
	public void receiveGetCoding();
	/**
	 * ��ȡ�豸ʱ��
	 */
	public void receiveGetTime();

	/**
	 * ��ȡ��ǰ�����豸������
	 */
	public void receiveGetName();
	/**
	 * ��ȡ��ǰ�豸�������Կ
	 */
	public void receiveGetPassword();

	/**
	 * ͬ��ʱ��
	 */
	public void receiveSyncTime();

	/**
	 * �޸���������
	 */
	public void receiveUpdateBlueName();
	/**
	 * �޸���������
	 */
	public void receiveUpdateBluePass();
	/**
	 * �����豸����
	 */
	public void receiveSetCoding();
	/**
	 * �����豸�汾��
	 */
	public void receiveSetVerNum();

	/**
	 * ��16�����ֽ�����ת��Ϊ�ַ�����������ʾ
	 * 
	 * @param b
	 *            �ֽ�����
	 * @return �ַ���
	 */
	public String getHexString(byte[] b);

	/**
	 * ��ʱ���16�����ֽ�����ת���ַ���
	 * 
	 * @param b
	 * @return
	 */
	public String getBcdString(byte[] b);

}
