# 클래스와 상속 (실습)



<a name="1"></a>	
### 1. 실습5_4 확장
- [실습5_4: 객체 배열 및 캡슐화 연습2](class-object2.html#4) 문제를 다음과 같이 확장한다.
	1.  다음과 같은 멤버를 가지는 원을 표현하는 **Circle** 클래스를 추가 작성하라.
		- int 타입의 **x, y, radius** 필드: 원의 중심점과 반지름을 나타냄 
			- 필드는 private 멤버로 정의하고, 적절한 생성자와 private 멤버를 접근하기 위한 getter/setter 메소드를 정의하시오.
		- **public String toString()** : 	
			- x, y, raduis 값을 문자열로 만들어 반환하는 메소드
		- **public boolean equals(Circle c)**: 
			- 파라미터로 전달된 객체 c와 현재 객체가 동일한 원이면 true를 반환 그렇지 않으면 false를 반환 
	2. 다음과 같은 멤버를 가지는 **FigureEditor** 클래스를 작성하라.
		- Rectangle 배열 타입의 **rectangles** 필드: 
			- FigureEditor 클래스에 추가된 Rectangle 객체를 저장
		- int 타입의 **numOfRect** 필드:
			- Rectangle 배열에 저장된 Rectangle 객체의 수
	
		- Circle 배열 타입의 **circles** 필드 [추가]: 
			- FigureEditor 클래스에 추가된 Circle 객체를 저장
		- int 타입의 **numOfCircle** 필드 [추가]:
			- Circle 배열에 저장된 Circle 객체의 수
	
		- **public void add(Rectangle r)**: 
			- 파라미터로 입력된 Rectangle 객체 r를 멤버변수로 선언된 Rectangle 배열에 추가; 
			- 파라미터로 입력된 Rectangle 객체 r과 동일한 사각형이 이미 Rectangle 배열에 있으면 추가하지 않음
	
		- **public void add(Circle c)** [추가]:
			- 파라미터로 입력된 Circle 객체 c를 멤버변수로 선언된 Circle 배열에 추가; 
			- 파라미터로 입력된 Circle 객체 c와 동일한 원이 이미 Circle 배열에 있으면 추가하지 않음
		- **public void display()** [확장]: 
			- Rectangle 배열에서 저장된 모든 Rectangle 객체를 화면에 출력
			- Circle 배열에서 저장된 모든 Circle 객체를 화면에 출력

	3. 작성된 클래스들을 테스트하기 위한 main함수를 포함한 FirgureEditorTest 클래스와 실행결과는 다음과 같다.	

		```java
		public class FigureEditorTest {
			public static void main(String[] args) {
				FigureEditor editor = new FigureEditor();
		
				Rectangle r1 = new Rectangle(1,2,3,4);
				Rectangle r2 = new Rectangle(2,3,4,5);
				Circle c1 = new Circle(3,4,5);
				Circle c2 = new Circle(4,5,6);
			
				editor.add(r1);
				editor.add(r2);
				editor.add(c1);
				editor.add(c2);
				editor.display();
				
				Rectangle r3 = new Rectangle(2,3,4,5);
				editor.add(r3);
				editor.display();
				
				r3.setX(1);
				editor.add(r3);
				Circle c3 = new Circle(4,5,6);
				editor.add(c3);
				editor.display();
				
			}
		}	
		```
		
		- 실행결과

			```
			-------------Rectangles -----------
			x=1, y=2, width=3, height=4
			x=2, y=3, width=4, height=5
			-------------Cricles -----------
			x=3, y=4, radius=5
			x=4, y=5, radius=6
			
			-------------Rectangles -----------
			x=1, y=2, width=3, height=4
			x=2, y=3, width=4, height=5
			-------------Cricles -----------
			x=3, y=4, radius=5
			x=4, y=5, radius=6
			
			-------------Rectangles -----------
			x=1, y=2, width=3, height=4
			x=2, y=3, width=4, height=5
			x=1, y=3, width=4, height=5
			-------------Cricles -----------
			x=3, y=4, radius=5
			x=4, y=5, radius=6
			
			```

---
<a name="2"></a>	
### 2. 클래스 상속 구조로 변경 
- 앞의 문제 코드를 클래스 상속을 통해 재구조화 시킨다.
	1.  Shape 클래스는 전체 도형의 슈퍼클래스이고, 다음의 멤버를 가진다.
		- int 타입의 x, y 전용 (private) 멤버 변수: Shape의 기준점을 나타냄
		- 두개의 생성자
			- public Shape()
			- public Shape(int, int)
		- getter/setter 메소드
	2. Rectangle 과 Circle 클래스의 중복 멤버(x, y, getX(), getY(), setX(), setY() 등)들을 제거하고, 이들을 Shape 클래스로부터 상속받도록 기존 클래스를 수정하시오.
		- 기존 생성자 및 메소드를 적절히 수정해야 합니다.

	3. 앞 문제의 FigureEditorTest 클래스를 통해서 앞 문제와 동일한 결과가 나오는 지를 테스트 해 보시오.

---
<a name="3"></a>	
### 3. 클래스 다운캐스팅 및 업캐스팅 실습
- **FigureEditor** 클래스를  다음과 같이 수정하시오.
	- Shape 배열 타입의 **shapes** 필드: 
		- FigureEditor 클래스에 추가된 Shape 객체를 저장
	- int 타입의 **numOfShape** 필드:
		- Shape 배열에 저장된 Shape 객체의 수
	
	- **public void add(Shape s)**: 
		- 파라미터로 입력된 Shape 객체 s를 멤버변수로 선언된 Shape 배열에 추가; 
		- 파라미터로 입력된 Shape 객체 s와 동일한 도형이 이미 Shape 배열에 있으면 추가하지 않음. (구체적으로 다음 두 조건인 경우)
			1. Shape 배열의 객체가 Rectangle이고, Shape 객체 s도 Rectangle 이고, Shape 배열 객체와 Shape 객체 s가 모두 동일한 값을 가지고 있는 경우
			2. Shape 배열의 객체가 Circle이고, Shape 객체 s도 Circle 이고, Shape 배열 객체와 Shape 객체 s가 모두 동일한 값을 가지고 있는 경우 
	
	- **public void display()** [확장]: 
		- Shape 배열에서 저장된 모든 Shape 객체를 화면에 출력
- 이를 테스트 하기 위한 FigureEditorTest 클래스는 다음과 같습니다.

	```java
	public class FigureEditorTest {
		public static void main(String[] args) {
			FigureEditor editor = new FigureEditor();
	
			Shape r1 = new Rectangle(1,2,3,4);
			Shape r2 = new Rectangle(2,3,4,5);
			Shape c1 = new Circle(3,4,5);
			Shape c2 = new Circle(4,5,6);
		
			editor.add(r1);
			editor.add(r2);
			editor.add(c1);
			editor.add(c2);
			editor.display();
			
			Rectangle r3 = new Rectangle(2,3,4,5);
			editor.add(r3);
			editor.display();
			
			r3.setX(1);
			editor.add(r3);
			Circle c3 = new Circle(4,5,6);
			editor.add(c3);
			editor.display();
			
		}
	}
	```
	
	- 실행결과

		```
		-------------Shapes -----------
		x=1, y=2, width=3, height=4
		x=2, y=3, width=4, height=5
		x=3, y=4, radius=5
		x=4, y=5, radius=6
		
		-------------Shapes -----------
		x=1, y=2, width=3, height=4
		x=2, y=3, width=4, height=5
		x=3, y=4, radius=5
		x=4, y=5, radius=6
		
		-------------Shapes -----------
		x=1, y=2, width=3, height=4
		x=2, y=3, width=4, height=5
		x=3, y=4, radius=5
		x=4, y=5, radius=6
		x=1, y=3, width=4, height=5
		```
