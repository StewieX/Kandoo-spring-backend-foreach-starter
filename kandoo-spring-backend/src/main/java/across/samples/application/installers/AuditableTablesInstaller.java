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
import com.foreach.across.modules.hibernate.installers.AuditableSchemaInstaller;
import org.springframework.core.annotation.Order;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;


@Order(2)
@Installer(name = "auditable-tables", description = "Adds auditing columns to core tables")
public class AuditableTablesInstaller extends AuditableSchemaInstaller {
    @Override
    protected Collection<String> getTableNames() {
        Collection<String> names = new ArrayList<>(Arrays.asList("my_page", "my_card"));
        return Collections.unmodifiableCollection(names);//Collections.singleton( "my_page" );
    }
}
