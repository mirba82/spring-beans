package peaksoft.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import peaksoft.model.Timer;

@Configuration
@ComponentScan(basePackages = "peaksoft")
public class AppConfig {
    private Timer timer;

    public Timer getTimer() {
        return timer;
    }

    public void setTimer(Timer timer) {
        this.timer = timer;
    }

}

