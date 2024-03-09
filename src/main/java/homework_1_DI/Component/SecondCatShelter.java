// реализация двух классов с одним интерфейсом

package homework_1_DI.Component;

import homework_1_DI.Base.CatBehavior;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Log4j2
@Component
public class SecondCatShelter {
    @Autowired
    CatBehavior blackHouseCat;

    @Autowired
    CatBehavior orangeHouseCat;

    @PostConstruct
    public void postConstruct() {
        log.info("Bean first interface created.");
    }

    @PreDestroy
    public void preDestroy() {
        log.info("Bean first interface destroyed.");
    }
}
