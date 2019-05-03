package org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.nst.rev180820.slice.connection.points.connection;
import java.lang.String;
import javax.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.nst.rev180820.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.nst.rev180820.slice.connection.points.Connection;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>nst</b>
 * <pre>
 * case nsd-connection-point-ref {
 *   leaf nsd-id-ref {
 *     type leafref {
 *       path /nsd:nsd-catalog/nsd:nsd/nsd:id;
 *     }
 *   }
 *   leaf nsd-connection-point-ref {
 *     type leafref {
 *       path /nsd:nsd-catalog/nsd:nsd/nsd:connection-point/nsd:name;
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>nst/slice-connection-points/connection/nsd-connection-point-ref</i>
 *
 */
public interface NsdConnectionPointRef
    extends
    DataObject,
    Augmentable<NsdConnectionPointRef>,
    Connection
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("nsd-connection-point-ref");

    /**
     * A reference to a nsd.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>nsdIdRef</code>, or <code>null</code> if not present
     */
    @Nullable
    String getNsdIdRef();
    
    /**
     * @return <code>java.lang.String</code> <code>nsdConnectionPointRef</code>, or <code>null</code> if not present
     */
    @Nullable
    String getNsdConnectionPointRef();

}

