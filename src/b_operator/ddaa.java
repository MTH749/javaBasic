package b_operator;

public class ddaa
{
	//3개의 int형 변수를 선언 및 초기화 후 합계와 평균을 구해주세요.
			//(평균은 소수점 셋째자리에서 반올림)
	public static void main(String[] args)
	{
	
		int i;
		int j;
		int k;
		int num = 10;
		
		for (i = 0; i < num; i++)
		{
			for (j = 1; j < num -i; j++)
			
			{
				System.out.print(" ");
			}	
						 
				for( k= 0; k <i * 2 + 1; k++)
			{
			System.out.print("*");	
			}
			System.out.println();
		}
	}
}
