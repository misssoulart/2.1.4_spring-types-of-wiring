package koschei.config;

import koschei.models.Needle7;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Egg6 {

    @Autowired
    private Needle7 needle;


    @Override
    public String toString() {
        return ", в яйце иголка " + needle.toString();
    }
}
