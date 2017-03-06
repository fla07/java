import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TabajaraBank {

	
	public static void main(String[] args) {
		
		Conta c1 = new Conta();
		
		c1.getTitular().setNome("João da Silva");
		c1.getTitular().setCpf("91820600987");
		c1.getTitular().setEmail("jojo@hotmail.com");
		c1.getTitular().setCelular("5556-6667");
		c1.setNro(001);
		c1.setSaldo(200.00);
		
		Conta c2 = new Conta();
		c2.getTitular().setNome("José dos Santos");
		c2.getTitular().setCpf("60988970900");
		c2.getTitular().setEmail("ze.santos@gmail.com");
		c2.getTitular().setCelular("44334-6967");
		c2.setNro(002);
		c2.setSaldo(100.00);

		Conta c3 = new Conta();
		c3.getTitular().setNome("Maria dos Anjos");
		c3.getTitular().setCpf("19900214305");
		c3.getTitular().setEmail("ma_lindinha@gmail.com");
		c3.getTitular().setCelular("1177-4455");
		c3.setNro(003);
		c3.setSaldo(70.00);
		
		
		List<Conta> list = new ArrayList<Conta>();
		list.add(c1);
		list.add(c2);
		list.add(c3);
		
		Collections.sort(list, new Comparator(){
			public final int compare(Object o1, Object o2) {  
				Conta c1 = (Conta) o1;  
                Conta c2 = (Conta) o2;  
                return c1.getSaldo() > c2.getSaldo() ? -1 : (c1.getSaldo() < c2.getSaldo() ? +1 : 0);  
            }  
		});
		
		System.out.println("Dados dos clientes em ordem decrescente de saldo: ");
		
		
		for(Conta c : list)
			System.out.println("Titular: "+c.getTitular().getNome()+" com um celular da  :" + c.getTitular().getCelular() +" \n " +
					" Tem o saldo de : R$ "+c.getSaldo());
	}
	

}
