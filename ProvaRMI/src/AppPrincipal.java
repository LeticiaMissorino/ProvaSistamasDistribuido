import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import javax.swing.JOptionPane;

public class AppPrincipal {
	public static void main(String[] args) {
		try {

			IServicoRemVeterinario objVet = (IServicoRemVeterinario) Naming.lookup("rmi://localhost:8282/prova");
			String nome ="";
			String id = "";
			String cpf = "";
			
			Veterinario v1 = new Veterinario();

			v1.setId(1);
			v1.setNome("leticia");
			v1.setCPF("123.654.987");
			objVet.inserir(v1);
			while(nome != null && cpf != null){
			//id = JOptionPane.showInputDialog("informe o id do Veterinario:"); n�o consegui converter para int o retorno, por isso o id sempre vai ser 1 
			nome = JOptionPane.showInputDialog("informe o nome do Veterinario:");
			cpf = JOptionPane.showInputDialog("informe o CPF do Veterinario:");
			
			Veterinario v2 = new Veterinario();
			v2.setId(1);
			v2.setNome(nome);
			v2.setCPF(cpf);

			objVet.inserir(v2);
			}
			
			for (Veterinario vet : objVet.listarVet()) {
				System.out.println("ID:" + vet.getId());
				System.out.println("Nome:" + vet.getNome());
				System.out.println("CPF:" + vet.getCPF());
			}
		
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (RemoteException e) {
			e.printStackTrace();
		} catch (NotBoundException e) {
			e.printStackTrace();
		}

	}

	/*
	 * for(Pessoa professor : objPessoa.listarPessoa()) {
	 * System.out.println("ID:" + professor.getId()); System.out.println("Nome:"
	 * + professor.getNome()); System.out.println("Telefone:" +
	 * professor.getTelefone()); System.out.println("Cidade:" +
	 * professor.getCidade());}
	 */
}
