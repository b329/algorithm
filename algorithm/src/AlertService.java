import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/** Question **/
/*
class AlertService {
    private final MapAlertDAO storage = new MapAlertDAO();

    public UUID raiseAlert() {
        return this.storage.addAlert(new Date());
    }

    public Date getAlertTime(UUID id) {
        return this.storage.getAlert(id);
    }
}

class MapAlertDAO {
    private final Map<UUID, Date> alerts = new HashMap<UUID, Date>();

    public UUID addAlert(Date time) {
        UUID id = UUID.randomUUID();
        this.alerts.put(id, time);
        return id;
    }

    public Date getAlert(UUID id) {
        return this.alerts.get(id);
    }
}
*/

/** Answer **/

class AlertService {
    private final MapAlertDAO storage = new MapAlertDAO();
    private AlertDAO obj;  // 이걸 추가할 수 있었을까.

    // 이걸 추가할 수 있었을까.
    // This means that you should not create a MapAlertDAO locally.
    // You need to use the one passed to its constructor.

    public AlertService(AlertDAO obj) {
        this.obj = obj;
    }

    public UUID raiseAlert() {
        return this.obj.addAlert(new Date());
    }

    public Date getAlertTime(UUID id) {
        return this.obj.getAlert(id);
    }
}

class MapAlertDAO implements AlertDAO {
    private final Map<UUID, Date> alerts = new HashMap<UUID, Date>();

    public UUID addAlert(Date time) {
        UUID id = UUID.randomUUID();
        this.alerts.put(id, time);
        return id;
    }

    public Date getAlert(UUID id) {
        return this.alerts.get(id);
    }
}

interface AlertDAO{
    public UUID addAlert(Date time);
    public Date getAlert(UUID id);
}
