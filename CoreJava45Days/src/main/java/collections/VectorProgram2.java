package collections;

import java.util.Iterator;
import java.util.Vector;
public class VectorProgram2 {

	public static void main(String[] args) throws InterruptedException {
	Vector <Integer> v=new Vector<>();
       
	Thread t1=new Thread(()->{
	for(int i=1;i<=6;i++) {
		v.add(i);
		System.out.println("Thread-1 called ");
	}
	});
	
	Thread t2=new Thread(()->{
		for(int i=7;i<=15;i++) {
			v.add(i);
			System.out.println("Thread-2 Called");
		}
	});
	
	t1.start();
	t2.start();
	
	t1.join();
	t2.join();
	
	System.out.println("Size :"+v.size());
	Iterator<Integer> i=v.iterator();
	System.out.println("Vector elements :");
	while(i.hasNext()) {
		System.out.print(i.next()+" ");
	}
	}

}
