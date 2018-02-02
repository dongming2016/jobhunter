package usermanager.business.interf;

import usermanager.entity.UserLoginInfo;

/**
 * 用户登录相关的接口。
 * 
 * @Title:
 * @Description:
 * @Author:chenmin
 * @Since:2018年1月7日
 * @Version:1.1.0
 */
public interface IUserLoginValidate
{
    /**
     * 检查 用户的合法性，当user的用户名和密码都正确时返回true。
     * 
     * @param userBaseInfo
     * @return
     * @Description:
     */
    public String validate(UserLoginInfo userLoginInfo);
    /**
     *@param 注册用户信息
     */
    public String insert(UserLoginInfo userLoginInfo);
    
    
}
