package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import servlet.LabCRUDInterface;
import danimals.danimals;

public class SqlCRUD implements LabCRUDInterface<danimals> {
	
	Connection connection;
	
	public SqlCRUD() {
		this.connection = new Connect().getCon();
	}

	public Connection getConnection() {
		return connection;
	}

	public void setConnection(Connection connection) {
		this.connection = connection;
	}

	@Override
	public void create(danimals t) {
		// TODO Auto-generated method stub
		try(PreparedStatement st =
				connection.prepareStatement("INSERT INTO danimals (title,age,height,length) VALUES(?,?,?,?)")){
			st.setString(1, t.getTitle());
			st.setInt(2, t.getAge());
			st.setFloat(3, t.getHeight());
			st.setFloat(4, t.getLength());
			st.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public List<danimals> read() {
		// TODO Auto-generated method stub
		List<danimals> list = new ArrayList<>();
		
		try(
			Statement st = connection.createStatement();
			ResultSet rs = st.executeQuery("SELECT * FROM danimals;");
				)
		{
			while (rs.next()) {
				list.add(new danimals(rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getFloat(4),rs.getFloat(5)));
			}
			
		} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		
		return list;
	}

	@Override
	public void update(int id, danimals t) {
		// TODO Auto-generated method stub
		try(PreparedStatement st =
				connection.prepareStatement("UPDATE danimals SET \"title\"=?,\"age\"=?, \"height\"=?, \"length\"=? WHERE id=?;")){
			st.setString(1, t.getTitle());
			st.setInt(2, t.getAge());
			st.setFloat(3, t.getHeight());
			st.setFloat(4, t.getLength());
			st.setInt(5, id);
			st.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		try(PreparedStatement st =
				connection.prepareStatement("DELETE FROM danimals WHERE id=?;")){
			st.setInt(1, id);
			st.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
