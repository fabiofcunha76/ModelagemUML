package model;

import Interfaces.Browser;
import Interfaces.Phone;
import Interfaces.ReprodutorMusical;

public class IPhone implements ReprodutorMusical, Phone, Browser {


    @Override
    public void play(String music) {
        System.out.println("Tocando agora \'" + music + "\'.");
    }

    @Override
    public void pause(String music) {
        System.out.println("Pausando a música " + music + ".");
    }

    @Override
    public void navigate(String url) {
        System.out.println("Navegando até a página " + url + ".");
    }

    @Override
    public void reload(String url) {
        System.out.println("Recarregando a página " + url + ".");
    }

    @Override
    public void stop(String music) {
        System.out.println("Parando a música " + music + ".");
    }

    @Override
    public void download(String url, String destination) {
        System.out.println("Baixando o arquivo da url " + url + " para a pasta de destino " + destination + ".");
    }

    @Override
    public void reset(String music) {
        System.out.println("Reiniciando a música " + music + ".");
    }

    @Override
    public void startCall(String numeroContato) {
        System.out.println("Discando para o número " + numeroContato + ".");
    }

    @Override
    public void endCall(String numeroContato) {
        System.out.println("Finalizando a chamada para o número " + numeroContato + ".");
    }

    @Override
    public void saveHistory(String numeroContato) {
        System.out.println("Registrando a chamada para o número " + numeroContato + ".");
    }

    @Override
    public void blockCall(String numeroContato) {
        System.out.println("Bloqueando chamada indesejada do número " + numeroContato + ". Sem noção...");
    }
}
