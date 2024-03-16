package homework_1_DI.Base;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class WhiteHouseCat implements CatBehavior {

    public void Sleep() {
        log.info("The white cat is not sleeping.");
    }

    public void Meow() {
        log.info("The white cat is not meowing.");
    }

    public void Eat() { log.info("The white cat is eating!");}
}
