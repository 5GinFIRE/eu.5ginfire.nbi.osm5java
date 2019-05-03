package org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.netslice.instantiation.parameters.rev181128;
import java.lang.String;
import javax.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.instantiation.parameters.rev180914.NsParams;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>netslice-instantiation-parameters</b>
 * <pre>
 * grouping netslice_subnet_params {
 *   leaf id {
 *     type string;
 *   }
 *   uses instantiation-parameters:ns_params;
 * }
 * </pre>The schema path to identify an instance is
 * <i>netslice-instantiation-parameters/netslice_subnet_params</i>
 *
 */
public interface NetsliceSubnetParams
    extends
    DataObject,
    NsParams
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("netslice_subnet_params");

    /**
     * @return <code>java.lang.String</code> <code>id</code>, or <code>null</code> if not present
     */
    @Nullable
    String getId();

}

