package vo;

public class Users {
	private String id;
	private String pwd;
	private String option;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getOption() {
		return option;
	}

	public void setOption(String option) {
		this.option = option;
	}
	public Users() {
		
	}

	public Users(String id) {
		super();
		this.id = id;
	}
//
//	public Users(String id, String pwd) {
//		super();
//		this.id = id;
//		this.pwd = pwd;
//	}
	public Users(String id, String option) {
		super();
		this.id = id;
		this.option = option;
	}
	public Users(String id, String pwd, String option) {
		super();
		this.id = id;
		this.pwd = pwd;
		this.option = option;
	}

}