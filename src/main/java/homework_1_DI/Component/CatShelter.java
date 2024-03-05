package homework_1_DI.Component;

import homework_1_DI.Base.BlackHouseCat;
import homework_1_DI.Base.CatBehavior;
import homework_1_DI.Base.OrangeHouseCat;
import homework_1_DI.Base.WhiteHouseCat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CatShelter {
    // введение через конструктор
    BlackHouseCat blackHouseCat;

    @Autowired
    public CatShelter(BlackHouseCat blackHouseCat) {
        this.blackHouseCat = blackHouseCat;
    }

    // введение через поле
    @Autowired
    OrangeHouseCat orangeHouseCat;

    // введение через сеттер
    WhiteHouseCat whiteHouseCat;
    @Autowired
    public void setWhiteHouseCat(WhiteHouseCat whiteHouseCat){
        this.whiteHouseCat = whiteHouseCat;
    }
}
