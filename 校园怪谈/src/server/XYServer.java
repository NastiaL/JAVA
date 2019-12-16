package server;

import java.io.*;
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.Admin;
import model.DataConnect;
import model.Photo;
import model.Uers;



@SuppressWarnings("unused")
public class XYServer implements XYProtocal ,Runnable{

	private Socket s;
	private ObjectInputStream ois;
	private ObjectOutputStream oos;
	ServerSocket ss;

	public XYServer() throws Exception {
		//ServerSocket ss = new ServerSocket(1354);
		ss = new ServerSocket(1364);
		Thread t = new Thread(this);
		t.start();

      }
	public void u_login() throws Exception {
		String name = ois.readUTF();
		String password = ois.readUTF();
		Uers u = null;
		String sql = "select * from uers where name='" + name+ "' and "
		+ " password = '" + password + "'";
		ResultSet rs = DataConnect.getStat().executeQuery(sql);
		if (rs.next()){
		     u = new Uers(rs.getInt("id"),name,password,rs.getInt("tu"));
		}
		oos.writeObject(u);
		oos.flush();
	}
	
	public void resigter() throws Exception {
		String name = ois.readUTF();
		String pw1 = ois.readUTF();
		String pw2 = ois.readUTF();
		
		if (!pw1.equals(pw2))
			throw new Exception("√‹¬Î ‰»Î≤ª“ª÷¬");
		String sql = "insert into uers(id,password) values('" + name
				+ "','" + pw1 + "')";
		DataConnect.getStat().executeUpdate(sql);
	}
	
	public void a_login() throws SQLException, ClassNotFoundException, IOException  {
		int id = ois.readInt();
		String pw = ois.readUTF();
		Admin a = null;
		String sql = "select * from Admin where id='" + id + "' and "
				+ " password = '" + pw + "'";
		ResultSet rs = DataConnect.getStat().executeQuery(sql);
		if (rs.next()){
		     a = new Admin(id,rs.getString("name"), pw);
		}
		oos.writeObject(a);
		oos.flush();
	}
	public void tu() throws Exception {
		int id = ois.readInt();
	    Photo J = null;
	    String sql = "select * from photo where id=" + id;
	    ResultSet rs = DataConnect.getStat().executeQuery(sql);
	    if (rs.next()) {
		    J = new Photo(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4));
			
	} 
	    oos.writeObject(J);
		oos.flush();
    }
	public void searchUers() throws IOException, ClassNotFoundException, SQLException{
		Admin a = (Admin) ois.readObject();
		String info =ois.readUTF();
		ArrayList<Uers> uers= new ArrayList<Uers>();
		String sql = "select * from uers where name like '%"+info+"%'";
		ResultSet rs = DataConnect.getStat().executeQuery(sql);
		while(rs.next()){
			uers.add(new Uers(rs.getInt("id"),rs.getString(2),rs.getString(3),rs.getInt(4)));
		}
		oos.writeObject(uers);
		oos.flush();
	}
	public void deleteUers()throws SQLException, ClassNotFoundException, IOException {
		Admin a = (Admin) ois.readObject();
		int id = ois.readInt();
		String sql ="delete from Uers where id ="+id;
		DataConnect.getStat().executeUpdate(sql);
	}
	public void viewUers() throws SQLException, ClassNotFoundException, IOException {
		Uers uers = null;
		Admin a = (Admin) ois.readObject();
		int id = ois.readInt();
		String sql = "select * from uers where id=" + id;
		ResultSet rs = DataConnect.getStat().executeQuery(sql);
		if (rs.next()) {
			uers = new Uers(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4));
		}
		oos.writeObject(uers);
		oos.flush();
	}
	public void continue1()throws SQLException, ClassNotFoundException, IOException {
		Uers u = (Uers)ois.readObject();
		int id = ois.readInt();
		String sql ="update uers set tu ="+ id + " where password = "+u.getPassword();
		DataConnect.getStat().executeUpdate(sql);
	}
	
	public static void main(String[] args) throws Exception {
		try {
			new XYServer();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void run() {
		try{
			while (true) {
				s = ss.accept();
				ois = new ObjectInputStream(s.getInputStream());
				oos = new ObjectOutputStream(s.getOutputStream());
				int command = ois.readInt();
				if (command == U_LOGIN) {
					this.u_login();
				}
				if (command == U_RESIGTER) {
					this.resigter();
					
				}			
				if (command == A_LOGIN) {
					this.a_login();
				}
				if (command == P_PHOTO) {
					this.tu();
				}
				if (command == A_SEARCHUERS) {
					this.searchUers();
				}	
				if (command == A_DELETEUERS) {
					this.deleteUers();
				}
				if (command == A_VIEWUERS) {
					this.viewUers();
				}
				if (command == U_CONTINUE1) {
					this.continue1();
				}

	           }
		}catch(Exception e){
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
		
	}
}
