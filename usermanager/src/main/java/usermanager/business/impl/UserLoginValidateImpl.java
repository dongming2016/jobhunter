package usermanager.business.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;
import usermanager.business.interf.IUserLoginValidate;
import usermanager.entity.UserBaseInfo;
import usermanager.entity.UserLoginInfo;
import usermanager.mapper.UserInfoMapper;

/**
 * 
 * @Title:
 * @Description:
 * @Author:chenmin
 * @Since:2018年1月5日
 * @Version:1.1.0
 */
@Component
public class UserLoginValidateImpl implements IUserLoginValidate
{
    @Resource
    private UserInfoMapper userInfoMapper;

    @Override
    public String validate(UserLoginInfo userLoginInfo)
    {
    	System.out.println(userLoginInfo.getUser_password());
    	UserLoginInfo userInfo = userInfoMapper.getUserBaseInfoByName(userLoginInfo.getUser_name());
        // 当前判断用户是否正确在java中进行，也可以使用sql语句来完成。
        System.out.println(userLoginInfo.getUser_password());
        
        if(!userInfo.getUser_password().equals(userLoginInfo.getUser_password())) {
        	System.out.println("这是我的错！");
        }
        
        if (userInfo == null || !userInfo.getUser_password().equals(userLoginInfo.getUser_password())) {
            return "密码错误！！";
        }
        return "您已成功登陆！！";            
    }

	@Override
	public String insert(UserLoginInfo userLoginInfo) {
		// TODO Auto-generated method stub 
		System.out.println(userLoginInfo.getUser_id());
		System.out.println(userLoginInfo.getUser_password());
		System.out.println(userLoginInfo.getUser_name());
		UserLoginInfo userinfo = userInfoMapper.getUserBaseInfoByName(userLoginInfo.getUser_name());
		if(userinfo!=null) {
			return "该账号已有人注册！";
		}
		userInfoMapper.insertUserInfo(userLoginInfo);
		return "您已成功注册用户！！";
	}
}
