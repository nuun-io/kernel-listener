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

/**
 * Kernel listener is an interface to be implemented by plugin which want listen the kernel life cycle.
 *
 * @see io.nuun.extension.kernellistener.KernelListenerExtension
 * @author Pierre Thirouin <pierre.thirouin@ext.mpsa.com>
 *         06/01/2015
 */
public interface KernelListener {

    /**
     * Notifies that the kernel is initializing.
     */
    public void kernelInitializing();

    /**
     * Notifies that the kernel is initialized.
     */
    public void kernelInitialized();

    /**
     * Notifies that the kernel is starting.
     */
    public void kernelStarting();

    /**
     * Notifies that the kernel is started.
     */
    public void kernelStarted();

    /**
     * Notifies that the kernel is stopping.
     */
    public void kernelStopping();

    /**
     * Notifies that the kernel is stopped.
     */
    public void kernelStopped();
}
