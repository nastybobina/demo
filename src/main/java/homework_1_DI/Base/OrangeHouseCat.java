package homework_1_DI.Base;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class OrangeHouseCat implements CatBehavior {
    public OrangeHouseCat() {
    }

    public void Sleep() {
        log.info("The orange cat is not sleeping.");
    }

    public void Meow() {
        log.info("The orange cat is meowing.");
    }

    public void Eat() { log.info("The orange cat is not eating.");}
}
