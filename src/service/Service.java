package service;

import dao.Dao;
import dao.IDao;

public class Service implements IService {

	@Override
	public boolean isRelated(String str1, String str2) throws Exception {
		IDao dao = new Dao();
		str1 = str1.substring(str1.length() - 1);

		if (null != str1 && str1.equals(str2.substring(0, 1))) {
			return dao.isRelated(str2);
		}
		return false;
	}

}
