import APP.FacebookMessenger;
import APP.MSNMessenger;
import APP.ServicoMensagemInstantanea;
import APP.Telegram;


public class ComputadorPedrinho {
    public static void main(String[] args){
        ServicoMensagemInstantanea smi = null;

        System.out.println("\n");

        String appEscolhido = "msn";

        if(appEscolhido.equals("msn"))
        smi = new MSNMessenger();

        else if(appEscolhido.equals("facebook"))
        smi = new FacebookMessenger();

        else if(appEscolhido.equals("telegram"))
        smi = new Telegram();

        smi.enviarMensagem();
        smi.receberMensagem();

}
}
