package org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.nst.rev180820;
import java.lang.String;
import javax.annotation.Nullable;
import org.opendaylight.yang.gen.v1.http.riftio.com.ns.riftware._1._0.nsd.base.rev170228.ClassifierCommon;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>nst</b>
 * <pre>
 * grouping classifier {
 *   uses nsd-base:classifier-common;
 *   leaf nsd-ref {
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
 * <i>nst/classifier</i>
 *
 */
public interface Classifier
    extends
    DataObject,
    ClassifierCommon
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("classifier");

    /**
     * @return <code>java.lang.String</code> <code>nsdRef</code>, or <code>null</code> if not present
     */
    @Nullable
    String getNsdRef();
    
    /**
     * @return <code>java.lang.String</code> <code>nsdConnectionPointRef</code>, or <code>null</code> if not present
     */
    @Nullable
    String getNsdConnectionPointRef();

}

