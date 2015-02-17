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

import io.nuun.kernel.spi.KernelExtension;

import java.util.Collection;

/**
 * This extension notifies kernel listeners about the kernel life cycle.
 * <p>
 * The notified states are:
 * </p>
 * <ul>
 *     <li>initializing</li>
 *     <li>initialized</li>
 *     <li>starting</li>
 *     <li>started</li>
 *     <li>stopping</li>
 *     <li>stopped</li>
 * </ul>
 *
 * @author Pierre Thirouin <pierre.thirouin@ext.mpsa.com>
 *         06/01/2015
 */
public class KernelListenerExtension implements KernelExtension<KernelListener> {

    @Override
    public void initializing(Collection<KernelListener> collection) {
        for (KernelListener kernelListener : collection) {
            kernelListener.kernelInitializing();
        }
    }

    @Override
    public void initialized(Collection<KernelListener> collection) {
        for (KernelListener kernelListener : collection) {
            kernelListener.kernelInitialized();
        }
    }

    @Override
    public void starting(Collection<KernelListener> collection) {
        for (KernelListener kernelListener : collection) {
            kernelListener.kernelStarting();
        }
    }

    @Override
    public void started(Collection<KernelListener> collection) {
        for (KernelListener kernelListener : collection) {
            kernelListener.kernelStarted();
        }
    }

    @Override
    public void stopping(Collection<KernelListener> collection) {
        for (KernelListener kernelListener : collection) {
            kernelListener.kernelStopping();
        }
    }

    @Override
    public void stopped(Collection<KernelListener> collection) {
        for (KernelListener kernelListener : collection) {
            kernelListener.kernelStopped();
        }
    }
}
