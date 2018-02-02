package usermanager.mapper;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import usermanager.entity.UserBaseInfo;

public interface UserBaseInfoMapper {
	
	//查询一条用户基本信息
	@Select("select user_base_id,user_base_name,user_image,user_discription,user_gender,user_major,user_birthday,user_final_diploma," +
			" user_total_work_time,user_live_city,user_tel_number,user_email,user_socialmedia_link,user_id from tbl_user_base_info where user_id =#{user_id}")
	public UserBaseInfo selectBaseInfoById(@Param("user_id")String user_id); 
	
	//插入一条用户基本信息
	@Insert("insert into tbl_user_base_info(user_base_id,user_base_name,user_image,user_discription,user_gender,user_major,user_birthday,user_final_diploma," + 
			" user_total_work_time,user_live_city,user_tel_number,user_email,user_socialmedia_link,user_id) values(#{user_base_id},#{user_base_name},#{user_image}," +
			" #{user_discription},#{user_gender},#{user_major},#{user_birthday},#{user_final_diploma},#{user_total_work_time},#{user_live_city},#{user_tel_number},"+
			" #{user_email},#{user_socialmedia_link},#{user_id})")
	public void insertUserBaseInfo(UserBaseInfo userbaseinfo);
	
	//更新一条信息
	@Update("update tbl_user_base_info set user_base_id = #{user_base_id},user_base_name = #{user_base_name},user_image = #{user_image},user_discription = #{user_discription},"+
			" user_gender = #{user_gender},user_major = #{user_major},user_birthday = #{user_birthday},user_final_diploma = #{user_final_diploma},user_total_work_time = #{user_total_work_time}," +
			" user_live_city =#{user_live_city},user_tel_number =#{user_tel_number},user_email =#{user_email},user_socialmedia_link =#{user_socialmedia_link} where user_id = #{user_id}")
	public void updateUserBaseInfo(UserBaseInfo userbaseinfo);
	
	//删除一条用户基本信息
	@Delete("delete from tbl_user_base_info where user_id=#{user_id}")
	public void deletUserBaseInfo(@Param("user_id") int id);
}
