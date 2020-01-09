package model;

public class Client {

	private long uid;
	private String name;
	private String lastName;
	private Account acc;
	
	

	@Override
	public String toString() {
		return "Client [uid=" + uid + ", name=" + name + ", lastName=" + lastName + ", acc=" + acc + "]";
	}

	public Client(long uid, String name, String lastName, Account acc) {
		this(uid, name, lastName);
		this.acc = acc;
	}

	public Client(long uid, String name, String lastName) {
		super();
		this.uid = uid;
		this.name = name;
		this.lastName = lastName;
	}

	public long getUid() {
		return uid;
	}

	public void setUid(long uid) {
		this.uid = uid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Account getAcc() {
		return acc;
	}

	public void setAcc(Account acc) {
		this.acc = acc;
	}

}
