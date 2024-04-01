public class testeFuncionario {
    public static void main(String[] args) {
        funcionario f1 = new funcionario("Isabel", 18, 1500);
        gerente g1 = new gerente("Tiago", 38, 2000, "Supervisor");
        System.out.println("Informações funcionário: ");
        f1.info();
        System.out.println();
        System.out.println("Informações gerente");
        g1.info();
    }

}
