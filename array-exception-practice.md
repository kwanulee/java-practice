# 자바 배열 및 예외처리 [실습]

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
- [문제1](#1)의 코드를 배열의 length 필드를 이용하도록 수정하시오. 

<a name="3"></a>
### 3. 배열과 메소드 활용
- 다음은 키보드로부터 정수 5개를 입력받아 배열에 저장하고, 증가하는 순서로 배열을 정렬하고, 정렬된 배열을 출력하는 프로그램이다.
	1. private static void sortNumbers(int[] array)를 완성하라.
	2. private static void printNumbers(int[] array)를 완성하라.
 
	```java
	import java.util.Scanner;
	
	public class Practice3_3 {
	    public static void main(String[] args) {
	        int[] numbers = inputNumbers();
	        sortNumbers(numbers);
	        printNumbers(numbers);
	    }
	    private static int[] inputNumbers() {
	        int[] nums = new int[5];
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("5개의 정수를 입력하시오");
	        for (int i = 0; i < 5; i++) {
	            System.out.print((i+1)+"번째 정수=");
	            nums[i] = scanner.nextInt();
	        }
	        return nums;
	    }
	    private static void sortNumbers(int[] array) {
	        // 배열 array를 증가하는 순서로 정렬한다 
	    }
	    private static void printNumbers(int[] array) {
	        //  배열 array를 출력한다 
	    }
	}
	```

- (참고자료)
	- 강의자료 [ArrayTest2 코드](https://github.com/kwanulee/JavaExample/blob/master/JavaArray/src/ArrayTest2.java)
	- 배열 정렬 방법 
		- http://terms.naver.com/entry.nhn?docId=2270437&cid=51173&categoryId=51173

- 실행결과

	```
	5개의 정수를 입력하시오
	1번째 정수=3
	2번째 정수=7
	3번째 정수=6
	4번째 정수=9
	5번째 정수=4
	
	배열 내용 출력(중가하는 순서)
	array[0]= 3
	array[1]= 4
	array[2]= 6
	array[3]= 7
	array[4]= 9
	```

<a name="4"></a>
### 4. 예외처리 연습
- [문제3](#3)의 코드에서 사용자가 정수 이외의 값을 입력하였을 때, 경고 메시지를 출력하도록 예외처리를 하고, 정수 값을 올바로 입력할 수 있도록 코드를 수정하시오. 
	- [참고] https://github.com/kwanulee/JavaExample/blob/master/JavaException/InputException/src/InputException.java 
	 
- 실행결과

	```
	5개의 정수를 입력하시오
	1번째 정수=f
	경고! 정수를 입력하지 않았습니다.
	1번째 정수=3
	2번째 정수=2.3
	경고! 정수를 입력하지 않았습니다.
	2번째 정수=3
	3번째 정수=42
	4번째 정수=3
	5번째 정수=6
	
	배열 내용 출력(중가하는 순서)
	array[0]=3
	array[1]=3
	array[2]=3
	array[3]=6
	array[4]=42
	```

<a name="5"></a>
### 5. 2차원 배열 사용하기1
- 다음은 3x4의 2차원 배열을 만들고, 이곳에 0~9 범위의 정수를 랜덤하게 저장한 후, 2차원 배열과 합을 출력하는 프로그램의 실행 결과와 코드이다. ****표시된 곳에 적절한 코드를 삽입하라.

	```java
	public class RadomArray {
	
		public static void main(String[] args) {
			int intArray[][];		// 2차원 정수 배열 선언
			****************			// intArray에 3x4 정수 배열 생성
			
			//12개의 정수를 랜덤하게 발생시켜 배열에 순서대로 저장한다.
			for (int i=0; i<3; i++)
				for (int j=0; j<4; j++)
					intArray[i][j] = (int)(Math.random()*10);
			
			// 3x4 배열을 출력한다.
			for (int i=0; i< ******** ; i++) {	// length 필드를 이용하라.
				for (int j=0; j< ******* ; j++)	// length 필드를 이용하라.
					*******************************	// 	원소 [i][j] 출
				System.out.println();
			}
			
			// 3x4 배열의 합을 구하여 출력한다.
			int i=0, sum=0;
			while(i<3) {	//3개의 각 행에 대해 반복
				*************************
				*************************
				*************************
			}
			System.out.println("합은 "+sum);
		}
	}
	```

- 실행결과

	```
	1	2	1	0	
	3	7	1	3	
	4	3	1	0	
	합은 26
	```

<a name="6"></a>
### 6. 2차원 배열 사용하기2
- 강의자료에서 예시한 ArrayTest3는 학생수와 과제수를 키보드로 입력받아 2차원 배열을 생성(**getArray()**)하고, 과제별 학생점수를 다시 키보드로부터 입력받아 생성된 2차원 배열에 저장(**inputGrade(int[][] scoresByAssings)**)한다. 마지막으로 이 2차원 배열을 화면에 정렬된 형태로 출력(**print(int[][])**)한다

- 이를 바탕으로 다음과 같이 수정 확장한다.
	1.	private static int[] calculateAverage(int[][] scoresByAssigns)를 완성하라.
	2.	private static void print(int[][] scoresByAssigns, int[] averageByAssigns)를 기존 메소드를 바탕으로 확장하여 완성하라.

	```java
	public class Practice3_6 {
		public static void main(String[] args) {
			int [][] scoresByAssignments = getArray();
			inputGrade(scoresByAssignments);
	        int [] averageByAssignments = calculateAverage(scoresByAssignments);
	        print(scoresByAssignments,averageByAssignments);
		}
		private static int[][] getArray() {  
			// ArrayTest3의 getArray()와 동일 
		}
		
		private static void inputGrade(int[][] scoresByAssigns) {
			// ArrayTest3의 inputGrade(int[][])와 동일
		}
		
		private static int[] calculateAverage(int[][] scoresByAssigns) {
	        //  과제별 학생점수를 기록한 2차원 배열 scoresByAssigns을 바탕으로
	        //  과제별 학생점수의 평균을 계산하고, 이를 저장한 배열을 반환한다.
		}
	
		private static void print(int[][] scoresByAssigns, int[] averageByAssigns){
	        //  과제별 학생점수를 기록한2차원 배열 scoresByAssigns과
	        //  과제별 학생들의 평균점수를 기록한 배열 averageByAssigns를 
	        //  화면에 정렬된 형태로 출력한다.
	
		}
	}
	```

- 실행결과

	```
	학생 수를 입력하시오:3
	과제 수를 입력하시오:2
	과제 0의 학생 성적을 차례로 입력하시오
	학생 S[0]의 과제 A[0] 성적:1
	학생 S[1]의 과제 A[0] 성적:2
	학생 S[2]의 과제 A[0] 성적:3
	과제 1의 학생 성적을 차례로 입력하시오
	학생 S[0]의 과제 A[1] 성적:4
	학생 S[1]의 과제 A[1] 성적:5
	학생 S[2]의 과제 A[1] 성적:6
	    	S[0]	S[1]	S[2]	평균
	A[0]	  1	  	2	  	3	 	2	
	A[1]	  4	  	5	  	6	 	5
	```

- 참고자료: [ArrayTest3.java 코드](https://github.com/kwanulee/JavaExample/blob/master/JavaArray/src/ArrayTest3.java)