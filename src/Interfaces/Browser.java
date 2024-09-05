package Interfaces;

public interface Browser {
    public void navigate(String url);
    public void reload(String url);
    public void stop(String url);
    public void download(String url, String destination);
}
