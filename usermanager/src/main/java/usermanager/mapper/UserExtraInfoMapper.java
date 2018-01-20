package usermanager.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import usermanager.entity.UserExtraInfo;

public interface UserExtraInfoMapper {

	//增加一条用户额外信息
	@Insert("insert into tbl_usre_extra_info(extra_id,user_self_discription,user_expect_position,uers_labor_relattion,user_excepted_city,user_excepted_salary,user_supplement_discription,user_current_work_state,user_id)"+
			" valuse(#{extra_id},#{user_self_discription},#{user_expect_position},#{uers_labor_relattion},#{user_excepted_city},#{user_excepted_salary},#{user_supplement_discription},#{user_current_work_state},#{user_id})")
	public void insertUserExtraInfo(UserExtraInfo userExtraInfo);

	//删除一条用户额外信息
	@Delete("delete from tbl_usre_extra_info where user_id=#{user_id}")
	public void deleteUserExtraInfo(@Param("user_id") int id);
	
	//改变一条用户额外信息
	@Update("update tbl_usre_extra_info set user_self_discription=#{user_self_discription},user_expect_position=#{user_expect_position,uers_labor_relattion=#{uers_labor_relattion},user_excepted_city=#{user_excepted_city},"+
			" user_excepted_salary=#{user_excepted_salary},user_supplement_discription=#{user_supplement_discription},user_current_work_state=#{user_current_work_state} where user_id=#{user_id}")
	public void updateUserExtraInfo(UserExtraInfo userExtraInfo);
	
	//查询一条用户额外信息
	@Select("select extra_id,user_self_discription,user_expect_position,uers_labor_relattion,user_excepted_city,user_excepted_salary,user_supplement_discription,user_current_work_state,user_id from tbl_usre_extra_info where user_id=#{user_id}")
	public UserExtraInfo selectUserEduInfo(@Param("user_id") int id);
	
	//查询所有用户额外信息
	@Select("select extra_id,user_self_discription,user_expect_position,uers_labor_relattion,user_excepted_city,user_excepted_salary,user_supplement_discription,user_current_work_state,user_id from tbl_usre_extra_info")
	public List<UserExtraInfo> selectAllUserEduInfo();
}
