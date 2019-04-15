package lab6.Currency;

public class Main {
    public static void main(String[] args) {
        RON ron=new RON(1);
        USD usd=new USD(1);
        ExchangeDesk exchangeDesk= new ExchangeDesk();
        exchangeDesk.addRate(usd,ron,4.1f);
        System.out.println("Exchange result:"+exchangeDesk.convert(ron,USD.class).getAmount());
        System.out.println("Exchange result:"+exchangeDesk.convert(usd,RON.class).getAmount());
    }
}
