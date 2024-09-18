import java.util.HashSet;

public class HashSetDemo {
	public static void main(String[] args) {
		HashSet<String> autos = new HashSet<String>();
		System.out.println(autos.add("Volvo"));//true
		System.out.println(autos.add("BMW"));//true
		System.out.println(autos.add("VW"));//true
		System.out.println(autos.add("Ford"));//true
		System.out.println(autos.add("Audi"));//true
		System.out.println(autos.add("BMW"));//false
		
		System.out.println(autos.size());//5
		System.out.println(autos.contains("BMW"));
		System.out.println(autos.isEmpty());//false
		
//		for (String auto : autos) {
//			System.out.println(auto);
//		}//foreach
		
		HashSet<String> pc = new HashSet<String>();
		pc.add("Lenovo");	pc.add("HP");		pc.add("Acer");
		pc.add("DELL");		pc.add("Gateway");	pc.add("Compaq");
		pc.add("Toshiba");	pc.add("VAIO");		pc.add("Apple");
		pc.add("ASUS");
		
		
		autos.forEach(  (marca) -> mostrarMarcas(marca) );
		System.out.println("**********************************************+");
		pc.forEach((marca) -> mostrarMarcas(marca) );
		

	}//main

	private static void mostrarMarcas(String marca) {
		System.out.println("+------------------------------------");
		System.out.println("| " + marca);
		System.out.println("+------------------------------------");
	}//mostrarMarcas

}//class HashSetDemo
