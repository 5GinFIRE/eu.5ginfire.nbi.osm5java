package osm5.ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata.nsr;
import com.google.common.base.MoreObjects;
import java.lang.Override;
import java.lang.String;
import java.math.BigInteger;
import java.util.Objects;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.Identifier;

public class InitialServicePrimitiveKey
 implements Identifier<InitialServicePrimitive> {
    private static final long serialVersionUID = -5831853827923659523L;
    private final BigInteger _seq;


    public InitialServicePrimitiveKey(BigInteger _seq) {
    
    
        this._seq = _seq;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public InitialServicePrimitiveKey(InitialServicePrimitiveKey source) {
        this._seq = source._seq;
    }


    public BigInteger getSeq() {
        return _seq;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Objects.hashCode(_seq);
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
        InitialServicePrimitiveKey other = (InitialServicePrimitiveKey) obj;
        if (!Objects.equals(_seq, other._seq)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper(InitialServicePrimitiveKey.class);
        CodeHelpers.appendValue(helper, "_seq", _seq);
        return helper.toString();
    }
}

