/*************************************************************************************************
 * 版权所有 (C)2015
 * 
 * 文件名称：DeviceUtil.java
 * 内容摘要：DeviceUtil.java
 * 当前版本：TODO
 * 作        者：李加蒙1605651971@qq.com
 * 完成日期：2015-11-13 下午2:43:00
 * 修改记录：
 * 修改日期：2015-11-13 下午2:43:00
 * 版   本 号：
 * 修   改 人：
 * 修改内容：
 ************************************************************************************************/
package com.xh.sh.xhspas.util;

import android.content.Context;
import android.telephony.TelephonyManager;

import com.xh.sh.xhspas.model.PhoneInfo;
import com.xh.sh.xhspas.setting.SettingHelper;


/**
 * @filename 文件名称：DeviceUtil.java
 * @contents 内容摘要：获取手机信息工具类
 */
public class DeviceUtil {
	private static DeviceUtil mDeviceUtil;

	private DeviceUtil() {
	};

	public static synchronized DeviceUtil getInstance() {
		if (mDeviceUtil == null) {
			mDeviceUtil = new DeviceUtil();
		}
		return mDeviceUtil;
	}

	/**
	 * 获取手机电话信息方法 　 手机号码不是所有的都能获取。只是有一部分可以拿到。这个是由于移动运营商没有把手机号码的数据写入到
	 * SIM卡中。SIM卡只有唯一的编号 供网络与设备识别那就是IMSI号码。
	 * 手机的信号也可以说是通过这个号码在网络中传递的，并不是手机号码。试想，你的SIM丢失后，补办一张新的会换号码吗？是不会的
	 * 就是因为在你的手机号码对应的IMSI号，在移动运营商中被修改成新SIM卡的IMSI号码。 　　
	 * 
	 * 那么手机号为什么有的就能显示呢? 这个就像是一个变量，当移动运营商为它赋值了，它自然就会有值。不赋值自然为空。
	 * 对于移动的用户，手机号码(MDN)保存在运营商的服务器中，而不是保存在SIM卡里 。SIM卡只保留了IMSI和一些验证信息。手机每次入网注册的时候
	 * ，都会以短信的形式将IMSI及验证信息上传到运营商的服务器，服务器在完成注册动作之后，会以短信的形式将注册的结果下发到手机里。
	 * 下发的内容会因条件不同而不同。 　 如果服务器在下发的短信中，不包含手机的号码，手机是无法取得电话号码。如果短信中包含了号码 ，手机才会将其缓存，
	 * 以备他用.此外，对于其他运行商的SIM卡或者UIM卡，MDN有可能保存在UIM卡中。100% 能够取得本机号码不太可能。
	 * 移动神州行,联通的卡是可以取到的.动感地带的取不到.别的卡还没有试过.
	 * 能够读取SIM卡号的话应该有前提.那就是SIM卡已经写入了本机号码，不然是无法读取的。 具体处理代码：（程序在模拟器上无法实现，必须连接手机）
	 * 
	 */
	public PhoneInfo getPhoneInfo() {
		TelephonyManager tm = (TelephonyManager) SettingHelper.getInstance()
				.getApplicationContext()
				.getSystemService(Context.TELEPHONY_SERVICE);
		PhoneInfo phoneInfo = new PhoneInfo();

		phoneInfo.populate(tm);
		return phoneInfo;
	}

	public int getSDKINT() {
		return android.os.Build.VERSION.SDK_INT;
	}

	/**
	 * 获取手机系统版本及手机型号
	 * 
	 * @return
	 */
	public String getUserAgent() {
		StringBuilder stringBuilder = new StringBuilder("XHSPA.COM");
		stringBuilder.append("/Android");
		stringBuilder.append("/" + android.os.Build.VERSION.RELEASE);// 手机系统版本
		stringBuilder.append("/" + android.os.Build.MODEL);// 手机型号
		return stringBuilder.toString();
	}

}
