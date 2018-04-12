
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface IServicoRemVeterinario extends Remote{
	void inserir(Veterinario p) throws RemoteException;
	List<Veterinario> listarVet() throws RemoteException;
}
