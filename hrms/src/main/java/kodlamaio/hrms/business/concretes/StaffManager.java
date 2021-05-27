package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sun.net.httpserver.Authenticator.Result;

import kodlamaio.hrms.business.abstracts.StaffService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.entities.concretes.Staff;

@Service
public class StaffManager implements StaffService{

	
	@Override
	public Result add(Staff staff) {
		return null;
	}

	@Override
	public DataResult<List<Staff>> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
