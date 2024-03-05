package homework_1_DI.Base;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class BlackHouseCat implements CatBehavior {
    public BlackHouseCat() {
    }

    public void Sleep() {
        log.info("The black cat is sleeping...");
    }

    public void Meow() {
        log.info("The black cat is not meowing.");
    }

    public void Eat() { log.info("The black cat is not eating.");}
}
