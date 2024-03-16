package homework_1_DI.Component;
import homework_1_DI.Base.CatBehavior;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CatShelter {
    // введение через конструктор
    @Getter
    private final CatBehavior blackHouseCat;
    private CatShelter(CatBehavior blackHouseCat) {
        this.blackHouseCat = blackHouseCat;
    }

    // введение через поле
    @Autowired
    private CatBehavior orangeHouseCat;

    @Getter
    private CatBehavior whiteHouseCat;
    // введение через сеттер
    @Autowired
    private void setWhiteHouseCat(CatBehavior whiteHouseCat){
        this.whiteHouseCat = whiteHouseCat;
    }

}
