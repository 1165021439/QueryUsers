import cn.bdqn.entity.Users;
import cn.bdqn.util.HibernateUtil;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class Test1 {

    public static void main(String[] args) {

        Session session = HibernateUtil.openSession();

        Transaction transaction = session.beginTransaction();

        String hql1 = "from Users";

        Query query = session.createQuery(hql1);

        List<Users> list = query.list();

        for (Users users:list) {

            System.out.println(users);

            System.out.println(users.getName());




        }

        transaction.commit();

        session.close();

    }
}
