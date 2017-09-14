package kr.ac.dit;

import java.sql.Connection;
import javax.inject.Inject;
import javax.sql.DataSource;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

//
@RunWith(SpringJUnit4ClassRunner.class)

// 
@ContextConfiguration(locations={"file:src/main/webapp/WEB-INF/spring/**/*.xml"})

public class DataSourceTest {
	@Inject
	private DataSource ds;	//DB객체 생성
	@Test
	public void testConnection() throws Exception {
		
	try(Connection conn = ds.getConnection()) {
		
		// 연결내용을 콘솔에 표시
		System.out.println(conn);
	}
	
	catch(Exception e) { e.printStackTrace();}
 }
}