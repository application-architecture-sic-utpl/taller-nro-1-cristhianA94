package ec.edu.utpl.sic.arqapl.metrics;

import com.github.vickumar1981.stringdistance.util.StringDistance;

public class JaroWinkler implements Similaritable {

    @Override
    public double similarity(String text1, String text2) {
        double similarity = StringDistance.jaroWinkler(text1, text2);
        System.out.printf("La distancia JaroWinkler es: %.5f", similarity);
        return similarity;
    }
}
