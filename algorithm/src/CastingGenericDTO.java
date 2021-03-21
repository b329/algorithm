import java.io.Serializable;

public class CastingGenericDTO<Dennis> implements Serializable {
    private Dennis object;
    public void setObject(Dennis obj) {
        this.object = obj;
    }
    public Dennis getObject() {
        return object;
    }
}
