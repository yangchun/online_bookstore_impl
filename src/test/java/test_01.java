

import java.io.IOException;
import java.io.InputStream;

import javax.annotation.Resource;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;




import com.online_bookstore.service.AddressService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring.xml" })
public class test_01 {

	@Resource
	private AddressService addressService;

	@Test
	public void test1() {
		System.out.println("--------");
		System.out.println(addressService.getAllAddress().size());
	}

	public static void main(String[] args) throws IOException {
		 ClassPathXmlApplicationContext context = new
		 ClassPathXmlApplicationContext(
		 new String[] { "spring.xml" });
		 context.start();
		 System.out.println("按任意键退出");
         System.in.read();
		// ApplicationContext context = new ClassPathXmlApplicationContext(
		// "spring.xml");
		// UserServiceImpl user=context.getBean(UserServiceImpl.class);
		// System.out.println(user.getUserById(1));

	}
}
