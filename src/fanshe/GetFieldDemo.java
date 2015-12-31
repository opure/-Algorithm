package fanshe;

import java.lang.reflect.Field ;	// ���빹�췽���İ�
import java.lang.reflect.Modifier ;	// ���빹�췽���İ�
public class GetFieldDemo{
	public static void main(String args[]){
		Class<?> c1 = null ;		// ����Class����
		try{
			c1 = Class.forName("org.lxh.demo15.Person") ;	// ʵ�����
		}catch(ClassNotFoundException e){
			e.printStackTrace() ;
		}
		{	// ��������
			Field f[] = c1.getDeclaredFields() ;	// ȡ�ñ����е�����
			for(int i=0;i<f.length;i++){
				Class<?> r = f[i].getType() ;	// �õ���������
				int mo = f[i].getModifiers() ;	// �õ����η������
				String priv = Modifier.toString(mo) ; // ��ԭ���η�
				System.out.print("�������ԣ�") ;
				System.out.print(priv + " ") ;	
				System.out.print(r.getName() + " ") ;	// �õ���������
				System.out.print(f[i].getName()) ;	// ����������
				System.out.println(" ;") ;
			}
		}
		{	// ��������
			Field f[] = c1.getFields() ;	// ȡ�ñ����еĹ�������
			for(int i=0;i<f.length;i++){
				Class<?> r = f[i].getType() ;	// �õ���������
				int mo = f[i].getModifiers() ;	// �õ����η������
				String priv = Modifier.toString(mo) ; // ��ԭ���η�
				System.out.print("�������ԣ�") ;
				System.out.print(priv + " ") ;	
				System.out.print(r.getName() + " ") ;	// �õ���������
				System.out.print(f[i].getName()) ;	// ����������
				System.out.println(" ;") ;
			}
		}
	}
};