package vo;

public class Users {
	private String id;
	private String pwd;
	private String option;
	
	
	@Override
	public String toString() {
		return "Users [id=" + id + ", pwd=" + pwd + ", option=" + option + "]";
	}
	public Users() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Users(String id, String pwd, String option) {
		super();
		this.id = id;
		this.pwd = pwd;
		this.option = option;
	}
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
	
	
}
