package business;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import hibernate.*;

@Component
public class DAODelegate implements IDAODelegate {
	@Autowired
	IUsers iuc;

//	public void setIuc(IUsers iuc) {
//		this.iuc = iuc;
//	}

	@Override
	public void addUsers(Users users) {
		iuc.insertUsers(users);
	}

}
