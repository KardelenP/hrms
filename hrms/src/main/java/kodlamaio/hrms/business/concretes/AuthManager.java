package kodlamaio.hrms.business.concretes;

import kodlamaio.hrms.business.abstracts.AuthService;

public class AuthManager implements AuthService{

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean checkEmail(String email) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean checkIdentityNumber(String identityNumber) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean checkingCenter(String email, String identityNumber) {
		// TODO Auto-generated method stub
		return false;
	}

	
}
