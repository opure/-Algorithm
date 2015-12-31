package fanshe;

import java.lang.reflect.Method ;	// ���빹�췽���İ�
import java.lang.reflect.Modifier ;	// ���빹�췽���İ�
public class GetMethodDemo{
	public static void main(String args[]){
		Class<?> c1 = null ;		// ����Class����
		try{
			c1 = Class.forName("fanshe.Person") ;	// ʵ�����
		}catch(ClassNotFoundException e){
			e.printStackTrace() ;
		}
		Method m[] = c1.getMethods() ;	// ȡ��ȫ������
		for(int i=0;i<m.length;i++){
			Class<?> r = m[i].getReturnType() ;	// �õ�����ֵ����
			Class<?> p[] = m[i].getParameterTypes() ;	// ȡ��ȫ�����������
			int xx = m[i].getModifiers() ;	// �õ����η�
			System.out.print(Modifier.toString(xx) + " ") ;	// ������η�
			System.out.print(r + " ") ;
			System.out.print(m[i].getName()) ;
			System.out.print("(") ;
			for(int j=0;j<p.length;j++){
				System.out.print(p[j].getName() + " " + "arg" + j) ;
				if(j<p.length-1){
					System.out.print(",") ;
				}
			}
			Class<?> ex[] = m[i].getExceptionTypes() ;	// ȡ���쳣
			if(ex.length>0){
				System.out.print(") throws ") ;
			}else{
				System.out.print(")") ;
			}
			for(int j=0;j<ex.length;j++){
				System.out.print(ex[j].getName()) ;
				if(j<p.length-1){
					System.out.print(",") ;
				}
			}
			System.out.println() ;
		}
	}
};