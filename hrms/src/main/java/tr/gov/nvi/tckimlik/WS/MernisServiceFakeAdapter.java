package tr.gov.nvi.tckimlik.WS;

import kodlamaio.hrms.business.abstracts.UserService;
import kodlamaio.hrms.entities.concretes.Employee;

public class MernisServiceFakeAdapter implements UserService{
	@Override
	public boolean IfUserRealPerson(Employee employee) {
		// TODO Auto-generated method stub
		return false;
	}

   
}
   