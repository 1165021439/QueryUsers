import cn.bdqn.entity.House;
import cn.bdqn.util.HibernateUtil;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import sun.security.ssl.HandshakeOutStream;

import java.util.List;

public class Test3 {

    public static void main(String[] args) {

        Session session = HibernateUtil.openSession();
        Transaction transaction = session.beginTransaction();

        House house = new House();

        house.setTitle("%中关村%");

        String sql = "from House where title like :title";

        Query query = session.createQuery(sql);

        List<House> list = query.list();

        for(House h : list)
        {
            System.out.println(h);
        }
        transaction.commit();
        session.close();


    }
}