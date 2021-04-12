package day0322.mapEx01;

public class User {
	private String userId;
	private String passward;
	public User(String userId, String passward) {
		super();
		this.userId = userId;
		this.passward = passward;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getPassward() {
		return passward;
	}
	public void setPassward(String passward) {
		this.passward = passward;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", passward=" + passward + "]";
	}
	
}
