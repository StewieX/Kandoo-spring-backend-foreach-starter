package across.samples.application.config;

import across.samples.application.domain.card.CardRepository;
import across.samples.application.domain.page.PageRepository;
import com.foreach.across.modules.hibernate.jpa.repositories.config.EnableAcrossJpaRepositories;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAcrossJpaRepositories(basePackageClasses = {PageRepository.class, CardRepository.class})
public class DomainConfiguration
{
}
