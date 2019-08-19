import com.cslg.dao.IAccountDao;
import com.cslg.domain.Account;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.InputStream;
import java.util.List;

public class testMybatis {
    @Test
    public void testRepository() throws Exception{
        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
        SqlSession sqlSession = factory.openSession();
        IAccountDao mapper = sqlSession.getMapper(IAccountDao.class);
        List<Account> all = mapper.findAll();
        for (Account account : all) {
            System.out.println(account);
        }
        Account account = new Account();
        account.setUserName("林俊杰");
        account.setMoney(400);
        mapper.saveAccount(account);
        in.close();
        sqlSession.commit();
        sqlSession.close();
    }
}
