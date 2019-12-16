package model;

import java.io.Serializable;
import java.sql.ResultSet;

public class Photo implements Serializable{
	int id;
	String name;
	String address;
	String song;
	
	public String getSong() {
		return song;
	}

	public void setSong(String song) {
		this.song = song;
	}

	public Photo(int id, String name, String address,String song){
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.song = song;
	}
	
	public Photo() {
		// TODO Auto-generated constructor stub
	}

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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	/*public Photo tu(int id) throws Exception {
	Photo J = new Photo();
	String sql = "select * from photo where id=" + id;
	ResultSet rs = DataConnect.getStat().executeQuery(sql);
	if (rs.next()) {
		J = new Photo(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4));
	}
	return J;
    }*/

}
