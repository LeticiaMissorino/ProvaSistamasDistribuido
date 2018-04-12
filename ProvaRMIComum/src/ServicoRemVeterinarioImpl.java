import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;

public class ServicoRemVeterinarioImpl extends UnicastRemoteObject implements IServicoRemVeterinario {

	private static List<Veterinario> lstVet = new ArrayList<>();

	public ServicoRemVeterinarioImpl() throws RemoteException {
	}

	public void inserir(Veterinario v) throws RemoteException {
		lstVet.add(v);
	}

	public List<Veterinario> listarVet() throws RemoteException {
		return lstVet;
	}

}
