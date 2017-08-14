package profile.spring;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.panlingxiao.spring.profile.service.HelloService;
import com.panlingxiao.spring.profile.service.NameService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:spring-profile.xml")
/*
 * 使用注册来完成对profile的激活,
 * 传入对应的profile名字即可,可以传入produce或者dev或者active
 */
@ActiveProfiles({"active","produce"})
public class TestActiveProfile2 {

    @Autowired
    private NameService nameService;
    
    @Autowired
    private HelloService hs;

    @Test
    public void testProfile() throws Exception {
        String value = nameService.sayName();
        System.out.println(value);
    }
}


