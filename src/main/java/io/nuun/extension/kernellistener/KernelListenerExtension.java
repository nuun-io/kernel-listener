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
