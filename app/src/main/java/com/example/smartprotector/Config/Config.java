package com.example.smartprotector.Config;

/**
 * Created by Huhu on 7/26/15.
 */
public class Config {
    public static final String CHARSET = "utf-8";
    //总的url
    public static String URL_PREF="http://115.28.18.171/smartprotector";
    //登陆接口URL
    public static final String URL_LOGIN = URL_PREF+"/sp/login_u.php ";
    //注册接口URL
    public static final String URL_REGISTER = URL_PREF+"/sp/register.php  ";
    //提交新报修单URL
    public static final String URL_NEWService = URL_PREF+"/sp/report_service.php";
    //获取所有报修单的URL
    public static final String URL_GETALLSERVICE = URL_PREF+"/sp/main.php";
    //获取报修单详细内容的URL
    public static final String URL_GETSERVICE = URL_PREF+"/sp/service_id.php";
    //推送给物业意见URL
    public static final String URL_ADVICE = URL_PREF+"/sp/advice_fc.php";
    //获取物业信息
    public static final String URL_GETCOMPANY=URL_PREF+"/sp/company.php";
   //获取首页头像
    public static final String URL_GETLOGINICON=URL_PREF+"/sp/icon_u.php";
    //提交意见
    public static final String URL_ADVICE_TO= URL_PREF+"/sp/advice.php";

    //用户账号（手机号）
    public static final String USER_ACCOUNT = "register_phone";
    //用户密码
    public static final String USER_PASSWORD = "password";
    //注册手机号
    public static final String USER_PHONE = "register_phone";
    //注册昵称
    public static final String USER_NICKNAME = "nickname";
    //注册头像
    public static final String USER_ICONPATH = "icon_u";
    //物业意见
    public static final String ADVICE="advice_for_company";
    //新报修单图片
    public static final String SERVICE_IMAGE = "image";
    //新保修单地址
    public static final String SERVICE_ADDRESS = "address";
    //新保修单联系方式
    public static final String SERVICE_PHONE = "phonenumber";
    //新报修单类型
    public static final String SERVICE_TYPES = "types";
    //新保修单故障源
    public static final String SERVICE_ORIGIN = "origin";
    //新保修单维修时间
    public static final String SERVICE_TIME = "resolve_time";
    //新保修单表现
    public static final String SERVICE_REASON = "reason";
    //新保修单备注
    public static final String SERVICE_MEMO = "memo";
    //  报修单号
    public static final String SERVICE_ID = "s_id";
}
