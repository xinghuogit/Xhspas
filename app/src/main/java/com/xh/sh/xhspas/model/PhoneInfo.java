/*************************************************************************************************
 * 版权所有 (C)2015
 * 
 * 文件名称：Phone.java
 * 内容摘要：Phone.java
 * 当前版本：TODO
 * 作        者：李加蒙1605651971@qq.com
 * 完成日期：2015-11-13 下午2:07:55
 * 修改记录：
 * 修改日期：2015-11-13 下午2:07:55
 * 版   本 号：
 * 修   改 人：
 * 修改内容：
 ************************************************************************************************/
package com.xh.sh.xhspas.model;

import java.io.Serializable;

import android.telephony.TelephonyManager;

/**
 * @filename 文件名称：Phone.java
 * @contents 内容摘要：手机信息
 */
public class PhoneInfo implements Serializable {

	// deviceId;
	// deviceSoftwareVersion;
	// line1Number;
	// networkCountryIso;
	// networkOperator;
	// networkOperatorName;
	// networkType;
	// phoneType;
	// simCountryIso;
	// simOperator;
	// simOperatorName;
	// simSerialNumber;
	// simState;
	// subscriberId;
	// voiceMailNumber;

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 国际移动用户识别码
	 */
	private String deviceId;
	private String deviceSoftwareVersion;
	private String line1Number;
	private String networkCountryIso;
	private String networkOperator;
	private String networkOperatorName;
	private String networkType;
	private String phoneType;
	private String simCountryIso;
	private String simOperator;
	private String simOperatorName;
	private String simSerialNumber;
	private String simState;
	private String subscriberId;
	private String voiceMailNumber;

	/**
	 * 国际移动用户识别码
	 */
	public String getDeviceId() {
		return deviceId;
	}

	/**
	 * 国际移动用户识别码
	 */
	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

	/**
	 * 手机卡中的软件信息、如GPS
	 */
	public String getDeviceSoftwareVersion() {
		return deviceSoftwareVersion;
	}

	/**
	 * 手机卡中的软件信息、如GPS
	 */
	public void setDeviceSoftwareVersion(String deviceSoftwareVersion) {
		this.deviceSoftwareVersion = deviceSoftwareVersion;
	}

	/**
	 * 1号线的电话号码
	 */
	public String getLine1Number() {
		return line1Number;
	}

	/**
	 * 1号线的电话号码
	 */
	public void setLine1Number(String line1Number) {
		this.line1Number = line1Number;
	}

	/**
	 * 当前的ISO国家网络代码
	 */
	public String getNetworkCountryIso() {
		return networkCountryIso;
	}

	/**
	 * 当前的ISO国家网络代码
	 */
	public void setNetworkCountryIso(String networkCountryIso) {
		this.networkCountryIso = networkCountryIso;
	}

	/**
	 * 移动运营商编号
	 */
	public String getNetworkOperator() {
		return networkOperator;
	}

	/**
	 * 移动运营商编号
	 */
	public void setNetworkOperator(String networkOperator) {
		this.networkOperator = networkOperator;
	}

	/**
	 * 移动运营商名称
	 * 
	 * @46000/46002中国移动
	 * @46001中国联通
	 * @46003中国电信
	 */
	public String getNetworkOperatorName() {
		return networkOperatorName;
	}

	/**
	 * 移动运营商名称
	 * 
	 * @46000/46002中国移动
	 * @46001中国联通
	 * @46003中国电信
	 */
	public void setNetworkOperatorName(String networkOperatorName) {
		this.networkOperatorName = networkOperatorName;
	}

	/**
	 * 网络类型
	 * 
	 * @0 没有
	 * @1 2g
	 * @2 3g
	 * @3 4g
	 */
	public String getNetworkType() {
		return networkType;
	}

	/**
	 * 网络类型
	 * 
	 * @0 没有
	 * @1 2g
	 * @2 3g
	 * @3 4g
	 */
	public void setNetworkType(String networkType) {
		this.networkType = networkType;
	}

	/**
	 * 手机号的类型
	 */
	public String getPhoneType() {
		return phoneType;
	}

	/**
	 * 手机号的类型
	 */
	public void setPhoneType(String phoneType) {
		this.phoneType = phoneType;
	}

	/**
	 * 当前的ISO国家网络代码
	 */
	public String getSimCountryIso() {
		return simCountryIso;
	}

	/**
	 * 当前的ISO国家网络代码
	 */
	public void setSimCountryIso(String simCountryIso) {
		this.simCountryIso = simCountryIso;
	}

	/**
	 * 当前手机卡的经营者
	 */
	public String getSimOperator() {
		return simOperator;
	}

	/**
	 * 当前手机卡的经营者
	 */
	public void setSimOperator(String simOperator) {
		this.simOperator = simOperator;
	}

	/**
	 * 当前手机卡的经营者名称
	 */
	public String getSimOperatorName() {
		return simOperatorName;
	}

	/**
	 * 当前手机卡的经营者名称
	 */
	public void setSimOperatorName(String simOperatorName) {
		this.simOperatorName = simOperatorName;
	}

	/**
	 * 手机号码
	 */
	public String getSimSerialNumber() {
		return simSerialNumber;
	}

	/**
	 * 手机号码
	 */
	public void setSimSerialNumber(String simSerialNumber) {
		this.simSerialNumber = simSerialNumber;
	}

	/**
	 * 手机号码状态
	 */
	public String getSimState() {
		return simState;
	}

	/**
	 * 手机号码状态
	 */
	public void setSimState(String simState) {
		this.simState = simState;
	}

	/**
	 * 用户ID
	 */
	public String getSubscriberId() {
		return subscriberId;
	}

	/**
	 * 用户ID
	 */
	public void setSubscriberId(String subscriberId) {
		this.subscriberId = subscriberId;
	}

	/**
	 * 声音用户编号
	 */
	public String getVoiceMailNumber() {
		return voiceMailNumber;
	}

	/**
	 * 声音用户编号
	 */
	public void setVoiceMailNumber(String voiceMailNumber) {
		this.voiceMailNumber = voiceMailNumber;
	}

	public PhoneInfo() {
		super();
	}

	public PhoneInfo(String deviceId, String deviceSoftwareVersion,
			String line1Number, String networkCountryIso,
			String networkOperator, String networkOperatorName,
			String networkType, String phoneType, String simCountryIso,
			String simOperator, String simOperatorName, String simSerialNumber,
			String simState, String subscriberId, String voiceMailNumber) {
		super();
		this.deviceId = deviceId;
		this.deviceSoftwareVersion = deviceSoftwareVersion;
		this.line1Number = line1Number;
		this.networkCountryIso = networkCountryIso;
		this.networkOperator = networkOperator;
		this.networkOperatorName = networkOperatorName;
		this.networkType = networkType;
		this.phoneType = phoneType;
		this.simCountryIso = simCountryIso;
		this.simOperator = simOperator;
		this.simOperatorName = simOperatorName;
		this.simSerialNumber = simSerialNumber;
		this.simState = simState;
		this.subscriberId = subscriberId;
		this.voiceMailNumber = voiceMailNumber;
	}

	public void populate(TelephonyManager tm) {
		if (tm == null) {
			System.out.println("phone为空");
			return;
		}
		setDeviceId(tm.getDeviceId() + "");
		setDeviceSoftwareVersion(tm.getDeviceSoftwareVersion() + "");
		setLine1Number(tm.getLine1Number() + "");
		setNetworkCountryIso(tm.getNetworkCountryIso() + "");
		setNetworkOperator(tm.getNetworkOperator() + "");
		setNetworkOperatorName(tm.getNetworkOperatorName() + "");
		setNetworkType(tm.getNetworkType() + "");
		setPhoneType(tm.getPhoneType() + "");
		setSimCountryIso(tm.getSimCountryIso() + "");
		setSimOperator(tm.getSimOperator() + "");
		setSimOperatorName(tm.getSimOperatorName() + "");
		setSimSerialNumber(tm.getSimSerialNumber() + "");
		setSimState(tm.getSimState() + "");
		setSubscriberId(tm.getSubscriberId() + "");
		setVoiceMailNumber(tm.getVoiceMailNumber() + "");
		System.out.println("DeviceId=" + getDeviceId()
				+ "\nDeviceSoftwareVersion=" + getDeviceSoftwareVersion()
				+ "\nLine1Number=" + getLine1Number() + "\nNetworkCountryIso="
				+ getNetworkCountryIso() + "\nNetworkOperator="
				+ getNetworkOperator() + "\nNetworkOperatorName="
				+ getNetworkOperatorName() + "\nNetworkType="
				+ getNetworkType() + "\nPhoneType=" + getPhoneType()
				+ "\nSimCountryIso=" + getSimCountryIso() + "\nSimOperator="
				+ getSimOperator() + "\nSimOperatorName="
				+ getSimOperatorName() + "\nSimSerialNumber="
				+ getSimSerialNumber() + "\nSimState=" + getSimState()
				+ "\nSubscriberId=" + getSubscriberId() + "\nVoiceMailNumber="
				+ getVoiceMailNumber());
	}

}
