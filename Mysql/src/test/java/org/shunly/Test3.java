package org.shunly;

public class Test3 {

	public static void main(String[] args) {
		try {
		long t1 = System.currentTimeMillis();
		for(int i = 1; i < 10001; i++) {
			System.out.println("第" + i + "次");
			ApplicationService.selectById(1);
			int j = 0/0 ;
		}
		long t2 = System.currentTimeMillis() - t1;
		System.out.println(t2);
		}catch (Exception e) {
			System.out.println("中断了~");
		}
		
	}
}