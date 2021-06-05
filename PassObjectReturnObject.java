import java.util.Date;
import java.util.Scanner;

class User {
	private String userId;
	private String pwd;
	private String userName;
	private String city;
	private int age;
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}

class Message {
	private String message;
	private String userId;
	private Date date;
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
}

class View {
	void login() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter User ID : ");
		String userId = scanner.next();
		System.out.print("Enter User Password : ");
		String pwd = scanner.next();
		DB db = new DB();
//		db.checkLogin(userId, pwd);
	}
	
	void register() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter User ID : ");
		String userId = scanner.next();
		System.out.print("Enter User Password : ");
		String pwd = scanner.next();
		System.out.print("Enter User Name : ");
		String userName = scanner.next();
		System.out.print("Enter User Age : ");
		int age = scanner.nextInt();
		System.out.print("Enter User City : ");
		String city = scanner.next();
		
		User userObj = new User();
		userObj.setUserId(userId);
		userObj.setPwd(pwd);
		userObj.setUserName(userName);
		userObj.setAge(age);
		userObj.setCity(city);
		
		DB db = new DB();
//		db.checkLogin(userId, pwd);
		Message msg = db.checkLogin(userObj);
		System.out.println(msg.getMessage());
		System.out.println(msg.getUserId());
		System.out.println(msg.getDate());
	}
}

class DB {
//	void checkLogin(String userId, String pwd) {
//		String message = "";
//		Date date = null;
//		if(userId.equals(pwd)) {
//			message = "Login Success...";
//		}
//		else {
//			message = "Login Failed...";
//		} 
//	}
	
	Message checkLogin(User userObj) {
		String message = "";
		Date date = null;
		if(userObj.getUserId().equals(userObj.getPwd())) {
			message = "Login Success...";
		}
		else {
			message = "Login Failed...";
		}
		Message msg = new Message();
		msg.setDate(new Date());
		msg.setMessage(message);
		msg.setUserId(userObj.getUserId());
		return msg;
	}
}

public class PassObjectReturnObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		View obj = new View();
		obj.register();
	}

}
