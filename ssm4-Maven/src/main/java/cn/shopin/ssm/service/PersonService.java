package cn.shopin.ssm.service;

import java.util.List;

import cn.shopin.ssm.domain.Person;

public interface PersonService {
	public List<Person> listAll();
	
	public int addRecord(Person p);
	
	public int saveOrUpdate(Person p);
	
	public Person getDetail(String id);
}
