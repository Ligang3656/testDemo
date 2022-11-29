import com.app.Application;
import com.app.boot.bean.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @description
 * @author:ligang
 * @date: 2022/10/25/ 22:58
 **/


@SpringBootTest(classes = Application.class)
@RunWith(SpringJUnit4ClassRunner.class)
public class MyTest {
//   autowired 注解会自动装配变量
    @Autowired
    private Person person;
    @Test
    public void Test(){
        System.out.println(person);
    }

}

