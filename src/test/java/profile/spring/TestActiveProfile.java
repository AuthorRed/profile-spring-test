package profile.spring;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.panlingxiao.spring.profile.service.HelloService;
//在注解中写多个字符串的方式；
//@WebAppConfiguration
//@ActiveProfiles({"development","jedis"})
//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(locations = { "classpath:spring/applicationContext.xml", 
//		"classpath*:com/aist/common/**/META-INF/beans.xml",
//		"classpath*:com/aist/uam/**/META-INF/httpInvoke-beans.xml", 
//		"classpath*:com/aist/uam/**/META-INF/beans.xml",
//		"classpath*:com/aist/uam/auth/META-INF/shiro-beans.xml",
//		"classpath*:com/centaline/trans/**/META-INF/core-beans.xml",
//		"classpath*:com/centaline/trans/**/META-INF/web-beans.xml",
//		"classpath*:com/aist/message/**/META-INF/beans.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:spring-profile.xml")
/*
 * 使用注册来完成对profile的激活,
 * 传入对应的profile名字即可,可以传入produce或者dev
 */
@ActiveProfiles("dev")
public class TestActiveProfile {
//	private ApplicationContext applicationContext;

    @Autowired
    private HelloService hs;
//    @Before
//    public void init(){
//    	applicationContext = new ClassPathXmlApplicationContext("classpath:spring-profile.xml");
//    	ConfigurableEnvironment environment = new StandardEnvironment();
//    	environment.setActiveProfiles("produce");
//    	
//    }

    @Test
    public void testProfile() throws Exception {   	
//    	HelloService hs = applicationContext.getBean(HelloService.class);
        String value = hs.sayHello();
        System.out.println(value);
    }
}


