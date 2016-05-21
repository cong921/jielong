package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import bean.Words;

public class Dao implements IDao {

	@Override
	public boolean isRelated(String str2) throws Exception {
		// 1. 创建一个 QueryRunner 的实例
		QueryRunner runner = new QueryRunner();

		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/game", "root", "mc2016");
		String sql = "SELECT * FROM chengyu WHERE name=? limit 1";
		Class type = Words.class;
		Object[] params = new Object[] { str2 };
		// 2. 查询操作
		List<Words> list = (List<Words>) runner.query(conn, sql, new BeanListHandler(type), params);
		System.out.println(list);
		conn.close();
		if (null != list && list.size() > 0) {
			return true;
		}
		return false;
	}

}
