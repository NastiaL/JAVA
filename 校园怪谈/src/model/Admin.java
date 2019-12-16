package model;

import java.io.Serializable;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.ImageIcon;

public class Admin implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int id;
	String name;
	String password;
	private boolean login;
	
	public Admin(int id, String name, String password) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		login = true;
		
	}

	/*public Admin() {
		super();
	}*/
	
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

	public Admin() {
		// TODO Auto-generated constructor stub
	}	
	public boolean isLogin() {
		// TODO Auto-generated method stub
		return login;
	}

	/*public Admin login(String name, String pw) throws SQLException, ClassNotFoundException  {
		if (this.isLogin())
			return this;
		String sql = "select * from admin where id='" +name+ "' and "
				+ "password = '" +pw+ "'";
		ResultSet rs = DataConnect.getStat().executeQuery(sql);
		if (rs.next())
			return new Admin(rs.getInt(1),rs.getString(2), rs.getString(3));
		else
			return this;
	}


	public ArrayList<Uers> searchUers(String info) throws SQLException, ClassNotFoundException {
		ArrayList<Uers> uers= new ArrayList<Uers>();
		String sql = "select * from uers where name like '%"+info+"%'";
		ResultSet rs = DataConnect.getStat().executeQuery(sql);
		while(rs.next()){
			uers.add(new Uers(rs.getInt("id"),rs.getString(2),rs.getString(3),rs.getString(4)));
		}
		return uers;
	}
	public void deleteUers(int uid)throws SQLException, ClassNotFoundException {
		String sql ="delete from Uers where id ="+uid;
		DataConnect.getStat().executeUpdate(sql);
	}
	public Uers viewUers(String xid) throws SQLException, ClassNotFoundException {
		Uers uers = null;
		String sql = "select * from uers where id=" + xid;
		ResultSet rs = DataConnect.getStat().executeQuery(sql);
		if (rs.next()) {
			uers = new Uers(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4));
		}
		return uers;
	}
	/*public Tupian tupian(String tupian) throws Exception {
		Tupian a = new Tupian();
		String sql = "select * from ͼƬ where tupian=" + tupian;
		ResultSet rs = DataConnect.getStat().executeQuery(sql);
		if (rs.next()) {
			a = new Tupian(rs.getString(1));
		}
		return a;
	}*/
}