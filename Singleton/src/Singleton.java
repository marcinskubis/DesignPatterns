public final class Singleton {
    private static Singleton Instance;
    private String info="info";
    private Singleton() {
    }
    public static Singleton getInstance()
    {
        if(Instance==null){
            Instance = new Singleton();
        }
        return Instance;
    }
    public void setInfo(String changedInfo){
        info=changedInfo;
    }
    public String getInfo()
    {
        return info;
    }
}
