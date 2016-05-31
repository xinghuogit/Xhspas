/*************************************************************************************************
 * 版权所有 (C)2016
 * 
 * 文件名称：PartUtil.java
 * 内容摘要：PartUtil.java
 * 当前版本：TODO
 * 作        者：李加蒙
 * 完成日期：2016-4-12 下午5:04:56
 * 修改记录：
 * 修改日期：2016-4-12 下午5:04:56
 * 版   本 号：
 * 修   改 人：
 * 修改内容：
 ************************************************************************************************/
package com.xh.sh.xhspas.server.part;

import java.io.Serializable;

/**
 * @author 创建作者LI：李加蒙
 * @filename 文件名称：PartUtil.java
 * @contents 内容摘要：
 */
public class PartUtil implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private StringPartUtil stringPartUtil;
	private FilePartUtil filePartUtil;

	public StringPartUtil getStringPartUtil() {
		return stringPartUtil;
	}

	public void setStringPartUtil(StringPartUtil stringPartUtil) {
		this.stringPartUtil = stringPartUtil;
	}

	public FilePartUtil getFilePartUtil() {
		return filePartUtil;
	}

	public void setFilePartUtil(FilePartUtil filePartUtil) {
		this.filePartUtil = filePartUtil;
	}

	public PartUtil() {

	}

	public PartUtil(StringPartUtil stringPartUtil) {
		setStringPartUtil(stringPartUtil);
	}

	public PartUtil(FilePartUtil filePartUtil) {
		setFilePartUtil(filePartUtil);
	}

	public PartUtil(String key, String value) {

	}

}
