import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;

import static java.lang.Math.pow;

public class Main {
    public static void main(String[] args) throws ParserConfigurationException, TransformerException {

        // პირველი დავალება
        Integer[] int_array = {1, 2, 3, 4, 5, 11, 13, 131, 2374};
        System.out.println(integerSum(int_array));

        // მეორე დავალება
        double a = 3;
        double b = 4;
        double c = 5;

        System.out.println(Diskriminanti(a, b ,c));

        // მესამე დავალება
            Book firstBook = new Book("The 100", 50);
            Book secondBook = new Book("The 100", 50);
            Book thirdBook = new Book("The 1000", 50);

            firstBook.equals(secondBook);
            firstBook.equals(thirdBook);
        // მეხუთე დავალება
        XmlUtil.createXml();
    }

    public static int integerSum(Integer[] args){
        int sum = 0;
        for (Integer arg : args) {
            if (arg < 100) {
                sum += arg;
            }
        }
        return sum;
    }

    public static double Diskriminanti(double a, double b, double c){
        double diskriminanti = pow(b, 2)-(4*a*c);
        return diskriminanti;
    }

}