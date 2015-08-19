package Algorithm.Set;

import java.security.Permission;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

/*class Person implements Comparable
{
	private String name;
	private int age;
	public Person(String name, int age)
	{
		this.name = name;
		this.age = age;
	}
	
	public String toString() { return name + ": "  + age; }
	
	public int compareTo(Object x)
	{
		if(x instanceof Person == false) return 0;//相等  有三种情况 大小等于 0是等于  -1是小于 1大于
		Person p = (Person)x;
		//return this.name.compareTo(p.name);
		int t = this.name.compareTo(p.name);
		if(t != 0) return t;
		//return this.age - p.age;
		return p.age - this.age;
	}
	
}*/

class Person
{
	private String name;
	private int age;
	public Person(String name, int age)
	{
		this.name = name;
		this.age = age;
	}
	
	public String getName() { return name; }
	public int getAge() { return age; }
	public String toString() { return name + ": "  + age; }
}

class K implements Comparator
{
	public int compare(Object a, Object b)
	{
		if(a instanceof Person==false || b instanceof Person==false) return 0;
		Person p1 = (Person)a;
		Person p2 = (Person)b;
		int t = p1.getName().compareTo(p2.getName());
		if(t != 0) return t;
		return p1.getAge() - p2.getAge();
	}
}

public class TreeSetTest {
	public static void main(String[] args) 
	{
		//Set<Person> a = new TreeSet<Person>();
		Set<Person> a = new TreeSet<Person>(new K());
		//a.add(new Permission("hao", 10));
		a.add(new Person("hao", 20));
		a.add(new Person("hao", 30));
		a.add(new Person("hao", 10));
		a.add(new Person("zhang", 10));
		a.add(new Person("zhang", 11));
		a.add(new Person("zhang", 20));
		a.add(new Person("li", 40));
		
		System.out.println(a);
		/*
		Set<String> a = new TreeSet<String>();
		a.add("abc");
		a.add("xyz");
		a.add("abc");
		
		System.out.println(a);
		*/
	}
}
