public class Usuario {
    public static void main(String[] args) throws Exception {
        
        smartTV smartTV = new smartTV();
        System.out.println("TV ligada ? " + smartTV.ligada);
        System.out.println("Canal Atual " + smartTV.canal);
        System.out.println("Volume Atual " + smartTV.volume);
    }
}
