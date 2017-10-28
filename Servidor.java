import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.registry.*;
import java.rmi.RemoteException;

/**
 *
 * @author itsgnegrao
 */


public class Servidor {

    public static void main(String[] args) throws RemoteException{
        Servidor servidor = new Servidor();
    }

    public Servidor()  throws RemoteException {
        try {
            Acesso acesso = new AcessoImplementacao();
            Registry registry = LocateRegistry.createRegistry(1099);
            Naming.rebind("AcessoImplementacao", acesso);

            System.out.println("Servidor: "+acesso.toString()+" ,registrado e pronto para aceitar solicitações.");
        } catch (RemoteException | MalformedURLException ex) {
            System.out.println("Houve um erro: " + ex.getMessage());
            System.exit(1);
        }
    }
}
