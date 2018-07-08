package hibernate;

import org.hibernate.Session;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Component
public class UsersCrud implements IUsers {
	@Autowired
	SessionFactory sf;
	
//	public void setSf(SessionFactory sf) {
//		this.sf = sf;
//		
//	}

	@Transactional(propagation=Propagation.REQUIRES_NEW, isolation=Isolation.READ_COMMITTED, rollbackFor=Exception.class)
	public void insertUsers(Users users) {
		
		Session session = sf.openSession();
		session.save(users);
		session.flush();
		System.out.println("User has been registered!");
	}

	
	
}
