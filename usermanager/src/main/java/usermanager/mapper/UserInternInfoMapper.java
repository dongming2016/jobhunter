package usermanager.mapper;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface UserInternInfo {

	//增加一条实习经历
	@Insert("insert into tbl_user_intern_info(intern_id,intern_company_name,intern_position,intern_company_image,intern_start_time," +
			" intern_stop_time,intern_work_content,user_id valuse(#{intern_id},#{intern_company_name},#{intern_position},#{intern_company_image},"+
			" #{intern_start_time},#{intern_stop_time},#{intern_work_content},#{user_id})")
	public void insertUserInternInfo(UserInternInfo userInternInf);
	
	//删除一条实习经历
	@Delete("delete from tbl_user_intern_info where user_id=#{user_id}")
	public void deleteUserInternInfo(@Param("user_id") int id);
	
	//修改一条实习经历
	@Update("update tbl_user_intern_info set intern_company_name=#{intern_company_name},intern_position=#{intern_position},intern_company_image=#{intern_company_image}," +
			" intern_start_time=#{intern_start_time},intern_stop_time=#{intern_stop_time},intern_work_content=#{intern_work_content} where user_id=#{user_id}")
	public void updateUserInternInfo(UserInternInfo userInternInf);
	
	//查询一条实习经历
	@Select("select intern_id,intern_company_name,intern_position,intern_company_image,intern_start_time,intern_stop_time,intern_work_content,user_id from tbl_user_intern_info" +
			" where usre_id=#{user_id}")
	public UserInternInfo selectUserInternInfo(@Param("user_id") int id);
}
