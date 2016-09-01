package BrazilCenter.UploadClient.Utils;

import java.util.HashMap;
import java.util.Map;

/**
 * ��˵�������ڱ������������Ϣ����
 * phoenix 20150127*/
public class Configuration {

	private String softwareId; // �����ʶ��
	private String targetSoftwareId;	//Ŀ���ַ�������ʶ��
	private String backupSfId;	//���������ʶ��
	
	private String MessageIp; // ��ת�����������IP��ַ
	private int MessagePort; // ��ת����������Ķ˿ں�
	
	private int reuploaderPort; //�����ش���������˿�
	
	private String MonitorServerIp;	//���������IP��ַ
	private int MonitorServerPort;	//��������Ķ˿ں�
	
	private int upLoadThreadNum; // �������ϴ��ļ��߳���
	
	private int scanInterval; // ɨ��Ŀ¼��ʱ����
	private int heartbeatInterval; // ������Ϣʱ����

	private Map<String, String> addresses;	//key:ScanAddress, value:BackupAddress
	private String destinationAddress; // Ŀ��Ŀ¼��ַ
	private String invaildFileDir;
	
	private String ftpIp; // FTP��������IP��ַ
	private int ftpPort; // FTP�������Ķ˿�
	private String ftpusername; // FTP�ͻ����û���
	private String ftppasswd; // FTP�ͻ�������
	
	public Configuration(){
		this.destinationAddress="/";
		this.addresses = new HashMap<String, String>();
	}
	
	public String getBackupSfId() {
		return backupSfId;
	}

	public String getTargetSoftwareId() {
		return targetSoftwareId;
	}

	public void setTargetSoftwareId(String targetSoftwareId) {
		this.targetSoftwareId = targetSoftwareId;
	}

	public int getReuploaderPort() {
		return reuploaderPort;
	}

	public void setReuploaderPort(int reuploaderPort) {
		this.reuploaderPort = reuploaderPort;
	}

	public void setBackupSfId(String backupSfId) {
		this.backupSfId = backupSfId;
	}

	public String getMonitorServerIp() {
		return MonitorServerIp;
	}

	public void setMonitorServerIp(String businessServerIp) {
		this.MonitorServerIp = businessServerIp;
	}

	public int getUpLoadThreadNum() {
		return upLoadThreadNum;
	}

	public void setUpLoadThreadNum(int upLoadThreadNum) {
		this.upLoadThreadNum = upLoadThreadNum;
	}

	public int getMonitorServerPort() {
		return MonitorServerPort;
	}

	public void setMonitorServerPort(int businessServerPort) {
		this.MonitorServerPort = businessServerPort;
	}

	public String getSoftwareId() {
		return softwareId;
	}

	public void setSoftwareId(String softwareId) {
		this.softwareId = softwareId;
	}

	public String getMessageIp() {
		return MessageIp;
	}

	public void setMessageIp(String messageIp) {
		MessageIp = messageIp;
	}

	public int getMessagePort() {
		return MessagePort;
	}

	public void setMessagePort(int messagePort) {
		MessagePort = messagePort;
	}
	
	public String getDestinationAddress() {
		return destinationAddress;
	}

	public void setDestinationAddress(String destinationAddress) {
		this.destinationAddress = destinationAddress;
	}

	public String getFtpIp() {
		return ftpIp;
	}

	public void setFtpIp(String ftpIp) {
		this.ftpIp = ftpIp;
	}

	public int getFtpPort() {
		return ftpPort;
	}

	public void setFtpPort(int ftpPort) {
		this.ftpPort = ftpPort;
	}

	public String getFtpusername() {
		return ftpusername;
	}

	public void setFtpusername(String ftpusername) {
		this.ftpusername = ftpusername;
	}

	public int getScanInterval() {
		return scanInterval;
	}

	public void setScanInterval(int scanInterval) {
		this.scanInterval = scanInterval;
	}

	public int getHeartbeatInterval() {
		return heartbeatInterval;
	}

	public void setHeartbeatInterval(int heartbeatInterval) {
		this.heartbeatInterval = heartbeatInterval;
	}

	public String getFtppasswd() {
		return ftppasswd;
	}

	public void setFtppasswd(String ftppasswd) {
		this.ftppasswd = ftppasswd;
	}

	public void putAddress(String souceAddress, String backUpAddress ){
		this.addresses.put(souceAddress, backUpAddress);
	}
	
	public Map<String,String> getAddress(){
		return this.addresses;
	}

	public String getInvaildFileDir() {
		return invaildFileDir;
	}

	public void setInvaildFileDir(String invaildFileDir) {
		this.invaildFileDir = invaildFileDir;
	}

}
