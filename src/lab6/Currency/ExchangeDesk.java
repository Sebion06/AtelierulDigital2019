package lab6.Currency;

import java.lang.reflect.InvocationTargetException;


public class ExchangeDesk {
    private float[][] exchangeRates = new float[20][20];

    public <T extends Currency, V extends  Currency> V convert(T convertFrom, Class<V> convertTo){
        V toReturn= null;
        try {
            toReturn=convertTo.getDeclaredConstructor(Float.TYPE).newInstance(0);
            toReturn=convertTo.getDeclaredConstructor(Float.TYPE).newInstance(convertFrom.getAmount()*exchangeRates[convertFrom.getCode()][toReturn.getCode()]);
        } catch (InstantiationException e){
            e.printStackTrace();
        } catch (InvocationTargetException e){
            e.printStackTrace();
        } catch (NoSuchMethodException e){
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return toReturn;
    }
    public <T extends Currency, V extends  Currency>void addRate(T convertFrom,V convertTo, float rate){
        exchangeRates[convertFrom.getCode()][convertTo.getCode()]=rate;
        exchangeRates[convertTo.getCode()][convertFrom.getCode()]=1/rate;
    }
}
