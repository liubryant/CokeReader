package com.marktrace.sendinterface;

/**
 * �����͵�ָ��
 * 
 * @author Administrator
 * @hide
 */
public interface GetSendCommandInterface {
	/**
	 * ����У���
	 * 
	 * @param sendBuffer
	 *            Ҫ���͵�ָ��(δ����У���)
	 */
	public byte[] sendRcvByteNum(byte[] sendBuffer);

	/**
	 * ����ָ��
	 * 
	 * @param command
	 *            ���͵�ָ��
	 */
	public void sendCommand(byte[] command);

	/**
	 * ��ȡͬ��ʱ���ָ��
	 * 
	 * @return ָ��
	 */
	public byte[] getSyncTimeCmd();

	/**
	 * ��ȡ�޸��豸���Ƶ�ָ��
	 * 
	 * @param name
	 *            �µ�����
	 * @return ָ��
	 */
	public byte[] getUpdateDeviceNameCmd(String name);

	/**
	 * ��ȡ�޸���������ָ��
	 * 
	 * @param password
	 *            �µ�����
	 * @return
	 */
	public byte[] getUpdateDevicePasswordCmd(String password);

	/**
	 * ���ַ���ת����ʮ�����Ƶ��ֽ�����
	 * 
	 * @param hexString
	 * @return
	 */
	public byte[] getByteArray(String hexString);

	/**
	 * BCD��
	 * 
	 * @param Dec
	 * @return
	 */
	public int DectoBCD(int Dec);

	/**
	 * �ж�����������Ƿ�Ϸ�
	 * 
	 * @param ver
	 *            ������ַ�
	 * @param length
	 *            �����ַ��ĳ���
	 */
	public boolean isCheckStr(String str, int length);
}
