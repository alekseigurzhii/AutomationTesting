/*Conditions:
 * Напишите программу нахождения гипотенузы и площади прямоугольного треугольника по двум катетам
 */
public class task4 {

	public static void main(String[] args) {
		int c1, c2;
		double hip = 0, s;

		c1 = 3;
		c2 = 4;

		hip = Math.sqrt(c1*c1 + c2*c2);

		s = 0.5*c1*c2;

		System.out.println("Гипотенуза =" + hip);
		System.out.println("Площадь =" + s);

	}

}
