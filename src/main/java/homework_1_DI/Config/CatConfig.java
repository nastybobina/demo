package homework_1_DI.Config;

import homework_1_DI.Base.BlackHouseCat;
import homework_1_DI.Base.CatBehavior;
import homework_1_DI.Base.OrangeHouseCat;
import homework_1_DI.Base.WhiteHouseCat;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class CatConfig {
    @Bean
    @Scope(value = "prototype")
    public CatBehavior blackHouseCat(){
        return new BlackHouseCat();
    }
    @Bean
    @Scope(value = "prototype")
    public CatBehavior orangeHouseCat() {
        return new OrangeHouseCat();
    }
    @Bean
    @Scope(value = "prototype")
    public CatBehavior whiteHouseCat() {
        return new WhiteHouseCat();
    }
}
