/*************************************************************************************************
 * 版权所有 (C)2015
 * 
 * 文件名称：StringUtil.java
 * 内容摘要：StringUtil.java
 * 当前版本：TODO
 * 作        者：李加蒙
 * 完成日期：2015-12-18 下午3:46:35
 * 修改记录：
 * 修改日期：2015-12-18 下午3:46:35
 * 版   本 号：
 * 修   改 人：
 * 修改内容：
 ************************************************************************************************/
package com.xh.sh.xhspas.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import android.util.Log;

/**
 * @filename 文件名称：StringUtil.java
 * @contents 内容摘要：String工具类
 */
public class StringUtil {
	public static String getMobile(String mobile) {
		StringBuffer sb = new StringBuffer();
		sb.append(mobile.substring(0, 3));
		sb.append("****");
		sb.append(mobile.substring(7, 11));
		return sb.toString();
	}

	/**
	 * Returns whether the given string is empty, which means either null or
	 * empty.
	 * 
	 * @param value
	 *            The string to check.
	 * @return Whether the string is empty.
	 */
	public static boolean isEmpty(String value) {
		return value == null || value.trim().length() == 0
				|| "null".equals(value.trim());
	}

	public static String getDouble(int a) {
		if (a < 10) {
			return "0" + a;
		}
		return a + "";
	}

	/**
	 * Returns whether the given object is empty, which means either null or an
	 * empty string.
	 * 
	 * @param value
	 *            The Object to check
	 * @return Whether the object is empty.
	 */
	public static boolean isEmpty(Object value) {
		return value == null
				|| (value.getClass() == String.class && (isEmpty((String) value)));
	}

	/**
	 * Returns whether the given string is nonempty.
	 * 
	 * @param value
	 *            The String to check.
	 * @return True if nonempty, false otherwise.
	 */
	public static boolean isNotEmpty(String value) {
		return value != null && value.trim().length() > 0;
	}

	/**
	 * Returns true if the two strings are equal, otherwise false. Handles nulls
	 * too.
	 * 
	 * @param str1
	 *            The first string
	 * @param str2
	 *            The second string
	 * @return True if equal, false otherwise
	 */
	public static boolean isEqual(String str1, String str2) {
		if (str1 == null) {
			return str2 == null;
		}
		return str1.equals(str2);
	}

	/**
	 * Returns true if the two objects are equal, otherwise false. Handles nulls
	 * too.
	 * 
	 * @param obj1
	 *            The first object
	 * @param obj2
	 *            The second object
	 * @return True if equal, false otherwise
	 */
	public static boolean isEqual(Object obj1, Object obj2) {
		if (obj1 == null) {
			return obj2 == null;
		}
		return obj1.equals(obj2);
	}

	/**
	 * Returns true if the two strings are equal, ignoring case, otherwise
	 * false. Handles nulls too.
	 * 
	 * @param str1
	 *            The first string
	 * @param str2
	 *            The second string
	 * @return True if equal, false otherwise
	 */
	public static boolean isEqualIgnoreCase(String str1, String str2) {
		if (str1 == null) {
			return str2 == null;
		}
		return str1.equalsIgnoreCase(str2);
	}

	/**
	 * Returns true if the two strings are equal, otherwise false. Considers an
	 * empty string equal to a null string.
	 * 
	 * @param str1
	 *            The first string
	 * @param str2
	 *            The second string
	 * @return True if equal, false otherwise
	 */

	public static boolean isEqualWithEmpty(String str1, String str2) {
		if (isEmpty(str1)) {
			return isEmpty(str2);
		}
		return str1.equals(str2);
	}

	/**
	 * Returns true if the two strings are unequal, otherwise false. Handles
	 * nulls too.
	 * 
	 * @param str1
	 *            The first string
	 * @param str2
	 *            The second string
	 * @return True if unequal, false otherwise
	 */

	public static boolean isNotEqual(String str1, String str2) {
		if (str1 == null) {
			return str2 != null;
		}
		return !str1.equals(str2);
	}

	public static boolean isGoodEmail(String str2) {
		String check = "^([a-z0-9A-Z]+[-|\\.]?)+[a-z0-9A-Z]@([a-z0-9A-Z]+(-[a-z0-9A-Z]+)?\\.)+[a-zA-Z]{2,}$";
		Pattern regex = Pattern.compile(check);
		Matcher matcher = regex.matcher(str2);
		boolean isMatched = matcher.matches();
		System.out.println(isMatched);
		return isMatched;
	}

	String TAG = "string json";

	String str = "{" + "\"日期\" : \"2011-06-06\","

	+ "\"Like\" : {" + "\"Name\" : \"加内特\"," + "\"Height\" : \"2.11cm\","
			+ "\"Age\" : 35" + "},"

			+ "\"LikeList\":" + "{\"List\": "
			+ "["
			+ // 这里也是JSONObject
			"{" + "\"Name\" : \"Rose\"," + "\"Height\" : \"190cm\","
			+ "\"Age\" : 23" + "}," + "{" + "\"Name\" : \"科比\","
			+ "\"Height\" : \"198cm\"," + "\"Age\" : 33" + "}" +

			"]" + "}"

			+ "}";

	public void StringJson() {

		try {
			JSONObject dataJson = new JSONObject(str);
			Log.d(TAG, dataJson.getString("日期"));
			JSONObject nbaJson = dataJson.getJSONObject("Like");
			Log.d(TAG, nbaJson.getString("Name"));
			Log.d(TAG, nbaJson.getString("Height"));
			Log.d(TAG, nbaJson.get("Age").toString());
			JSONObject listJson = dataJson.getJSONObject("LikeList");
			JSONArray arrayJson = listJson.getJSONArray("List");
			for (int i = 0; i < arrayJson.length(); i++) {
				JSONObject tempJson = arrayJson.optJSONObject(i);
				Log.d(TAG, tempJson.getString("Name"));
				Log.d(TAG, tempJson.getString("Height"));
				Log.d(TAG, tempJson.getString("Age").toString());
			}
		} catch (JSONException e) {
			System.out.println("Something wrong...");
			e.printStackTrace();
		}
	}
}
