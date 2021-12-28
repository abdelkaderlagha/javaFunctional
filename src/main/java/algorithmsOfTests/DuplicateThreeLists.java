package algorithmsOfTests;

import java.util.*;

public class DuplicateThreeLists {
    public static void main(String[] args) {
        List<String> name = Arrays.asList("apple","banana","banana","apple");
        List<Integer> price = Arrays.asList(1,2,2,1);
        List<Integer> qty = Arrays.asList(1,2,2,1);

        int result = duplicate(name, price, qty);
        System.out.println(result);
    }

    static int duplicate(List<String> name, List<Integer> price, List<Integer> qty){
    Set<Integer> index = new HashSet<>();
        for(int i=0;i<name.size();i++){
            for(int j=i+1;j<name.size();j++){
                if(name.get(i).equals(name.get(j))
                        && price.get(i).equals(price.get(j))
                        && qty.get(i).equals(qty.get(j))){
                    index.add(i);
                }
            }
        }
        return index.size();
    }
}
