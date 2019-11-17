# 패키지와 컬렉션 (실습)

[다형성의 활용 실습과제](https://kwanulee.github.io/java-practice/polymorphism.html)에서 정의한 Shape, Rectangle, Circle 클래스를 바탕으로 다음의 내용을 구현해 보자.

- [다형성 활용 실습 소스코드](Practice7.java)

<a name="1"></a>
### 1. 패키지 생성 및 패키지 사용

1. shape 패지키와 editor 패키지를 만든다.
2. shape 패키지에는 Shape, Rectangle, Circle 클래스를 포함시키고, editor 패키지에는 ShapePanel클래스와 main함수를 포함한 클래스(Practice7)를 배치시킨다.
	- [**주의**] 다른 패키지에서 사용되는 클래스는 public으로 선언되어야 하고, public으로 선언된 클래스는 동일한 이름의 .java 파일에 정의되어 있어야 합니다. 
3. Practice7 클래스의 이름을 Practice12로 변경한다. (반드시, Refactor의 Rename을 이용해야 함)
4. Practice12의 main함수를 실행시켜 Practice7와 동일한 결과가 나오는지를 확인한다.


---
<a name="2"></a>
### 2. toString()메소드 재정의

- Rectangle 클래스와 Circle클래스에서 Object클래스에서 정의된 public String toString() 메소드를 재정의한다.
	- Rectangle 클래스의 public String toString() 
	
		- Rectangle 객체의 멤버 변수(width, height, x, y) 값을 문자열로 만들어 반환
예: “x=1, y=1, width=10, height=100” 과 같은 형식의 문자열 반환

	- Circle 클래스의 public String toString(): 

		- 앞의 Rectangle 클래스의 toString() 메소드 구현과 같은 방식

[참고코드] https://github.com/kwanulee/JavaExample/blob/master/JavaPackages/PackageTest/src/com/kwanwoo/java/ObjectTest.java#L34-L36


---
<a name="3"></a>
### 3.	ShapePanle의 display()메소드 재구현
- 앞에서 정의한 toString() 메소드를 이용하여 구현해야 함.
	- public void display() : 
		- Shape 배열에서 저장된 모든 도형 객체를 화면에 출력
			- 각 도형이 가지고 있는 정보를 출력
				- Rectangle 객체의 출력 예시:
					- [Rectangle 객체]x=20, y=20, width=3, height=4
				- Circle 객체의 출력 예시:
					- [Circle 객체]x=10, y=10, radius=10


---
<a name="4"></a>
### 4. Shapepanel클래스에서 ArrayList<E> 사용
- [Practice7.java](Practice7.java)에서 ShapePanel 클래스를 구현할 때, Shape 배열을 사용하여 ShapePanel의 add(), delete(), display() 메소드를 구현하였는데, 이를 ArrayList<Shape>을 사용하여 다시 구현하여라.
- 이를 테스트하기 위한 main() 함수는 문제1에서 예시된 실습7의 것과 동일하다. 

	- 실행결과
	
		![](figure/Practice12.png)
