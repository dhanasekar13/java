package collection.src.array_list;

import java.util.Comparator;
import java.util.TreeSet;
class full implements Comparable
{
	int id;
	String name;
	full(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	public String toString()
	{
		return name+"  "+id;
	}
	public int compareTo(Object obj)
	{int eid1=this.id;
	full e=(full)obj;
	int eid2=e.id;
	if(eid1<eid2)
	{
		return -1;
	}
	else if(eid1>eid2)
	{
		return 1;
	}
	else 
		return 0;
	}
}
public class TreesetSorted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
full i=new full(1,"dhana");
full j=new full(2,"sekar");
full k=new full(3,"dhanasekar");
full l=new full(4,"dsekar");
full m=new full(5,"sekarda");
TreeSet t=new TreeSet();
t.add(i);
t.add(j);
t.add(k);
t.add(l);
t.add(m);
System.out.println(t);

	}

}
