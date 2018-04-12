import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

public class Servidor  {

	public Servidor() throws RemoteException {
		try{
			LocateRegistry.createRegistry(8282);
			Naming.rebind("rmi://localhost:8282/prova", new ServicoRemVeterinarioImpl());
			System.out.println("Rodando...");
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) throws RemoteException  {
		new  Servidor();
	}

}
