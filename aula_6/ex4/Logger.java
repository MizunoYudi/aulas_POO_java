public class Logger{
    public void log(String msg){
        System.out.println("Log: " + msg);
    }

    public void log(String msg, int nivel){
        System.out.println(String.format("Log: %s\nNivel: %d", msg, nivel));
    }

    /*public void log(String msg, Throwable t){
        System.out.println(String.format("Log: %s\nMotivo: %s", msg, t.getCause()));
    }*/

    public void log(String  msg, String... args){
        System.out.println(msg);
        for(int i = 0; i < args.length; i++){
            System.out.println(args[i]);
        }
    }


    public static void main(String[] args){
        Logger l = new Logger();
        
        l.log("Deu erro");
        l.log("Deu erro 2" , 2);
        l.log("Sequencia de logs: ", "Log1", "Log2", "Log3", "Log4");
    }
}