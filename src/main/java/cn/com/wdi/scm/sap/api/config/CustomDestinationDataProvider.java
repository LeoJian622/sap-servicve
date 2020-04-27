package cn.com.wdi.scm.sap.api.config;

import com.sap.conn.jco.ext.DataProviderException;
import com.sap.conn.jco.ext.DestinationDataEventListener;
import com.sap.conn.jco.ext.DestinationDataProvider;
import org.springframework.stereotype.Component;

import java.util.Properties;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author liyongjian
 * @create 2020-03-10 17:13
 */

@Component
public class CustomDestinationDataProvider implements DestinationDataProvider {

    private DestinationDataEventListener eL;

    public  ConcurrentHashMap<String,Properties> secureDBStorage = new ConcurrentHashMap<>();

    @Override
    public Properties getDestinationProperties(String destName) throws DataProviderException {

        // read the destination from DB
        Properties p=secureDBStorage.get(destName);

        // check if all is correct
        if (p!=null&&p.isEmpty()) {
            throw new DataProviderException(DataProviderException.Reason.INVALID_CONFIGURATION,
                    "destination configuration is incorrect", null);
        }

        return p;
    }

    @Override
    public boolean supportsEvents() {
        return true;
    }

    @Override
    public void setDestinationDataEventListener(DestinationDataEventListener destinationDataEventListener) {
        this.eL = destinationDataEventListener;
    }

    public void changeProperties(String destName, Properties properties) {
        synchronized (secureDBStorage) {
            if (properties == null) {
                if (secureDBStorage.remove(destName) != null) {
                    eL.deleted(destName);
                }
            } else {
                secureDBStorage.put(destName, properties);
                // create or updated
                eL.updated(destName);
            }
        }
    }
}
