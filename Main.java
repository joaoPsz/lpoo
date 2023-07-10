public class Main{
  public static void main(String[] args){
		System.out.println("O Banco está aberto!");
		Pessoa p1= new Pessoa("Luiza", "6456345634", new Data (13, 3, 2019), 'F');
		Pessoa p2= new Pessoa("Emerson", "6456345634", new Data (13, 3, 2019), 'M');
    Pessoa p3= new Pessoa("Felipe", "6456345634", new Data (13, 3, 2019), 'M');
    Pessoa p4= new Pessoa("Joelma", "6456345634", new Data (13, 3, 2019), 'F');
		Gerente g1 = new Gerente ("Maria","16732733788", new Data (13, 3, 2019) , 'F', "323606", "dfghj");
		Gerente g2 = new Gerente ("Joao", "16732733788", new Data (13, 3, 2019) , 'F', "323606", "dfghj");
		ContaCorrente c1 = new ContaCorrente ("1234-5", p1, g1, new Data(12, 3, 2019)); 
    ContaCorrente c2 = new ContaCorrente ("1234-5", p1, g1, new Data(12, 3, 2019)); 
		Poupanca c3 = new Poupanca ("2345-6", p2, g2, new Data (13, 3, 2019));
    Poupanca c4 = new Poupanca ("2345-6", p2, g2, new Data (13, 3, 2019));
    c1.depositar(100);
    c1.sacar(50);
    c1.transferir(5, c2);
    c1.extrato();

    c2.depositar(150);
    c2.sacar(23);
    c2.transferir(10, c3);
    c2.extrato();

    c3.depositar(200);
    c3.sacar(70);
    c3.transferir(15, c4);
    c3.extrato();

    c4.depositar(250);
    c4.sacar(100);
    c4.transferir(20, c1);
    c4.extrato();
	}
}