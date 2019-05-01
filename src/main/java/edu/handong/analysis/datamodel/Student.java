package edu.handong.analysis.datamodel;

public class Student {
	private String name;
	
	public Student(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		return name;
	}
}


//조건문에서 array 특정 index element가 null인지 확인할 필요가 있을 겁니다. 
//instanName != null 이라는 형식의 조건문을 이용하면 됩니다.

//trim()이 필요할 겁니다. 안쓰고 해결할 수 있지만 코드가 복잡해질 겁니다.
