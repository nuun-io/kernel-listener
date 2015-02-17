/**
 * Copyright (C) 2013-2015 Kametic <epo.jemba@kametic.com>
 *
 * Licensed under the GNU LESSER GENERAL PUBLIC LICENSE, Version 3, 29 June 2007;
 * or any later version
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.gnu.org/licenses/lgpl-3.0.txt
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.nuun.extension.kernellistener;

import io.nuun.kernel.api.Kernel;
import io.nuun.kernel.tests.it.NuunITRunner;
import io.nuun.kernel.tests.it.annotations.WithParams;
import org.fest.assertions.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * @author Pierre Thirouin <pierre.thirouin@ext.mpsa.com>
 *         06/01/2015
 */
@WithParams({Kernel.NUUN_ROOT_PACKAGE, "io.nuun"})
@RunWith(NuunITRunner.class)
public class KernelListenerExtensionTest {

    @Test
    public void steps_until_started_should_have_been_handled() {
        Assertions.assertThat(MyExtendedPlugin.count).isEqualTo(1111);
    }
}
