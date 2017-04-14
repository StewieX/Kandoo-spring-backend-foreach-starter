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

package across.samples;

import com.foreach.across.config.AcrossApplication;
import com.foreach.across.modules.adminweb.AdminWebModule;
import com.foreach.across.modules.applicationinfo.ApplicationInfoModule;
import com.foreach.across.modules.debugweb.DebugWebModule;
import com.foreach.across.modules.entity.EntityModule;
import com.foreach.across.modules.user.UserModule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.h2.H2ConsoleAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Import;
@AcrossApplication(
		modules = {
				ApplicationInfoModule.NAME,
				EntityModule.NAME,
				AdminWebModule.NAME,
				DebugWebModule.NAME,
				UserModule.NAME
		}
)
@Import({ DataSourceAutoConfiguration.class, H2ConsoleAutoConfiguration.class})
public class KandooBackendApplication
{
	public static void main( String[] args ) {
		SpringApplication.run( KandooBackendApplication.class, args );
	}
}
