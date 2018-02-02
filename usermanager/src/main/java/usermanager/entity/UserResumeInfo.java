package usermanager.entity;

import java.util.List;

public class UserResumeInfo {

	private UserBaseInfo userBaseInfo;
	private List<UserEduInfo> userEduList;
	private List<UserInternInfo> userInternList;
	private UserExtraInfo userExtraInfo;

	public UserBaseInfo getUserBaseInfo() {
		return userBaseInfo;
	}

	public void setUserBaseInfo(UserBaseInfo userBaseInfo) {
		this.userBaseInfo = userBaseInfo;
	}

	public List<UserEduInfo> getUserEduList() {
		return userEduList;
	}

	public void setUserEduList(List<UserEduInfo> userEduList) {
		this.userEduList = userEduList;
	}

	public List<UserInternInfo> getUserInternList() {
		return userInternList;
	}

	public void setUserInternList(List<UserInternInfo> userInternList) {
		this.userInternList = userInternList;
	}

	public UserExtraInfo getUserExtraInfo() {
		return userExtraInfo;
	}

	public void setUserExtraInfo(UserExtraInfo userExtraInfo) {
		this.userExtraInfo = userExtraInfo;
	}

}
