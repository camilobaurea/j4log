/*
 * Copyright 2016 Camilo Bermúdez
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
package co.huitaca.j4log.plugins;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import co.huitaca.j4log.J4LogPlugin;

public class PluginManager {

	private static List<J4LogPlugin> PLUGINS;

	static {
		PLUGINS = new ArrayList<>();
		PLUGINS.add(new Log4JPlugin());
//		PLUGINS.add(new JULPlugin());
		PLUGINS.add(new ApacheJULIPlugin());
		PLUGINS = Collections.unmodifiableList(PLUGINS);

	}

	public static List<J4LogPlugin> getPlugins() {
		return PLUGINS;
	}

}
