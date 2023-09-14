package by.home.springapp2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.util.Arrays;
import java.util.List;

@Configuration

public class SpringConfig {
    @Bean
    @Scope("prototype")
    public ClassicalMusic classicalMusic(){
        return new ClassicalMusic();
    }

    @Bean
    @Scope("prototype")
    public RockMusic rockMusic(){
        return new RockMusic();
    }
    @Bean
    @Scope("prototype")
    public PopMusic popMusic(){
        return new PopMusic();
    }

    @Bean
    List<Music> musicList(){
        return Arrays.asList(classicalMusic(),rockMusic(),popMusic());

    }

    @Bean MusicPlayer musicPlayer(){
        return new MusicPlayer(musicList());
    }
}
