package usermanager.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import usermanager.entity.UserLoginInfo;

/**
 * 用户信息的
 * 
 * @Title:
 * @Description:
 * @Author:chenmin
 * @Since:2018年1月7日
 * @Version:1.1.0
 */
@Mapper
public interface UserInfoMapper
{
    /**
     * 根据用户名查询用户的基本信息
     * 
     * @param Name
     * @return
     * @Description:
     */
    @Select("SELECT user_id,user_name,user_password FROM tbl_user_base_info where user_name = #{userName}")
    UserLoginInfo getUserBaseInfoByName(@Param("userName")String Name);
    
    @Insert("insert into tbl_user_base_info(user_id,user_name,user_password) values(#{user_id},#{user_name},#{user_password})")
    public void insertUserInfo(UserLoginInfo user);
}
