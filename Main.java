import java.io.FileReader;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.util.ArrayList;

class Main {
	public static void main(String[] args) throws FileNotFoundException {

		int num;




		ArrayList<String> arrayList = new ArrayList<>();
		FileReader fr = new FileReader("names.txt");
		Scanner fileScanner = new Scanner(fr);
		while (fileScanner.hasNextLine()) {
			arrayList.add(fileScanner.nextLine());
		}
		Scanner scanner = new Scanner(System.in);


		do{
			System.out.println("Press 1 to learn about salary.");
			System.out.println("Press 2 to learn about the job.");
			System.out.println("Press 3 to learn about demand.");
			System.out.println("Press 4 to view current students.");
			System.out.println("Press 5 to quit.");

			num = scanner.nextInt();

			if(num == 1){
				System.out.println("98,345 average salary in South Florida!");
			}
			else if(num == 2){
				System.out.println("US News - 100 Best Jobs!");
			}
			else if(num == 3){
				System.out.println("Top 10 Forbes In-Demand Jobs!");
			}
			else if(num == 4){
				System.out.println("Current Students: ");
				for(String names : arrayList){
					System.out.println(names);
				}
			}
		}while(num != 5);

	}
}