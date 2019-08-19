import com.cslg.domain.Account;
import com.cslg.service.IAccountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testService {
    @Test
    public void testSpring(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        IAccountService accountService = (IAccountService) ac.getBean("accountService");
        accountService.findAll();
        accountService.saveAccount(new Account());
    }
}
