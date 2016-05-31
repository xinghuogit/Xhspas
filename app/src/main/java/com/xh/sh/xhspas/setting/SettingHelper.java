package com.xh.sh.xhspas.setting;

import android.app.Activity;
import android.content.Context;

import java.util.ArrayList;

/**
 * 文    件：SettingHelper
 * 描    述：SettingHelper
 * 作    者：LI
 * 时    间：2016/5/31 17:40
 * 版    权：(C)2016
 * 邮    箱：1822396822@qq.com
 */

public class SettingHelper {
    private static SettingHelper singleton = new SettingHelper();
    private static Context mApplicationContext;
    private static Activity mCurrentActivity;
//  private UserInfo mUserInfo;

    private static final String USER_INFO_FILE = "com.xh.sh.userInfo.dat";
    private static final String USER_DATA_FILE = "com.xh.sh.userdata.dat";
    private static final String GOODS_CATEGORY = "com.xh.sh.goodscategory.dat";

    // 用户名历史
    private ArrayList<String> nameHis;

    /**
     * @return 获取SettingHelper类的对象
     */
    public static SettingHelper getInstance() {
        return singleton;
    }

    /**
     * @return 获取APP的Context
     */
    public synchronized Context getApplicationContext() {
        return mApplicationContext;
    }

    /**
     * @param applicationContext 设置APP的Context
     */
    public synchronized void setApplicationContext(Context applicationContext) {
        mApplicationContext = applicationContext;
    }

//    /**
//     * 获取登陆用户信息
//     *
//     * @return
//     */
//    public UserInfo getUserInfo() {
//        if (mUserInfo == null) {
//            try {
//                File file = getApplicationContext().getFileStreamPath(USER_INFO_FILE);
//                if (file.exists()) {
//                    FileInputStream fis = getApplicationContext().openFileInput(USER_INFO_FILE);
//                    ObjectInputStream ois = new ObjectInputStream(fis);
//                    Object object = ois.readObject();
//                    if (object != null && object instanceof UserInfo) {
//                        mUserInfo = (UserInfo) object;
//                    }
//                    ois.close();
//                }
//
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//        }
//        return mUserInfo;
//    }
//
//    /**
//     * 保存登陆用户信息
//     *
//     * @return
//     */
//    public void setUserInfo(UserInfo userInfo) {
//        this.mUserInfo = userInfo;
//        if (userInfo == null) {
//            LoginServiceUtil.setAliasAndTags(false);
//            File file = getApplicationContext().getFileStreamPath(USER_INFO_FILE);
//            if (file.exists()) {
//                file.delete();
//            }
//        } else {
//            try {
//                FileOutputStream fos = getApplicationContext().openFileOutput(USER_INFO_FILE, Context.MODE_PRIVATE);
//                ObjectOutputStream oos = new ObjectOutputStream(fos);
//                oos.writeObject(userInfo);
//                oos.close();
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//        }
//    }


//    /**
//     * 获取用户名历史列表
//     *
//     * @author 翟彬
//     * @param
//     * @exception @throws
//     * @return
//     * @since 2015年8月20日 下午12:32:52
//     */
//    public ArrayList<String> getNameHis() {
//        try {
//            File file = getApplicationContext().getFileStreamPath(USER_NAME_HIS);
//            if (file.exists()) {
//                FileInputStream fis = getApplicationContext().openFileInput(USER_NAME_HIS);
//                ObjectInputStream ois = new ObjectInputStream(fis);
//                Object object = ois.readObject();
//                if (object != null && object instanceof ArrayList) {
//                    nameHis = (ArrayList<String>) object;
//                }
//                ois.close();
//            }
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        if (nameHis == null) {
//            nameHis = new ArrayList<String>();
//        }
//        return nameHis;
//    }
//
//    /**
//     * 保存用户名历史
//     *
//     * @author 翟彬
//     * @param
//     * @exception @throws
//     * @return
//     * @since 2015年8月20日 下午12:33:43
//     */
//    public void putNameHis(String name) {
//        if (nameHis == null) {
//            nameHis = new ArrayList<String>();
//        }
//        if (nameHis.contains(name)) {
//            nameHis.remove(name);
//        }
//        nameHis.add(0, name);
//        File file = getApplicationContext().getFileStreamPath(USER_NAME_HIS);
//        if (file.exists()) {
//            file.delete();
//        }
//        try {
//            FileOutputStream fos = getApplicationContext().openFileOutput(USER_NAME_HIS, Context.MODE_PRIVATE);
//            ObjectOutputStream oos = new ObjectOutputStream(fos);
//            oos.writeObject(nameHis);
//            oos.close();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
}
