package ImperativeFunctions;

import java.util.function.Supplier;

public class _Suplier {
    public static void main(String[] args) {
        System.out.println(getDBUrlSupplier.get());
    }

    static String getConnectionDBUrl(){
        return "jdbc://localhost:5432/users";
    }

    static Supplier<String> getDBUrlSupplier = () ->
            "jdbc://localhost:5432/users";
}
