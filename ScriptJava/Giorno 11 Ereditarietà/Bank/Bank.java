public class Bank{
    int getRateOfInterest(){
        return 0;
    }

    String nome(){
        return "Bank";
    }

    public static void main(String[] args) {
        SBI s = new SBI();
        AXIS a = new AXIS();
        ICICI i = new ICICI();
        System.out.println(s.nome()+"rate:" + s.getRateOfInterest());
        System.out.println(a.nome()+"AXIS rate:" + a.getRateOfInterest());
        System.out.println(i.nome()+"ICICI rate:" + i.getRateOfInterest());

    }
}
