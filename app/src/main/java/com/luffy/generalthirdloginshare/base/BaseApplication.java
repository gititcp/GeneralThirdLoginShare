package com.luffy.generalthirdloginshare.base;

import android.app.Application;

import com.luffy.generalthirdloginshare.constants.ConstantsUmengLogin;
import com.umeng.commonsdk.UMConfigure;
import com.umeng.socialize.PlatformConfig;

/**
 * Created by lvlufei on 2017/11/24
 *
 * @desc 公共-Application
 */
public class BaseApplication extends Application {

    /**友盟分渠道*/ {
        // 微信设置
        PlatformConfig.setWeixin(ConstantsUmengLogin.WeChat.APP_ID, ConstantsUmengLogin.WeChat.APP_SECRET);
        PlatformConfig.setWXFileProvider("com.aoji.smartconsult.fileprovider");
        // 企业微信设置
        PlatformConfig.setWXWork(ConstantsUmengLogin.EnterpriseWeChat.APPID,
                ConstantsUmengLogin.EnterpriseWeChat.SECRET,
                ConstantsUmengLogin.EnterpriseWeChat.AGENTID,
                ConstantsUmengLogin.EnterpriseWeChat.SCHEMA);
        PlatformConfig.setWXWorkFileProvider("com.aoji.smartconsult.fileprovider");
        // QQ设置
        PlatformConfig.setQQZone(ConstantsUmengLogin.QQ.APP_ID, ConstantsUmengLogin.QQ.APP_KEY);
        PlatformConfig.setQQFileProvider("com.aoji.smartconsult.fileprovider");
        // 新浪微博
        PlatformConfig.setSinaWeibo(ConstantsUmengLogin.Sina.APP_ID, ConstantsUmengLogin.Sina.APP_SECRET, ConstantsUmengLogin.Sina.CALLBACK_URL);
        PlatformConfig.setSinaFileProvider("com.aoji.smartconsult.fileprovider");
        // 钉钉
        PlatformConfig.setDing(ConstantsUmengLogin.Ding.APP_ID);
    }

    @Override
    public void onCreate() {
        super.onCreate();
        /**初始化友盟SDK*/
        UMConfigure.init(this, ConstantsUmengLogin.Umeng.APP_ID, "umeng", UMConfigure.DEVICE_TYPE_PHONE, "");
    }
}
