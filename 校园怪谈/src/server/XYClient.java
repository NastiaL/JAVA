package server;

import java.io.*;
import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


import model.Admin;
import model.DataConnect;
import model.Photo;
import model.Uers;


@SuppressWarnings("unused")
public class XYClient implements XYProtocal{

	private static Socket s;
	private static ObjectOutputStream oos;
	private static ObjectInputStream ois;

	private static void init() throws UnknownHostException, IOException {
		s = new Socket("129.211.42.69", 1364);
		oos = new ObjectOutputStream(s.getOutputStream());
		ois = new ObjectInputStream(s.getInputStream());
	}	
	public static Uers login(String name,String password) throws UnknownHostException,
	 IOException, ClassNotFoundException {
		
		init();
	    oos.writeInt(U_LOGIN);
	    oos.flush();
	    oos.writeUTF(name);
	    oos.flush();
	    oos.writeUTF(password);
	    oos.flush();
	    Uers u = (Uers) ois.readObject();
	    return u;
  }
	public static void Resigter(String name, String pw1, String pw2) throws  IOException, ClassNotFoundException{
		init();
		 oos.writeInt(U_RESIGTER);
		 oos.flush();
		 oos.writeUTF(name);
		 oos.flush();
		 oos.writeUTF(pw1);
		 oos.flush();
		 oos.writeUTF(pw2);
		 oos.flush();
		
	}
	public static Admin alogin(int id, String pw) throws IOException, UnknownHostException, ClassNotFoundException {
		init();
		oos.writeInt(A_LOGIN);
		oos.flush();
		oos.writeInt(id);
		oos.flush();
		oos.writeUTF(pw);
		oos.flush();
		Admin a = (Admin) ois.readObject();
		return a;
		
	}
	public static Photo photo(int id) throws UnknownHostException,
	 IOException, ClassNotFoundException {
		
		init();
	    oos.writeInt(P_PHOTO);
	    oos.flush();
	    oos.writeInt(id);
	    oos.flush();
	    Photo J = (Photo) ois.readObject();
	    return J;
 }
	public static ArrayList<Uers> searchUers(Admin a,String info) throws IOException, ClassNotFoundException {
		init();
	      oos.writeInt(A_SEARCHUERS);
	      oos.flush();
	      oos.writeObject(a);
	      oos.flush();
	      oos.writeUTF(info);
	      oos.flush();
	      ArrayList<Uers>  uers = (ArrayList<Uers>) ois.readObject();
	      return uers;
	}
	public static void deleteUers(Admin a,int id)throws  IOException {
		init();
	      oos.writeInt(A_DELETEUERS);
	      oos.flush();
	      oos.writeObject(a);
	      oos.flush();
	      oos.writeInt(id);
	      oos.flush();
	}
	public static Uers viewUers(Admin a,int id) throws  IOException, ClassNotFoundException {
		init();
	      oos.writeInt(A_VIEWUERS);
	      oos.flush();
	      oos.writeObject(a);
	      oos.flush();
	      oos.writeInt(id);
	      oos.flush();
		  Uers u = (Uers) ois.readObject();
		  return u;	      
	}
	public static void continue1(Uers u,int id) throws  IOException, ClassNotFoundException {
		init();
	      oos.writeInt(U_CONTINUE1);
	      oos.flush();
	      oos.writeObject(u);
	      oos.flush();   
	      oos.writeInt(id);
	      oos.flush();
	}

}
