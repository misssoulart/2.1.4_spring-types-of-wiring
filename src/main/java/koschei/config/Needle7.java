package koschei.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Needle7 extends koschei.models.Needle7 {

    @Override
    public String toString() {
        return ", смерть Кощея на игле :( " + "";
    }
}
/*
@Component
public class Needle7 extends koschei.models.Needle7 {
    private Deth8 deth;

    @Override
    public String toString() {
        return ", смерть Кощея на игле :( " + deth.toString();
    }

    @Autowired
    public Needle7(Deth8 deth) {
        this.deth = deth;
    }
}
/*
@Component
public class Needle7 extends koschei.models.Needle7 {

     @Override
     public String toString() {
         return ", смерть Кощея на игле :( " + "";
     }
}
*/