package com.techchefs.jdbcapp.connectionpool;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Vector;

import com.techchefs.jdbcapp.util.PropertyUtil;

public class ConnectionPool {
	private Vector<Connection> pool;
	private static ConnectionPool poolRef = null;

	private int poolSize;
	private String dbUrl;;
	private String username;
	private String password;
	private String driverClassname;

	private ConnectionPool() throws Exception {
		loadProperties();
		initializePool();

	}
	public static ConnectionPool getConnectionPool() throws Exception {
		if (poolRef != null) {
			return poolRef;
		} else {
			return new ConnectionPool();
		}
	}
	
	public Connection getConnectioFromPool() {
		return pool.remove(0);
	}

	public void returnConnectionToPool(Connection con) {
		pool.add(con);
	}

	private void loadProperties() throws Exception, IOException {
		
		poolSize = Integer.parseInt(PropertyUtil.getProertyUtil().getProperty(ConnectionPoolConstants.POOL_SIZE));
		dbUrl = PropertyUtil.getProertyUtil().getProperty(ConnectionPoolConstants.DB_URL);
		username = PropertyUtil.getProertyUtil().getProperty(ConnectionPoolConstants.USER_NAME);
		password = PropertyUtil.getProertyUtil().getProperty(ConnectionPoolConstants.PASSWORD);
		driverClassname = PropertyUtil.getProertyUtil().getProperty(ConnectionPoolConstants.DRIVER_CLASS_NAME);
	}

	private void initializePool() throws Exception {
		pool = new Vector<>();
		 Connection con = null;
		Class.forName(driverClassname);
		for (int i = 0; i < poolSize; i++) {
			con = DriverManager.getConnection(dbUrl, username, password);
			pool.add(con);
		}
	}

	

	
}
