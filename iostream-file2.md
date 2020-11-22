# 입출력 스트림과 파일 실습

## 실습 문제

- 학생 정보는 학부생과 대학원생 정보는 약간의 차이가 있다.
	 - 학부생 정보: 학번(String), 이름(String), 학과/트랙(String), 나이(int), 동아리(String)
	 - 대학원생 정보: 학번(String), 이름(String), 학과(String), 나이(int), 학위과정(String), 전공(String)
	 
1. 위의 정보를 바탕으로 **Student**, **UnderGraduate**, **Graduate** 클래스를 정의하라.
	- **Student**는 **UnderGraduate**와 **Graudate**의 슈퍼클래스이다. 
2. **ArrayList\<Student\>** 객체인 students가 아래와 같이 초기화 되어 있을 경우에, 이를 파일에 저장하는 함수와 파일로부터 저장된 정보를 읽어와 **ArrayList\<Student\>** 객체를 재구성하여 반환하는 함수를 두가지 방식으로 구현하시오.


	```
	public class 실습12 {
	
		public static void main(String[] args) {
			ArrayList<Student> students = new ArrayList<Student>();
			students.add(new UnderGraduate("100","Lee","사물인터넷",21,"테니스"));
			students.add(new UnderGraduate("101","Kim","지능시스템",21,"요가"));
			students.add(new UnderGraduate("102","Park","사이버보안",24,"댄스"));
			students.add(new UnderGraduate("103","Kim","ICT융합엔터테인먼트",21,"야구"));
			students.add(new Graduate("G100","Jung","정보시스템",26,"석사","인공지능"));
			students.add(new Graduate("G101","Lee","정보시스템",26,"석사","보안"));
			students.add(new Graduate("G200","Han","정보컴퓨터공학",28,"박사","임베디드시스템"));
			
			saveDataToFile(students, "output.dat");
			System.out.println(loadDataFromFile("output.txt"));
			
			saveObjectToFile(students, "output.dat");
			System.out.println(loadObjectFromFile("output.dat"));
	
		}
		public static void saveDataToFile(ArrayList<Student> students, String fileName)  {...}
		public static ArrayList<Student> loadDataFromFile(String fileName) {...}
		
		public static void saveObjectToFile(ArrayList<Student> students, String fileName) {...}
		public static ArrayList<Student> loadObjectFromFile(String fileName) {...}
	}
	```
	- **방식1**: ArrayList<Student> 컬렉션 객체에 저장된 개별 객체 정보를 텍스트 파일(filename)에 저장하고, 파일에 저장된 정보를 읽어와서 ArrayList<Student> 컬렉션 객체를 재구성하여 반환함
		- **public static void saveDataToFile(ArrayList<Student> students, String fileName)** 
		- **public static ArrayList<Student> loadDataFromFile(String fileName)**
	- **방식2**:  **ObjectOutputStream** 객체를 이용하여 ArrayList<Student> 객체를 파일(fileName)에 저장하고, **ObjectInputStream** 객체를 이용하여 파일에 저장된 ArrayList<Student> 객체를 읽어옴
		- **public static void saveObjectToFile(ArrayList<Student> students, String fileName)** 
		- **public static ArrayList<Student> loadObjectFromFile(String fileName)** 