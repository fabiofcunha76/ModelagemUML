package Interfaces;

import java.security.SecureRandom;

public interface Phone {

    public void startCall(String numeroContato);
    public void endCall(String numeroContato);
    public void saveHistory(String numeroContato);
    public void blockCall(String numeroContato);
}
