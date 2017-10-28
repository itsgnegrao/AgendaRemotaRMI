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
import java.rmi.server.*;
import java.util.ArrayList;

public class AcessoImplementacao extends UnicastRemoteObject implements Acesso {

    ArrayList<Compromisso> Agenda;

    public AcessoImplementacao() throws RemoteException{
        super();
        Agenda = new ArrayList<Compromisso>();
    }

    @Override
    public int Adicionar(String[] str) throws RemoteException {
        Compromisso c = new Compromisso(str[0],str[1],str[2],str[3],str[4]);
        Agenda.add(c);
        System.out.println("Adicionado um Compromisso");
        return 1;
    }

    @Override
    public int Alterar(String[] str) throws RemoteException {
        for(Compromisso c : Agenda){
            if(c.Data.equals(str[0]) && c.Hora.equals(str[1])){
                c.Assunto = str[2];
                c.Descricao = str[3];
                c.Notificacao = str[4];
                break;
            }
        }
        System.out.println("Compromisso Alterado");
        return 1;
    }

    @Override
    public int Remover(String str[]) throws RemoteException {
        for(Compromisso c : Agenda){
            if(c.Data.equals(str[0]) && c.Hora.equals(str[1])){
                Agenda.remove(c);
                break;
            }
        }
        System.out.println("Compromisso Removido");
        return 1;
    }

    @Override
    public ArrayList<String[]>  ListarData(String data) throws RemoteException {
        ArrayList<String[]> list = new ArrayList<String[]>();
        String[] str;

        for(Compromisso c : Agenda){
            if(c.Data.equals(data)){
                str = new String[]{c.Data,c.Hora,c.Assunto,c.Descricao,c.Notificacao};
                list.add(str);
            }
        }
        System.out.println("Lista de Eventos Retornada");
        return list;
    }

    @Override
    public ArrayList<String[]> ExibirTodos() throws RemoteException {
        ArrayList<String[]> list = new ArrayList<String[]>();
        String[] str;

        for(Compromisso c : Agenda){
            str = new String[]{c.Data,c.Hora,c.Assunto,c.Descricao,c.Notificacao};
            list.add(str);
        }
        System.out.println("Lista de Eventos Completa Retornada");
        return list;
    }


}
