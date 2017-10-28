/**
 *
 * @author itsgnegrao
 *
    1. Adicionar um compromisso.
    2. Alterar um compromisso.
    3. Remover um compromisso.
    4. Listar os compromissos de uma data específica
    5. Exibir todos os compromissos da Agenda.
 */
 
import java.rmi.*;
import java.util.ArrayList;

public interface Acesso extends Remote {

    public int Adicionar(String[] str) throws RemoteException;

    public int Alterar(String[] str) throws RemoteException;

    public int Remover(String[] str) throws RemoteException;

    public ArrayList<String[]>  ListarData(String data) throws RemoteException;

    public ArrayList<String[]> ExibirTodos() throws RemoteException;

}
