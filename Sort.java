import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Sort {

	int rollno;
	String fname;
	String lname;
	int cgpa;
	public Sort(int rollno, String fname,String lname,int cgpa)
	{
		this.rollno=rollno;
		this.fname=fname;
		this.lname=lname;
		this.cgpa=cgpa;
		
		
	}
	
	public String toString()
	{
		return this.rollno+" "+this.fname+" "+this.lname+" "+this.cgpa;
		
	}
	
	public int getRollno() {
		return rollno;
	}



	public void setRollno(int rollno) {
		this.rollno = rollno;
	}



	public String getFname() {
		return fname;
	}



	public void setFname(String fname) {
		this.fname = fname;
	}



	public String getLname() {
		return lname;
	}



	public void setLname(String lname) {
		this.lname = lname;
	}



	public int getCgpa() {
		return cgpa;
	}



	public void setCgpa(int cgpa) {
		this.cgpa = cgpa;
	}

	
	


	public static void main(String args[])
	{
		
		List<Sort> list = new ArrayList<Sort>();
		
		list.add(new Sort(1,"Kaustubh","Patkar",3));
		list.add(new Sort(2,"Venkatesh","Devale",4));
		list.add(new Sort(3,"Kshitija","Godse",3));
		
		
		
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i));
			
		}
		
		Collections.sort(list,new SortbyRoll());
		
		System.out.println("after sorting\n");
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i));
			
		}
	}
}

class SortbyRoll implements Comparator<Sort>
{

	@Override
	public int compare(Sort o1, Sort o2) {
		// TODO Auto-generated method stub
		if(o1.cgpa == o2.cgpa)
		{
			return o1.fname.compareTo(o2.fname);
		}
		return o1.cgpa-o2.cgpa;
	}
	
	
}
