/*
 * Copyright 2017 the original author or authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package across.samples.application.installers;

import com.foreach.across.core.annotations.Installer;
import com.foreach.across.core.installers.AcrossLiquibaseInstaller;
import org.springframework.core.annotation.Order;

/**
 * @author Arne Vandamme
 * @since 0.0.1
 */
@Order(1)
@Installer(name = "schema-installer", description = "Installs the required database tables")
public class SchemaInstaller extends AcrossLiquibaseInstaller
{
	public SchemaInstaller() {
		super( "installers/schema/main.xml" );
	}
}
