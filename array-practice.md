# 자바 배열 [실습]

<a name="1"></a>
### 1.	자바 키 입력, 배열, 반복문 연습
- 정수 10개를 키보드로부터 입력받아 배열에 저장한 후, 배열을 검색하여 3의 배수만 골라 출력하는 프로그램을 작성하라.

- 실행결과
	
	```
	10개의 정수를 입력하시오>>5 10 39 23 48 29 18 83 2 90 
	39 48 18 90
	```

<a name="2"></a>
### 2. 배열의 length 필드 활용
- 학생 수를 입력 받고, 

<a name="3"></a>
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
```
public class MultiplicationTableBy3 {
    public static void main(String[] args) {

        for (int k =1; k<10; k+=3) {            // 3단씩 3번 반복
            for (int i = 1; i < 10; i++) {      // 단에 대한 반복. 1단에서 9단
                for (int j = k; j < 10; j++) {  // 각 단의 곱셈
                    System.out.print(j + "*" + i + "=" + i * j); // 구구셈 출력
                    System.out.print('\t'); // 하나씩 탭으로 띄기
                    if (j % 3 == 0) break;
                }
                System.out.println(); // 3단 씩의 출력 끝나면 한 줄 띄움
            }
            System.out.println();
        }
    }
}
```

<a name="4"></a>
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
<a name="5"></a>
### 5. if 조건문 연습
- 키보드로부터 연도를 입력 받아서 입력받은 연도가 윤년인지 아닌지 판단하는 프로그램을 완성하시오.
	- 주어진 연도 year가 윤년인지 판단하는 방법
		- year가 400의 배수이면 무조건 윤년, 예, 1600, 2000, 800년 등
		- year가 4의 배수이고 100의 배수가 아니면 윤년임. 
			- 예, 1100년은 4의 배수이고 100의 배수이므로, 윤년이 아님
			- 예, 1004년은 4의 배수이지만 100의 배수가 아니므로, 윤년
   
   (힌트) 4의 배수 여부는 %연산자로 판단, 즉, x%4==0 이면 x는 4의 배수

	```java
	public class Exercise3_1 {
		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			System.out.print("연도를 입력하시오:");
			int year = scanner.nextInt();
			
			// year가 윤년인지 아닌지 판단하여 결과를 출력하는 코드 추가
		}
	}
	```
- 실행결과

	```
	연도를 입력하시오: 2017
	2017년은 윤년이 아닙니다.
	```
	```
	연도를 입력하시오: 2016
	2016년은 윤년입니다.
	```
<a name="6"></a>	
### 6. switch와 break문 연습
- 학점이 A, B이면, "Excellent", 학점이 C, D이면 "Good", 학점이 F이면 "Bye"라고 출력하는 프로그램을 작성하라. switch와 break를 활용하라.
- 실행결과

	```
	학점을 입력하세요>>B
	Excellent
	```

<a name="7"></a>
### 7. 구구단 (1단-9단)을 출력 프로그램 작성
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
