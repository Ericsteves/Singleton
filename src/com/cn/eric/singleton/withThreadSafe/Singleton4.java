package com.cn.eric.singleton.withThreadSafe;
/**
 * 
 * @author Ericsteves
 * 
 * 单例模式-双重检查-volatile关键字（线程安全）
 * 
 * 缺点：
 * 优点：实现延迟加载，使用volatie关键字，结合synchronized，锁的粒度较小
 * 
 * 推荐！
 *
 */
public class Singleton4 {
	
	private volatile static Singleton4 instance;//未赋值,为了延迟加载,关键在于volatile关键字,能防止在instance = new Singleton4()时发生指令重排
	
	private Singleton4(){};//构造函数私有化，防止在外部被实例化
	
	
	//Double-Check
	public static Singleton4 getInstance(){
		if(instance==null){
			synchronized (Singleton4.class) {
				if (instance==null) {
					instance = new Singleton4();
				}
			}
		}
		return instance;
	}
}
