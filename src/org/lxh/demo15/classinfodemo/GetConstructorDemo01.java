package org.lxh.demo15.classinfodemo ;
import java.lang.reflect.Constructor ;	// ���빹�췽���İ�
public class GetConstructorDemo01{
	public static void main(String args[]){
		Class<?> c1 = null ;		// ����Class����
		try{
			c1 = Class.forName("org.lxh.demo15.Person") ;	// ʵ�����
		}catch(ClassNotFoundException e){
			e.printStackTrace() ;
		}
		Constructor<?> con[] = c1.getConstructors() ;	// ȡ��һ�����е�ȫ������
		for(int i=0;i<con.length;i++){
			System.out.println("���췽����" + con[i]) ;	 // ������죬ֱ�Ӵ�ӡ
		}
	}
};