package homework_1_DI.Component;
import homework_1_DI.Base.BlackHouseCat;
import homework_1_DI.Base.CatBehavior;
import homework_1_DI.Base.OrangeHouseCat;
import homework_1_DI.Base.WhiteHouseCat;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CatShelter {
    // введение через конструктор
    @Getter
    private final CatBehavior blackHouseCat;
    public CatShelter(BlackHouseCat blackHouseCat) {
        this.blackHouseCat = blackHouseCat;
    }

    // введение через поле
    @Autowired
    public CatBehavior orangeHouseCat;

    // введение через сеттер
    public CatBehavior whiteHouseCat;
    @Autowired
    public void setWhiteHouseCat(WhiteHouseCat whiteHouseCat){
        this.whiteHouseCat = whiteHouseCat;
    }

}
