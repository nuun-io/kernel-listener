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

import io.nuun.kernel.core.AbstractPlugin;

/**
 * @author Pierre Thirouin <pierre.thirouin@ext.mpsa.com>
 *         06/01/2015
 */
public class MyExtendedPlugin extends AbstractPlugin implements KernelListener {

    static int count = 0;

    @Override
    public String name() {
        return "my-extended-plugin";
    }

    @Override
    public void kernelInitializing() {
        count += 1;
    }

    @Override
    public void kernelInitialized() {
        count += 10;
    }

    @Override
    public void kernelStarting() {
        count += 100;
    }

    @Override
    public void kernelStarted() {
        count += 1000;
    }

    @Override
    public void kernelStopping() {
        count += 10000;
    }

    @Override
    public void kernelStopped() {
        count += 100000;
    }
}
