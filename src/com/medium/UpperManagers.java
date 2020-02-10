package com.medium;

import java.util.ArrayList;
import java.util.List;

import com.model.User;

/**
 * def users (
    [loginName: 'BB', reportTo: 'AA'],
    [loginName: 'DE', reportTo: 'CE'],
    [loginName: 'CE', reportTo: 'BB'],
    [loginName: 'DD', reportTo: 'AA'],
    [loginName: 'CC', reportTo: 'AC'],
    [loginName: 'DA', reportTo: 'AB'],
    [loginName: 'BC', reportTo: 'AB'],
    [loginName: 'DC', reportTo: 'BC']
);
 assert showMessage(users, 'DE');//CE, BB, AA
 * @author dnmhi
 *
 */
public class UpperManagers {

	public static void main(String[] args) {
		List<User> users = new ArrayList<>();
		users.add(new User("BB", "AA"));
		users.add(new User("DE", "CE"));
		users.add(new User("CE", "BB"));
		users.add(new User("DD", "AA"));
		users.add(new User("CC", "AC"));
		users.add(new User("DA", "AB"));
		users.add(new User("BC", "AB"));
		users.add(new User("DC", "BC"));
		getManagers(users, "DE").forEach(manager -> System.out.println(manager));
	}
	
	public static List<String> getManagers(List<User> users, String loginName) {
		List<String> managers = new ArrayList<>();
		String manager = getManager(users, loginName);
		while (manager != null) {
			managers.add(manager);
			manager = getManager(users, manager);
		}
		return managers;
	}
	
	public static String getManager(List<User> users, String loginName) {
		for (User user: users) {
			if (user.loginName == loginName) {
				return user.reportTo;
			}			
		}
		return null;
	}

}
