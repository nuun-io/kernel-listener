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
