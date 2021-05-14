package kodlamaio.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="products")
public class User {
	
	@Id
	@GeneratedValue
    @Column(name="id")
	private int id;
    
    @Column(name="email")
	private String email;
    
    @Column(name="password")
	private String password;
    
    @Column(name="again_password")
	private String againPassword;

}
