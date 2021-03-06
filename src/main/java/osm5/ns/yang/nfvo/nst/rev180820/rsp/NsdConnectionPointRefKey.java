package osm5.ns.yang.nfvo.nst.rev180820.rsp;
import com.google.common.base.MoreObjects;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.Identifier;

public class NsdConnectionPointRefKey
 implements Identifier<NsdConnectionPointRef> {
    private static final long serialVersionUID = -5606965792302765567L;
    private final String _nsdRef;


    public NsdConnectionPointRefKey(String _nsdRef) {
    
    
        this._nsdRef = _nsdRef;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public NsdConnectionPointRefKey(NsdConnectionPointRefKey source) {
        this._nsdRef = source._nsdRef;
    }


    public String getNsdRef() {
        return _nsdRef;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Objects.hashCode(_nsdRef);
        return result;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        NsdConnectionPointRefKey other = (NsdConnectionPointRefKey) obj;
        if (!Objects.equals(_nsdRef, other._nsdRef)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper(NsdConnectionPointRefKey.class);
        CodeHelpers.appendValue(helper, "_nsdRef", _nsdRef);
        return helper.toString();
    }
}

