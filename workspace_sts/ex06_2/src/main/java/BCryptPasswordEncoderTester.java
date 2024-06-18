import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class BCryptPasswordEncoderTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BCryptPasswordEncoder bpe = new BCryptPasswordEncoder();
		System.out.println(bpe.encode("1234"));
	}

}
