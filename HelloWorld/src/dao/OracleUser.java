package dao;

import org.springframework.ui.Model;

public class OracleUser implements IUser {

	@Override
	public int Get(Model model) {
		return 2;
	}

}
