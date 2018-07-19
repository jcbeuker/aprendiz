package basico;

public class Hello {

	public static void main(String[] args) {

		Person pa = new Person();
		pa.name = "Thays";
		pa.old = 25;

		Person pb = new Person();
		pb.name = "Caetano";
		pb.old = 30;

		Address end1 = new Address();
		end1.street = "Rua 36 Norte";
		end1.neighborhood = "Norte (Águas Claras)";
		end1.number = 3350;

		Address end2 = new Address();
		end2.street = "Rua 36";
		end2.neighborhood = "Norte (Águas Claras)";
		end2.number = 3350;

		pa.end = end1;
		pb.end = end2;

		end1.dweller = new Person[2];
		end2.dweller = new Person[2];

		end1.dweller[0] = pa;
		end2.dweller[1] = pb;
		
		
		System.out.println("Dados: ");
	}

}
