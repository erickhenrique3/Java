public class PetMachine {

    private static final int MAX_WATER = 30;
    private static final int MAX_SHAMPOO = 10;
    private static final int WATER_PER_WASH = 10;
    private static final int SHAMPOO_PER_WASH = 2;

    private int water = MAX_WATER;
    private int shampoo = MAX_SHAMPOO;
    private Pet pet;

    public void setPet(Pet pet) {
        if (this.pet != null) {
            System.out.println("Já existe um pet na máquina.");
            return;
        }

        this.pet = pet;
        System.out.println("Pet " + pet.getName() + " adicionado.");
    }

    public void removePet() {
        if (pet == null) {
            System.out.println("Não há pet na máquina.");
            return;
        }

        System.out.println("Pet " + pet.getName() + " removido.");
        pet = null;
    }

    public void wash() {
        if (pet == null) {
            System.out.println("Nenhum pet na máquina.");
            return;
        }

        if (pet.isClean()) {
            System.out.println("O pet já está limpo.");
            return;
        }

        if (water < WATER_PER_WASH || shampoo < SHAMPOO_PER_WASH) {
            System.out.println("Recursos insuficientes.");
            return;
        }

        water -= WATER_PER_WASH;
        shampoo -= SHAMPOO_PER_WASH;
        pet.setClean(true);

        System.out.println("Pet lavado com sucesso!");
    }

    public void addWater(int amount) {
        water = Math.min(water + amount, MAX_WATER);
        System.out.println("Água atual: " + water);
    }

    public void addShampoo(int amount) {
        shampoo = Math.min(shampoo + amount, MAX_SHAMPOO);
        System.out.println("Shampoo atual: " + shampoo);
    }

    public void showStatus() {
        System.out.println("Água: " + water);
        System.out.println("Shampoo: " + shampoo);
        System.out.println("Pet na máquina: " + (pet != null ? pet.getName() : "Nenhum"));
    }
}
