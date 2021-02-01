package codeSignal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class coverDebts {

    public static void main(String[] args) {
        int s = 40;
        int[] debts = { 2, 2, 5 };
        int[] interests = { 75, 25, 25 };
        double result = coverDebts(s, debts, interests);
        System.out.println(result);
    }

    static double coverDebts(int s, int[] debts, int[] interests) {

        double result = 0;

        double pay = (s * 0.1);
        List<Mapeamento> listaMapeamento = new ArrayList<Mapeamento>();

        for (int i = 0; i < debts.length; i++) {
            listaMapeamento.add(new Mapeamento(debts[i], interests[i]));
        }

        List<Mapeamento> sortedList = listaMapeamento.stream()
                .sorted(Comparator.comparing(Mapeamento::getInterest).reversed()).collect(Collectors.toList());

        for (int i = 0; i < sortedList.size(); i++) {
            System.out.println(sortedList.get(i).getDebt() + "  " + sortedList.get(i).getInterest());
        }

        double resultFinal = 0;

        for (int i = 0;  i < sortedList.size();) {
            if (sortedList.get(i).getDebt() != 0) {

                double sobra = pay - sortedList.get(i).getDebt();
               

                if (sobra == 0 || sobra > 0) {
                   
                    resultFinal = resultFinal + sortedList.get(i).getDebt();

                    sortedList.get(i).setDebt(0);
                    i++;
                  
                    if(sobra == 0){
                        sortedList = reajuste(sortedList);
                        pay =  (s * 0.1);
                    }
                      
                    else 
                        pay = sobra;
                    

                }

                else if (sobra < 0) {

                    resultFinal = resultFinal + pay;

                    sortedList.get(i).setDebt(sortedList.get(i).getDebt() - pay);
                    sortedList = reajuste(sortedList);
                    pay = (int) (s * 0.1);

                }
            }

        }

        
        return resultFinal;

    


}

static List<Mapeamento> reajuste(List<Mapeamento> sortedList){
    
    for (int k = 0; k < sortedList.size(); k++) {
        if (sortedList.get(k).getDebt() != 0) {
            double montanteFinal = 0;
            if (sortedList.get(k).getInterest() > 100) {
                montanteFinal = sortedList.get(k).getDebt()
                        + (sortedList.get(k).getDebt() * sortedList.get(k).getInterest() / 100);
            } else {
                montanteFinal = sortedList.get(k).getDebt()
                        + sortedList.get(k).getDebt() * (sortedList.get(k).getInterest() / 100);
            }
            sortedList.get(k).setDebt(montanteFinal);
        }
    }

    return sortedList;

}
}

class Mapeamento {
    double debt;
    double interest;

    public Mapeamento(double debt, double interest) {
        this.debt = debt;
        this.interest = interest;
    }

    public double getDebt() {
        return debt;
    }

    public void setDebt(double debt) {
        this.debt = debt;
    }

    public double getInterest() {
        return interest;
    }

    public void setInterest(double interest) {
        this.interest = interest;
    }

}

