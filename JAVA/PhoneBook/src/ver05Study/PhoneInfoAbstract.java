package ver05Study;

public abstract class PhoneInfoAbstract implements PhoneInfoInterface{
	private String name; 		//이름
	private String phoneNumber; //전화번호
	private String addr;		//주소
	private String email;		//이메일
	
	PhoneInfoAbstract() {}
	
	 PhoneInfoAbstract(String name,String phoneNumber,String addr,String email){
		 this.setName(name);
		 this.phoneNumber=name;
		 this.addr=addr;
		 this.email=email;
	 }

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getPhoneNumber() {
		return phoneNumber;
	}


	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}


	public String getAddr() {
		return addr;
	}


	public void setAddr(String addr) {
		this.addr = addr;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}
	
	
	


	
}
