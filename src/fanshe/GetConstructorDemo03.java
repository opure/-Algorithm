package fanshe ;
import java.lang.reflect.Constructor ;	// ���빹�췽���İ�
import java.lang.reflect.Modifier ;	// ���빹�췽���İ�
public class GetConstructorDemo03{
	public static void main(String args[]){
		Class<?> c1 = null ;		// ����Class����
		try{
			c1 = Class.forName("fanshe.Person") ;	// ʵ�����
		}catch(ClassNotFoundException e){
			e.printStackTrace() ;
		}
		Constructor<?> con[] = c1.getConstructors() ;	// ȡ��һ�����е�ȫ������
		for(int i=0;i<con.length;i++){
			Class<?> p[] = con[i].getParameterTypes() ;		// �õ����췽���е�ȫ������
			System.out.print("���췽����" ) ;	 // ������죬ֱ�Ӵ�ӡ
			int mo = con[i].getModifiers() ; // �õ���Ҫ�ķ���Ȩ��
			System.out.print(Modifier.toString(mo) + " ") ;	// �õ����η�
			System.out.print(con[i].getName()) ;	// ȡ�ù��췽��������
			System.out.print("(") ;
			for(int j=0;j<p.length;j++){
				System.out.print(p[j].getName() + " arg" + i) ;
				if(j<p.length-1){
					// �жϴ��Ƿ������һ������
					System.out.print(",");	// �����,��
				}
			}
			System.out.println("){}") ;
		}
	}
};