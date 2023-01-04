package Lib.Mod;

import static Lib.Multiplication.multiply;
import static Lib.Mod.BarrettReduction.barrett;

public class MulMod {
    public static String mulMod(String num1, String num2, String mod, int NumeralSystemInput, int NumeralSystemOutput) throws Exception {
        String res = multiply(num1, num2, NumeralSystemInput, NumeralSystemOutput);
        return barrett(res, mod, NumeralSystemInput, NumeralSystemOutput);
    }
}
