package across.samples.application.extensions;

import across.samples.application.domain.card.Card;
import across.samples.application.domain.page.Page;
import com.foreach.across.core.annotations.ModuleConfiguration;
import com.foreach.across.modules.hibernate.jpa.AcrossHibernateJpaModule;
import com.foreach.across.modules.hibernate.provider.HibernatePackageConfigurer;
import com.foreach.across.modules.hibernate.provider.HibernatePackageRegistry;

/**
 * Register entities for scanning by the Hibernate module.
 */
@ModuleConfiguration(AcrossHibernateJpaModule.NAME)
public class EntityScanConfiguration implements HibernatePackageConfigurer
{
	@Override
	public void configureHibernatePackage( HibernatePackageRegistry hibernatePackageRegistry ) {
		hibernatePackageRegistry.addPackageToScan( Page.class );
		hibernatePackageRegistry.addPackageToScan( Card.class );
	}
}
