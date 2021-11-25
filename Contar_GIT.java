package Funciones;

public class Contar_GIT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int contar = 0;
		int[] array = new int[20];

		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * 10);
			System.out.print(array[i] + ","  );
			contar++;
			
		}
	System.out.print(" " + "Hay: " + contar);
	}
	

}
