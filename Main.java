import java.util.Scanner;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);
    private static final PetMachine petMachine = new PetMachine();

    public static void main(String[] args) {

        int option;

        do {
            System.out.println("""
                    
                    ==== PET SHOP MACHINE ====
                    1 - Adicionar pet
                    2 - Remover pet
                    3 - Adicionar água
                    4 - Adicionar shampoo
                    5 - Lavar pet
                    6 - Ver status
                    0 - Sair
                    """);

            option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1 -> addPet();
                case 2 -> petMachine.removePet();
                case 3 -> petMachine.addWater(10);
                case 4 -> petMachine.addShampoo(2);
                case 5 -> petMachine.wash();
                case 6 -> petMachine.showStatus();
                case 0 -> System.out.println("Encerrando...");
                default -> System.out.println("Opção inválida.");
            }

        } while (option != 0);
    }

    private static void addPet() {
        System.out.print("Nome do pet: ");
        String name = scanner.nextLine();

        Pet pet = new Pet(name);
        petMachine.setPet(pet);
    }
}
