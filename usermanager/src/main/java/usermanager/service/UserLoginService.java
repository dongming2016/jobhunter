package usermanager.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import usermanager.business.impl.UserLoginValidateImpl;
import usermanager.business.interf.IUserLoginValidate;
import usermanager.entity.UserBaseInfo;
import usermanager.entity.UserLoginInfo;

/**
 * 
 * @Title:
 * @Description:
 * @Author:chenmin
 * @Since:2018年1月5日
 * @Version:1.1.0
 */
@RestController
@RequestMapping("/userManager/userBaseInfo")
public class UserLoginService
{
    private UserLoginValidateImpl userloginvalidate;
     
    public UserLoginValidateImpl getUserBaseInfo()
    {
        return userloginvalidate;
    }

    public void setUserBaseInfo(UserLoginValidateImpl userloginvalidate)
    {
        this.userloginvalidate = userloginvalidate;
    }
    
    @Autowired
    public UserLoginService(UserLoginValidateImpl userloginvalidate)
    {
        super();
        this.userloginvalidate = userloginvalidate;
    }

    @RequestMapping(method = RequestMethod.POST, value = "/log")
    public String logIn() {
    	return "nihao!!!";
    }
    
    @RequestMapping(method = RequestMethod.GET, value = "/find")
    public String find() {
    	return "hello!!!";
    }

	
    @RequestMapping(method = RequestMethod.POST, value = "/verify-user")
    public String verifyUser(@RequestBody UserLoginInfo userLoginInfo) {
    	if (userLoginInfo == null) {
    		return "没有接收到信息";
    	}
        return this.userloginvalidate.validate(userLoginInfo);
    }
    
    @RequestMapping(method = RequestMethod.POST,value = "/insertuser")
    public String insertUser(@RequestBody UserLoginInfo userLoginInfo) {
    	return userloginvalidate.insert(userLoginInfo);
    }
	    
}
