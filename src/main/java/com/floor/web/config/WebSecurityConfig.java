package com.floor.web.config;

import com.floor.web.entity.Author;
import com.floor.web.repository.AuthorRepository;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.boot.autoconfigure.security.oauth2.resource.PrincipalExtractor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableOAuth2Client;

import java.security.Principal;
import java.time.LocalDateTime;

@Configuration
@EnableWebSecurity
@EnableOAuth2Sso
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception{
        http
                .authorizeRequests()
                .mvcMatchers("/").permitAll()
                .anyRequest().authenticated()
                .and()
                .csrf().disable();
    }

    @Bean
    public PrincipalExtractor principalExtractor(AuthorRepository repository){
        return map -> {
            String id = (String) map.get("sub");
            Author author = repository.findById(id).orElseGet(()->{
                Author newAuthor = new Author();

                newAuthor.setId(id);
                newAuthor.setName((String) map.get("name"));
                newAuthor.setEmail((String) map.get("email"));
                newAuthor.setLocale((String) map.get("locale"));
                newAuthor.setUserpic((String) map.get("picture"));

                return newAuthor;
            });
            author.setLastVisit(LocalDateTime.now());

            return repository.save(author);
        };
    }
}
