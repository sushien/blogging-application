package util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class MyUtil {
	private static Session session=null;
	public static Session getSesso(){
		SessionFactory fac=
		new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		if(session==null)
			session=fac.openSession();
		return session;
	}

}
