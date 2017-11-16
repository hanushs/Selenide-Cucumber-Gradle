package steps;

import org.apache.commons.pool2.ObjectPool;

import javax.naming.spi.ObjectFactory;
import java.util.NoSuchElementException;

/**
 * Created by pshynin on 11/16/2017.
 */
public class PagesPool implements ObjectPool {

    @Override
    public Object borrowObject() throws Exception, NoSuchElementException, IllegalStateException {
        return null;
    }

    @Override
    public void returnObject(Object obj) throws Exception {

    }

    @Override
    public void invalidateObject(Object obj) throws Exception {

    }

    @Override
    public void addObject() throws Exception, IllegalStateException, UnsupportedOperationException {

    }

    @Override
    public int getNumIdle() {
        return 0;
    }

    @Override
    public int getNumActive() {
        return 0;
    }

    @Override
    public void clear() throws Exception, UnsupportedOperationException {

    }

    @Override
    public void close() {

    }
}
