public class gerente extends funcionario{
    public String departamento;
    public gerente (String nome, int idade, double salario, String departamento){
        super (nome, idade, salario);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    public void info(){
        super.info();
        System.out.println("Departamento: " + departamento);
    }
}
