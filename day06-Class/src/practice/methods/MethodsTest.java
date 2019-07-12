package practice.methods;

public class MethodsTest {

	public static void main(String[] args) {
		int[] stage = new int[3];
		for (int cou = 0; cou < 3; cou++) {
			stage[cou] = (int) (Math.random() * 9 + 1);
		}

		VarietyMethods methods = new VarietyMethods();
		
		methods.birthYearMonth("홍길동", 996, 07);
		
		methods.printNineNineTabl(8);

		methods.printNineNineTableArray(stage);
		
		double height = 177.4;
		double weight = 70.2;
		String bmi_judm = methods.calcBmi(height, weight);
		System.out.println("비만도 판정 결과 : " + bmi_judm + "\n");
		
		int min_judm = methods.min(2, 3);
		System.out.println("작은 값 : "+ min_judm + "\n");
		
		int max_judm = methods.max(2, 3);
		System.out.println("큰 값 : "+ max_judm + "\n");
		
		int sum = methods.sumOfArray(stage);
		for (int cou = 0; cou < 3; cou++) {
			System.out.printf("stage[%d] = %d\n",cou,stage[cou]);
		}
		System.out.println("\n배열의 합 : "+ sum + "\n");
		
		int avg = methods.avgOfArray(stage);
		System.out.println("배열의 평균 : "+ avg + "\n");
		
		int add_sum = methods.adder(3, '+', 5);
		System.out.println("덧셈 결과 : "+ add_sum + "\n");
	}

}
