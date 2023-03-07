package Multithreading;
import java.lang.Thread;//optional
public class Example1 {

	public static void main(String[] args) {
		Thread t=Thread.currentThread();//public static Thread currentThread(){}
		System.out.println(t);
		t.setName("NewGen Thread");
		t.setPriority(7);
		System.out.println(t);
		System.out.println("id of thread set by jvm="+t.getId());
		System.out.println("Min thread prirty="+Thread.MIN_PRIORITY);
		System.out.println("Max thread prirty="+Thread.MAX_PRIORITY);
		System.out.println("Norm thread prirty="+Thread.NORM_PRIORITY);
		System.out.println("Thread alive::"+t.isAlive());
		System.out.println("Thread state::"+t.getState());
		System.out.println("thread gropu name::"+t.getThreadGroup());
		

	}

}
//Thread[main,5,main] - threadname, priorty(1-10), thread group name