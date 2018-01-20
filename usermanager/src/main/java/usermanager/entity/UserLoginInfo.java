package usermanager.entity;

/**
 * 用户基本信息
 * 
 * @Title:
 * @Description:
 * @Author:chenmin
 * @Since:2018年1月7日
 * @Version:1.1.0
 */
public class UserLoginInfo {
	/**
	 * 用户id，用32位UUID标识
	 */
	private String user_id;

	/**
	 * 用户密码
	 */
	private String user_password;

	/**
	 * 用户名，本网站中唯一。
	 */
	private String user_name;

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getUser_password() {
		return user_password;
	}

	public void setUser_password(String user_password) {
		this.user_password = user_password;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}


}
