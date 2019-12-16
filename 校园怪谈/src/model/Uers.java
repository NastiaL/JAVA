package model;

import java.io.Serializable;

public class Uers implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private String name;
	private String password;
	private int tu;
	public int getTu() {
		return tu;
	}
	public void setTu(int tu) {
		this.tu = tu;
	}

	private boolean login;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public Uers(int id, String name, String password,int tu) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.tu=tu;
		login = true;
	}
	public Uers() {
		// TODO Auto-generated constructor stub
	}
	public boolean isLogin() {
		return login;
	}
	/*public Uers login(String name, String pw) throws Exception {
		if (login)
			throw new Exception("你已经登陆了");
		String sql = "select * from uers where id='" + name + "' and "
				+ " password = '" + pw + "'";
		ResultSet rs = DataConnect.getStat().executeQuery(sql);
		if (rs.next())
			return new Uers(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4));
		else
			return this;
	}
	
	public void Resigter(String name, String pw1, String pw2) throws Exception {
		if (!pw1.equals(pw2))
			throw new Exception("密码输入不一致");
		String sql = "insert into uers(id,password) values('" + name
				+ "','" + pw1 + "')";
		DataConnect.getStat().executeUpdate(sql);
	}
	
	public void continue1(){
		
		
	}
	*/

}
