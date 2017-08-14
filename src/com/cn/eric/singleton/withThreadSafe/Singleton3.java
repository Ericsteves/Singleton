package com.cn.eric.singleton.withThreadSafe;
/**
 * 
 * @author Ericsteves
 * 
 * 单例模式-静态内部类（线程安全）
 * 
 * 缺点：
 * 有点：实现了延迟加载，利用JVM的ClassLoader机制避免了多线程同步问题
 * 
 * 推荐！延迟加载，对于实例化比较耗资源的INSTANCE来讲，有很好的效果
 */
public class Singleton3 {
	private static class SingleHolder{
		private static final Singleton3 INSTANCE = new Singleton3(); 
	}
	private Singleton3(){};
	public static final Singleton3 getInstance(){
		return SingleHolder.INSTANCE;
	}
}
