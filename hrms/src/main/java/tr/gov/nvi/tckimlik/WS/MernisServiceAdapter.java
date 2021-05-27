package tr.gov.nvi.tckimlik.WS;

public class MernisServiceAdapter implements UserCheckService{
	@Override
	public boolean IfUserRealPerson(Employee employee) {
		KPSPublicSoapProxy proxy =new KPSPublicSoapProxy();
		boolean result = false;
		
		try {
			result = proxy.TCKimlikNoDogrula(Long.parseLong(employee.getIdentityNumber()), employee.getFirstName().toUpperCase() , employee.getLastName().toUpperCase(),employee.getDateOfBirth().getYear());
			
		} catch (NumberFormatException | RemoteException e) {
			System.out.println("Not a valid user");
		}
		
		return result;
	}

}
