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
