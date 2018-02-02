package usermanager.entity;

public class UserInternInfo {

	private int intern_id;
	private String intern_company_name;
	private String intern_position;
	private String intern_company_image;
	private String intern_start_time;
	private String intern_stop_time;
	private String intern_work_content;
	private int user_id;
	
	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public int getIntern_id() {
		return intern_id;
	}

	public void setIntern_id(int intern_id) {
		this.intern_id = intern_id;
	}

	public String getIntern_company_name() {
		return intern_company_name;
	}

	public void setIntern_company_name(String intern_company_name) {
		this.intern_company_name = intern_company_name;
	}

	public String getIntern_position() {
		return intern_position;
	}

	public void setIntern_position(String intern_position) {
		this.intern_position = intern_position;
	}

	public String getIntern_company_image() {
		return intern_company_image;
	}

	public void setIntern_company_image(String intern_company_image) {
		this.intern_company_image = intern_company_image;
	}

	public String getIntern_start_time() {
		return intern_start_time;
	}

	public void setIntern_start_time(String intern_start_time) {
		this.intern_start_time = intern_start_time;
	}

	public String getIntern_stop_time() {
		return intern_stop_time;
	}

	public void setIntern_stop_time(String intern_stop_time) {
		this.intern_stop_time = intern_stop_time;
	}

	public String getIntern_work_content() {
		return intern_work_content;
	}

	public void setIntern_work_content(String intern_work_content) {
		this.intern_work_content = intern_work_content;
	}

}
