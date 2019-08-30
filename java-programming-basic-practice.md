# 자바 프로그래밍 기초1 [실습]

### 1.	자신의 정보를 출력하는 자바 프로그램 작성하기
- 자신의 학부/트랙 또는 학과, 학번, 학년, 이름을 화면에 출력하시오. 단 화면에 출력되는 형태는 자유롭게 정의해도 됩니다.

### 2. 프로그램에 주석을 달고, HTML 문서 생성하기

- 1번 프로그램의 클래스, main() 메소드, 문장 각각에 주석(Comment)을 추가하고, Eclipse IDE의 HTML 문서 생성 기능을 활용하여 HTML 문서를 생성하시오.

### 3. 아래 코드에서 잘못된 부분을 수정하고, 실행결과를 출력하시오

```java
public class 실습 2_3{
	public static void main(String args[]) {
		boolean a = 10>0;
		boolean b = 1;
		byte c =  128;
		short d = 129;
		int e = 300000;
		long f = 3.14;
		float g = 3.14; 
		double h = 3.14;
		char i = 'a';
		char j = '한';
		final double PI = 3.142592;
		
		System.out.println("c="+c);
		PI = 3.14;
		System.out.println("PI="+PI);
	}
}

```
### 4. 산술 연산자 응용 프로그램 작성하기
- 원화를 달러로 환전해 주는 프로그램을 완성하여라. 
	- 원화 액수와 환율을 각각 입력 받고, 환전된  달러가 100 달러, 50 달러, 20달러, 10 달러, 5 달러, 2달러, 1달러 지폐 각각 몇 개로 변환되는 지 출력하라. 단 1 달러 이하의 금액은 버린다고 가정한다.

	```java
	import java.util.Scanner;
	
	public class Exercise2_4 {
	    public static void main(String[] args) {
	        int won;
	        double rate;
	        int dollar;
	
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("환전할 원화 액수를 입력하시오>");
	        won = scanner.nextInt();
	
	        System.out.print("현재의 환율을 입력하시오>");
	        rate = scanner.nextDouble();
	
	        dollar = (int)(won/rate);
	        System.out.println("환전한 달러는 총 "+dollar+" 입니다");
	        
	        // 여기서부터 코드 추가하세요
		}
	}
	```
- 실행결과

	```
	환전할 원화 액수를 입력하시오>100000
	현재의 환율을 입력하시오>1209
	환전한 달러는 총 82 입니다
	100달러 0개, 50달러 1개, 20달러 1개, 10달러 1개, 5달러 0개, 2달러 1개, 1달러 0개 
	```

### 5. switch와 break문 연습
- 학점이 A, B이면, "Excellent", 학점이 C, D이면 "Good", 학점이 F이면 "Bye"라고 출력하는 프로그램을 작성하라. switch와 break를 활용하라.
- 실행결과

	```
	학점을 입력하세요>>B
	Excellent
	```

### 6. 구구단 (1단-9단)을 출력 프로그램 작성
- 구구단 (1단-9단)을 아래와 같이 1줄에 3단씩 출력하도록 프로그램을 작성하시오.
	- 단, 강의자료에 게시된 코드 (https://github.com/kwanulee/JavaExample/blob/master/JavaBasic/src/com/kwanwoo/java/MultiplicationTableBy3.java) 와는 다른 방식으로 구현해야 합니다.

- 실행결과

	```
	1*1=1	2*1=2	3*1=3	
	1*2=2	2*2=4	3*2=6	
	1*3=3	2*3=6	3*3=9	
	1*4=4	2*4=8	3*4=12	
	1*5=5	2*5=10	3*5=15	
	1*6=6	2*6=12	3*6=18	
	1*7=7	2*7=14	3*7=21	
	1*8=8	2*8=16	3*8=24	
	1*9=9	2*9=18	3*9=27	
	
	4*1=4	5*1=5	6*1=6	
	4*2=8	5*2=10	6*2=12	
	4*3=12	5*3=15	6*3=18	
	4*4=16	5*4=20	6*4=24	
	4*5=20	5*5=25	6*5=30	
	4*6=24	5*6=30	6*6=36	
	4*7=28	5*7=35	6*7=42	
	4*8=32	5*8=40	6*8=48	
	4*9=36	5*9=45	6*9=54	
	
	7*1=7	8*1=8	9*1=9	
	7*2=14	8*2=16	9*2=18	
	7*3=21	8*3=24	9*3=27	
	7*4=28	8*4=32	9*4=36	
	7*5=35	8*5=40	9*5=45	
	7*6=42	8*6=48	9*6=54	
	7*7=49	8*7=56	9*7=63	
	7*8=56	8*8=64	9*8=72	
	7*9=63	8*9=72	9*9=81	
	```
