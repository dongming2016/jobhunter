package usermanager.mapper;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import usermanager.entity.UserEduInfo;

public interface UserEduInfoMapper {
	
	//增加一条用户教育信息
	@Insert("insert into tbl_user_edu_info(edu_id,user_school_name,user_major_name,user_diploma,user_graduate_time,user_id)" +
			" valuse(#{edu_id},#{user_school_name},#{user_major_name},#{user_diploma},#{user_graduate_time},#{user_id})")
	public void  insertUserEduInfo(UserEduInfo userEduInfo);
	
	//删除一条用户教育信息
	@Delete("delete from tbl_user_edu_info where user_id=#{user_id}")
	public void deleteUserEduInfo(@Param("user_id") int id);
	
	//改变一条用户教育信息
	@Update("update tbl_user_edu_info set user_school_name=#{user_school_name},user_major_name=#{user_major_name},user_diploma=#{user_diploma},"+
			" user_graduate_time=#{user_graduate_time} where user_id=#{user_id}")
	public void updateUserEduInfo();
	
	//查询一条用户教育信息
	@Select("select edu_id,user_school_name,user_major_name,user_diploma,user_graduate_time,user_id from tbl_user_edu_info where user_id=#{user_id}")
	public UserEduInfo selectUserEduInfo(@Param("user_id") int id);
}
