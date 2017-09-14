package kr.ac.dit;
import org.junit.Test;
import java.sql.Connection;
import java.sql.DriverManager;

public class JDBCDataSourceTest {
	
	// 사용할 DB 설정
	private static final String driver = "com.mysql.jdbc.Driver";
	private static final String url = "jdbc:mysql://localhost:3306/201312406";
	private static final String user = "201312406";
	private static final String password = "201312406";
	
	// src/main/webapp/WEB-INF/spring/root-context.html
	// DB에 대한 정보가 저장되는 장소
	
	@Test
	public void testConnection() throws Exception {
			Class.forName(driver);
		
		// try catch 문
		try(Connection conn = DriverManager.getConnection(url,user,password)) {
			System.out.println(conn);
		} 
		
		catch(Exception e) { e.printStackTrace(); }
	}
}